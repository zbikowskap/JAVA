package exceptions;

/**
 * Moj wlasny wyjatek typu UNCHECKED.
 */
public class MyOwnUncheckedException extends RuntimeException {

    /**
     * Taki konstruktor pozwoli tworzac wyjatki dodawac im wiadomosci.
     */
    public MyOwnUncheckedException(String message) {
        super(message);
    }

}
