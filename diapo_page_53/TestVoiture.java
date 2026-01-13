package diapo_page_53;


public class TestVoiture {
    public static void main(String[] args) {
        // Instanciation Voiture Electrique
        VoitureElectronique maVoitureElectronique;
        maVoitureElectronique = new VoitureElectronique("VoitureElec", 5, false, 1.0f, "Chargeur20");
        maVoitureElectronique.afficher();

        System.out.println("\n--------------------------\n");

        // VoitureCarburant
        VoitureCarburant maVoitureEssence = new VoitureCarburant("SUV Essence", 120, false, 0.0f, "Essence Sans Plomb");
        maVoitureEssence.demarre();
        maVoitureEssence.accelere(50.0f);
        maVoitureEssence.afficher();
    }
}
