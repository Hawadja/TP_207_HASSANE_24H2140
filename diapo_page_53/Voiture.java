package diapo_page_53;

class Voiture {
    protected int puissance;
    protected boolean estDemarre;
    protected float vitesse;
    protected String nom;

    public Voiture(String nom, int puissance, boolean estDemarre, float vitesse) {
        this.nom = nom;
        this.puissance = puissance;
        this.estDemarre = estDemarre;
        this.vitesse = vitesse;
    }
    
    public int deQuellePuissance() {
        return this.puissance;
    }

    public void demarre() {
        this.estDemarre = true;
        System.out.println(this.nom + " démarre.");
    }

    public void accelere(float p1) {
        this.vitesse += p1;
        System.out.println(this.nom + " accélère. Nouvelle vitesse : " + this.vitesse);
    }

    public void afficher() {
        System.out.println("--- Détails Voiture ---");
        System.out.println("Voiture : " + this.nom);
        System.out.println("Puissance : " + this.puissance + " CV");
        System.out.println("Démarrée : " + this.estDemarre);
        System.out.println("Vitesse : " + this.vitesse + " km/h");
    }
}

class VoitureElectronique extends Voiture {
    private String typeChargeur;

    public VoitureElectronique(String nom, int puissance, boolean estDemarre, float vitesse, String typeChargeur) {
        super(nom, puissance, estDemarre, vitesse);
        this.typeChargeur = typeChargeur;
    }

    @Override
    public void afficher() {
        super.afficher();
        System.out.println("Type de chargeur : " + this.typeChargeur);
    }
}

class VoitureCarburant extends Voiture {
    private String typeCarburant;

    public VoitureCarburant(String nom, int puissance, boolean estDemarre, float vitesse, String typeCarburant) {
        super(nom, puissance, estDemarre, vitesse);
        this.typeCarburant = typeCarburant;
    }

    @Override
    public void afficher() {
        super.afficher();
        System.out.println("Type de carburant : " + this.typeCarburant);
    }
}

