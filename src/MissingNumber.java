public class MissingNumber {

    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 3, 4, 8, 9};
        int[] brr = {1, 3, 4, 9};

        int[] comparator = new int[10];
        for (int i = 0; i < arr.length; i++) {
            int count = arr[i];
            comparator[count]++;
        }
        for (int j = 0; j < brr.length; j++) {
            int count = brr[j];
            comparator[count]--;
        }
        for (int b : comparator) {
            System.out.println(b);

        }
        for (int k = 1; k < comparator.length; k++) {
            if (comparator[k] != 0) {
                for (int a = 0; a < comparator[k]; a++) {
                    System.out.println(k);
                }
            }

        }

    }
}
