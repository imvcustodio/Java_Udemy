package applocattion;

import entities.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;

public class ProgramFixacao {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        List<Product> productList = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Enter the number of products: ");
        int productsNumber = scanner.nextInt();
        for (int i = 0; i < productsNumber; i++) {
            System.out.println("Product #" + (i + 1) + " data: ");
            System.out.println("Common, used or imported (c/u/i): ");
            char productCategory = scanner.next().charAt(0);
            System.out.println("Name: ");
            String name = scanner.next();
            System.out.println("Price: ");
            double price = scanner.nextDouble();
            if(productCategory == 'c'){
                productList.add(new Product(name,price));
            }else  if(productCategory == 'u'){
                System.out.println("Manufacture date: (dd/MM/yyyy): ") ;
                String dateString = scanner.next();
                Date manufactureDate = sdf.parse(dateString);
                productList.add(new UsedProduct(name, price, manufactureDate));
            } else if (productCategory == 'i') {
                System.out.println("Custom fee: ");
                double customFee = scanner.nextDouble();
                productList.add(new ImportedProduct(name, price, customFee));
            }

        }
        System.out.println("Price Tags: ");
        for (Product products : productList) {
            System.out.println(products.priceTag());
        }


    }
}
