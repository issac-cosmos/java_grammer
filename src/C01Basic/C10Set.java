package C01Basic;

import com.sun.source.util.Trees;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class C10Set {
    public static void main(String[] args) {
//        Set<String> mySet = new HashSet<>();
//        mySet.add("h");
//        mySet.add("h");
//        mySet.add("e");
//        mySet.add("l");
//        mySet.add("l");
//        mySet.add("o");
//        System.out.println(mySet);
////        순서 보장 안됌 , 중복은 제거
////        출력시 index로 접근 불가
//        for(String a : mySet){
//            System.out.println(a);
//        }

//        폰켓몬 : 프로그래머스

////        LinkedHashSet
//        Set<Integer> linkedSet = new LinkedHashSet<>();
//        linkedSet.add(1);
//        linkedSet.add(1);
//        linkedSet.add(0);
//        linkedSet.add(3);
//        linkedSet.add(1);
//        linkedSet.add(2);
//        System.out.println(linkedSet);
//
////        TreeSet
//        TreeSet<Integer> treeSet = new TreeSet<>();
//        treeSet.add(1);
//        treeSet.add(1);
//        treeSet.add(0);
//        treeSet.add(3);
//        treeSet.add(1);
//        treeSet.add(2);
//        System.out.println(treeSet);

//        집합 관련 함수 : 교집합(retainAll) , 합집합(addAll) , 차집합(removeAll)
        Set<String> set1 = new HashSet<>();
        set1.add("java");
        set1.add("python");
        set1.add("javascript");
        Set<String> set2 = new HashSet<>();
        set1.add("java");
        set1.add("html");
        set1.add("css");

        set1.retainAll(set2);
        System.out.println(set1);


    }
}
