package C02ClassBasic;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankService {
    static List<BankAccount> newAccount = new ArrayList<>();

    public static void main(String[] args) throws IOException {
//        서비스번호를 입력하세요. 1.개설 2.조회 3. 입금 4.출금 5.송금 0.종료
//        1.개설 : 계좌번호와 입금 금액을 입력하세요
//        2.조회 : 계좌조회서비스입니다. 계좌번호를 입력해주세요 ->잔고 출력
//        3.입금 : 계좌입금서비스입니다. 계좌번호와 입금금액을 입력해주세요.
//        4.출금 : 계좌출금서비스입니다. 계좌번호와 출금금액을 입력해주세요.
//        5.송금 : 계좌송금 서비스입니다. user1이 user2에게 계좌번호와 송금금액을 입력해주세요.
//        0.종료 : 서비스가 종료되었습니다.

        while (true){
            System.out.println("서비스번호를 입력하세요. 1.개설 2.조회 3. 입금 4.출금 5.송금 0.종료");
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();
            if(input.equals("0")) {
                System.out.println("서비스가 종료됩니다.");
                break;
            }
            else if(input.equals("1")){
                System.out.println("1번 개설 : 계좌번호와 입금 금액을 입력하세요");
                System.out.println("계좌번호 : ");
                String accountNumber = sc.nextLine();
                System.out.println("입금금액 : ");
                int money = sc.nextInt();
                    BankAccount ba = new BankAccount(accountNumber, money);
                newAccount.add(ba);
            }else if(input.equals("2")){
                System.out.println("2번 조회 : 계좌조회서비스입니다. 계좌번호를 입력해주세요.");
                System.out.println("계좌번호 : ");
                String accountNumber = sc.nextLine();
                    BankAccount b1 = searchAccount(accountNumber);
                System.out.println("잔액 : "+b1.getBalance());
            }else if(input.equals("3")){
                System.out.println("3번 입금 : 계좌입금서비스입니다. 계좌번호와 입금금액을 입력해주세요");
                System.out.println("계좌번호 : ");
                String accountNumber = sc.nextLine();
                System.out.println("입금금액 : ");
                int money = sc.nextInt();
                    BankAccount b1 = searchAccount(accountNumber);
                b1.deposit(money);
                System.out.println("입금후 : "+b1.getBalance());
            }else if(input.equals("4")){
                System.out.println("4.출금 : 계좌출금서비스입니다. 계좌번호와 출금금액을 입력해주세요.");
                System.out.println("계좌번호 : ");
                String accountNumber = sc.nextLine();
                System.out.println("출금금액 : ");
                int money = sc.nextInt();
                    BankAccount b1 = searchAccount(accountNumber);
                b1.withdraw(money);
                System.out.println("출금후 : "+b1.getBalance());
            }else if(input.equals("5")){
                System.out.println("5.송금 : 계좌송금 서비스입니다. 본인 계좌번호와 받는계좌 , 송금 금액을 입력해주세요.");
                System.out.println("본인계좌번호 : ");
                String accountNumber1 = sc.nextLine();
                System.out.println("받는계좌번호 : ");
                String accountNumber2 = sc.nextLine();
                System.out.println("송금금액 : ");
                int money = sc.nextInt();
                BankAccount b1 = searchAccount(accountNumber1);
                BankAccount b2 = searchAccount(accountNumber2);
                b1.transfer(b2,money);
            }else{
                System.out.println("잘못 입력 하셨습니다.");
            }
        }

//Account 객체: 자체ID값(자동 increment),계좌번호,잔액 변수로 구성


    }

    public static BankAccount searchAccount( String accountNumber){     //조회 메서드
        for(BankAccount a : newAccount ){
            if(a.getAccountNum().equals(accountNumber)){
                return a;
            }
        }
        return null;
    }
}


class BankAccount{
    static long static_Id = 0L;
    private long Id;
    private int balance;
    private String accountNum;      //인스턴스 변수

    public BankAccount(String accountNum, int balance) {        //생성자
        static_Id++;
        this.Id = static_Id;
        this.accountNum = accountNum;
        this.balance = balance;
    }


    public void deposit(int money){     //입금
        this.balance+=money;
    }
    public boolean withdraw(int money){     //출금 (부족한지 확인)
        if(this.balance<money){
            System.out.println("잔액부족입니다.");
            return false;
        }else{
            this.balance-=money;
            return true;
        }
    }
    public void transfer(BankAccount yourAccount, int money){
        this.withdraw(money);
        yourAccount.deposit(money);
    }

    public int getBalance() {           //getter
        return balance;
    }
    public String getAccountNum() {
        return accountNum;
    }
    public long getId() {
        return Id;
    }

}


////선생님 코드
//package C02ClassBasic;
//
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Scanner;
//
//public class BankService {
//    public static void main(String[] args) {
////        프로그램은 항상 실행될수 있도록 전체코드를 while(true)처리
////        서비스번호를 입력하세요. 1.개설 2.조회 3.입금 4.출금 5.송금
////        1.개설 : 계좌번호와 현재가지고 계신돈을 입력하세요.
////        2.조회 : 계좌조회서비스입니다. 계좌번호를 입력해주세요. -> 잔고출력
////        3.입금 : 계좌입금서비스입니다. 계좌번호와 입금금액을 입력해주세요.
////        4.출금 : 계좌출금서비스입니다. 계좌번호와 출금금액을 입력해주세요.(잔액검증)
////        5.송금 : 송금서비스입니다. user1과 user2의 송금금액을 입력해주세요.(잔액검증)
//        Map<String, BankAccount> map = new HashMap<>();
//        while (true){
//            Scanner sc = new Scanner(System.in);
//            System.out.println("서비스 번호를 입력해주세요. 1.개설 2.조회 3.입금 4.출금 5.송금");
//            String input = sc.nextLine();
//            if(input.equals("1")){
//                System.out.println("계좌번호를 입력해주세요");
//                String accountNumber = sc.nextLine();
//                System.out.println("계좌금액을 입력해주세요");
//                int money = Integer.parseInt(sc.nextLine());
//                BankAccount ba = new BankAccount(accountNumber, money);
//                map.put(accountNumber, ba);
//            }else if(input.equals("2")){
//                System.out.println("조회입니다. 계좌번호를 입력해주세요");
//                String accountNumber = sc.nextLine();
//                BankAccount ba = map.get(accountNumber);
//                System.out.println("현재 잔고는 "+ba.getBalance());
//            }else if(input.equals("3")){
//                System.out.println("입금입니다. 계좌번호를 입력해주세요");
//                String accountNumber = sc.nextLine();
//                System.out.println("입금금액을 입력해주세요");
//                int money = Integer.parseInt(sc.nextLine());
//                BankAccount ba = map.get(accountNumber);
//                ba.deposit(money);
//            }else if(input.equals("4")){
//                System.out.println("출금입니다. 계좌번호를 입력해주세요");
//                String accountNumber = sc.nextLine();
//                System.out.println("출금금액을 입력해주세요");
//                int money = Integer.parseInt(sc.nextLine());
//                BankAccount ba = map.get(accountNumber);
//                ba.withdraw(money);
//            }else if(input.equals("5")){
//                System.out.println("송금입니다. 본인계좌번호를 입력해주세요");
//                String accountNumber1 = sc.nextLine();
//                System.out.println("상대방계좌번호를 입력해주세요");
//                String accountNumber2 = sc.nextLine();
//                System.out.println("송금금액을 입력해주세요");
//                int money = Integer.parseInt(sc.nextLine());
//                BankAccount ba1 = map.get(accountNumber1);
//                BankAccount ba2 = map.get(accountNumber2);
//                ba1.transfer(ba2, money);
//            }else {
//                System.out.println("잘못 입력하셨습니다.");
//            }
//        }
//    }
//}
////Account객체 : 자체ID값(자동 increment), 계좌번호, 잔액 변수로 구성
//class BankAccount{
//    static long static_id = 0L;
//    private long id;
//    private String accountNumber;
//    private int balance;
//
//    public BankAccount(String accountNumber, int balance) {
//        static_id++;
//        this.id = static_id;
//        this.accountNumber = accountNumber;
//        this.balance = balance;
//    }
//    public void transfer(BankAccount yourBankacount, int money){
//        if(!this.withdraw(money)){
////            void에서 return을 만나면 메서드는 강제 종료
//            return;
//        };
//        yourBankacount.deposit(money);
//    }
//    public void deposit(int money){
//        this.balance += money;
//    }
//    public boolean withdraw(int money){
//        if(this.balance < money){
//            System.out.println("잔액 부족입니다");
//            return false;
//        }else {
//            this.balance -= money;
//            return true;
//        }
//    }
//
//
//
//
//
//    public long getId() {
//        return id;
//    }
//    public String getAccountNumber() {
//        return accountNumber;
//    }
//    public int getBalance() {
//        return balance;
//    }
//}
