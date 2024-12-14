package C02ClassBasic;
//1.회원가입 : 이름, 이메일, 비밀번호 id값(auto increment)
//2.회원 전체 목록 조회 : id, email
//3.회원 상세 조회(id로 조회) : id, email, name, password ,작성글수
//4.게시글 작성 :id(post auto increment) 제목, 내용, 작성자email->id를 찾아서 id로 변경해서 입력
//5.게시물 목록 조회 : id(post), title
//6.게시물 상세 조회 : id(post), title, contents, 작성자email
//7.서비스 종료

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BoradService {
    static List<Author> newAuthor = new ArrayList<>();
    static List<Post> newPost = new ArrayList<>();
    public static void main(String[] args) {

        while (true){
            System.out.println("1.회원가입  2.회원 전체 목록 조회  3.회원 상세 조회" +"\n" + "4.게시글 작성  5.게시글 목록 조회  6.게시글 상세 조회  0.종료");
            Scanner sc = new Scanner(System.in);
            String n = sc.nextLine();
            if(n.equals("1")) {
                System.out.println("1.회원 가입");
                System.out.println("이름 입력");
                String name = sc.nextLine();
                System.out.println("이메일 입력");
                String email = sc.nextLine();
                System.out.println("비밀번호 입력");
                String password = sc.nextLine();
                Author na = new Author(name, email, password);
                newAuthor.add(na);
            }else if(n.equals("2")) {
                System.out.println("2.회원 전체 목록 조회");
                for (Author a : newAuthor) {
                    System.out.println("ID:" + a.getId() + "  Email:" + a.getEmail());
                }
            }else if(n.equals("3")) {
                System.out.println("3.회원 상세 조회");
                System.out.println("고유id 입력");
                int id = sc.nextInt();
                for(Author a : newAuthor){
                    if(a.getId()==id){
                        System.out.println("고유id:"+a.getId()+" email:" +a.getEmail()+" name:"+a.getName() +" password:"+a.getPassword());
                    }
                }

            }else if(n.equals("4")) {
                System.out.println("4.게시글 작성");
                System.out.println("제목입력");
                String title = sc.nextLine();
                System.out.println("내용입력");
                String contents = sc.nextLine();
                System.out.println("작성자 이메일");
                String email = sc.nextLine();
                for(Author a : newAuthor){
                    if(a.getEmail().equals(email)){
                        Post newPost = new Post(title,contents,a.getId());
                    }
                }

            }else if(n.equals("5")) {
                System.out.println("2.회원 전체 목록 조회");

            }else if(n.equals("6")) {
                System.out.println("2.회원 전체 목록 조회");
            }else if(n.equals("0")) {
                System.out.println("서비스종료");
                break;
            }else{
                System.out.println("다른값을 입력해 주세요");
            }//if end

        }//while end
    }//main end
}
class Author{
    static int author_Id = 0;
    private String name ;
    private String email ;
    private String password ;
    private int id =0;


    public Author(String name, String email, String password) {
        author_Id++;
        this.id = author_Id;
        this.name = name;
        this.email = email;
        this.password = password;
    }


    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public String getPassword() {
        return password;
    }
}//author class

class Post{
    private int post_Id = 0;
    private String title ;
    private String contents ;
    private int id ;

    public Post(String title, String contents,  int id) {
        this.post_Id++;
        this.id = post_Id;

        this.title = title;
        this.contents = contents;
    }


    public String getTitle() {
        return title;
    }
    public String getContents() {
        return contents;
    }
    public int getId() {
        return id;
    }
}//post class



// 선생님 코드 주요 매서드 복습

//public class BoardService {
//    public static void main(String[] args) {
////        1.회원가입 : 이름, 이메일, 비밀번호, id값(auto_increment)
////        2.회원 전체 목록 조회 : id, email
////        3.회원 상세 조회(id로 조회) : id, email, name, password, 작성글수
////        4.게시글 작성 : 제목, 내용, 작성자Email -> author_id를 찾아서 author_id로 변경 입력, id값(auto_increment)
////        5.게시물 목록 조회 : id(post), title
////        6.게시물 상세 조회 : id(post), title, contents, 작성자email
////        7.서비스 종료
//
//        List<Author> authorList = new ArrayList<>();
//        List<Post> postList = new ArrayList<>();
//        Scanner sc = new Scanner(System.in);
//
//        while (true){
//            System.out.println("원하는 서비스 번호를 입력하세요. ~~");
//            String input = sc.nextLine();
//            if(input.equals("1")){
//                System.out.println("회원가입");
//                String name = sc.nextLine();
//                String email = sc.nextLine();
//                String password = sc.nextLine();
//                Author a1 = new Author(name, email, password);
//                authorList.add(a1);
//            }else if(input.equals("2")){
//                System.out.println("전체 회원 목록조회");
//                for(Author a1 : authorList){
//                    System.out.println(a1.getEmail() + a1.getName());
//                }
//            }else if(input.equals("3")){
//                System.out.println("회원 상세 조회");
//                int inputId = Integer.parseInt(sc.nextLine());
//                for(Author a1 : authorList){
//                    if(a1.getId()==inputId){
//                        System.out.println(a1.getName() + a1.getEmail());
//                        System.out.println(a1.getPostList().size());
//                        break;
//                    }
//                }
//
//            }else if(input.equals("4")){
//                System.out.println("게시글 작성");
//                String title = sc.nextLine();
//                String contents = sc.nextLine();
//                int author_id = Integer.parseInt(sc.nextLine());
//                Author a1 = null;
//                for(Author a : authorList){
//                    if(a.getId()==author_id){
//                        a1 = a;
//                    }
//                }
//                Post p1 = new Post(title,contents,a1);
////                a1.getPostList().add(p1);
//                postList.add(p1);
//            }else if(input.equals("5")){
//                System.out.println("게시글 목록조회");
//            }else if(input.equals("6")){
//                System.out.println("게시글 상세조회");
//                int id = Integer.parseInt(sc.nextLine());
//                for(Post p : postList){
//                    if(p.getId()==id){
//                        System.out.println(p.getTitle() + p.getContents());
//                        System.out.println(p.getAuthor().getName());
//                    }
//                }
//            }
//        }
//    }
//}
//
//class Author{
//    private static int static_id;
//    private String name;
//    private int id;
//    private String email;
//    private String password;
//    private List<Post> postList;
//
//    public List<Post> getPostList() {
//        return postList;
//    }
//
//    public Author(String name, String email, String password) {
//        static_id++;
//        this.name = name;
//        this.id = static_id;
//        this.email = email;
//        this.password = password;
//        this.postList = new ArrayList<>();
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//}
//class Post{
//
//    private static int static_id;
//    private int id;
//    private String title;
//    private String contents;
//    private Author author;
//
//    public Post(String title, String contents, Author author) {
//        static_id++;
//        this.id = static_id;
//        this.title = title;
//        this.contents = contents;
//        this.author = author;
//        this.author.getPostList().add(this);
//    }
//
//
//
//    public int getId() {
//        return id;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public String getContents() {
//        return contents;
//    }
//
//    public Author getAuthor() {
//        return author;
//    }
//}