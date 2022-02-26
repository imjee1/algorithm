package boj.io.boj2445;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_bak {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());

        for(int i=1; i<=num; i++) {
            String result1 = "";
            String result2 = "";
            for(int j=0; j<i; j++) {
                result1 += "*";
            }
            for(int t=0; t<num-i; t++) {
                result2 += " ";
            }
            sb.append(result1).append(result2).append(result2).append(result1).append("\n");
        }
        for(int i=1; i<=num; i++) {
            String result1 = "";
            String result2 = "";
            for(int j=0; j<i; j++) {
                result1 += " ";
            }
            for(int t=0; t<num-i; t++) {
                result2 += "*";
            }
            sb.append(result2).append(result1).append(result1).append(result2).append("\n");
        }
        System.out.println(sb);
    }
}