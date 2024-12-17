package C04Interface;

public class C0401InterfaceMain {
    public static void main(String[] args) {
//        C0401Cat c1= new C0401Cat();
//        c1.makeSound();
//        C0401Dog d1= new C0401Dog();
//        d1.makeSound();

//        다형성 : 하나의 객체가 여러개의 참조변수 타입을 가질수 있음을 의미.
//        C0401AnimalInterface1 c2= new C0401Cat();
//        c1.makeSound();
//        C0401AnimalInterface1 d2= new C0401Dog();
//        d1.makeSound();

//        다중상속(구현)
        C0401CatMultiImpl c1 = new C0401CatMultiImpl();
        C0401DogMultiImpl d1 = new C0401DogMultiImpl();

//        다중
        C0401AnimalInterface1 ci1 =new C0401AnimalInterface1() {
            @Override
            public void makeSound() {
                System.out.println("hello world");
            }
        };
        ci1.makeSound();
    }
}
