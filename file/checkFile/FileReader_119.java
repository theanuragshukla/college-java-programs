import java.io.File;

public class FileReader_119 {
    public static void main(String[] args) {
        String fileName = "myfile.txt";
        File file = new File(fileName);

        if (file.exists()) {
            System.out.println("File exists");

            if (file.isFile()) {
                System.out.println("It is a file");

                if (file.canRead()) {
                    System.out.println("File is readable");
                } else {
                    System.out.println("File is not readable");
                }
            } else {
                System.out.println("It is not a file");
            }
        } else {
            System.out.println("File does not exist");
        }
    }
}
