import java.util.Scanner;

public class SeperatedNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();

        String compareString;
        String nextString;
        int startIndex = 0;
        int length = 1;
        int lenStr = 0;
        int endIndex = startIndex + length;
        boolean flag = false;
        String first = "";

        //System.out.println(numbers);

        for (length = 1; length <= s.length()/2; length++) {
            //flag = true;
            startIndex = 0;
            endIndex = startIndex+length;
            first = s.substring(startIndex, endIndex);
            while (endIndex < s.length()) {
                compareString = s.substring(startIndex, endIndex);
                long a = Long.parseLong(compareString);
                long b = a + 1;
                nextString = Long.toString(b);
                lenStr = nextString.length();
                startIndex = endIndex;
                endIndex = endIndex + lenStr;
                if (endIndex > s.length()) {
                    flag = false;
                    break;
                }
                    flag = nextString.equals(s.substring(startIndex, endIndex));
                    //System.out.println(flag);
                if(flag == false) {
                    break;
                }


            }
            if (flag == true){
                break;
            }
        }
        if (flag == true) {
            System.out.println("Yes " + first);
        } else {
            System.out.println("No");
        }




            /*String element = numbers.substring(startIndex,startIndex+length);
            int separatedNumber = Integer.parseInt(element);
            while (compare = true) {
                element = Integer.toString(++separatedNumber);
                int elementLength = element.length();
                int a = startIndex + length;
                int b = a + elementLength;
                System.out.println(a + " " + b);
                String comparator = numbers.substring(a, b);
                System.out.println(comparator);
                compare = element.equals(comparator);
                System.out.println(element + " " + compare + " " + comparator);

            }*/


    }
}
