import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Easy {
    public static void main(String[] args) throws IOException {
        File file = new File("text");
        if (file.createNewFile()){
            System.out.println("File is created!");
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите текст: ");
        String str = sc.nextLine();

        FileWriter writer = new FileWriter (file);
        writer.write(str);
        writer.close();


    }
}
