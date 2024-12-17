package C05AnonymousLamda;
import java.util.*;

public class AbsHip {
    public static void main(String[] args) {
        Queue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(Math.abs(o1)==Math.abs(o2)){
                    return o1-o2;
                }
                else{
                    return Math.abs(o1)-Math.abs(o2);
                }
            }
        });
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for(int i = 0 ; i < n ; i++){
            int k = sc.nextInt();

            if(k==0&&pq.isEmpty()) {
                System.out.println(0);
                continue;
            }

            if(k!=0){
                pq.add(k);
            }else {
                System.out.println();

            }

        }



    }
}
