package Inheritance;

import java.util.Objects;

public class Player {

    private static int counter = 0;
    private final int id;
    private String name;
    private Team team;
    private int points;

    public Player(String name, Team team, int points) {
        this.id = ++counter;
        this.name = name;
        this.team = team;
        this.points = points;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPoints() {
        return points;
    }

    public Team getTeam() {
        return team;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    @Override
    public String toString() {
        return "Player [Id = " + id + ", name " + name + " Team "+ team + " Score " + points + "]";
    }



    @Override
    public int hashCode() {
        return Objects.hash(id, name, team, points);
    }

    public static void main(String[] args) {


        Player player1 = new Player("Faro", Team.Team_A, 10);
        System.out.println(" ID " + player1.getId());
        System.out.println(" Name " + player1.getName());
        System.out.println(" Team " + player1.getTeam());
        System.out.println(" Points " + player1.getPoints());

        player1.setName("Aiman");
        player1.setTeam(Team.Team_B);
        player1.setPoints(20);

        System.out.println(player1.toString());

    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return id == player.id && points == player.points && Objects.equals(name, player.name) && team == player.team;
    }

}