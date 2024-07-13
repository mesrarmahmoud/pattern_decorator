import deco.Chocolat;
import deco.Lait;
import deco.Noisette;
import deco.Vanille;
import produits.Boisson;
import produits.Deca;
import produits.Espresso;
import produits.Sumatra;

public class Application {
    public static void main(String[] args) {
//        Boisson boisson = new Espresso();
//        System.out.println(boisson.getDescription());
//        System.out.println(boisson.cout());
//
//        System.out.println("-------------------");
//        boisson = new Deca();
//        System.out.println(boisson.getDescription());
//        System.out.println(boisson.cout());
//        System.out.println("-------------------");
//
//        boisson = new Lait(boisson);
//        System.out.println(boisson.cout());
//        System.out.println(boisson.getDescription());
        Boisson boisson;
        boisson = new Sumatra();
        System.out.println(boisson.cout());
        System.out.println(boisson.getDescription());

        System.out.println("--------------------");
        boisson = new Lait(boisson);
        System.out.println(boisson.cout());
        System.out.println(boisson.getDescription());

        System.out.println("--------------------");
        boisson = new Chocolat(boisson);
        System.out.println(boisson.cout());
        System.out.println(boisson.getDescription());

        System.out.println("***********************");

        Boisson b = new Vanille(new Chocolat(new Chocolat(new Noisette( new Chocolat(new Sumatra())))));
        System.out.println(b.cout());
        System.out.println(b.getDescription());

    }



}
