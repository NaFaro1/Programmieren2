import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Shop {

    private HashMap<String, Produkt> products;

    public Shop() {
        this.products = new HashMap<>();
    }

    public void add(Produkt p) {
        products.put(p.getTitle(), p);
    }

    public Produkt get(String name) {
        if (products.containsKey(name)) {
            return products.get(name);
        } else {
            System.out.println("Das Produkt " + name + " wurde nicht gefunden.");
            return null;
        }
    }

    public ArrayList<Produkt> getByPriceFrom(double from) {
        ArrayList<Produkt> result = new ArrayList<>();
        for (Map.Entry<String, Produkt> entry : products.entrySet()) {
            if (entry.getValue().getPrice() >= from) {
                result.add(entry.getValue()); // executed result :
            }
        }
        return result;
    }

    public ArrayList<Produkt> getByPriceTo(double to) {
        ArrayList<Produkt> result = new ArrayList<>();
        for (Map.Entry<String, Produkt> entry : products.entrySet()) {
            if (entry.getValue().getPrice() <= to) {
                result.add(entry.getValue());
            }
        }
        return result;
    }

    public void removeProductsFromByIterator(double from) {
        Iterator<Map.Entry<String, Produkt>> it = products.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, Produkt> entry = it.next();
            if (entry.getValue().getPrice() >= from) {
                it.remove();
            }
        }
    }

    public void removeProductsFromByKeySet(double from) {
        for (String key : products.keySet()) {
            if (products.get(key).getPrice() >= from) {
                products.remove(key);
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        String format = "| %-20s | %-8s | %-10s |\n";
        result.append(String.format(format, "Name", "Preis", "Beschreibung"));
        result.append("+----------------------+----------+------------+\n");
        for (Map.Entry<String, Produkt> entry : products.entrySet()) {
            Produkt p = entry.getValue();
            result.append(String.format(format, p.getTitle(), p.getPrice(), p.getDiscription()));
        }
        return result.toString();
    }
}