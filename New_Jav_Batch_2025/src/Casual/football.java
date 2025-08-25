package Casual;
import java.util.*;

public class football {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String plr = sc.next();

        int a = 0, b = 0;

        for (int i = 0; i < plr.length(); i++) {
            char temp = plr.charAt(i);

            if (temp == '1') {
                a++;
                b = 0;
            } else { // temp == '0'
                b++;
                a = 0;
            }

            if (a == 7 || b == 7) {
                System.out.println("YES");
                return; // exit program immediately
            }
        }

        System.out.println("NO"); // only reached if no 7 in a row
    }
}



