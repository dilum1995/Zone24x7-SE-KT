public class simpleCalculatorFactory implements CalculatorFactory {

    //in the factory pattern these violation automatically
    public static Calculator create(Arguments arguments) {
        // Retrieve and assign operator and array of operands


        String operator = arguments.getOperator();
        int[] operands = arguments.getOperands();
        Calculator calc = null;

        // Create an object of the subtypes of Calculator according to the Command Line Argument
        if (operator.equalsIgnoreCase("Min")) {
            calc = new MinCalculator(operands);
        }
        else if (operator.equalsIgnoreCase("Max")) {
            calc = new MaxCalculator(operands);
        }

        return calc;

    }
}
