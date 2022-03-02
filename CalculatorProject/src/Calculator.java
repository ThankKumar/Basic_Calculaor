import java.util.Scanner;
public class Calculator {
    public static void main(String [] args){
        char operator;
        Double number1, number2, result;
        //create an object of scanner class
        Scanner input = new Scanner(System.in);

        //ask user input operands
        System.out.println("Chose You an Operators: +, -, *, / \n");
        System.out.println("1.Addition:");
        System.out.println("2.Subtraction:");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        operator = input.next().charAt(0);

        //ask user input first operands
        System.out.println("Chose You first Number:\n");
        number1 = input.nextDouble();

        //ask user input second operands
        System.out.println("Chose You Second number:\n");
        number2 = input.nextDouble();

        //Actuaal coding
        switch (operator){
            //additions between two numbers
            case '1':
                result=number1+number2;
                System.out.println(number1 + "+" + number2 + "=" + result);
                break;


            //Subtraction between two numbers
            case '2':
                result=number1-number2;
                System.out.print(number1 + "-" + number2 + "=" + result);
                break;

            //Multiply between two numbers
            case '3':
                result=number1*number2;
                System.out.print(number1 + "*" + number2 + "=" + result);
                break;

            //Devided between two numbers
            case '4':
                result=number1/number2;
                System.out.print(number1 + "/"  +number2 + "=" + result);
                break;

            default:
                System.out.println("Invalid operators");
                break;

        }
        input.close();
    }
}


