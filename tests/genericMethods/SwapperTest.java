package genericMethods;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SwapperTest {

    @Test
    void testStringSwap1And2OutOf5() throws IndexingError {

        String[] stringArray = {"Matthew", "Sam", "Potato", "Jack", "Luqmaan"};
        String[] expectedArray = {"Matthew", "Potato", "Sam", "Jack", "Luqmaan"};
        assertArrayEquals(expectedArray, Swapper.swap(stringArray,1,2));
    }

    @Test
    void testStringSwap12nd5OutOf8() throws IndexingError {

        String[] stringArray = {"Matthew", "Sam", "Potato", "Jack", "Luqmaan", "Jeff", "Zelda","Link"};
        String[] expectedArray = {"Matthew", "Sam","Jeff", "Jack", "Luqmaan", "Potato","Zelda","Link"};
        assertArrayEquals(expectedArray, Swapper.swap(stringArray,2,5));
    }

    @Test
    void testIntegerSwap1And5OutOf10() throws IndexingError {

        Integer[] intArray = {1,6,3,4,5,2,7,8,9,10};
        Integer[] expectedArray = {1,2,3,4,5,6,7,8,9,10};
        assertArrayEquals(expectedArray, Swapper.swap(intArray,1,5));
    }

    @Test
    void testDoubleSwap4And7OutOf10() throws IndexingError {

        Double[] doubleArray = {0.1,0.2,0.3,0.4,0.8,0.6,0.7,0.5,0.9,1.0};
        Double[] expectedArray = {0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,0.9,1.0};
        assertArrayEquals(expectedArray, Swapper.swap(doubleArray,4,7));
    }

}