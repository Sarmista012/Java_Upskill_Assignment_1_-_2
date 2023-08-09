package Training;

import java.util.Scanner;

class Calculator {
    private double operand1;
    private double operand2;
    private char operator;

    public Calculator(double operand1, double operand2, char operator) {
        this.operand1 = operand1;
        this.operand2 = operand2;
        this.operator = operator;
    }

    public double add() {
        return operand1 + operand2;
    }

    public double subtract() {
        return operand1 - operand2;
    }

    public double multiply() {
        return operand1 * operand2;
    }

    public double divide() {
        if (operand2 == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return operand1 / operand2;
    }
}

 public class Java_Upskill_Assignment_1 {
    public static void main(String[] args) {
    	
    	        Scanner scanner = new Scanner(System.in);

    	        System.out.print("Enter operand 1: ");
    	        double operand1 = scanner.nextDouble();

    	        System.out.print("Enter operand 2: ");
    	        double operand2 = scanner.nextDouble();

    	        System.out.print("Enter operator (+, -, *, /): ");
    	        char operator = scanner.next().charAt(0);

    	        Calculator calculator = new Calculator(operand1, operand2, operator);

    	        double result;

    	        switch (operator) {
    	            case '+':
    	                result = calculator.add();
    	                break;
    	            case '-':
    	                result = calculator.subtract();
    	                break;
    	            case '*':
    	                result = calculator.multiply();
    	                break;
    	            case '/':
    	                try {
    	                    result = calculator.divide();
    	                } catch (ArithmeticException e) {
    	                    System.out.println("Error: " + e.getMessage());
    	                    return;
    	                }
    	                break;
    	            default:
    	                System.out.println("Invalid operator");
    	                return;
    	        }

    	        System.out.println("Result: " + result);

    	  
    	        scanner.close();
    	    }
    	}
