package C08Thread;

public class MainClass {
    public static void main(String[] args) {
//        스레드 생성방법2가지
//        방법1. 스레드 클래스 상속방식
        Thread t1 = new MyClass1();
//        Thread클래스 안에 start메서드가 내장되어 있으므로 ,해당 메서드로 스레드 생성
//        start메서드는 내부적으로 run메서드를 호춣

//        방법2. Runnable을 구현한 객체를 Thread클래스에 주입하는 방식
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("스레드 실행(runnable 객체 구현)");
            }
        });
        Thread t3 = new Thread(()-> System.out.println("스레드 실행(Runnable 람다 구현)"));
        t1.start();
        t2.start();
        t3.start();
        new Thread(()-> System.out.println("스레드 실행(Runnable 람다 구현2)")).start();






    }
}
