import java.util.Scanner;
public class Example{
    public static void main(String [] args){
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Eneter Your Age:");
        int age = scan.nextInt();
        if (age >= 18){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        }
    }
