public class main {
    public static void main(String[] args) {


        Produkt q = new Produkt("Product2", 50);
        q.setDiscount(20);
        System.out.println(q.getPriceWithDiscount());
        System.out.println(q);

        Produkt q2 = new Produkt("Product2", 50);
        q2.setDiscount(10);
        System.out.println(q.getPriceWithDiscount());
        System.out.println(q2);

        System.out.println(q.equals(q2));


    }
}