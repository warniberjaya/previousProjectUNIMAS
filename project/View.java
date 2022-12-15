import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class View {
    File file = new File("C:\\Users\\Asus\\Documents\\unimas\\sem 4\\java\\project\\Record.txt");
    Scanner scan = new Scanner(file);

    public View() throws FileNotFoundException 
    {
        while(scan.hasNextLine()){
            System.out.println(scan.nextLine());
        }
    }
}