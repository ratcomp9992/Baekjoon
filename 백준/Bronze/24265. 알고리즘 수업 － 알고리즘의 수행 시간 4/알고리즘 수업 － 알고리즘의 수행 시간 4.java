import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufw = new BufferedWriter(new OutputStreamWriter(System.out));

        long n = Long.parseLong(bufr.readLine());

        bufw.write(Long.toString((n * (n - 1)) / 2) + "\n2");

        bufw.flush();
        bufw.close();
        bufr.close();
    }
}