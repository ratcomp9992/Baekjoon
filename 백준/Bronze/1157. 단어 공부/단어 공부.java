import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufw = new BufferedWriter(new OutputStreamWriter(System.out));

        char[] input = bufr.readLine().toUpperCase().toCharArray();
        int[] alphabet = new int[26];

        for (int i = 0; i < input.length; i++) {
            alphabet[input[i] - 65]++;
        }

        int max = Integer.MIN_VALUE;
        String output = Character.toString((char)(input[0] + 65));;

        for (int i = 0; i < alphabet.length; i++) {
            if (alphabet[i] != 0) {
                if (max == alphabet[i]) {
                    output = "?";
                }
                else if (max < alphabet[i]) {
                    max = alphabet[i];
                    output = Character.toString((char)(i + 65));
                }
            }
        }

        bufw.write(output);
        bufw.flush();
        bufw.close();
        bufr.close();
    }
}