import java.util.Scanner;
public class Loop {
    public static void main(String[] args) {
     // Scanner sc= new Scanner(System.in);
     // int n = sc.nextInt();
       //for( int counter =0; counter<3; counter++){
        //System.out.println("hello world");
       //}
       //for(int i = 0; i<10; i++){
        //System.out.println(i+" ");
    //}
      // int i=0;
       //while(i<11){
        //System.out.println(i);
        //i++;
       //}
       //int i=0;
       //do{
        //System.out.println(i);
        //i++;
       //}
        //while(i<11);
       // int i =12;
        //while(i<11){
     // System.out.println(i);
       // }
        //do{
          //  System.out.println("hello world");
            //            while(i<11);
        //}
        //int sum =0;
        //for(int i=1; i<=n;i++){
          //  sum = sum+i;
        //}
       // System.out.println(sum);
      // for(int i =1;i<11;i++){
        //System.out.println(i*n);
       //}
       //print all thebnumbers till n
      // Scanner sc= new Scanner(System.in);
       //int n= sc.nextInt();
       //n= 25;
       //for (int i =1; i<n;i++){
       //if(i%2==0){
            //    System.out.println(i);
       //}
      //}
      Scanner sc= new Scanner(System.in);
      int input;
      do{
        int marks= sc.nextInt();
        if(marks>=90 && marks<=100){
          System.out.println("this is good marks");
        }
      else if(marks>=60 && marks<=89){
        System.out.println("this is also good");
      }
      else if(marks>=0 && marks<=59){
      System.out.println("this is also good as well");
      }
      else {
        System.out.println("invalid");
      }
      System.out.println("want to contine yes(0)or no(1)");
      input = sc.nextInt();
    }
    while(input==1);
  }
}

