
package BitManipulation;

import java.util.Scanner;

//set means if the ith bit is 1 then it is set .
public class check_if_ithBit_isSet {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        System.out.println("enter the ith position on which you want to check");
        int i = sc.nextInt();
        if((n&(1<<i))!=0){
            System.out.println("it is a set");
        }
        else System.out.println("it is not set");
    }
}
