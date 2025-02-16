import java.util.*;
class Home{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int add,sub,mul,div,mod;
        System.out.println("Enter the 1st number");
        int a= sc.nextInt();
        System.out.println("Enter the 2nd number");
        int b= sc.nextInt();
        System.out.println("Enter the operation (1: Add, 2: Sub, 3: Mul, 4: Div, 5: Mod):");
        int button= sc.nextInt();
        add= a+b;
        sub= a-b;
        mul=a*b;
        div=a/b;
        mod=a%b;

        switch(button){
            case 1: System.out.println("Addition is ",+ add);
            break;
            case 2: System.out.println("Subtraction is ",+ sub);
            break;
            case 3: System.out.println("Multiplication is ",+ mul);
            break;
            case 4: System.out.println("Division is ",+ div);
            break;
            case 5: System.out.println("Modulous is ",+ mod);
            break;
            default: System.out.println("Invalid option!");
        }
        sc.close();
    }
}