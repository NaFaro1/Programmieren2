package Inheritance;

import java.util.ArrayList;

    public class FriendList {
        private ArrayList<Friend> friends;

        public FriendList() {
            friends = new ArrayList<>();
        }

        public void addFriend(Friend f) {
            friends.add(f);
        }

        public void removeFriend(Friend f) {
            friends.remove(f);
        }

        public ArrayList<Friend> friendsAbroad(String homeCountry) {
            ArrayList<Friend> friendsAbroad = new ArrayList<>();
            for (Friend f : friends) {
                if (!f.getCountry().equals(homeCountry)) {
                    friendsAbroad.add(f);
                }
            }
            return friendsAbroad;
        }

        public ArrayList<Friend> getFriends() {
            return friends;
        }

        public static void main(String[] args) {
            FriendList list = new FriendList();

            list.addFriend(new Friend("Nusrat", "USA"));
            list.addFriend(new Friend("Api", "Canada"));
            list.addFriend(new Friend("Elian", "Germany"));

            System.out.println("All friends: " + list.getFriends());
            System.out.println("Friends abroad: " + list.friendsAbroad("USA"));

            list.removeFriend(list.getFriends().get(0));

            System.out.println("All friends after removal: " + list.getFriends());
        }
    }



