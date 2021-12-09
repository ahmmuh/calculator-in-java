public class Main {

    public static void main(String[] args) {
        MakeCalculation makeCalculation = new MakeCalculation();
        System.out.println( "Added " + makeCalculation.add(2,4));
        System.out.println("Divided " + makeCalculation.divide(8,4));
        System.out.println("Minus " + makeCalculation.minus(5,3));
        System.out.println("Multiply " + makeCalculation.multiply(2,3));
    }
}
