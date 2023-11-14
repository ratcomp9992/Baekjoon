import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufw = new BufferedWriter(new OutputStreamWriter(System.out));

        int x = Integer.parseInt(bufr.readLine());
        int y = Integer.parseInt(bufr.readLine());
        if (x > 0 && y > 0) {
            bufw.write("1");
        }
        else if (x < 0 && y > 0) {
            bufw.write("2");
        }
        else if (x < 0 && y < 0) {
            bufw.write("3");
        }
        else {
            bufw.write("4");
        }

        bufw.flush();
        bufw.close();
        bufr.close();
    }
}