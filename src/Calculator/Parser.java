package Calculator;

import java.util.regex.Pattern;

public class Parser {
    private static final String OPERATION_REG = "[+\\-*/]";
    private static final String NUMBER_REG = "^[0-9]*$";

    private final Calculator calculator = new Calculator();

    public Parser parseFirstNum(String firstInput) throws BadInputException {
        // 구현 1.
        boolean regex = Pattern.matches(NUMBER_REG, firstInput);
        if (regex == false) {
            throw new BadInputException("숫자");
        }
        this.calculator.setFirstNumber(Integer.parseInt(firstInput));
        
        return this;
    }

    public Parser parseSecondNum(String secondInput) throws BadInputException {
        // 구현 1.
        boolean regex = Pattern.matches(NUMBER_REG, secondInput);
        if (regex == false) {
            throw new BadInputException("숫자");
        }
        this.calculator.setSecondNumber(Integer.parseInt(secondInput));

        return this;
    }

    public Parser parseOperator(String operationInput) throws BadInputException {
        // 구현 1.
        boolean regex = Pattern.matches(OPERATION_REG, operationInput);
        if (regex == false) {
            throw new BadInputException("연산자");
        }

        if (operationInput.equals("-")){
            this.calculator.setOperation(new SubstractOperation());
        } else if (operationInput.equals("+")) {
            this.calculator.setOperation(new AddOperation());
        } else if (operationInput.equals("/")){
            this.calculator.setOperation(new MultiplyOperation());
        } else if (operationInput.equals("*")) {
            this.calculator.setOperation(new DivideOperation());
        }

        return this;
    }

    public double executeCalculator() {
        return calculator.calculate();
    }
}