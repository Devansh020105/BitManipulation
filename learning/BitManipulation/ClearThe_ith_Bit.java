package BitManipulation;
import java.util.Scanner;
public class ClearThe_ith_Bit {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the num");
        int n = sc.nextInt();
        System.out.println("enter the ith bit you want to Clear");
        int i = sc.nextInt();
        System.out.println(n^(1<<i));
    }
}
