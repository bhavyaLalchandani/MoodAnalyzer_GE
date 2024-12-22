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
    public String analyseMood() throws MoodAnalysisException {
        try {
            if (message == null) {
                throw new MoodAnalysisException(MoodAnalysisError.NULL, "Mood is NULL");
            }
            if (message.trim().isEmpty()) {
                throw new MoodAnalysisException(MoodAnalysisError.EMPTY, "Mood is EMPTY");
            }
            if (message.toLowerCase().contains("sad")) {
                return "SAD";
            } else {
                return "HAPPY";
            }
        } catch (MoodAnalysisException e) {
            throw e;
        }
    }
}