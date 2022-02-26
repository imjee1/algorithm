package boj.io.boj2441;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());
        String result = "";
        String result2 = "";
        for(int i=0; i<num; i++) {
            result2 = "";
            for(int j=num; j>i; j--) {
                result2 +="*";
            }
            sb.append(result).append(result2).append("\n");
            result += " ";
        }
        System.out.println(sb);
    }
}
