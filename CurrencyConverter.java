public class CurrencyConverter {
    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        IO.print("If I give you £1, how many Euro will you give me? ");
        double euroOverPoundRatio = scan.nextDouble();
        IO.print("If I give you 1€, how many Sterling pounds will you give me? ");
        double poundOverEuroRatio = scan.nextDouble();
        IO.println("OK, now I know enough.");
        boolean finished = false;
        while (!finished) {
            IO.println();
            IO.println("What would you like to do?");
            IO.println("   1 - Exchange pounds into euro");
            IO.println("   2 - Exchange euro into pounds");
            IO.println("   0 - Exit the program");
            IO.println();
            IO.print(  "> ");
            int choice = scan.nextInt();
            switch (choice) {
            case 1:
                IO.print("How many pounds would you like to convert? ");
                double pounds = scan.nextDouble();
                double euro   = pounds * euroOverPoundRatio;
                IO.println("£" + pounds + " will give you " + euro + "€");
                break;
            case 2:
                IO.print("How many euro would you like to convert? ");
                euro   = scan.nextDouble();
                pounds = euro * poundOverEuroRatio;
                IO.println(euro + "€ will give you £" + pounds);
                break;
            case 0:
                finished = true;
                break;
            default:
                IO.println("Sorry, that is not a valid option");
            }
        }
        IO.println("Exiting the program");
    }
}
