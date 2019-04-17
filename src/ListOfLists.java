import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListOfLists {
    ArrayList<ArrayList<Integer>> matrix = new ArrayList<ArrayList<Integer>>();
    int r = 1;

    public void listToArray() {
        int rotation;
        ArrayList<Integer> first = new ArrayList<>();
        first.add(1);
        first.add(2);
        first.add(3);
        first.add(4);
        ArrayList<Integer> second = new ArrayList<>();
        second.add(7);
        second.add(8);
        second.add(9);
        second.add(10);
        ArrayList<Integer> third = new ArrayList<>();
        third.add(13);
        third.add(14);
        third.add(15);
        third.add(16);
        ArrayList<Integer> forth = new ArrayList<>();
        forth.add(19);
        forth.add(20);
        forth.add(21);
        forth.add(22);
        ArrayList<Integer> fifth = new ArrayList<>();
        fifth.add(25);
        fifth.add(26);
        fifth.add(27);
        fifth.add(28);
        ArrayList<Integer> sixth = new ArrayList<>();
        sixth.add(31);
        sixth.add(32);
        sixth.add(33);
        sixth.add(34);
        matrix.add(first);
        matrix.add(second);
        matrix.add(third);
        matrix.add(forth);
        matrix.add(fifth);
        matrix.add(sixth);
        System.out.println(matrix);
        int[][] outArray = new int[matrix.size()][(matrix.get(0)).size()];
        List<Integer> rotatedList = new ArrayList<>();
        int iMin = 0;
        int iMax = (matrix.get(0)).size();
        int jMin = 0;
        int jMax = matrix.size();




        while (!(matrix.isEmpty()||(matrix.get(0)).isEmpty())) {
            List<Integer> outer = new ArrayList<>();
            outer.addAll(matrix.get(0));
            matrix.remove(0);
            int size = matrix.size() - 1;
            for (int i = 0; i < matrix.size() - 1; i++) {
                outer.add((matrix.get(i)).remove(matrix.get(i).size() - 1));
            }
            List<Integer> temp = matrix.remove(size);
            Collections.reverse(temp);
            outer.addAll(temp);
            for (int j = (matrix.size() - 1); j >= 0; j--) {
                outer.add((matrix.get(j)).remove(0));
            }


            rotation = r%outer.size();
            for (int k = rotation; k < outer.size(); k++ ) {
                rotatedList.add(outer.get(k));
            }
            for (int k = 0; k < rotation; k++) {
                rotatedList.add(outer.get(k));
            }
            int i = iMin;
            int j = jMin;
            for (int k = 0; k < rotatedList.size();) {
                while (i < iMax - 1) {
                    outArray[j][i] = rotatedList.get(k);
                    i++;
                    k++;
                }
                while (j < jMax - 1) {
                    outArray[j][i] = rotatedList.get(k);
                    j++;
                    k++;
                }
                while (i > iMin) {
                    outArray[j][i] = rotatedList.get(k);
                    i--;
                    k++;
                }
                while (j > iMin) {
                    outArray[j][i] = rotatedList.get(k);
                    j--;
                    k++;
                }
            }
            iMin++;
            iMax -= 1;
            jMin++;
            jMax -= 1;
            rotatedList.clear();


            //System.out.println(matrix);
        }
        for (int[] arr : outArray) {
            for (int a : arr) {
                System.out.print(a + " ");
            }
            System.out.print("\n");
        }


    }
}
