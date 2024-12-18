package C06EtcClass;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class C0604GenericMain {
    public static void main(String[] args) {
        String[] stArr = {"java","python","c"};
        stChange(stArr,0,1);

        Integer[] intArr = {10,20,30};
        integerChange(intArr,1,2);

        genericChange(stArr,1,2);
        genericChange(intArr,1,2);

        person p1 = new person("hong");
        System.out.println(p1.getValue());

//        generic을 사용하여 범용적 클래스(객체)생성
        Genericperson<Integer> p2 = new Genericperson<>(10);
        System.out.println(p2.getValue());

//        제네릭의 사용 예시
        List<String> mylist= new ArrayList<>();
        Stream<String> myStream;
        IntStream intStream;
        Optional<String> optional;
        OptionalInt optionalInt;

    }

    //제네릭 메서드는 반환타입 왼쪽에 <T>선언.
    //유의점으로 T에는 참조형변수인 객체타입 들어와야함
    static <T> void genericChange(T[] arr, int a , int b){
        T temp = arr[a];
        arr[a]= arr[b];
        arr[b] = temp;
    }
    static void stChange(String[] arr, int a , int b){
        String temp = arr[a];
        arr[a]= arr[b];
        arr[b] = temp;
    }
    static void integerChange(Integer[] arr, int a , int b){
        Integer temp = arr[a];
        arr[a]= arr[b];
        arr[b] = temp;
    }
}
class person{
    private String value;


    public person(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}

//제네릭클래스는 클래스명 옆에 <T> 선언
class Genericperson<T>{
    private T value;


    public Genericperson(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}
