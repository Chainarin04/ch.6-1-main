import com.npru.se.*;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IO.print("input yourname : ");
        String name = sc.nextLine();
        IO.print("input your age: ");
        byte age = sc.nextByte();
        boolean isVote = age >= 18;

        IO.println("Your name is : "+name+" and Age is "+age);

        if(isVote){
            IO.print(name.toUpperCase()+ " You can Vote");
            }else{
                IO.println(name.toUpperCase()+ " You can not Vote");
                }



//       int amontofStudent = 20;
//         double price = 25.50;
//         String productName = "Mocha Coffee";

//         System.out.printf("Number of Student  :  %d   %n",amontofStudent);
//         System.out.printf("Price is  :  %.2f   %n",price);
//         System.out.printf("%s : %.2f \n",productName,price);
//          System.out.printf("%s : %.2f \n","Late Coffee", 45.50);
//         System.out.println("Hello Main");
//         SubMain sub = new SubMain();
//         SubMain.HellloSubMain(); 
    }
}