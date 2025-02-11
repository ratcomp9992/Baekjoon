import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    static int n;

    public static void main (String[] args) throws IOException {
        BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufw = new BufferedWriter(new OutputStreamWriter(System.out));

        n = Integer.parseInt(bufr.readLine());
        int[] arr = new int[n + 1];
        arr[0] = 0;

        int answer = 0;
        if (n != 0) {
            arr[1] = 1;

            if (n == 1) {
                answer = arr[1];
            } else {
                answer = func(arr, 2);
            }
        }

        bufw.write(Integer.toString(answer));

        bufw.flush();
        bufw.close();
        bufr.close();
    }

    static int func(int[] arr, int index) {
        if (index > n) {
            return arr[index - 1];
        } else {
            arr[index] = arr[index - 2] + arr[index - 1];
            return func(arr, index + 1);
        }


    }
}