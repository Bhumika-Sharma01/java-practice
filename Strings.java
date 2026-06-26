import java.util.Scanner;
public class Strings {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
         int size= sc.nextInt();
    String arr[]= new String[size];
    int totallength= sc.nextInt();
    for(int i=0; i<size; i++){
     arr[i]= sc.next();

    totallength+= arr[i].length();
    }
    System.out.println(totallength);
    }
}