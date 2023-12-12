public class Calculator {
    int firstOperand;
    double secondOperand;
    String convertedUppercaseText;

    public void displayCalculatedSum(int firstOperand, int secondOperand) {
        int additionResult = firstOperand + secondOperand;
        System.out.println("Result: " + additionResult);
    }

    public void displayUpperCaseString(String inputText) {
        convertedUppercaseText = inputText.toUpperCase();
        System.out.println("Updated String: " + convertedUppercaseText);
    }
}

public class CalculatorApp {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.firstOperand = 10; 
        calculator.secondOperand = 20.5; 
        calculator.text = "hello"; 
        
        calculator.displayCalculatedSum(calculator.firstOperand, 5);
        calculator.displayUpperCaseString("world");
    }
}