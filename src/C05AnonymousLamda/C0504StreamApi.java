package C05AnonymousLamda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class C0504StreamApi {
    public static void main(String[] args) {
//        int[] arr ={20,10,4,12};
////        전통적인 방식의 데이터 접근방식 : 메모리 주소접근
//        for(int i = 0 ; i<arr.length;i++){
//            System.out.println(arr[i]);
//        }
//        for(int a : arr){
//            System.out.println(a);
//        }
//        함수형 프로그래밍 방식 : 데이터와 객체 중심이 아닌, 입력에 따른 출력만 존재
//        java에서 함수형프로그래밍을 지원하기위한 라이브러리는 streamAPI
//        foreach는 스트림의 각 요소를 소모하면서 동작을 수행
//        Arrays.stream(arr).forEach(a -> System.out.println(a));

//        스트림의 생성 : .stream()
//        String[] stArr = {"HTML","CSS","JAVA","PYTHON"};
//        Stream<String> stream1 = Arrays.stream(stArr);
//        List<String> mylist = new ArrayList<>();
//        mylist.add("HTML");
//        mylist.add("CSS");
//        Stream<String> stream2 = mylist.stream();
//
//
//        int[] intArr = {10,20,30,40,50};
////        원시자료형을 가지고 stream객체를 만들게 되면, Stream<T>가 아니라 , 별도의 Stream객체 존재
//        IntStream stream3 = Arrays.stream(intArr);
//
//        List<Integer> mylist2 = new ArrayList<>();
//        mylist2.add(10);
//        mylist2.add(20);
//        mylist2.add(30);
//        Stream<Integer> stream4 = mylist2.stream();

//      Stream 변환(중개연산) : filter , map , sorted , distinct
//        int[] intArr = {10,20,30,40,50};
//        filter : 특정기준으로 대상을 filtering한 뒤에 새로운 스트림을 반환
////        아래코드는 filter까지 스트림의 중계연산이고, sum을 통해 스트림을 모두 소모하여 총합을 구함.
//        int sum = Arrays.stream(intArr).filter(a->a<=30).sum();
////        원시자료형의 경우 Instream으로 stream객체가 반환되므로, 제네릭타입소거 문제 발생하지않음.
//        int[] newIntArr = Arrays.stream(intArr).filter(a->a<=30).toArray();
//        System.out.println(sum);
//        System.out.println(Arrays.toString(newIntArr));
//
//        String[] stArr = {"HTML","CSS","JAVA","PYTHON"};
////        제네릭 타입소거로 인해 , toArray를 통해 바로 새로운 String 배열을 만드는 것이 불가
////        제네릭 타입소거란 <String> 이러한 제네릭의 타입이 런타임시점에서는 제거되는 것을 의미.
//        String[] newstArr = Arrays.stream(stArr).filter(a->a.length()<=4).toArray(a->new String[a]);//a변수에는 배열의 길이가 담긴다.
//        distinct : 중복제거
//        int[] intArr = {10,10,30,40,50};
//        int[] newArr = Arrays.stream(intArr).distinct().toArray();
//        System.out.println(Arrays.toString(newArr));
//
////        map : 기존의 스트림을 조작하여 새로운 스트림을 반환
//        int[] newArr2 = Arrays.stream(intArr).map(a->a*10).toArray();
//        System.out.println(Arrays.toString(newArr2));
//
////        mapToInt : intstream형태로 변환해주는 map
//        String[] stArr = {"HTML","CSS","JAVA","PYTHON"};
//        int total = Arrays.stream(stArr).mapToInt(a->a.length()).sum();
//        int[] newintArr = Arrays.stream(stArr).mapToInt(a->a.length()).toArray();
//        System.out.println(Arrays.toString(newintArr));
////        sorted : 정렬된 새로운 스트림 반환
//        String[] newStArr = Arrays.stream(stArr).sorted(Comparator.reverseOrder()).toArray(a->new String[a]);
//        System.out.println(Arrays.toString(newStArr));

        int[] arr1 = {1,2,3,4,5,6};
//        arr1에서 홀수만 담은 배열을 arr2라는 이름으로 변환
//        arr3에 홀수걸러서 해당 홀수의 제곱값을 담기
//        arr4에 솔수만 거르고, 제곱값을 구하고 해당 숫자들을 오름차순한 순서로 담아주세요.
        int[] arr2 = Arrays.stream(arr1).filter(a->a%2!=0).toArray();
        System.out.println(Arrays.toString(arr2));
        int[] arr3 = Arrays.stream(arr2).map(a->a*a).toArray();
        System.out.println(Arrays.toString(arr3));
        int[] arr4 = Arrays.stream(arr3).sorted().toArray();
    }
}
