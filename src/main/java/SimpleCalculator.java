

public class SimpleCalculator {
    private double firstNumber;
    private double secondNumber;

    public double getFirstNumber() {
        return firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }
    public void getAdditionResult(){
        firstNumber += secondNumber;
    }
    public void getSubtractionResult(){
        secondNumber -= firstNumber;
    }
    public void getMultiplicationResult(){
        //trường giá trị nhân
        firstNumber *= secondNumber;
    }
    public double getDivisionResult() {
        if (secondNumber == 0) {
            return 0;
        } else {
            firstNumber /= secondNumber;
        }
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }
}
