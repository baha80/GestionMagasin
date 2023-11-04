package tn.tuniprob.gestionmagasin;

import tn.tuniprob.Employee;

public class Magasin {
    int identifiant;
    String adresse;
    int capacite;
    Produit[] produits;

    Employee[] employees;

    int comp;


    public Magasin(int identifiant, String adresse) {
        this.identifiant = identifiant;
        this.adresse = adresse;
        this.produits = new Produit[50];

    }

    @Override
    public String toString() {
        String s = "";
        s += "identifiant : " + this.identifiant + " \n";
        s += "adresse : " + this.adresse + " \n";
        s += "capacite : " + this.capacite + " \n";
        String prods = "";
        for (int i = 0; i < this.capacite; i++) {
            prods += this.produits[i];
        }
        return s + prods;
    }

    public void ajouterProduit(Produit produit) {
        if (cherche(produit)){
            System.out.println("this product already exist");
        }
        else {
            this.produits[capacite] = produit;
            this.capacite++;
        }

    }

    public int getTotalProduits() {
        return this.capacite;
    }

    public boolean cherche(Produit produit) {
        for (int i = 0; i < produits.length; i++) {
            if (produit.equals(produits[i])) {
                return true;
            }
        //  produit.compare(produits[i]

        }


        return false;
    }
    public void supprimerProduit(Produit produit){
        if (cherche(produit)){
            for (int i = 0; i < produits.length; i++) {
                if (produit.equals(produits[i])) {
                    produits[i]=null;
                    capacite--;
                }
            }
        }
        else {
            System.out.println("this product doesn't exist");
        }
    }

    public Magasin compare_magasin(Magasin magasin){
        if (this.capacite>magasin.capacite){
            return this;
        }
        else {
            return magasin;
        }
    }






}