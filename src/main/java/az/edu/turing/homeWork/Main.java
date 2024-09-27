package az.edu.turing.homeWork;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Player> players=new ArrayList<>(Arrays.asList(
                new Player(1,"Leyla",25,90,true),
                new Player(2,"Leyla",25,90,true),
                new Player(3,"Leyla",25,90,true),
                new Player(4,"Leyla",25,90,true),
                new Player(5,"Leyla",25,90,true)
                ));
        Comparator<Player>playerComparator=Comparator.comparingDouble((Player p)-> p.getScore()).reversed()
                .thenComparing(p->!p.isFemale())
                .thenComparingInt(p->p.getAge())
                .thenComparing(p->p.getName(),Comparator.reverseOrder())
                .thenComparingInt(p-> p.getId());
        players.sort(playerComparator);
        players.forEach(System.out::println);
    }
}
