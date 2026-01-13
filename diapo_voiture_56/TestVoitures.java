package diapo_voiture_56;

public class TestVoitures{
    public static void main(String [] args){

        VoitureElectronique maVoitureElectronique = new VoitureElectronique("Tesla", 600, false, 0.0f);
        maVoitureElectronique.afficher();

        VoitureCarburant maVoitureEssence = new VoitureCarburant("Toyota", 100, false, 0.0f );
        maVoitureEssence.afficher();
    }
}