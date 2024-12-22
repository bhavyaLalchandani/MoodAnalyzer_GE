public class Main {
    public static void main(String[] args) {
        try {
            // Test Case 1: Constructor with "I am in Sad Mood"
            MoodAnalyzer moodAnalyser1 = new MoodAnalyzer("I am in Sad Mood");
            String result1 = moodAnalyser1.analyseMood();
            System.out.println("Message: " + moodAnalyser1.getMessage() + " | Mood: " + result1);

            // Test Case 2: Constructor with NULL mood
            MoodAnalyzer moodAnalyser2 = new MoodAnalyzer(null);
            String result2 = moodAnalyser2.analyseMood();
            System.out.println("Message: " + moodAnalyser2.getMessage() + " | Mood: " + result2);
        } catch (MoodAnalysisException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            // Test Case 3: Constructor with Empty mood
            MoodAnalyzer moodAnalyser3 = new MoodAnalyzer("");
            String result3 = moodAnalyser3.analyseMood();
            System.out.println("Message: " + moodAnalyser3.getMessage() + " | Mood: " + result3);
        } catch (MoodAnalysisException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}