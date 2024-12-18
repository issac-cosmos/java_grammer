package C05AnonymousLamda;

import java.util.*;
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

//        int[] arr1 = {1,2,3,4,5,6};
////        arr1에서 홀수만 담은 배열을 arr2라는 이름으로 변환
////        arr3에 홀수걸러서 해당 홀수의 제곱값을 담기
////        arr4에 솔수만 거르고, 제곱값을 구하고 해당 숫자들을 오름차순한 순서로 담아주세요.
//        int[] arr2 = Arrays.stream(arr1).filter(a->a%2!=0).toArray();
//        System.out.println(Arrays.toString(arr2));
//        int[] arr3 = Arrays.stream(arr2).map(a->a*a).toArray();
//        System.out.println(Arrays.toString(arr3));
//        int[] arr4 = Arrays.stream(arr3).sorted().toArray();

//        스트림의 소모  : foreach(출력) , Sum(합계) , reduce(누적연산)
//        int[] intArr = {10,20,30,40};
//        Arrays.stream(intArr).forEach(a-> System.out.println(a));
//        int total = Arrays.stream(intArr).sum();
//        System.out.println(total);
//        int max = Arrays.stream(intArr).max().getAsInt();
////        optional객체 : 값이 있을수도 있고 , 없을수도 있음을 명시한 객체
//        int min = Arrays.stream(intArr).min().getAsInt();
//        long count = Arrays.stream(intArr).count();
//
//        //        reduce : 누적연산 , reduce(초기값,연산식)
//        int allAdd = Arrays.stream(intArr).reduce(0,(a,b)->a+b);
//        System.out.println(allAdd);
//        int allMultiply = Arrays.stream(intArr).reduce(1,(a,b)->a*b);
//        System.out.println(allMultiply);
//
//        String[] stArr = {"hello", "java","world"};
//        String myString = Arrays.stream(stArr).reduce("",(a,b)->a+b);
//        System.out.println(myString);
////        findFirst : 첫번째요소  반환
//        String first = Arrays.stream(stArr).filter(a->a.length()>=5).findFirst().get();
//        System.out.println(first);



//        List<Student> students = new ArrayList<>();
////        객체 담기 : {"Kim",20}, {"Choi",32}, {"Lee", 35} , {"Park",22}
//        students.add(new Student("Kim",20));
//        students.add(new Student("Choi",32));
//        students.add(new Student("Lee",35));
//        students.add(new Student("Park",22));
//
//
////        1)모든 객체의 평균 나이
//        double age = students.stream().mapToInt(a->a.getAge()).average().getAsDouble();
//        System.out.println(age);
////        2)가장 나이 어린 사람 찾기
//        Student s1 = students.stream().sorted((o1,o2)->o1.getAge()-o2.getAge()).findFirst().get();
////        3)30대인 사람들의 이름을 새로운 Sting배열에 담기
//        String[] newArr = students.stream().filter(a->a.getAge()>=30).map(a->a.getName()).toArray(a->new String[a]);
//        System.out.println(Arrays.toString(newArr));
////        메소드 참조 : 하나의 메소드만을 호출하는 경우에 매개변수를 제거한 형식, 클래스명::메서드명
//        students.stream().forEach(System.out::println);
//        String[] arr = students.stream().map(a->a.getName()).toArray(String[]::new);


////        Optional객체 : 특정객체에 값이 없을지도 모른다는것을 명시적으로 표현
//        Optional<String> opt1 = Optional.ofNullable(null);
//        String st1 = null;
//        if(st1!=null){
//            System.out.println(st1.compareTo("hello"));
//        }else{
//            System.out.println("값이 없습니다");
//        }//null 처리 해주는게 좋은 코딩
//        if(opt1.isPresent()){
//            System.out.println(opt1.get().compareTo("hello"));
//        }else{
//            System.out.println("값이 없습니다");
//        }

//        System.out.println(st1.compareTo("hello"));//null 과 비교 불가 (에러 발생)

////      Optional객체 생성방법 3가지
//        Optional<String> opt1 = Optional.empty();//이어있는 Optional객체 생성
//        Optional<String> opt2 = Optional.ofNullable(null);//비어있는 Optional객체 생성
//        Optional<String> opt2_1 = Optional.ofNullable("hello");//값이 있는 Optional객체 생성
//        Optional<String> opt3 = Optional.of("hello");//값이 있는 경우만 Optional.of
//
////        (중요)Optional 객체 처리 방법 4가지
////        방법1. isPresent()확인후에 get()
//        if(opt2.isPresent()){
//            System.out.println(opt2.get());
//        }else{
//            System.out.println("값이 없습니다.");
//        }
////        방법2. orElse() : 값이 있으면 있는값 return, 없으면 지정값 return
//        System.out.println(opt2.orElse("none"));
////        방법3. orElseGet() : 값이 있으면 있는값 return , 없으면 람다함수 실행
////        방법4. orElseThrow : 값이 있으면 있는값 return , 없으면 지정된 예외 강제 발생
////        개발에서 사용자에게 적절한 메시지 전달 목적과 의도된 코드중단을 목표로 , 강제로 예외를 발생시키는 경우가 많음.
//        System.out.println(opt2.orElseThrow(()->new NoSuchElementException("값이 없습니다.")));

//        예시1.
        List<Student> students = new ArrayList<>();
//        OptionalDouble opt_avg = students.stream().mapToInt(a->a.getAge()).average();
//        if(opt_avg.isPresent()){
//            System.out.println(opt_avg.getAsDouble());
//        }else{
//            throw new NoSuchElementException("값이 없음");
//        }
        //위에 4줄을 줄이면
        System.out.println(students.stream().mapToInt(a->a.getAge()).average().orElseThrow(()->new NoSuchElementException("값이 없음")));

//        예시2. DB조회 상황 가능
        System.out.println("조회하실 id를 입력해주세요.");
        Scanner sc = new Scanner(System.in);

        int id = Integer.parseInt(sc.nextLine());
        Optional<Student> myStudent;
        if(id<10){
            myStudent = Optional.of(new Student("hong",20));
        }else{
            myStudent = Optional.empty();
        }
//        Student가 있으면 student 출력. 없으면 " 해당학생은 없습니다." 라고 에러메시지와 함께 에러 강제 발생
        System.out.println(myStudent.orElseThrow(()->new NoSuchElementException("해당 학생은 없습니다.")));


    }
}
