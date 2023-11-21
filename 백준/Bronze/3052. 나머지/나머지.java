import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufw = new BufferedWriter(new OutputStreamWriter(System.out));

        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int num = Integer.parseInt(bufr.readLine()) % 42;

            if (!arr.contains(num)) {
                arr.add(num);
            }
        }

        bufw.write(Integer.toString(arr.size()));

        bufw.flush();
        bufw.close();
        bufr.close();
    }
}