package tn.tuniprob;

public class Responsable extends Employee {
    private float  prime;

    public Responsable(int identifiant, String nom, String adresse, int nbrHeures, int prime) {
        super(identifiant, nom, adresse, nbrHeures);
        this.prime = prime;
    }

    public float getPrime() {
        return prime;
    }

    @Override
    public double calculerSalaire() {
        double salaireBase = getNbrHeure() * 10;
        if (getNbrHeure() > 160) {
            salaireBase += (getNbrHeure() - 160) * 2;
        }
        return salaireBase + prime;
    }

    @Override
    public String toString() {
        return "Responsable{" +
                "prime=" + prime +
                "} " + super.toString();
    }
}

