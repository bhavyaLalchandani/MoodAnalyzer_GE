public class Main {
    public static void main(String[] args) {
        // Test Case 1: Constructor with "I am in Sad Mood"
        MoodAnalyzer moodAnalyser1 = new MoodAnalyzer("I am in a Sad Mood");
        String result1 = moodAnalyser1.analyseMood();
        System.out.println("Message: " + moodAnalyser1.getMessage() + " | Mood: " + result1);

        // Test Case 1.1: Constructor with "I am in Happy Mood"
        MoodAnalyzer moodAnalyser2 = new MoodAnalyzer("I am in a Happy Mood");
        String result2 = moodAnalyser2.analyseMood();
        System.out.println("Message: " + moodAnalyser2.getMessage() + " | Mood: " + result2);

        // Test Case 2: Constructor with null mood
        MoodAnalyzer moodAnalyser3 = new MoodAnalyzer(null);
        String result3 = moodAnalyser3.analyseMood();
        System.out.println("Message: " + moodAnalyser3.getMessage() + " | Mood: " + result3);
    }
}