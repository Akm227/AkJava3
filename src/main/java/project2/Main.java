package project2;

public class Main {
    public static void main(String[] args) {
        Product product=new Product();
        product.name="NoteBook";
        product.price=300;

        Shop shop=new Shop();
        int quantity=4;
        double total=shop.calculaateTotal(product.price,quantity);
        System.out.println("total:"+total);
        shop.chekDiscount(total);

    }
}
