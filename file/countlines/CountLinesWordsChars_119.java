import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountLinesWordsChars_119{

    public static void main(String[] args) throws IOException {
        // Provide the path of the file
        String filePath = "myfile.txt";

        // Initialize counters for lines, words, and characters
        int lines = 0;
        int words = 0;
        int characters = 0;

        // Read the file
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;
        while ((line = reader.readLine()) != null) {
            // Increment the lines counter
            lines++;
            // Split the line into words
            String[] wordsArray = line.split(" ");
            // Increment the word counter by the number of words in the line
            words += wordsArray.length;
            // Increment the character counter by the number of characters in the line
            characters += line.length();
        }
        // Close the reader
        reader.close();

        // Print the counters
        System.out.println("Lines: " + lines);
        System.out.println("Words: " + words);
        System.out.println("Characters: " + characters);
    }
}
