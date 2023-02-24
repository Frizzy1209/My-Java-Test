package assignment2;

public class FlipCoin {

    /**
     * 
     * @return a random 0 or 1
     * Value must be random
     */
    public int flipCoin() {

        int max = 1;
        int min = 0;

        return (int) (Math.random() * (max - min) + min);

    }
}
