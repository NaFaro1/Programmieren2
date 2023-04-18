package Inheritance;

import java.util.ArrayList;





    public class EventCalendar {
        private ArrayList<Event> events;

        // Konstruktor
        public EventCalendar() {
            this.events = new ArrayList<>();
        }

        // Methoden
        public void add(Event e) {
            events.add(e);
        }

        public void print() {
            print(events);
        }

        public void print(ArrayList<Event> events) {
            for (Event e : events) {
                System.out.println(e);
            }
        }

        public Event getByTitle(String title) {
            for (Event e : events) {
                if (e.getTitle().equals(title)) {
                    return e;
                }
            }
            return null;
        }

        public ArrayList<Event> getByType(EventType type) {
            ArrayList<Event> result = new ArrayList<>();
            for (Event e : events) {
                if (e.getType() == type) {
                    result.add(e);
                }
            }
            return result;
        }

        public ArrayList<Event> getByOrt(String ort) {
            ArrayList<Event> result = new ArrayList<>();
            for (Event e : events) {
                if (e.getOrt().equals(ort)) {
                    result.add(e);
                }
            }
            return result;
        }

        public Event getMostExpensive() {
            Event result = null;
            for (Event e : events) {
                if (result == null || e.getPreis() > result.getPreis()) {
                    result = e;
                }
            }
            return result;
        }
    }



