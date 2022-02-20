package boj.io.boj11720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cnt = Integer.parseInt(br.readLine());
        String str = br.readLine(); //문자열로 입력받기

        int result = 0;
        for(int i=0; i<cnt; i++) {
            result+=str.charAt(i)-48; //charAt : String 타입으로 받은 문자열을 char 타입으로 한글자만 받음
            //숫자 0~9 : 유니코드상 48~27
        }
        System.out.println(result);
    }
}
