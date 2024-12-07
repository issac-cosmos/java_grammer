package C01Basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;


public class C06String {
    public static <string> void main(String[] args) {
//        //        참조자료형 : 기본 자료형을 제외한 모든 자료형. 클래스 기반
////        WrapperClass : 기본형 타입을 Wrapping한 클래스
//        int a = 10;
//
//        Integer b = new Integer(10);
////        오토 언박싱 : wrapperclass -> 기본자료형
//        int c = b;
////        오토 박싱 : 기본자료형 -> wrapperclass 형변환
//        Integer d = a;

//       String과 int의 형변환
//        int a = 10;
//        String st1 =Integer.toString(a);
//        String st2 = String.valueOf(a);
//

//        String -> int
//                int b = Integer.parseInt(st1);
//        배열에는 원시타입 자료형 세팅
//        int[] arr1 = {10,20,30};
//        리스트에는 참조자료형 세팅
//        참조자료형에 원시자료형을 담을때는 wrapper클래스를 써야함
//        List<Integer> list1 = new ArrayList<>();
//        list1.add()
////        st2는 객체
////        String은 클래스
//
//
//
//        String st1 = new String("hello1");
//        String st2 = "hello1"; //리터럴방식 허용 : 권장되는 방식
//        문자 pool을 통해 성능향상

////        성능최적화
//        System.out.println(st1==st2);
//
//
//        char ch1 = '가';
//        char ch2 = '가';
//        System.out.println(ch1==ch2);
//
//        String a = "1";
//        String b = "1";
//        System.out.println(a == b);
//
//        String st3 = new String("hello1");
//        String st4 = "hello1";
////        참조자료형이므로, ==비교는 메모리 주소가 되고, 값을 비교할때에는 .equals 사용
//        System.out.println(st3.equals(st4));



//        equals 중에 대소문자 무시 :
//        String st1 = "hello1";
//        String st2 = "hello1";
//        String st3 = "Hello1";
//        System.out.println(st1.equals(st2));
//        System.out.println(st2.equals(st3));
//        System.out.println(st2.equalsIgnoreCase(st3));
//

//        문자열의 길이 : length()
//        String st1 = "hello1 java1 world2";
//        System.out.println(st1.length());
////        charAt : 특정 인덱스의 문자값을 리턴
////        소문자알파벳의 개수
//        int cnt = 0;
//        for (int i=0; i< st1.length();i++){
//            if (st1.charAt(i) >= 'a' && st1.charAt(i) <= 'z'){
//                cnt++;
//            }
//        }
//        System.out.println(cnt);

//        int count = 0;
//        String st2 = "abcdefabaad";
////        a의 개수 세기
//        for (int i = 0; i <st2.length();i++){
//            if (st2.charAt(i) == 'a'){
//                count++;
//            }
//        }
//        System.out.println(count);

//            int c = 0;
////        toCharArray() : String 문자열을 char배열로 리턴
//         char[] chArr = st2.toCharArray();
//         for (int i = 0; i < chArr.length;i++){
//             if (chArr[i] == 'a'){
//                 c++;
//             }
//         }
//        System.out.println(c);



//        String st1 ="hello java java";
////    indexOf : 특정 문자열의 위치 반환, 가장 먼저 나오는 문자열의 위치
//        System.out.println(st1.indexOf("java"));
//
//
////contains : 특정 문자열이 있는지 여부 boolean
//        System.out.println(st1.contains("hello"));
//        System.out.println(st1.contains("world"));


      //  substring(a,b) : a이상 b 미만의 index 의 문자를 잘라 변환
//        String st1 = "hello world";
//        System.out.println(st1.substring(0,5));
//        System.out.println(st1.substring(6,st1.length()));
//        String my_string = "abcdef";
//        String letter = "f";
//        String answer = "";
//        for(int i =0 ; i<my_string.length();i++){
//
//        }
//
//    }

//        // trim , strip : 문자열 양쪽 끝의 공백 제거
//        String st1 = " hello world      ";
//        String trimSt1 = st1.trim();
//        String stripSt1 = st1.strip();
//        System.out.println(trimSt1);
//        System.out.println(stripSt1);
//
        //toUpperCase : 대문자로 변환 , toLowerCase : 소문자로 변환
//        String s1 = "Hello";
//        String s2 = s1.toUpperCase();
//        String s3 = s1.toLowerCase();
//        System.out.println(s2);
//        System.out.println(s3);

        //char -> String 형변환
//        char ch1 = 'a';
//        String st1 = Character.toString(ch1);
//        //String -> char 형변환
//        char ch2 = st1.charAt(0);

//        //replace(a,b) : a문자열을 b문자열로 대체한다.
//        String st1 = "hello world";
//        String st2 = st1.replace("world","java");
//        System.out.println(st2);

        //[a-z]+
        //[A-Za-z]+
        //[가-힣]+
        //[0-9]+


//           //replaceAll : replace와 동일 , 정규표현식을 쓸수있는 점이 차이.
//          String st1 = "01abc123한글12";
//          String answer = "";
//          for(int i =  0; i< st1.length(); i++){
//              if(st1.charAt(i)<'a'||st1.charAt(i)>'z')
//                  answer += st1.charAt(i);
//          }
//          String answer2 = st1.replaceAll("[가-힣]+","");
//        System.out.println(answer2);

//        String input = "hello";
//        System.out.println(input.matches("[A-z]+"));
//        if(input.matches("[A-z]+")){
//            System.out.println("제대로 입력하셨습니다");
//        }
//        else{
//            System.out.println("틀렸습니다 입력을 확인해주세요");
//        }

//        //전화번호 검증
//        String number = "010-1234-5678";
//        boolean b1 = Pattern.matches("\\d{3}-\\d{4}-\\d{4}$",number);
//        System.out.println(b1);

        //이메일 검증 : 소문자@소문자.com
//        String email = "hello@naver.com";
//        boolean b2 = Pattern.matches("^[a-z0-9]+@[a-z]+.com$",email);
//        System.out.println(b2);

        //문자열 다루기 기본 - 프로그래머스

        //split : 특정문자를 기준으로 문자열을 자르는것.
//        String a = "a:b:c:d";
//        String[] arr1 = a.split(":");
//        System.out.println(Arrays.toString(arr1));
//        String b = "a b c  d";
//        String[] arr2 = b.split(" ");
//        String[] arr3 = b.split("\\s+");
//        System.out.println(Arrays.toString(arr2));
//        System.out.println(Arrays.toString(arr3));
//
//        int count = 0 ;
//        for(int i = 0 ; i<arr2.length; i++){
//            if(arr2[i]!=""){
//                count++;
//            }
//        }
//        System.out.println(count);

//        //null과 공백의 차이
//        String st1 = null;  //null은 String 이 아님
//        String st2 = "" ;
//        String st3 = "hello";
//        System.out.println(st1==st2); //false
//        System.out.println(st3.isEmpty()); //false
//        System.out.println(st2.isEmpty()); //true
//        System.out.println(st1.isEmpty()); //NullPointerException발생

//        String[] arr = {"hello","java",null,"python"};
//
//        int answer = 0;
//        for(int i =0 ; i<arr.length; i++){
//            if(arr[i]!=null && arr[i].equals("python")){
//                answer= i;
//            }
//        }

//        StringBuffer : 문자열 조립
//        String[] arr = {"java", "python", "javacript"};
//        String answer = "";
//        for(String a : arr){
//            answer += a;
//        }
//        System.out.println(answer);
//
//        String answer2 = String.join(":",arr);
//        System.out.println(answer2);

//        StringBuffer : 문자열 조립
//        StringBuffer sb = new StringBuffer();
//        sb.append("java");
//        sb.append("python");
//        sb.append("javascript");
//        String answer = sb.toString();
//        System.out.println(answer);
//
//        StringBuilder sb2 = new StringBuilder();
//        sb2.append("java");
//        sb2.append("\n");
//        sb2.append("python");
//        sb2.append("\n");
//        sb2.append("javascript");
//        sb2.append("\n");
//        String answer3 = sb2.toString();
//        System.out.println(answer3);

        //문자열 뒤집기
//        String st1 = "hello";
//        String answer = "";
//        StringBuilder sb1 = new StringBuilder();
//        for(int i = st1.length()-1; i>=0 ; i--){
//            sb1.append(st1.charAt(i));
//        }
//
//        StringBuilder sb = new StringBuilder(st1);
//
//
//    }


    //문자열 밀기 - 프로그래머스
//import java.util.*;
//    class Solution {
//        public int solution(String A, String B) {
//            int answer = 0;
//            int l = A.length();
//
//            if(A.equals(B)){
//                return 0;
//            }
//            else{
//                for(int i = 0; i<l; i++){
//
//                    char last = A.charAt(A.length()-1);
//                    answer++;
//                    A= last+A.substring(0,A.length()-1);
//
//                    if(A.equals(B)){
//                        return answer;
//                    }
//                }
//            }
//
//            return -1;
//        }
//    }

    }
}
