import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        final String fizz = "Fizz";
        final String buzz = "Buzz";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int number = scanner.nextInt();
        if (number % 5 == number % 3){
            System.out.println(fizz+buzz);
        }else if (number % 5 == 0){
            System.out.println(fizz);
        } else if (number % 3 == 0) {
            System.out.println(buzz);
        }else
            System.out.println(number);
    }
}
