package InfosysSampleQues;
import java.util.Scanner;
public class ArrayQueriesProblem {
    static final int MOD = 1_000_000_007;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array size");
        int n = sc.nextInt();
        System.out.println("enter the number of queries");
        int q  =sc.nextInt();
        System.out.println("enter the array");
        int[]A = new int[n+1];
        for(int i =1;i<=n;i++){
            A[i]=sc.nextInt();
        }
        long totalSum = 0;

        for (int Queries = 0 ; Queries <q;Queries++){
            int type = sc.nextInt();
            int L = sc.nextInt();
            int r = sc.nextInt();

            if(type == 1){
                int value = A[L];
                for(int i = L ;i<=r;i++){
                    A[i] = (int)(((long)(i-L+1)*value)%MOD);
                }
            }
            else if(type == 2){
                long currentSUm = 0;
                for (int i = L;i<=r;i++){
                    currentSUm = (A[i]+currentSUm)%MOD;
                }
                totalSum = (totalSum+currentSUm)%MOD;
            }
        }
        System.out.println(totalSum);
    }
}
