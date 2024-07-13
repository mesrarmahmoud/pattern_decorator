package deco;

import produits.Boisson;

public class Vanille extends DecoratorBoisson{

    public Vanille(Boisson boisson) {
        super(boisson);
    }

    @Override
    public String getDescription() {
        return boisson.getDescription() + " au vanille";
    }

    @Override
    public double cout() {
        return 1.6 + boisson.cout();
    }
}
