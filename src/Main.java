import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int result = birthdayCakeCandles(new int[25]);
        System.out.println(result);

        /*

        OUTPUT:

        63 96 87 20 43 37 35 62 92 34 17 23 15 57 19 28 60 96 58 4 88 57 80 58 47
        Max element is: 96
        2


        */
    }

    public static int birthdayCakeCandles(int[] cakes){
        int n = cakes.length;
        int max = -9999999;
        int k = 0;
        Random r = new Random();

        for (int i = 0; i < cakes.length; i++) {
            cakes[i] = r.nextInt(100);
        }

        for (int i = 0; i < cakes.length; i++) {
            System.out.print(cakes[i] + " ");
        }

        for (int i = 0; i < n; i++) {
            if(cakes[i] > max)
                max = cakes[i];
        }
        System.out.println();
        System.out.println("Max element is: " + max);
        for (int i = 0; i < n; i++) {
            if(cakes[i] == max)
                k++;
        }
        return k;
    }

}
