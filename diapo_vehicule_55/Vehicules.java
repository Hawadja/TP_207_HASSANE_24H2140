package diapo_vehicule_55;

class Vehicule{
    protected int type;

    public void seDeplacer(){
        System.out.println("le Vehicule se deplace");
    }
}

class Train extends Vehicule{
    @Override
    public void seDeplacer(){
        System.out.println("Le train se deplace sur le rail");
    }
}

class Voiture extends Vehicule{
    @Override
    public void seDeplacer(){
        System.out.println("La voiture se deplace sur la route");
    }
}

class Bateau extends Vehicule{
    @Override
    public void seDeplacer(){
        System.out.println("Le Bateau se deplace sur l'eau");
    }
}