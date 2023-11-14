import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;


public class Main {
    public static void main (String[] args) throws IOException {
        BufferedWriter bufw = new BufferedWriter(new OutputStreamWriter(System.out));

        bufw.write("|\\_/|\n" +
                "|q p|   /}\n" +
                "( 0 )\"\"\"\\\n" +
                "|\"^\"`    |\n" +
                "||_/=\\\\__|");

        bufw.flush();
        bufw.close();
    }
}