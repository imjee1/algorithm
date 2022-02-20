package boj.io.boj11721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();
        int a = 0;
        while(a<str.length()) {
            for(int i=a; i<a+10; i++) {
                if(i>=str.length()) {
                    break;
                }
                sb.append(str.charAt(i));
            }
            sb.append("\n");
            a += 10;
        }
        System.out.println(sb);
    }
}
