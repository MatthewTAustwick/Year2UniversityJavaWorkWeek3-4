package genericMethods;

class IndexingError extends Exception
{
    /**
     * Used to report an index out of bounds error
     **/
    IndexingError() {
        super("Index out of bounds");
    }
}