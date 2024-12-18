package C05AnonymousLamda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static java.lang.Integer.parseInt;

class Solution {
    public static void main(String[] args) {
        String answer = "";
        int[] numbers = new int[]{3, 30, 34, 5, 9};
        String[] arr = new String[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            arr[i] = String.valueOf(numbers[i]);
        }
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o2+o1).compareTo(o1+o2);
            }
        });
        for(String a : arr){
            answer+=a;
        }
        if(answer.charAt(0)=='0'){
            answer = "0";
        }
    }
}
