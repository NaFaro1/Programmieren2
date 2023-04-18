package Inheritance;

public class Event {

        private EventType type;
        private String title;
        private String ort;
        private double preis;

        // Konstruktor
        public Event(EventType type, String title, String ort, double preis) {
            this.type = type;
            this.title = title;
            this.ort = ort;
            this.preis = preis;
        }

        // Getter-Methoden
        public EventType getType() {
            return type;
        }

        public String getTitle() {
            return title;
        }

        public String getOrt() {
            return ort;
        }

        public double getPreis() {
            return preis;
        }

        // Setter-Methoden
        public void setType(EventType type) {
            this.type = type;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public void setOrt(String ort) {
            this.ort = ort;
        }

        public void setPreis(double preis) {
            this.preis = preis;
        }

        // toString-Methode
        @Override
        public String toString() {
            return "Event{" +
                    "type=" + type +
                    ", title='" + title + '\'' +
                    ", ort='" + ort + '\'' +
                    ", preis=" + preis +
                    '}';
        }
    }

