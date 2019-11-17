package genericMethods;

import java.util.Arrays;

public class Swapper {
    public static <T> T[] swap(T[] array, int index1, int index2) throws IndexingError {
        if (index1 < 0 || index1 > array.length) { //This checks to make sure that the given index is within the boundaries of the array and does not exceed it or go below it.
            throw new IndexingError(); //Outputs an error which is defined by its own class - this only occurs if the given index is NOT in the array.
        } else if (index2 < 0 || index2 > array.length) { //This checks to make sure that the given index is within the boundaries of the array and does not exceed it or go below it.
            throw new IndexingError(); //Outputs an error which is defined by its own class - this only occurs if the given index is NOT in the array.
        }
        T temp = array[index1]; //Creates a temporary variable used for swapping purposes - assigns the first item's value
        array[index1] = array[index2]; //Moves the second item to the first item's slot (and replaces it)
        array[index2] = temp; //Assigns the 2nd value to the 1st value that was copied - subsequently swapping it

        return array;
    }
}