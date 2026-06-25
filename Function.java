import java.util.Scanner;
public class Function {
    public static void printPrime(int n){
        boolean prime= true;
        if(n<=0){
            prime= false;
        }
        else{
       for(int i=2; i<=n%i; i++){
      if (n%i==0){
        prime= false;
        break;
      }
       }
    }
    if(prime){
        System.err.println(prime);
    }
    else{
        System.out.println(false);
    }
       }
     public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        printPrime(n);
     }
     
    }
