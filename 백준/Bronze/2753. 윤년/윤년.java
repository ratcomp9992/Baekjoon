import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufw = new BufferedWriter(new OutputStreamWriter(System.out));

        int year = Integer.parseInt(bufr.readLine());

        if ((year % 4 == 0 &&
            year % 100 != 0) ||
            year % 400 == 0) {
            bufw.write("1");
        }
        else {
            bufw.write("0");
        }

        bufw.flush();
        bufw.close();
        bufr.close();
    }
}