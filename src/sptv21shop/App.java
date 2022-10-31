package sptv21shop;


import Entity.Buyer;
import Entity.Product;
import java.text.ParseException;
import java.util.Arrays;
import java.util.Scanner;
import Manager.ManagerBuyer;
import Manager.ManagerProduct;


public class App {
    private Product[] products;
    private Buyer[] buyers;
    private final ManagerBuyer managerBuyer;
    private final ManagerProduct managerProduct;

    public App() {
        this.products = new Product[0];
        this.buyers = new Buyer[0];
        managerBuyer = new ManagerBuyer();
        managerProduct = new ManagerProduct();

    }

    public void run() throws ParseException{
        boolean repeat = true;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("Список задач: ");
            System.out.println("1. Выход из программы");
            System.out.println("2. Добавить продукт");
            System.out.println("3. Добавить покупателя");
            System.out.println("4. Список продуктов");
            System.out.println("5. Список покупателей");
            System.out.println("6. Покупка продукта");
            System.out.println("7. Выдача денег покупателю");
            int task = scanner.nextInt();
            scanner.nextLine();
            System.out.println("=====================================");
            switch (task) {
                case 0:
                    repeat = false;
                    System.out.println("0. Выход из программы");
                    break;
                case 2:
                    System.out.println("2. Добавить продукт");
                    this.products = Arrays.copyOf(this.products, this.products.length+1);
                    this.products[this.products.length-1] = managerProduct.addproduct();
                    break;
                case 4:
                    System.out.println("4. Список продуктов");
                    managerProduct.printListProducts(products);
                    break;
                case 3:
                    System.out.println("3. Добавить покупателя");
                    this.buyers =  Arrays.copyOf(this.buyers, this.buyers.length+1);
                    this.buyers[this.buyers.length-1] = managerBuyer.createBuyer();
                case 5:
                    System.out.println("5. Список покупателей");
                    System.out.println("Список покупателей");
                    managerBuyer.printListBuyers(buyers);
                    break;
                case 6:
                    System.out.println("6. Покупка продукта");
                    System.out.println(" Список покупателей: ");
                    managerBuyer.printListBuyers(buyers);
                    int buy1 = scanner.nextInt();
                    System.out.println(" Список продуктов: ");
                    for(int j = 0; j< products.length; j++){
                        System.out.println(j+1);
                    }
                    int buy2 = scanner.nextInt();
                    int pur = buyers[buy1-1].getCash() - products[buy2-1].getPrice();
                    buyers[buy1-1].setCash(pur);
                    System.out.println("Остаток на счету"+pur);

                    break;
                case 7:
                    System.out.println("7. Добавление денег покупателю");
                    System.out.println("Выберите покупателя для зачисления на его счет денежных средств");
                    System.out.println("Список покупателей");
                    managerBuyer.printListBuyers(buyers);
                    int turn = scanner.nextInt(); scanner.nextLine();
                    System.out.println("Сколько денег?");
                    int addMoney = scanner.nextInt(); scanner.nextLine();
                    int TotalMoney = buyers[turn -1].getCash()+ addMoney;
                    buyers[turn -1].setCash(TotalMoney);
                    break;
            }
            System.out.println("=======================================");
        }while(repeat);
        System.out.println("Пока, ребята!");
    }

    private void testAddProduct() {

        Product product = new Product();
        product.setProductName("Product for editing");
        Buyer buyer = new Buyer();
        buyer.setFirstname("Имя");
        buyer.setLastname("Фамилия");
        Buyer[] productBuyers = new Buyer[1];
        productBuyers[0] = buyer;
        product.setBuyers(productBuyers);
        this.products = Arrays.copyOf(this.products, this.products.length+1);
        this.products[this.products.length-1] = product;
    }

}