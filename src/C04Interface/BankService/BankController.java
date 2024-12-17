package C04Interface.BankService;

import java.util.Scanner;

public class BankController {
    public static void main(String[] args) {
        System.out.println("계좌번호 입력해주세요.");
        Scanner sc = new Scanner(System.in);
        String accountNumber = sc.nextLine();
        BankAccount ba = new BankAccount(accountNumber,0);
        while (true){

            System.out.println("입금하시려면 1 출금하시려면 2");
            String input = sc.nextLine();
            if(input.equals("1")){
                System.out.println("입금금액을 적어주세요");
                int money = sc.nextInt();
                System.out.println("입금방식을 선택해주세요. 1 카트 2 카카오페이");
                String input2 = sc.nextLine();
                BankService bs ;
                if(input2.equals("1")){
//                    카드서비스 객체 생성
                    bs = new BankCardService();
                    bs.deposit(money,ba);
                }else {
//                    카카오서비스 객체 생성
                    bs = new BankKakaoService();
                    bs.deposit(money,ba);
                }
            }else{
                System.out.println("출금금액을 적어주세요");
                int money = sc.nextInt();
                System.out.println("출금 방식을 선택해주세요. 1 카트 2 카카오페이");
                String input2 = sc.nextLine();
                BankService bs;
                if(input2.equals("1")){
                    bs=new BankCardService();
                    bs.withdraw(money,ba);
                }else {
                    bs=new BankKakaoService();
                    bs.withdraw(money,ba);
                }
            }
        }

    }
}
