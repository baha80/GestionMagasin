package tn.tuniprob;

public class Vendeur extends Employee {
    private double tauxDeVente;

    public Vendeur(int identifiant, String nom, String adresse, int nbrHeures, double tauxDeVente) {
        super(identifiant, nom, adresse, nbrHeures);
        this.tauxDeVente = tauxDeVente;
    }

    public double getTauxDeVente() {
        return tauxDeVente;
    }

    @Override
    public double calculerSalaire() {
        return 450 * (tauxDeVente / 100);
    }

    @Override
    public String toString() {
        return "Vendeur{" +
                "tauxDeVente=" + tauxDeVente +
                "} " + super.toString();
    }
}


//baha work