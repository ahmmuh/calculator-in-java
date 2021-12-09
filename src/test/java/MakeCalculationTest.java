import static org.junit.jupiter.api.Assertions.*;

class MakeCalculationTest {

    @org.junit.jupiter.api.Test
    void add() {
        MakeCalculation makeCalculation = new MakeCalculation();

        assertEquals(4,makeCalculation.add(2,2));
    }

    @org.junit.jupiter.api.Test
    void divide() {
        MakeCalculation makeCalculation = new MakeCalculation();
        assertEquals(4,makeCalculation.divide(8,2));
    }

    @org.junit.jupiter.api.Test
    void minus() {

        MakeCalculation makeCalculation = new MakeCalculation();
        assertEquals(4,makeCalculation.minus(10,6));
    }

    @org.junit.jupiter.api.Test
    void multiply() {

        MakeCalculation makeCalculation = new MakeCalculation();
        assertEquals(16,makeCalculation.multiply(8,2));
    }
}