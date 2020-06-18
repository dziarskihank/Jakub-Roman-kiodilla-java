package com.kodilla.testing.collection;

import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.*;

import java.util.ArrayList;

public class CollectionTestSuite {
    @Before
    public void before() {
        System.out.println("Collection Test Case: begin");
    }

    @After
    public void after() {
        System.out.println("Collection Test Case: end");
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Collection Test Suite: begin");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("Collection Test Suite: end");
    }

    @Test

    // poprawić test.
    public void testOddNumbersExterminatorEmptyList() {

        // jedyne co powinieneś tutaj zrobić, to wywołać metodę z klasy exterminate z klasy "OddNumbersExterminator"
        // i zobaczyć, czy zwraca dobry wynik. Czyli:

        // Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        // numbers - dla tej listy wywolamy metode
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        // expectedResult - to nasza metoda powinna zwrocic (bo ma zwrocic tylko parzyste)
        ArrayList<Integer> expectedResult = new ArrayList<>();
        expectedResult.add(2);
        expectedResult.add(4);

        // When
        ArrayList<Integer> result = oddNumbersExterminator.exterminate(numbers);

        // Then
        Assert.assertEquals(expectedResult, result);
    }
}