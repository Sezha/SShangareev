package ru.job4j.coffee;

/**
 * class CoffeeMachine.
 * @author  Sergei Shangareev (sezhaekb@gmail.com).
 * @version 1.0.
 * @since 04/27/2018.
 */
public class CoffeeMachine {
    /**
     * coin ONECOIN with value of one.
     */
    final int ONECOIN = 1;
    /**
     * coin TWOCOIN with value of two.
     */
    final int TWOCOIN = 2;
    /**
     * coin FIVECOIN with value of five.
     */
    final int FIVECOIN = 5;
    /**
     * coin TENCOIN with value of ten.
     */
    final int TENCOIN = 10;
    /**
     * array of coins by ascending.
     */
    int[] coins = new int[4];

    /**
     * method changes.
     * @param value value of money.
     * @param price cost of coffee.
     * @return array of coins.
     */
   public int[] changes(int value, int price) {
       int rest = value - price;
           coins[0] = ONECOIN * checkOneCoin(rest);
           coins[1] = TWOCOIN * checkTwoCoin(rest);
           coins[2] = FIVECOIN * checkFiveCoin(rest);
           coins[3] = TENCOIN * checkTenCoin(rest);
       return coins;
   }

    /**
     * method checkTenCoin.
     * @param rest rest is a change.
     * @return amount of tencoin.
     */
    public int checkTenCoin(int rest) {
       int count = 0;
           while (rest > TENCOIN - 1) {
              rest = rest - TENCOIN;
              count++;
           }
           return count;
    }

    /**
     * method checkFiveCoin.
     * @param rest rest is a change.
     * @return amount of fivecoin.
     */
    public int checkFiveCoin(int rest) {
        int counter = 0;
        if (rest % 10 != 0) {
            int temp = rest - TENCOIN*checkTenCoin(rest);
            while (temp > 4 ) {
                temp = temp - FIVECOIN;
                counter++;
            }
            return counter;
        } else {
        return counter;
        }
    }

    /**
     * method checkTwoCoin.
     * @param rest rest is a change.
     * @return amount of twocoin.
     */
    public int checkTwoCoin(int rest) {
        int counter = 0;
        int temp = rest - TENCOIN * checkTenCoin(rest) - FIVECOIN * checkFiveCoin(rest);
        while (temp > 1) {
            temp = temp - TWOCOIN;
            counter++;
        }
        return counter;
    }

    /**
     * method checkOneCoin.
     * @param rest rest is a change.
     * @return amount of onecoin.
     */
    public int checkOneCoin(int rest) {
        int counter = 0;
        int temp = rest - TENCOIN * checkTenCoin(rest) - FIVECOIN * checkFiveCoin(rest) - TWOCOIN*checkTwoCoin(rest);
        while (temp != 0) {
            temp = temp - ONECOIN;
            counter++;
        }
        return counter;
    }
}
