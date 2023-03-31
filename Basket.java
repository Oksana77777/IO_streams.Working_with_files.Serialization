import java.io.*;
import java.util.Arrays;

import static java.lang.System.out;


public class Basket {
    // private static final long serialVersionUID = 1L;
    private String[] goods;
    private int[] prices;
    private int[] quantities;

    public Basket() {
    }

    public Basket(String[] goods, int[] prices) {
        this.goods = goods;
        this.prices = prices;
        this.quantities = new int[goods.length];
    }

    public void addToCart(int productNum, int amount) {
        quantities[productNum] += amount;
    }

    public void printCart() {
        int totalPrices = 0;
        out.println("Список покупок: ");
        for (int i = 0; i < goods.length; i++) {
            if (quantities[i] > 0) {
                int currentPrice = prices[i] * quantities[i];
                totalPrices += currentPrice;
                out.printf("%15s%4d р/шт%6d шт %d p%n", goods[i], prices[i], quantities[i], currentPrice);

            }
        }
        out.printf("Итого: %dр", totalPrices);
    }

    public void saveTxt(File textFile) throws FileNotFoundException {
        try (PrintWriter out = new PrintWriter(textFile)) {
  /*          for (String good : goods) {
                out.println(good + " ");
            }
            out.println();

            for (int price : prices) {
                out.println(price + " ");
            }
            out.println();

            for (int quantity : quantities) {
                out.println(quantity + " ");
  */      //    }
            out.println(String.join( " ", goods));
            out.println(String.join(" ", Arrays.stream(prices)
                    .mapToObj(String::valueOf)
                    .toArray(String []::new)));
            out.println(String.join( " ", goods));
            out.println(String.join(" ", Arrays.stream(quantities)
                    .mapToObj(String::valueOf)
                    .toArray(String []::new)));
        }
    }
    public static Basket loadFromTxtFile(File textFile) {
        Basket basket = new Basket();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(textFile))) {
            String goodsStr = bufferedReader.readLine();
            String pricesStr = bufferedReader.readLine();
            String quantitiesStr = bufferedReader.readLine();

            basket.goods = goodsStr.split(" ");
            basket.prices = Arrays.stream(pricesStr.split(" "))
                    .map(Integer::parseInt)
                    .mapToInt(Integer::intValue)
                    .toArray();
            basket.quantities = Arrays.stream(quantitiesStr.split(" "))
                    .map(Integer::parseInt)
                    .mapToInt(Integer::intValue)
                    .toArray();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);

        }
        return basket;
    }
}
