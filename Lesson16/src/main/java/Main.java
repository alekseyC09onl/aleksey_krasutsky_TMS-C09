public class Main {
    public static void main(String[] args) {
        Product cucumber = new Product(15, "огурец", 4);
        Product tomato = new Product(16, "помидор", 5);
        Product carrot = new Product(16, "морковь", 2);
        Shop shop = new Shop();
        try {
            shop.addProductToList(cucumber);
            shop.addProductToList(tomato);
            shop.addProductToList(carrot);
        } catch (IdException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(shop.getProductList());
    }
}
