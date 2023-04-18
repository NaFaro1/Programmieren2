package Inheritance;

public class Employee {
    String name;
    int Id;
    String adresse;

    public Employee(String name, int id, String adresse) {
        this.name = name;
        Id = id;
        this.adresse = adresse;
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Melissa", 102, "Elisabethinergasse 3");
        Employee e2 = new Employee("Meriam", 103, "Steinfeldgasse 23");
        Employee e3 = new Employee("Katja", 104, "Neutorgassee 99");
        Employee e4 = new Employee("Issa", 105, "Keplerstraßee 45");

        System.out.println(  e1.Id + e1.adresse+e1.name); //Ausgabe 102Elisabethinergasse 3Melissa  kein schöner Code aber funktioniert
        System.out.println(  e2.Id + e2.adresse+e2.name);
        System.out.println(  e3.Id + e3.adresse+e3.name);
        System.out.println(  e4.Id + e4.adresse+e4.name);

        e1.run();
        //System.out.println(e1.run());


    }

    public void run(){   // public String run(){  return String "";
        //return "I am running 2 km per day and you?";
        System.out.println("I am running 2 km per day and you?" );
    }
}
