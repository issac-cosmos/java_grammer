package C01Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class C11QueStackDeque {
    public static <string> void main(String[] args) {
//        큐 인터페이스를 LinkedList가 구현한 방식을 가장 많이 사용
//        Queue<Integer> queue = new LinkedList<>();
//        queue.add(10);
//        queue.add(20);
//        queue.add(30);
////        큐에 데이터를 삭제하면서 반환
//        System.out.println(queue.poll());
//        System.out.println(queue);
//        System.out.println(queue.peek());

//        LinkedList와 ArrayList 성능비교
//        중간위치에 데이터 add테스트
//          LinkedList<Integer> list1 = new LinkedList<>();
//        long startTime = System.currentTimeMillis();
//        for (int i = 0; i<100000;i++){
//            list1.add(0,10);
//       }
//        long endTime = System.currentTimeMillis();
//        System.out.println("linkedlist 삽입속도" + (endTime-startTime));
//
//          ArrayList<Integer> list2 = new ArrayList<>();
//        long startTime2 = System.currentTimeMillis();
//        for (int i = 0;i<100000;i++){
//            list2.add(0,10);
//        }
//        long endTime2 = System.currentTimeMillis();
//        System.out.println("Arraylist 삽입속도" + (endTime2-startTime2));


//      조회속도 비교
//      linkedlist조회
//        long startTime3 = System.currentTimeMillis();
//        for (int i = 0;i<100000;i++){
//            list1.get(i);
//        }
//        long endTime3 = System.currentTimeMillis();
//        System.out.println("linkedlist 조회속도" + (endTime3-startTime3));
//


//      Arraylist조회
//        long startTime4 = System.currentTimeMillis();
//        for (int i = 0;i<100000;i++){
//            list2.get(i);
//        }
//        long endTime4 = System.currentTimeMillis();
//        System.out.println("Arraylist 조회속도" + (endTime4-startTime4));
//


//            Queue<String> myque = new LinkedList<>();
//            myque.add("문서1");
//            myque.add("문서2");
//            myque.add("문서3");
//            while (!myque.isEmpty()){
//                System.out.println(myque.poll());
//            }

//            길이제한 큐 : ArrayBlockQueue
        Queue<String> blockingqueue = new ArrayBlockingQueue<>(3);
//            blockingqueue.add("문서1");
//            blockingqueue.add("문서2");
//            blockingqueue.add("문서3");
//            blockingqueue.add("문서4");

//        큐에 여유공간이 있을 때만 add
//        blockingqueue.offer("문서1");
//        blockingqueue.offer("문서2");
//        blockingqueue.offer("문서3");
//        blockingqueue.offer("문서4");
//        System.out.println(blockingqueue);


//      우선순위큐 : 데이터를 꺼낼대 정렬된 데이터 pop
//       전체정렬이아닌, poll할때마다 최소값을 보장
//        Queue<Integer> pq = new PriorityQueue<>();
//        pq.add(30);
//        pq.add(20);
//        pq.add(10);
//        pq.add(40);
//        pq.add(50);
//        System.out.println(pq);
//        while (!pq.isEmpty()){
//            System.out.println(pq.poll());
//        }
//
//
//        Queue<Integer> pq1 = new PriorityQueue<>();

//        최소힙 - 백준
//        최대힙 인 경우
//        Queue<Integer> maxPq = new PriorityQueue<>(Comparator.reverseOrder());
//        maxPq.add(30);
//        maxPq.add(10);
//        maxPq.add(20);
//        System.out.println(maxPq.poll());

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        Queue<Integer> pq = new PriorityQueue<>();
//        int count = Integer.parseInt(br.readLine());
//        StringBuilder sb = new StringBuilder();
//        for(int i=0; i<count; i++){
//            int temp = Integer.parseInt(br.readLine());
//            if(temp ==0){
//                if(pq.isEmpty()){
//                    sb.append(0);
//                    sb.append("\n");
//                }else {
//                    sb.append(pq.poll());
//                    sb.append("\n");
//                }
//            }else {
//                pq.add(temp);
//            }
//        }
//        sb.deleteCharAt(sb.length()-1);
//        System.out.println(sb);

//        프로그래머스 - 더 맵게
//        class Solution {
//            public int solution(int[] scoville, int K) throws IOException {
//
//                Queue<Integer> pq = new PriorityQueue<>();
//                scoville = new int[]{1, 2, 3, 9, 10, 12};
//                int answer = 0;
//                K = 7;
//                for(int s : scoville){
//                    pq.offer(s);
//                }
//                while (!pq.isEmpty()){
//                    int first = pq.poll();
//                    if(first>K){
//                        return answer;
//                    }
//                    int second = pq.poll();
//                    int newscoville = first+(second*2);
//                    pq.offer(newscoville);
//                    answer++;
//                }
//
//                return -1;
//            }
//        }

//        같은 숫자는 싫어
//        public class Solution {
//            public int[] solution(int []arr) {
//                int[] answer = {};
//                Queue<Integer> queue = new LinkedList<>();
//                queue.add(arr[0]);
//                for(int i = 0; i < arr.length-1 ; i++){
//                    if(arr[i]!=arr[i+1]){
//                        queue.add(arr[i+1]);
//                    }
//                }
//
//                return answer;
//            }
//        }

//        스택으로 풀기
//        int []arr = {1,1,3,3,0,1,1};
//        Stack<Integer> st = new Stack<>();
//        for(int a : arr){
//            if(st.isEmpty()){
//                st.push(a);
//            }else {
//                if(st.peek() != a){
//                    st.push(a);
//                }
//            }
//        }
//        int[] answer = new int[st.size()];
//        for(int i=answer.length-1; i>=0 ;i--){
//            answer[i] = st.pop();
//        }
//        System.out.println(Arrays.toString(answer));

//        Deque : addFirst , addLast , pollFirst , pollLast
//        Deque<Integer> d1 = new ArrayDeque<>();
//        d1.addLast(10);
//        d1.addLast(20);
//        System.out.println(d1);
//        d1.addFirst(30);
//        System.out.println(d1);
//        System.out.println(d1.peekFirst());//30
//        System.out.println(d1.peekLast());//20
//        System.out.println(d1.pollLast());//20
//        System.out.println(d1.pollFirst());//30

//        올바른 괄호

//                String s="(())()";
//                boolean answer = true;
//                Deque<Character> d1 = new ArrayDeque<>();
//                int sum = 0;
//                if(s.charAt(0)=='(') {
//                    for(int i = 0; i < s.length(); i++) {
//                        char ch = s.charAt(i);
//                        d1.addLast(s.charAt(i));
//                        if(s.charAt(i)==')'){
//                            d1.pollFirst();
//                            d1.pollLast();
//                        }
//                    }
//                }
//        System.out.println(d1);
//                if(d1.isEmpty()){
//                    System.out.println(true);
//                } else {
//                    System.out.println(false);
//                }
////        이런 방법도있다.
//        char[] arr = s.toCharArray();
//        int cnt = 0;
//
//        for (char c: arr){
//            cnt = c=='(' ? cnt+1 : cnt-1;
//            if (cnt < 0) return false;
//        }
//
//        return cnt==0;
    }
}