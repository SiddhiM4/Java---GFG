// Complete the function
// Take input for a and s
import java.util.*;
class Geeks {
    static void getInput() {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Taking the number of testcases
        while (t-- > 0) {
            int a = sc.nextInt();
            String s = sc.next();

            // Your code here
            s += sc.nextLine();

            System.out.println(a);
            System.out.println(s);
        }
    }
}