import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new BottleOfWater("qwe", 123, 100));
        productList.add(new BottleOfWater("qwe", 200, 150));
        productList.add(new BottleOfWater("zxcg", 500, 1000));
        productList.add(new BottleOfWater("qaffwe", 123, 10));
        BottleOfWaterVendingMachine vendingMachine = new BottleOfWaterVendingMachine();
        vendingMachine.initProduct(productList);
        System.out.println(vendingMachine.getProduct("qwe", 150));
        Product test = new BottleOfWater("asd", 123, 123);

        productList.add(new HotDrink("coffee", 600, 210, 55));
        productList.add(new HotDrink("tea", 700, 300, 50));
        productList.add(new HotDrink("green_tea", 800, 400, 50));
        productList.add(new HotDrink("cocoa", 900, 500, 55));
        HotDrinkVendingMachine vendingMachine2 = new HotDrinkVendingMachine();
        vendingMachine2.initProduct(productList);
        System.out.println(vendingMachine2.getProduct("tea", 300, 50));
    }
}