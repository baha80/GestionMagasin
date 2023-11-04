package tn.tuniprob;

public class Caissier extends Employee {
    private int numeroDeCaisse;

    public Caissier(int identifiant, String nom, String adresse, int nbrHeures, int numeroDeCaisse) {
        super(identifiant, nom, adresse, nbrHeures);
        this.numeroDeCaisse = numeroDeCaisse;
    }

    public int getNumeroDeCaisse() {
        return numeroDeCaisse;
    }

    @Override
    public double calculerSalaire() {
        double salaireBase = super.calculerSalaire();
        if (getNbrHeure() > 180) {
            return salaireBase * 1.15;
        }
        return salaireBase;
    }

    @Override
    public String toString() {
        return "Caissier{" +
                "numeroDeCaisse=" + numeroDeCaisse +
                "} " + super.toString();
    }
}

