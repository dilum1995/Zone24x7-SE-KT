public class MinCalculator implements Calculator {
    private int[] operands;

    public MinCalculator(int[] operands) {
        this.operands = operands;
    }

    // Implementing calculate() and name() methods from supertype

    // Calculates minimum
    @Override
    public int calculate() {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < operands.length; i++) {
            if (min > operands[i]) {
                min = operands[i];
            }
        }

        return min;
    }

    // Returns name of operator
    @Override
    public String name() {
        return "Min";
    }
}
