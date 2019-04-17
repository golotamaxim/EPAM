import java.util.ArrayList;
import java.util.List;

public class MagicSquare {

    int[][] s = new int[3][3];


    public void countOfSquare() {
        int price = 45;
        int thisPrice = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int number = (int) (Math.random() * 10);
                if (number == 0)
                    number = 5;
                s[i][j] = number;
            }
        }
        List<Integer> mySquare = new ArrayList<>();
        int[] sqr = new int[9];

        for (int[] arr : s) {
            for (int a : arr) {
                System.out.print(a + " ");
                mySquare.add(a);
            }
            System.out.print("\n");
        }
        for (int i = 0; i < 9; i++) {
            sqr[i] = mySquare.get(i);
        }
        int[] right1 = {6, 7, 2, 1, 5, 9, 8, 3, 4};
        int[] right2 = {2, 9, 4, 7, 5, 3, 6, 1, 8};
        int[] right3 = {4, 3, 8, 9, 5, 1, 2, 7, 6};
        int[] right4 = {8, 1, 6, 3, 5, 7, 4, 9, 2};
        int[] left1 = {2, 7, 6, 9, 5, 1, 4, 3, 8};
        int[] left2 = {6, 1, 8, 7, 5, 3, 2, 9, 4};
        int[] left3 = {4, 9, 2, 3, 5, 7, 8, 1, 6};
        int[] left4 = {8, 3, 4, 1, 5, 9, 6, 7, 2};
        int[] pattern[] = {right1, right2, right3, right4, left1, left2, left3, left4};

        for (int[] arr : pattern) {
            for (int i = 0; i < 9; i++) {
                thisPrice += Math.abs(sqr[i] - arr[i]);
            }
            if (thisPrice < price)
                price = thisPrice;
            thisPrice = 0;
        }
        System.out.println(price);


        //System.out.println(mySquare);


    }
}
