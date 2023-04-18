public class ShopTest {


        public static void main(String[] args) {
            Shop shop = new Shop();

            // Produkte hinzufügen
            shop.add(new Produkt("Buch", 40, "Ein interessantes Buch"));
            shop.add(new Produkt("T-Shirt", 12.99, "Ein cooles T-Shirt"));
            shop.add(new Produkt("Kaffeebecher", 5, "Ein schöner Kaffeebecher"));

            // Shop ausgeben
            System.out.println(shop);

            // Produkt suchen
            System.out.println(shop.get("Buch"));

            // Produkte teurer als 10 Euro ausgeben
            System.out.println("Produkte teurer als 10 Euro:");
            for (Produkt p : shop.getByPriceFrom(10)) {
                System.out.println(p);
            }

            // Produkte günstiger als 15 Euro ausgeben
            System.out.println("Produkte günstiger als 15 Euro:");
            for (Produkt p : shop.getByPriceTo(15)) {
                System.out.println(p);
            }

            // Produkte teurer als 15 Euro entfernen
            shop.removeProductsFromByIterator(15);
            System.out.println(shop);

            // Produkte teurer als 10 Euro entfernen
            shop.removeProductsFromByKeySet(10);
            System.out.println(shop);
        }
    }

