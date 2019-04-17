import java.util.*;

public class LilysHomework {

    public static void main(String[] args) {

        int[] arr = {5, 8, 14, 3, 23, 1};
        int[] arr2 = arr.clone();

        int swapF = 0;
        int swapB = 0;
        int length = arr.length;

        Map<Integer, Integer> cv = new HashMap<>();
        for (int i = 0; i < length; i++) {
            cv.put(arr[i], i);
        }
        Map<Integer, Integer> scv = (HashMap<Integer, Integer>)((HashMap<Integer, Integer>) cv).clone();

        int[] forward = arr.clone();
        Arrays.sort(forward);
        int[] backward = new int[length];
        for (int i = 0; i < length; i++) {
            backward[i] = forward[length-1-i];

        }

        for (int i = 0; i < length; i++) {
            int a = forward[i];
            int b = arr[i];
            if (a != b) {
                swapF++;
                arr[i] = a;
                arr[cv.get(a)] = b;
                cv.put(b, cv.get(a));


            }
        }
        for (int i = 0; i < length; i++) {
            int a = backward[i];
            int b = arr2[i];
            if (a != b) {
                swapB++;
                arr2[i] = a;
                arr2[scv.get(a)] = b;
                scv.put(b, scv.get(a));


            }
        }

        System.out.println(swapF < swapB ? swapF : swapB);
    }
}
