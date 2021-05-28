import java.util.*;
public class Multiplication {
    public static void main(String args[]){
        int n;
        System.out.println("Enter n value:");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        for(int i = 1; i <= 10; ++i)
        {
            System.out.printf("%d * %d = %d \n", n, i, n * i);
        }
    }
    
}