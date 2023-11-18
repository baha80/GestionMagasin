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
    public String toString() {
        return "Caissier{" +
                "numeroDeCaisse=" + numeroDeCaisse +
                "} " + super.toString(); //mrthode recursive
        
    }


    @Override
    public double calculerSalaire() {
        double salaireBase = getNbrHeure()*5;
        if(getNbrHeure()>160){
            salaireBase+=((getNbrHeure()-180)*2)/100;
        }
        return salaireBase;
    }

}

