package BitManipulation;

import java.util.Scanner;

public class CheckNumIS2Pow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N =  sc.nextInt();
        if((N&N-1)==0){
            System.out.println("it is pow of 2");
        }
        else System.out.println("it is not a pow of 2");
    }
}
