package BitManipulation;

import java.util.Scanner;

public class MinBitFlipToConvertNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the start value ");
        int start = sc.nextInt();
        System.out.println("enter the goal value you it to be converted to ");
        int goal = sc.nextInt();

        int ans =  start^goal;
        int count =0;
        for(int i =0;i<=31;i++){
            if((ans&(1<<i))!=0){
                count++;
            }
        }
        System.out.println(count);
    }
}
