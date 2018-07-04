public class MaxCalculator implements Calculator {

    private int[] operands;

    public MaxCalculator(int[] operands) {
        this.operands = operands;
    }

    // Implementing calculate() and name() methods from supertype

    // Calculates maximum
    @Override
    public int calculate() {
        int max = 0;
        for (int i = 0; i < operands.length; i++) {
            if (max < operands[i]) {
                max = operands[i];
            }
        }

        return max;
    }

    // Returns name of operator
    @Override
    public String name() {
        return "Max";
    }

}
