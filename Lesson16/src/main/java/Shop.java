import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.ListIterator;

@Getter
@Setter
public class Shop {
    private ArrayList<Product> productList;
    private Product product;
    private boolean repeatId;

    public Shop() {
        productList = new ArrayList<>();
    }

    public void addProductToList(Product product) throws IdException {
        ListIterator<Product> listIterator = productList.listIterator();
        if (productList.isEmpty()) {
            productList.add(product);
        } else {
            while (listIterator.hasNext()) {
                if (product.getId() == listIterator.next().getId()) {
                    repeatId = true;
                }
            }
            if (repeatId) {
                throw new IdException("Невозможно добавить " + product.getName() + "! Продукт с таким id уже существует!");
            } else {
                productList.add(product);
            }
        }
    }

    public String getProductList() {
        ListIterator<Product> listIteratorProduct = productList.listIterator();
        StringBuilder stringBuilder = new StringBuilder();
        while (listIteratorProduct.hasNext()) {
            stringBuilder.append(listIteratorProduct.next().toString() + "\n");
        }
        return stringBuilder.toString();
    }


}
