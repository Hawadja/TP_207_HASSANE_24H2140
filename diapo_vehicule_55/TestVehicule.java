package diapo_vehicule_55;

public class TestVehicule{
    public static void main(String [] args){
        Vehicule monTrain = new Train();
        Vehicule maVoiture = new Voiture();
        Vehicule monBateau = new Bateau();

        System.out.println("Les deplacements");

        monTrain.seDeplacer();
        maVoiture.seDeplacer();
        monBateau.seDeplacer();
    }
}