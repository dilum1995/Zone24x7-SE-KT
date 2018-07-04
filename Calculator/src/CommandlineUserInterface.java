public class CommandlineUserInterface implements Userinterface {

    private String[] args;

    @Override
    public void show() {
        // Pass args array as a parameter to the Arguments object
        Arguments arguments = new Arguments(args);

        // Create an instance of the simpleCalculatorFactory class
        Calculator calc = simpleCalculatorFactory.create(arguments);

        // Display result of operation
        System.out.println(calc.name() + " = " + calc.calculate());
    }
}
