package ru.job4j.tracker;

/**
 * class StubInput.
 * @author Sergei Shangareev (sezhaekb@gmail.com).
 * @version 2.0.
 */
public class StubInput implements Input {
    private final String[] answers;
    private int position = 0;

    /**
     * constructor of class StubInput.
     * @param answers
     */
    public StubInput(String[] answers) {
        this.answers = answers;
    }
    /**
     * method String ask.
     */
    @Override
    public String ask(String question) {
        return this.answers[position++];
    }

    /**
     * method int ask.
     * @param question
     * @param range
     * @return
     */
    public int ask(String question, int[] range) {
        int key = Integer.valueOf(this.ask(question));
        boolean exist = false;
        for (int value : range) {
            if (value == key) {
                exist = true;
                break;
            }
        }
        if (exist) {
            return key;
        } else {
            throw new MenuOutException("Out of menu range");
        }
    }
}
