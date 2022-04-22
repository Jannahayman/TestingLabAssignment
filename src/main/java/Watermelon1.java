import java.util.Scanner;

public class Watermelon1 {

    public static String Divided2(int n) {
        if (n % 2 == 0 && n != 2)
            return "YES";
        else
            return "NO";

    }

    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        int n = x.nextInt();
        System.out.print(Divided2(n));

    }
}
