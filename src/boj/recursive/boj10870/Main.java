package boj.recursive.boj10870;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//피보나치 Fn = Fn-1 + Fn-2 (n ≥ 2)
public class Main {
    public static void main(String[] args) throws IOException {
        //0 1 1 2 3 5 8
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        System.out.println(fibonacci(num));
    }

    public static int fibonacci(int n) {
        //base case
        if(n == 0) {
            return 0;
        } else if(n == 1) {
            return 1;
        }
        //recursive case
        return fibonacci(n-1)+fibonacci(n-2);
    }
}
