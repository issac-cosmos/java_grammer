package C01Basic;

public class C03Operator {
    public static void main(String[] args) {
//        //산술연산자 : 사칙연산
//        int n1 = 8;
//        int n2 = 3;
//        // *:곱셈 , /:몫 , %:나머지
//        System.out.println("n1 + n2 = " + (n1+n2));
//        System.out.println("n1 - n2 = " + (n1-n2));
//        System.out.println("n1 x n2 = " + (n1*n2));
//        System.out.println("n1 / n2 = " + (n1/n2));
//        System.out.println("n1 % n2 = " + (n1%n2));


//        //대입 연산자
//        int n1 = 7;
//        int n2 = 7;
//        int n3 = 7;
//        n1 = n1-3;
//        n2 -= 3;
//        n3 = -3;
//        System.out.println(n1);
//        System.out.println(n2);
//        System.out.println(n3);
//
//        int n4 = 10;
//        int n5 = 10;
//        n4 /= 3;
//        System.out.println(n4);
//        n5 %= 3;
//        System.out.println(n5);

//        //증감연산자
//        int a = 10;
//        a = a+1;
//        System.out.println(a);//11
//        a += 1;
//        System.out.println(a);//12
//        a++;  //후위증감연산자
//        ++a;  //전위증감연산자
//        System.out.println(a);//14
//
//        int b = 5;
//        int c = b++; // c = 5 , b = 6
//        int d = ++b; // d = 7 , b = 7
//        System.out.println(b);
//        System.out.println(c);
//
//        //논리 연산자 : == , != , > , >= 등
//        char ch1 = 'a';
//        char ch2 = 'b';
//        System.out.println(ch1==ch2);
//        System.out.println(ch1!=ch2);

//        //논리연산자 : && , || , !
//        int num1 = 10;
//        int num2 = 20;
//        boolean result1 = num1 > 5 && num1 < 20;
//        System.out.println(result1);
//
//        boolean result2 = !(num2 <= 10|| num2 >= 30);
//        System.out.println(result2);

        //비트 연산자 :컴푸터의 연산 방식. & , | , ^ , ~ , >> , <<
        int n1 = 5;
        int n2 = 4;
        int n3 = n1 & n2 ;
        System.out.println(n3);
        int n4 = n1 | n2 ;
        System.out.println(n4);
        int n5 = n1 ^ n2 ;
        System.out.println(n5);
        int n6 = ~ n5 ;
        System.out.println(n6);

        //
    }
}
