package C02ClassBasic;

import java.util.Scanner;

public class C0201MethodPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(isPrime(n)==true){
            System.out.println("소수입니다.");
        }
        else{
            System.out.println("소수가 아닙니다.");
        }
    }
    public static boolean isPrime(int K){
        boolean c = false;
        for(int i = 2 ; i < K ; i++) {
            if (K % i == 0) {
                return c;
            }
        }
        return true;
    }


}
