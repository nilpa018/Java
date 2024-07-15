import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 */
public class Hello {
    public static void main(String[] args) {
        System.out.println("Saisissez du texte :");
        try {
            BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
            String s = bufferRead.readLine();
            System.out.println(s);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {

        }

    }
}
