public class MoodAnalyzer {
    private String message;

    // Default constructor
    public MoodAnalyzer() {
    }

    // Parameterized constructor
    public MoodAnalyzer(String message) {
        this.message = message;
    }

    // Getter for message
    public String getMessage() {
        return message;
    }

    // Setter for message
    public void setMessage(String message) {
        this.message = message;
    }

    // Analyse mood based on the message field
    public String analyseMood() {
        if (message != null && message.toLowerCase().contains("sad")) {
            return "SAD";
        } else {
            return "HAPPY";
        }
    }
}