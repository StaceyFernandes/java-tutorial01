package learnings.stacey;


import static org.junit.jupiter.api.Assertions.assertEquals;

class ComparerTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void compareFirstNumberIsGreaterThanSecond() {
        Integer firstNumber = 3;
        Integer secondNumber = 2;

        Comparer comparer = new ComparerImpl();
        Boolean actual = comparer.compare(firstNumber, secondNumber);
        Boolean expected = true;

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void compareFirstNumberIsLessThanSecond() {
        Integer firstNumber = 1;
        Integer secondNumber = 2;

        Comparer comparer = new ComparerImpl();
        Boolean actual = comparer.compare(firstNumber, secondNumber);
        Boolean expected = false;

        assertEquals(expected, actual);
    }
}
