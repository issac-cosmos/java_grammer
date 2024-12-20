package C08Thread;

public class Library {
    static int bookCount = 100;
    public static void borrow(){
        if(bookCount>0){
            try {
                Thread.sleep(300);
            }catch (InterruptedException e){
                e.printStackTrace();
            }

            bookCount--;
            System.out.println("대출완료");
        }else {
            System.out.println("대출불가");
        }
    }
}
