package C01Basic;

import java.util.*;

public class C09Map {
    public static void main(String[] args) {
////        map은 index 요소가 없으므로 , 순서가 무의미
////        key값은 중복되지 않고, value를 덮어쓰기함
//        Map<String , String> sports = new HashMap<>();
//        sports.put("basketball", "농구");
//        sports.put("soccer", "축구");
//        sports.put("baseball", "야구");
//        System.out.println(sports);
//
////        map은 key를 통해 value를 get
////        map에서 key 값을 통한 복잡도는 O(1)
//        System.out.println(sports.get("baseball"));
//
////        map의 전체 데이터 조회
////        keySet() : map의 key 목록을 리턴하는 메서드
////        values() : map의 value목록을 리턴하는 메서드
//        for(String key : sports.keySet()){
//            System.out.println("sport의 key 값은 " + key);
//            System.out.println("sport의 key 값은 " + sports.get(key));
//        }
//
////        remove : 키를 통해 삭제
//        sports.remove("baseball");
//        System.out.println(sports);
//
////        putIfAbsent : key값이 없는 경우에만 put
//        sports.putIfAbsent("soccer","운동");
//        sports.putIfAbsent("baseball","야구");
//        System.out.println(sports);
//
////        getOrDefault : key가 없으면 default값으로 return
//        System.out.println(sports.get("pingpong"));
//        System.out.println(sports.getOrDefault("pingpong", "그런키 없음"));
//        System.out.println(sports.getOrDefault("baseball", "그런키 없음"));
//
////        containsKey : 키가 있으면 true, 없으면 false
//        System.out.println(sports.containsKey("baseball"));
//        System.out.println(sports.containsKey("pingpong"));


//        String[] arr = {"농구", "축구", "농구", "야구", "축구"};
////        농구:2 , 축구 :2 , 야구 :1
//
//        Map<String, Integer> sports = new HashMap<>();
//
//        for(int i = 0 ; i < arr.length ; i++) {
//            if (sports.containsKey(arr[i])) {
//                sports.put(arr[i], sports.get(arr[i]) + 1);
//            } else {
//                sports.put(arr[i], 1);
//            }
//        }
//
//        System.out.println(sports);

//        완주하지 못한 선수

//        class Solution {
//            public String solution(String[] participant, String[] completion) {
//                participant = new String[]{"leo", "kiki", "eden","leo"};
//                completion = new String[]{"eden", "kiki","leo"};
//                String answer = "";
//
//                for(int i = 0 ; i < participant.length ; i++){
//                    int count = 0;
//                    for(int j = 0 ; j < completion.length ; j++ ){
//                        if(participant[i].equals(completion[j])){break;}
//                        count++;
//                        if(count==completion.length){
//                            answer=participant[i];
//                            System.out.println(answer);
//                            return answer;
//                        }
//                    }
//                }
//                System.out.println(answer);
//                return answer;
//            }
//        }

//        프로그래머스 - 의상
//        String[][] clothes = new String[][]{{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
//        Map<String, Integer> clo = new HashMap<>();
//
//        for(int i = 0; i< clothes.length ; i++){
//            if (clo.containsKey(clothes[i][1])) {
//                clo.put(clothes[i][1], clo.get(clothes[i][1]) + 1);
//            } else {
//                clo.put(clothes[i][1], 1);
//            }
//        }
//        int num = 1;
//        for(String s : clo.keySet()){
//            num *=(clo.get(s)+1) ;
//        }
//        System.out.println(num-1);

//        LinkedHashMap : 데이터 삽입순서를 보장(유지)
//        Map<String, Integer> linkedMap = new LinkedHashMap<>();
//        linkedMap.put("hello5",1);
//        linkedMap.put("hello4",2);
//        linkedMap.put("hello3",3);
//        linkedMap.put("hello2",4);
//        linkedMap.put("hello1",5);
//        for(String l : linkedMap.keySet()){
//            System.out.println("key값은 : " + l);
//        }
//

////        TreeMap : key를 통해 데이터를 정렬
//        Map<String, Integer> treeMap = new TreeMap<>();
//        treeMap.put("hello5",1);
//        treeMap.put("hello4",2);
//        treeMap.put("hello3",3);
//        treeMap.put("hello2",4);
//        treeMap.put("hello1",5);
//        for(String l : treeMap.keySet()){
//            System.out.println("key값은 : " + l);
//        }


////        HashMap을 사용해서 key로 정렬
//        Map<String, Integer> myMap = new HashMap<>();
//        myMap.put("hello5",1);
//        myMap.put("hello4",2);
//        myMap.put("hello3",3);
//        myMap.put("hello2",4);
//        myMap.put("hello1",5);
//        List<String> myList = new ArrayList<>();
//        for(String a : myMap.keySet()){
//            myList.add(a);
//        }
//        Collections.sort(myList);
//        for(String l : myList){
//            System.out.println("key 값은 : " + l);
//            System.out.println("value 값은 : " + myMap.get(l));
//        }
////        키값 기준으로 정렬하는 방법
//        Collections.sort(myList, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return myMap.get(o1)-myMap.get(o2);
//            }
//        });
//        System.out.println(myList);


//        HashMap출력방법 2가지 : 1. 강화된 for문  2. iterator
        Map<String,String> myMap = new HashMap<>();
        myMap.put("basketball", "농구");
        myMap.put("soccer", "축구");
        myMap.put("baseball", "야구");
        for(String a : myMap.keySet()){
            System.out.println(a);
        }
        Iterator<String> myIters = myMap.keySet().iterator();
//        next메서드는 데이터를 하나씩 소모시키면서 값을 반환
        System.out.println(myIters.next());
//        hasNext는 iterator안에 그다음값이 있는지 없는지 boolean return
        while(myIters.hasNext()){
            System.out.println(myIters.next());
        }




    }
}
