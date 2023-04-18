package Inheritance;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

    public class Verwaltung {
        private List<Player> playerList;

        public Verwaltung() {
            playerList = new ArrayList<>();
        }

        public void addPlayer(Player player) {
            playerList.add(player);
        }

        public void removePlayer(Player player) {
            playerList.remove(player);
        }

        public void printPlayers() {
            Iterator<Player> it = playerList.iterator();
            while (it.hasNext()) {
                System.out.println(it.next());
            }
        }

        public Player getPlayerById(int id) {
            for (Player player : playerList) {
                if (player.getId() == id) {
                    return player;
                }
            }
            return null;
        }

        public int getPointsPerTeam(Team team) {
            int totalPoints = 0;
            for (Player player : playerList) {
                if (player.getTeam() == team) {
                    totalPoints += player.getPoints();
                }
            }
            return totalPoints;
        }

        public Player getWinner() {
            Player winner = null;
            int maxPoints = 0;
            for (Player player : playerList) {
                if (player.getPoints() > maxPoints) {
                    winner = player;
                    maxPoints = player.getPoints();
                }
            }
            return winner;
        }
    }

