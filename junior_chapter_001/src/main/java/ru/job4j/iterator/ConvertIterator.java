package ru.job4j.iterator;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * class ConavertIterator.
 * class iterator.
 * @author Sergei Shangareev(sezhaekb@gmail.com).
 * @version 1.0.
 * @since 16/07/2018.
 */
public class ConvertIterator {
    /**
     * Covert iterator of iterators in iterator of integers.
     * @param it iterator to convert.
     * @return iterator.
     */
    public Iterator<Integer> converter(Iterator<Iterator<Integer>> it) {
        return new IteratorOfIterators(it);
    }

    /**
     * Iterator Of Iterators class.
     */
    private class IteratorOfIterators implements Iterator<Integer> {
        /**
         * Iterators.
         */
        private final Iterator<Iterator<Integer>> itOfIterators;
        /**
         * Work space.
         */
        private Iterator<Integer> itOfInteger;

        /**
         * Constructor.
         * @param it input iterators.
         */
        public IteratorOfIterators(final Iterator<Iterator<Integer>> it) {
            this.itOfIterators = it;
            this.itOfInteger = it.next();
        }

        @Override
        public boolean hasNext() {
            boolean result = false;
            boolean done = false;
            while (!done) {
                if (this.itOfInteger.hasNext()) {
                    result = true;
                    done = true;
                } else if (this.itOfIterators.hasNext()) {
                    this.itOfInteger = this.itOfIterators.next();
                } else {
                    done = true;
                }
            }
            return result;
        }

        @Override
        public Integer next() {
            Integer result;
            if (this.hasNext()) {
                result = this.itOfInteger.next();
            } else {
                throw new NoSuchElementException("NoSuchElementException");
            }
            return result;
        }
    }
}
