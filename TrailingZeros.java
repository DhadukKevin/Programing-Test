import java.util.*;

public class TrailingZeros{

    static int trailingZeros(int n){
        if(n < 0){
            return -1;
        }else{
            int count = 0;
            for(int i=5;n/i>=1;i*=5){
                count+=n/i;
            }
            return count;
        }
    }

    public static void main(String args[]){ 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N : ");
        int n = sc.nextInt();

        System.out.print(trailingZeros(n));

    }
}
