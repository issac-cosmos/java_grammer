package C05AnonymousLamda;

import java.util.*;

public class C0503ComparableComparator {
    public static void main(String[] args) {

//        자바에서는 비교를 위한 인터페이스 대표적으로 2개를 제공
//        Comparable 인터페이스는 comparetor메서드 선언
//        Comparator 인퍼테이스는 compare메서드 선언

//        String 클래스에 compareTo메서드 내장
//        String 클래스 외에 java의 많은 클래스에서 compareTo를 구현하고 있다 (Comparable 인터페이스 구현)
//        String a = "hello";
//        String b = "world";
//
////        두 문자열의 각 자리를 순차적으로 비교, 비교결과는 유니코드값의 차이를 반환
//        System.out.println(a.compareTo(b));
//
//        List<String> myList = new ArrayList<>();
//        myList.add("java");
//        myList.add("python");
//        myList.add("javascript");
//        Collections.sort(myList);
//        myList.sort(Comparator.naturalOrder());
//        방법 1. Student 객체에서 Comparable을 구현한 방식.
//myList요소인 Student객체 안에 Comparable인터페이스를 구현한 compareTo메서드가 있어야 함.



//        List<Student> myList = new ArrayList<>();
//        myList.add(new Student("kim", 24));
//        myList.add(new Student("lee", 21));
//        myList.add(new Student("park", 35));
//        myList.add(new Student("choi", 15));
//        myList.add(new Student("kim", 30));
////        Collections.sort(myList);    //myList요소인 Student객체 안에 Comparable인터페이스를 구현한 compareTo메서드가 있어야 함.
////        방법2. Comparator를 구현한 익명객체를 sort에 매개변수로 주입.
////        myList.sort(new Comparator<Student>() {
////            @Override
////            public int compare(Student o1, Student o2) {
//////                return o1.getAge() - o2.getAge();//나이를 기준으로 오름차순정렬
//////                return o2.getAge() - o1.getAge();//나이를 기준으로 내림차순정렬
////                return o1.getName().compareTo(o2.getName()); //이름를 기준으로 오름차순 정렬
////            }
////        });
////      Comparator를 람다함수 활용하여 mylist 정렬 : 이름을 기준으로 내림차순 . 이름이 같으면 나이로 오름차순
//        myList.sort((a,b) -> {
//            if(a.getName().compareTo(b.getName())==0){
//                return a.getAge()-b.getAge();
//            }
//            return b.getName().compareTo(a.getName());
//
//        });
//
//
//        System.out.println(myList);

        String[] stArr = {"hello","java","C++","world2"};
        Arrays.sort(stArr,Comparator.reverseOrder());
        System.out.println(Arrays.toString(stArr));

//글자 길이를 기준으로 내림차순 정렬
//        Arrays.sort(stArr, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o2.length() - o1.length();
//            }
//        });
//        System.out.println(Arrays.toString(stArr));

//        pq로 바꾸기?
//        Queue<String> pq = new PriorityQueue<>(new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o2.length() - o1.length();
//            }
//        });
//        for(String a : stArr){
//            pq.add(a);
//        }
//        while(!pq.isEmpty()){
//            System.out.println(pq.poll());
//        }

        // 백준 - 절대값 힙

        List<int[]> mylist = new ArrayList<>();
        mylist.add(new int[]{4, 5});
        mylist.add(new int[]{1, 2});
        mylist.add(new int[]{5, 0});
        mylist.add(new int[]{3, 1});

        mylist.sort(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {

                return o1[1]-o2[1];
            }
        });
        for(int[] a : mylist){
            System.out.println(Arrays.toString(a));
        }
//      정렬 조건 : 리스트 안의 배열에 index 1번째 값을 기준으로 오름차순



    }
}
//class Student implements Comparable<Student>{
class Student{
    private String name;
    private int age;

    public Student(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
//  정렬은 결국 2개의 값을 비교하는 것이므로 , A B 대상 2개만 있으면 충분
//    두수 (또는 문자)의 비교의 경우 ,
//    @Override
//    public int compareTo(Student o) {
//        return this.name.compareTo(o.getName());
//    }

//    객체 호출시에 자동으로 메모리 주소가 아닌 내용이 출력되게 하려면 toString메서드를 구현
//    자바의 모든 클래스는 조상클래스인 Object클래스를 상속하고, 아래의 override는 Object클래스의 toString메서드를 구현한 것


    public String toString(){
        return "이름은 "+this.name+", 나이는 "+this.age;
    }
}