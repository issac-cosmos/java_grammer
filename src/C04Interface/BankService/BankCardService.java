package C04Interface.BankService;

public class BankCardService implements BankService {
    @Override
    public void deposit(int money, BankAccount ba) {
        int current = ba.getBalance();
        int balance = current+money;
        ba.updateBalance(balance);
        System.out.println(money+"원 카드로 입금 되었습니다.");
        System.out.println("현재 잔액은 "+ balance +"원 입니다.");
    }

    @Override
    public void withdraw(int money, BankAccount ba) {
        int current = ba.getBalance();
        if (current < money) {
            System.out.println("잔액이 부족합니다.");
        } else {
            int balance = current - money;
            ba.updateBalance(balance);

            System.out.println(money + "원 카드로 입금 되었습니다.");
            System.out.println("현재 잔액은 " + balance + "원 입니다.");
        }
    }
//    입금시
//    xx원 카드로 입금되엇습니다.
//현재잔액은 yy원입니다

//    출금시
//    xx원 카드로 출금되엇습니다.
//현재잔액은 yy원입니다
}
