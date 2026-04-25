import java.util.Scanner;

public class PrimeNumber {
    public boolean isPrime(int num){
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int num=sc.nextInt();
        PrimeNumber p=new PrimeNumber();
        System.out.println(p.isPrime(num));

    }
}
