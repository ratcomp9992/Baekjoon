import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufw = new BufferedWriter(new OutputStreamWriter(System.out));

        char[] input = bufr.readLine().toCharArray();
        int left = 0;
        int right = input.length - 1;
        boolean check = true;

        while (left < right) {
            if (input[left] != input[right]) {
                check = false;
                break;
            }
            left++;
            right--;
        }

        bufw.write(Integer.toString((check) ? 1 : 0));
        bufw.flush();
        bufw.close();
        bufr.close();
    }
}