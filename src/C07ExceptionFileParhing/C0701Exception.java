package C07ExceptionFileParhing;

import java.sql.SQLException;
import java.sql.SQLOutput;
import java.util.Scanner;

public class C0701Exception {
    public static void main(String[] args) {
////        일반적인 예외처리 방식
//        System.out.println("나눗셈 프로그램입니다.");
//        Scanner sc = new Scanner(System.in);
//        try {
//            System.out.println("분자를 입력하세요");
//            int head = Integer.parseInt(sc.nextLine());
//            System.out.println("분모를 입력하세요");
//            int tail = Integer.parseInt(sc.nextLine());
//            int result = head / tail;
//            System.out.println("두수를 나눈값은" + result);
//        }
////        예외가 발생할것으로 예상되는 코드에 try로 감싼다.
//        catch (ArithmeticException error){
//            System.out.println("0으로 나누시면 안됩니다.");
//            error.printStackTrace();
//        }
//        catch (NumberFormatException error){
//            System.out.println("문자를 입력하시면 안됩니다.");
//            error.printStackTrace();
//        }
////        Exception클래스는 모든 예외에 조사클래스이다.
//        catch (Exception e) {
//            System.out.println("예상치못한 예외가 발생했습니다.");
//            e.printStackTrace();
////            finally는 예외 상관없이 무조건 실행되는 구문
//        }finally {
//            System.out.println("무조건 실행되는 구문입니다.");
//        }
//        System.out.println("감사합니다.");

        System.out.println("로그인을 위한 비밀번호를 입력해주세요");
        Scanner sc = new Scanner(System.in);
        String password = sc.nextLine();
//        login(password);

//        checked exception의 경우에 예외처리를 위임받게 되면, 반드시 예외처리를 해줘야함.
        try {
            login2(password);
        }catch (SQLException e){
            e.printStackTrace();
            System.out.println("에러 메시지 : "+e.getMessage());
        }

    }
//    throws키워드를 통해 예외를 위임. 다만, unchecked예외에서는 예외가 강제가 아니므로, throws가 큰의미가 없음.
    static void login(String pw){
    if(pw.length()<10){
        System.out.println("길이가 너무 짧습니다.");
//            throw new : 예외를 강제로 발생
//            unchecked예외는 예외 처리가 강제되지 않음.
//            예외는 기본적으로 메서드를 호출한쪽으로 전파
        throw new IllegalArgumentException("비밀번호가 너무 짧습니다.");
    }else{
        System.out.println("로그인이 되었습니다.");
    }
}
    static void login2(String pw) throws SQLException {
        if(pw.length()<10){
            System.out.println("길이가 너무 짧습니다.");
            throw new SQLException("비밀번호가 너무 짧습니다.");
        }else{
            System.out.println("로그인이 되었습니다.");
        }
    }
}
