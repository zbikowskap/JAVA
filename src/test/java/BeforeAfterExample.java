import org.junit.jupiter.api.*;

public class BeforeAfterExample {

    @BeforeEach
    void setUpBeforeEach() {
        System.out.println("@BeforeEach");
    }

    @AfterEach
    void setUpAfterEach() {
        System.out.println("@AfterEach");
    }

    @BeforeAll
    static void setUpBeforeAll() {
        System.out.println("@BeforeAll");
    }

    @AfterAll
    static void setUpAfterAll() {
        System.out.println("@AfterAll");
    }


    @Test
    void test1() {
        System.out.println("Test One");
    }

    @Test
    void test2() {
        System.out.println("Test Two");
    }

}
