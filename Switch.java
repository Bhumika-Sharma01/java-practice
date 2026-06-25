import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
       // int days = sc.nextInt();
        //switch (days) {
           // case 1:
             //   System.out.println("monday");
               // break;
                //case 2:
                  //  System.out.println("tuesday");
                   // break;
            //case 3:
              //  System.out.println("wednesday");
                //break;
                //default:
                  //  System.out.println("invalid");
        //}
       // int button= sc.nextInt();
        //switch(button){
    //case 1:
    //System.out.println("hello");
    //break;
    //case 2:
    //System.out.println("namaste");
    //break;
    //case 3:
    //System.out.println("ram ram");
    //break;
    //default:
       // System.out.println("invalid");
       int  a= sc.nextInt();
       System.out.println("enter the first no");
       int b= sc.nextInt();
       System.out.println("enter the second no");
       System.out.println("enter the choice");
       int choice = sc.nextInt();
       switch(choice){
        case 1:
            System.out.println("addition="+(a+b));
            break;
            case 2:
                System.out.println("sub="+(a-b));
                break;
                case 3:
                    System.out.println("mul="+(a*b));
                    break;
                    default:
                        System.out.println("invalid");

       }
}
    }


