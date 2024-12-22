public class Main {
    public static void main(String[] args) {
        // Using the parameterized constructor
        MoodAnalyzer moodAnalyser1 = new MoodAnalyzer("I am in Sad Mood");
        String result1 = moodAnalyser1.analyseMood();
        System.out.println("Message: " + moodAnalyser1.getMessage() + " | Mood: " + result1);

        // Using the default constructor and setting the message later
        MoodAnalyzer moodAnalyser2 = new MoodAnalyzer();
        moodAnalyser2.setMessage("I am in Any Mood");
      
        String result2 = moodAnalyser2.analyseMood();
        System.out.println("Message: " + moodAnalyser2.getMessage() + " | Mood: " + result2);
    }
}