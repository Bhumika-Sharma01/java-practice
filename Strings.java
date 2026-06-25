import java.util.Scanner;
public class Strings {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
         int size= sc.nextInt();
    // String arr[]= new String[size];
    // int totallength= sc.nextInt();
    // for(int i=0; i<size; i++){
    //  arr[i]= sc.next();

    // totallength+= arr[i].length();
    // }
    // System.out.println(totallength);
    String strs[] = {"flight", "flower", "flow"};
    String prefixString ="fl";
    for(int i=0; i<3; i++){
     strs[i]= sc.next();
    }
    for(int i=0; i<strs.length; i++){
        for(int j=0; j<strs.length; j++){
    }
    if(strs== prefixString){
        System.out.println("fl");
    } 
    else {
        System.out.println("wrong string");
    }
    }
}
}
