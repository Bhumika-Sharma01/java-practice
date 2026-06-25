import java.util.Scanner;
public class Pattern {
    public static void main(String[] args) {
        //int n= 4;
      //  int m= 5;
        //outer loop
        //for(int i=1; i<=n; i++){
           // inner loop
           // for( int j=1; j<=m; j++){
              //  System.out.print("*");
            //}
             //   System.out.println(" ");
           // }
         //  int n=4;
           //int m=5;
           //for(int i=1; i<=4; i++){
            //for(int j=1; j<=5; j++){
              //  if(i==1 || j==1 || i==n || j==m){
                //    System.out.print("*");
               // }
                //else{
                    //System.out.print(" ");
              //  }
            //}
         //  System.out.println();
           //}
          // int n= 4;
           //for(int i=1; i<=n; i++){
            //for(int j=1; j<=i; j++){
              //  System.err.print("*");
            //}
           // System.out.println();
           //}
          // int n= 4;
           //for(int i=n; i>=1; i--){
           // for(int j=1; j<=i; j++){
             //   System.err.print("*");
            //}
            //System.out.println();
          // }
          //int n =4;
         // for(int i=1; i<=n; i++){
            //inner loop - for space
           // for(int j=1;j<=n-i; j++){
             // System.out.print(" ");
            //}
            // inner loop- for print star
            //for( int j=1; j<=i; j++){
              //System.out.print("*");
            //}
           // System.out.println();
         // }
       // int n=5;
       // for(int i=1; i<=n; i++){
         // for(int j=1; j<=i; j++){
           // System.out.print(j+" ");
         // }
         // System.out.println();
        //}
//int n=5;
  //      for(int i=1; i<=n; i++){
    //      for(int j=1; j<= n-i+1; j++){
      //      System.out.print(j);
        //  }
          //System.out.println();
        //}
       // int n=5;
        //int number=1;
        //for(int i= 1; i<=n; i++){
          //for(int j=1; j<=i; j++){
            //System.out.print(number+" ");
            //number= number+1;
          //}
         // System.out.println();
        //}
        //int n=5;
       // for(int i=1; i<=n; i++){
          //for(int j=1; j<=i; j++){
           // int sum= i+j;
           // if((sum%2==0)){
             // System.out.print(1+" ");
            //}
            //else{
              //System.out.print(0+" ");
            //}
            //}
            //System.out.println();
          //}
         // int n=5;
         // for(int i=1; i<=n; i++){
           // for(int j=1; j<=n-i; j++){
             // System.out.print(" ");
            //}
            //for(int j=1; j<=n; j++){
              //System.out.print("*");
            //}
            //System.out.println();
          //}
         // int n=5;
          //for(int i=1; i<=n; i++){
            //for(int j=1; j<=n-i;j++){
              //System.out.print(" ");
            //}
            //for(int j=1; j<=i; j++){
              //System.out.print(i+" ");
            //}System.out.println();
          //}
          // butterfly pattern
         // int n = 5;
          //upper half
          //for(int i=1; i<=n; i++){
            //inner loop for star
            //for(int j=1; j<=i; j++){
              //System.out.print("*");
            //}
            // loop for spaces
            //int spaces= 2*(n-i);
            //for(int j= 1; j<=spaces; j++){
              //System.out.print(" ");
            //}
            //second side star 
           // for(int j=1; j<=i; j++){
             // System.out.print("*");
            //}
            //System.out.println();
          //}
          //lower half
          //for(int i=n; i>=1; i--){
            //inner loop for star
            //for(int j=1; j<=i; j++){
             // System.out.print("*");
            //}
            // loop for spaces
            //int spaces= 2*(n-i);
            //for(int j= 1; j<=spaces; j++){
              //System.out.print(" ");
            //}
            //second side star 
            //for(int j=1; j<=i; j++){
              //System.out.print("*");
            //}
            //System.out.println();
          //}
}
}