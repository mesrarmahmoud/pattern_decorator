package deco;

import produits.Boisson;

public class Noisette extends DecoratorBoisson{

    public Noisette(Boisson boisson) {
        super(boisson);
    }

    @Override
    public String getDescription() {
        return boisson.getDescription() + " au noisette";
    }

    @Override
    public double cout() {
        return 1.3 + boisson.cout();
    }
}
