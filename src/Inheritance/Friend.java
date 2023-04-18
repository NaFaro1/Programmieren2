package Inheritance;

class Friend {
        private String name;
        private String country;

        public Friend(String name, String country) {  // hier habe ich einen Konstrktor erstellt
            this.name = name;
            this.country = country;
        }

        public String getName() {
            return name;
        }

        public String getCountry() {
            return country;
        }

        @Override
        public String toString() {
            return name + " (" + country + ")";
        }
    }


