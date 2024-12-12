package C02ClassBasic;

public class C0202Person {
//        private접근제어자는 해당 클래스내에서만 접근 가능
//        클래스에서 객체변수는
    String name;
    int age;
    String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public void eating(){
        System.out.println(name+"님이 밥을 먹고 있습니다.");
    }
}


