public class DataProcessor {
    int integerValue;
    double decimalValue;
    String text;

    public void displayCalculatedSum(int firstNumber, int secondNumber) {
        int additionResult = firstNumber + secondNumber;
        System.out.println("Result: " + additionResult);
    }

    public void displayUpperCaseString(String inputText) {
        text = inputText.toUpperCase();
        System.out.println("Updated String: " + text);
    }
}

public class ProgramExecutor {
    public static void main(String[] args) {
        DataProcessor dataHandlerObject = new DataProcessor();
        dataHandlerObject.integerValue = 10; 
        dataHandlerObject.decimalValue = 20.5; 
        dataHandlerObject.text = "hello"; 
        
        dataHandlerObject.displayCalculatedSum(dataHandlerObject.integerValue, 5);
        dataHandlerObject.displayUpperCaseString("world");
    }
}