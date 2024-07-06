public class ValidPocketException extends Exception {
    public ValidPocketException(int pocketNumber) {
        super("Pocket number " + pocketNumber + " is invalid");
    }
}
