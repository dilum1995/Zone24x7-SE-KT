public class Arguments {
    private String[] args;

    public Arguments(String[] args) {
        this.args = args;
    }

    // Return operator specified in Command Line Arguments
    public String getOperator() {
        return args[0];
    }

    // Convert values in Command Line Arguments to integers and return
    public int[] getOperands() {
        int[] n = new int[args.length -1];

        for (int i = 1; i < args.length; i++) {
            n[i - 1] = Integer.parseInt(args[i]);
        }

        return n;
    }
}
