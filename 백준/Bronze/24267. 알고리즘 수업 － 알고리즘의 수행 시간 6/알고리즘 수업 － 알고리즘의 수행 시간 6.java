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

        bufw.write((n * (n - 1) * (n - 2)) / 6 + "\n3");

        bufw.flush();
        bufw.close();
        bufr.close();
    }
}