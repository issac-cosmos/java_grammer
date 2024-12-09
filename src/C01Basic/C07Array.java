package C01Basic;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class C07Array {
    public static void main(String[] args) {
//        배열 표현식1. 리터럴 방식
//        int[] intArr1 = {1, 3, 5, 7, 9};
//
////        배열 표현식2. 배열선언 후 할당 방식
//        int[] intArr2 = new int[5];
//        intArr2[0] = 1;
//        intArr2[1] = 3;
//        intArr2[2] = 5;
//        intArr2[3] = 7;
//        System.out.println(intArr2[4]); // 0으로 초기화
//
////        참조자료형의 배열은 기본적으로 null초기화
//        String[] stArr = new String[5];
//        stArr[0] = "hello1";
//        stArr[1] = "hello2";
//        stArr[2] = "hello3";
//        for(int i = 0 ; i<stArr.length;i++){
//            if(stArr[i].equals("hello10")){
//                System.out.println("hello10가 있습니다.");
//            }
//        }
//
////        배열 표현식3.
//        int[] intArr3 = new int[]{1, 3, 5, 7, 9};
//        List<int[]> list1 = new ArrayList<>();
//        list1.add(new int[]{1, 2, 3, 4, 5});

//        표현식4 : 불가 -> 배열의 길이가 사전 지정되어야함
//        int[] intArr4 =new int[];

//        String[] stArr = new String[5];
//        for(int i = 0 ; i<stArr.length;i++){
//            stArr[i] = "";
//        }
//        Arrays.fill(stArr, "hello");
//        System.out.println(Arrays.toString(stArr));

//        85, 65 90 인 int배열 선언하고 총합, 평균을 구하자
//        int[] arr = new int[]{85,65,90};
//        int sum = 0;
//        int averge = 0;
//        for(int i = 0 ; i<arr.length ; i++){
//            sum+=arr[i];
//        }
//        averge = sum / arr.length;
//        System.out.println(sum);
//        System.out.println((double)averge);

//        배열의 최대값, 최솟값
//        int[] arr2 = {10, 20, 30, 12, 8, 17};
//        int max = Integer.MIN_VALUE;
//        int min = Integer.MAX_VALUE;
//        for(int i= 0 ; i < arr2.length ; i++){
//            if(max<arr2[i])max=arr2[i];
//            if(min>arr2[i])min=arr2[i];
//        }
//        System.out.println("최댓값은 : "+max);
//        System.out.println("최솟값은 : "+min);

//      배열의 자리바꾸기
//        int[] arr = {20,10,30};
//        int temp = arr[0];
//        arr[0] = arr[1];
//        arr[1] = temp;

//        int[] arr2 = {10, 20, 30, 40, 50};
//        int temp2 = arr2[0];
//        for(int i = 0 ; i < arr2.length-2 ; i++){
//            arr2[i]=arr2[i+1];
//        }
//        arr2[arr2.length-1] = temp2;
//
//        System.out.println(Arrays.toString(arr2));

//        배열뒤집기 : 새로운 배열을 선언하여, arr을 뒤집을 배열 생성
//        int[] arr = {10, 20, 30, 40, 50};
//        int[] arr1 = new int[5];
//        for(int i = 0 ; i< arr.length; i++){
//            arr1[i] = arr[arr.length-1-i];
//        }
//        System.out.println(Arrays.toString(arr1));

//        배열의 정렬
//        int[] arr = {17, 12, 20, 10, 25};
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
//        선택정렬 알고리즘

//        for(int i =0; i < arr.length-1; i++){
//            int min = arr[i];
//            int minindex = i;
//            for(int j = i+1 ; j < arr.length; j++ ) {
//                    if(min>arr[j]){
//                        min=arr[j];
//                        minindex = j;
//                    }
//            }
//            int temp = arr[i];
//            arr[i] = arr[minindex];
//            arr[minindex]=temp;
//        }
//        System.out.println(Arrays.toString(arr));

//        문자정렬
//        아스키코드(unicode)기준으로 정렬
//        String[] fruits =  {"banana","apple", "cherry"};
////        오름차순
//        Arrays.sort(fruits);
//        System.out.println(Arrays.toString(fruits));
//
//        String[] fruits2 = {"apple","applee", "applef","b"};
//        Arrays.sort(fruits2);
//        System.out.println(Arrays.toString(fruits2));
//
//
////        내림차순 : 기본형타입은 Comparator로 처리불가
//        Arrays.sort(fruits, Comparator.reverseOrder());
//        System.out.println(Arrays.toString(fruits));
//
////        프로그래머스 - K번째수

//        int[] array={1, 5, 2, 6, 3, 7, 4};
//        int[][] commands={{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
//        int[] answer = new int[commands.length];
//        for(int i=0; i<commands.length; i++){
//            int[] temp = new int[commands[i][1]-commands[i][0]+1];
//            int number=0;
//            for(int j=commands[i][0]-1; j<commands[i][1];j++){
//                temp[number] = array[j];
//                number++;
//            }
//            Arrays.sort(temp);
//            answer[i] = temp[commands[i][2]-1];
//        }
//        System.out.println(Arrays.toString(answer));

////        숫자 조합의 합
////        모두 각기 다른 숫자의 배열이 있을때, 만들어질수있는 2개의 조합의 합을 출력
//        int[] intArr = {10,20,30,40,50,60};
//        int[] arr1 = new int[intArr.length * intArr.length];
//        int index = 0;
//        for(int i=0; i<intArr.length; i++){
//            for(int j=i+1; j< intArr.length; j++){
//                arr1[index] = intArr[i]+intArr[j];
//                index++;
//            }
//        }
//        System.out.println(Arrays.toString(arr1));
//        int[] answer = new int[index];
//        for(int i=0; i<index; i++){
//            answer[i] = arr1[i];
//        }
//        Arrays.sort(answer);
//        System.out.println(Arrays.toString(answer));
//
//
//        int[] answer2 = new int[index];
//        int index2 = 0;
//        for(int i = 0 ; i < answer.length-1 ; i++){
//            if(answer[i] == answer[i+1]){
//                continue;
//            }
//            else {
//                answer2[index2] =answer[i];
//                index2++;
//            }
//        }
//
//        int[] answer3 = new int[index2];
//        for(int i =0 ; i < index2 ;i++){
//            answer3[i]=answer2[i];
//        }
//        System.out.println(Arrays.toString(answer3));
//
////        배열의 복사
////        Arrays.copyOf(배열명, length), Arrays.copyOfRange(배열명, start, end)
//        int[] answer4 = Arrays.copyOf(answer3, index2);


//        두개 뽑아서 더하기
//        class Solution {
//            public int[] solution(int[] numbers) {
//                int[] answer = {};
//                numbers = new int[]{2,1,3,4,1};
//                int[] sum = new int[numbers.length*numbers.length];
//                int index =0;
//                for(int i =0; i<numbers.length-1;i++){
//                    for(int j =1+i ; j < numbers.length ; j++){
//                        sum[index] = numbers[i]+numbers[j];
//                        index++;
//                    }
//                }
//
//                int[] arr1 = new int[index];
//                Arrays.sort(sum);
//                int index2 = 0;
//                arr1[0] = sum[0];
//                for(int i = 1 ; i < index ; i++ ){
//                    if(sum[i-1]!=sum[i]){
//                        arr1[index2] = sum[i];
//                        index2++;
//                    }
//                }
//                return answer;
//            }
//        }

//        배열의 검색
//        int[] arr = {5,3,1,8,7};
//        int target = 8;
//        int index = 0;
//        for(int i = 0 ; i < arr.length ; i++){
//            if(arr[i]==target)break;
//            index++;
//        }

//        이진검색(Binary search) - 이분탐색
//        사전에 오름차순정렬이 되어 있어야만 이진검색 가능
//
//        int[] arr = {1, 3, 6, 8, 9, 11, 15};
//        System.out.println(Arrays.binarySearch(arr, 15));

////        배열간 비교
//        int[] arr1 = {10,20,30};
//        int[] arr2 = {10,20,30};
//        System.out.println(arr1==arr2);
////        Arrays.equals : 값과 순서까지 동일해야 true
//        System.out.println(Arrays.equals(arr1,arr2));



//        가변배열 선언 후 할당
//        int[][] arr1 =new int[2][];
//        arr1[0] = new int[2];
//        arr1[1] = new int[3];
//        arr1[0][0]=10;
//        arr1[0][1]=20;
//        arr1[1][0]=30;
//        arr1[1][1]=40;
//        arr1[1][2]=50;
//        System.out.println(Arrays.deepToString(arr1));
////        가변배열 리터럴방식
//        int[][] arr2 = {{10,20},{30,40,50}};
//
////        [3][4] 사이즈 배열 선언
////        1~12까지 숫자값을 각 배열에 순차적으로 할당
////        {1,2,3,4} , {5,6,7,8}  ...
//        int[][] arr3 = new int[3][4];
//        int num = 1;
//        for(int i =0 ; i< arr3.length ; i++){
//            for(int j = 0; j < arr3[i].length ; j++){
//                arr3[i][j] = num;
//                num++;
//            }
//        }
//        System.out.println(Arrays.deepToString(arr3));

//        행렬의 덧셈 - 프로그래머스



    }
}
