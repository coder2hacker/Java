import java.util.Scanner;

public class SubStrings {
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        for (int i = 0; i < k; i++) {
            smallest += s.charAt(i);
        }
        largest = smallest;
        for (int i = 1; i <= (s.length()-k); i++) {
            String str = "";
            for (int j = i; j < (i + k); j++) {
                str += s.charAt(j);
            }
            for (int c = 0; c < k; c++) {
                if (str.charAt(c) < smallest.charAt(c)) {
                    smallest = str;
                    break;
                }
                else if (str.charAt(c) > smallest.charAt(c)) {
                    break;
                }
            }
            for (int c = 0; c < k; c++) {
                if (str.charAt(c) > largest.charAt(c)) {
                    largest = str;
                    break;
                }
                else if (str.charAt(c) < largest.charAt(c)){
                    break;
                }
            }
        }
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
