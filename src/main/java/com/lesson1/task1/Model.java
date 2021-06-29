public class Model {

    public static final String FIRST_PART = "Hello";
    public static final String SECOND_PART = "world!";
    public static final String INVALID_INPUT = "Invalid input!";

    private boolean isFirst;
    private boolean isSecond;
    private String message;

    public boolean isFinished(String input) {
        addInput(input);
        return checkState();
    }

    public void addInput(String input) {
        if (input.equals(FIRST_PART)) {
            isFirst = true;
            setMessage(null);
        }
        else if (input.equals(SECOND_PART)) {
            if (isFirst) {
                isSecond = true;
                setMessage(FIRST_PART + " " + SECOND_PART);
            } else {
                setMessage(INVALID_INPUT);
            }
        } else {
            setMessage(INVALID_INPUT);
        }
    }

    public boolean checkState() {
        return isFirst && isSecond;
    }

    private void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

}
