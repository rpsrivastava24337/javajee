class CommandLineArgAdd {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int result = a + b;
        System.out.println("The Addition of " + a + " and " + b + " is " + result);
    }
}