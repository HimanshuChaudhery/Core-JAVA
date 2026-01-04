import java.util.Scanner;

public class switchCase{
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);

        char choice;

        System.out.println("----------- Normal Calculator ------------------");
        System.out.println("Options: ");
        System.out.println("a. ADD");
        System.out.println("b. SUBTRACT");
        System.out.println("c. MULTIPLY");


        System.out.println("Enter your choice: ");
        choice = sc.next().charAt(0);
        switch(choice){
            case 'a':
                System.out.println("ADDITION");
                break;
            case 'b':
                System.out.println("SUBTRACTION");
                break;

            case 'c':
                System.out.println("MULTIPLY");
                break;

            default:
                System.out.println("Not a choice!");
                break;
        }

    }
}