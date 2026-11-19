package project2;

public class Shop {
    double calculaateTotal(double price,int quantity){
        double total=0;
        for (int i = 1; i <=quantity ; i++) {
            total+=price;
        }
        return total;
    }
    void chekDiscount(double total){
        if (total>=1000){
            System.out.println("Discount availbe");
        }else
        {
            System.out.println("not discount");
        }
    }
}
