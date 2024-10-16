import java.util.Scanner;

public class power {
    public static void main(String[] args) {
        int n, p, result=1;
        System.out.println("Enter no.");
        Scanner s = new Scanner(System.in);
        n=s.nextInt();
        System.out.println("Enter Power.");
        p=s.nextInt();
        for(int i=1; i<=p; i++){
            result=n*result;
        }
        System.out.println("Power" +result);
    }
}
