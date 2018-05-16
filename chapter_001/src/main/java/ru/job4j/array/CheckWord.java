package ru.job4j.array;
/**
 * class CheckWord.
 * Проверка, что одно слово находится в другом слове.
 * @author Sergei Shangareev (sezhaekb@gmail.com)
 * @version 1.0
 */
public class CheckWord {
    private char[] data;

   // public CheckWord(String line){
   //         this.data = line.toCharArray();
   // }


    public boolean contains(String origin, String sub) {
       // boolean result = false;
        char[] arrayOrigin = origin.toCharArray();
        char[] value = sub.toCharArray();

       // for (char items : arrayOrigin) {
             return arrayOrigin.equals(value) ? true : false;
        }
            /*if (arrayOrigin.equals(value)) {
                result = true;
            }
        }
        return result;*/
/*

    public boolean contains(String origin, String sub) {
    char[] arrayOrigin = origin.toCharArray();
    char[] value =  sub.toCharArray();
    boolean tru = false;
        for (int i = 0; i < value.length; i++) {
            if (arrayOrigin[i] == value[i]) {
                tru = true;
            }
        }
        return tru;
    }
*/
}
