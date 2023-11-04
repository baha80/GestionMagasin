package tn.tuniprob;

public class Employee {
    private int id; 
    private String nom;
    private String Adress; 
    private float nbrHeure;
    

    public Employee(int id, String nom, String Adress, float nbrHeure) {
        this.id = id;
        this.nom = nom;
        this.Adress = Adress;
        this.nbrHeure = nbrHeure;
    }

    public Employee() {
    }

    public int getId() {
        return id;
    }
    public String getNom() {
        return nom;
    }
    public String getAdress() {
        return Adress;
    }
    public float getNbrHeure() {
        return nbrHeure;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setAdress(String Adress) {
        this.Adress = Adress;
    }
    public void setNbrHeure(float nbrHeure) {
        this.nbrHeure = nbrHeure;
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", nom=" + nom + ", Adress=" + Adress + ", nbrHeure=" + nbrHeure + '}';
    }

    public double calculerSalaire() {
        return nbrHeure * 5; 
    }
}

