package Calculator;

public class Calculator {

    private AbstractOperation operation;
    public Calculator(AbstractOperation operation){
        this.operation = operation;
    }

    public double  Calculator(int num1, int num2){
        double result = 0;
        result = operation.operate(num1,num2);
//        if(equalSign.equals("+")){
//            result = addoperation.operate(num1,num2);
//        } else if (equalSign.equals("-")) {
//            result = substractoperation.operate(num1,num2);
//        } else if (equalSign.equals("/")) {
//            result = divideOperation.operate(num1,num2); //몫
//        } else if (equalSign.equals("%")) {
//            result = num1 % num2; // 나머지
//        } else if (equalSign.equals("*")) {
//            result = multiplyOperation.operate(num1,num2);
//        }
        return result;
    }
}
