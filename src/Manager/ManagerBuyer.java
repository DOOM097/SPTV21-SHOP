package Manager;

import Entity.Buyer;

import java.util.Scanner;

public class ManagerBuyer{
    private final Scanner scanner = new Scanner(System.in);
    public Buyer createBuyer(){
        Buyer buyer = new Buyer();
        System.out.print("Введите Имя: ");
        buyer.setFirstname(scanner.nextLine());
        System.out.print("Введите Фамилия: ");
        buyer.setLastname(scanner.nextLine());
        return buyer;
    }

    public void printListBuyers(Buyer[] buyers) {
        for (int i = 0; i < buyers.length; i++) {
            Buyer buyer = buyers[i];
            System.out.printf(i+1+"%s %n"
                    ,buyer.getFirstname()
                    ,buyer.getLastname()
            );
        }
    }
}