package C02ClassBasic;

public class C0208RecursiveBasic {
    public static void main(String[] args) {

        System.out.println(sumAcc(10));
//        팩토리얼 값 구하기
//        factorial(5)
        System.out.println(factorial(5));

        int a=0;
        int b=1;
        int c=0;
        int q=10;
        for(int i=3 ; i <= q ; i++){
            c=a+b;
            a=b;
            b=c;
        }
        System.out.println(b);
        System.out.println(fivonacci(100));
    }
    public static int fivonacci(int i){//피보나치 구현
        if(i<=2){
            return 1;
        }
        return fivonacci(i-1)+fivonacci(i-2);
    }
    public static int factorial(int K){
        if(K==1){
            return 1;
        }
        return K*factorial(K-1);
    }
    public static int sumAcc(int n){
        if(n==1) {
            return 1;
        }
        return n + sumAcc(n - 1);
    }
}
