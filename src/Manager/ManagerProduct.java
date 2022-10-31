package Manager;


import Entity.Product;
import java.util.Scanner;


public class ManagerProduct {
    private Scanner scanner;

    public ManagerProduct() {
        this.scanner = new Scanner(System.in);
    }

    public Product addproduct() {
        Product product = new Product();
        System.out.println("Введите название продукта");
        product.setProductName(scanner.nextLine());
        System.out.println("Введите цену продукта (целыми числами)");
        product.setPrice(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Количество товара");
        product.setPrice(scanner.nextInt());
        scanner.nextLine();
        return product;
    }


    public void printListProducts(Product[] products){
        System.out.println("Продукты: ");
        for (int i = 0; i < products.length; i++) {
            Product product = products[i];
            System.out.printf(i+1+". "+
                            "%s"
                    ,product.getProductName());
        }
        System.out.println();
    }

}