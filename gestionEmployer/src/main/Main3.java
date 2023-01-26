package main;

import Models.Personne;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main3 {
    public static void main(String[] args) {
        List<Personne> pers=new ArrayList<>();
        pers.add(new Personne("durc",50));
        pers.add(new Personne("aime",41));
        pers.add(new Personne("oui",15));
        pers.add(new Personne("arthur",75));
//Fonctionel programming
        pers.forEach(p->System.out.println(p));
        /*System.out.println("-------------------------------------------");
        pers.stream().filter(p->p.getAge()>18).collect(Collectors.toList()).forEach(p->System.out.println(p));
        System.out.println("-------------------NOMS-------------------------");
         pers.stream().map(p->p.getNom()).collect(Collectors.toList()).forEach(p->System.out.println(p));*/

    }
}
