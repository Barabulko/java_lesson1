import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();

        char operator = scanner.next().charAt(0);

        int num2 = scanner.nextInt();

        System.out.println("=");

        int result = 0;

        switch(operator){
            case '+':
                result = num1+num2;
                break;
            case '-':
                result = num1-num2;
                break;
            case '*':
                result = num1*num2;
                break;
            case '/':
                result = num1/num2;
                break;
            default:
                System.out.println("wrong operation");
                return;
        }
        System.out.println(result);
    }
}
