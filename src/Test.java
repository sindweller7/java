import java.io.FileWriter;
import java.io.IOException;

public class Test {
    public static void main(String[] args) {
        String sb = "12345";
        try {
            FileWriter fw = new FileWriter("c:/test.txt");
            fw.write(sb.toString());
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}