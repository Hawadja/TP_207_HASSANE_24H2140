package diapo_voiture_56;

class Voiture{
    protected int puissance;
    protected boolean estDemarre;
    protected float vitesse;
    protected String nom;

    public Voiture(String nom, int puissance, boolean estDemarre, float vitesse){
        this.nom=nom;
        this.puissance=puissance;
        this.estDemarre=estDemarre;
        this.vitesse=vitesse;
    }
    public void afficher(){
        System.out.println("Detail Voiture");
        System.out.println("nom :"+ this.nom);
        System.out.println("puissance :"+this.puissance);
        System.out.println("demarre :"+this.estDemarre);
        System.out.println("Vitesse :"+this.vitesse);
    }
}

class VoitureElectronique extends Voiture{
    private String typeChargeur;

    public VoitureElectronique(String nom, int puissance, boolean estDemarre, float vitesse){
        super(nom, puissance, estDemarre, vitesse);
        this.typeChargeur=typeChargeur;
    }
    @Override
    public void afficher(){
        super.afficher();
        System.out.println("Type : Electronique");
        System.out.println("Chargeur :"+typeChargeur);
    }
}

class VoitureCarburant extends Voiture{
    private String typeCarburant;

    public VoitureCarburant(String nom, int puissance, boolean estDemarre, float vitesse){
        super(nom, puissance, estDemarre, vitesse);
        this.typeCarburant=typeCarburant;
    }
    @Override
    public void afficher(){
        super.afficher();
        System.out.println("Type : carburant");
        System.out.println("Type :"+typeCarburant);
    }
}