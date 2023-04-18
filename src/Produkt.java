import java.util.Objects;

public class Produkt {
    private String title;
    private double price;
    private double discount;
    private String discription;

    public Produkt(String title, double price, String discription) {
        this.title = title;
        this.price = price;
        this.discription = discription;
    }

    public Produkt(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public double getDiscount() {
        return discount;
    }

    public String getDiscription() {
        return discription;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produkt produkt = (Produkt) o;
        return Double.compare(produkt.price, price) == 0 && Objects.equals(title, produkt.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, price);
    }


    @Override
    public String toString() {
        return "Produkt{" +
                "title='" + title + '\'' +
                ", price=" + getPriceWithDiscount() +
                '}';
    }




        public double getPriceWithDiscount () {
            return price - price* discount / 100;
        }

    }
