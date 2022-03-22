package boj.recursive.boj10872;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//팩토리얼 n*(n-1)
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        System.out.println(factorial(num));

    }
    public static int factorial(int n) {
        //base case : 끝날 수 있는 조건
        if(n <= 0) {
            return 1;
        }
        //recursive case
        return n*factorial(n-1);
    }
}
