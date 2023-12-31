import org.w3c.dom.ls.LSOutput;
import tn.tuniprob.Caissier;
import tn.tuniprob.Employee;
import tn.tuniprob.Responsable;
import tn.tuniprob.gestionmagasin.Magasin;
import tn.tuniprob.gestionmagasin.Produit;


import java.util.Date;


public class Test {

    public static void main(String[] args) {
        Produit p1=new Produit();


        System.out.println("id :"+p1.getIdentifiant());
        System.out.println("marque :"+p1.getMarque());

        System.out.println("libelle :"+p1.getLibelle());
        System.out.println("prix :"+p1.getPrix());

        Produit p2=new Produit(1021,"Delice","Lait");
        System.out.println("id :"+p2.getIdentifiant());
        System.out.println("marque :"+p2.getMarque());

        System.out.println("libelle :"+p2.getLibelle());
        System.out.println("prix :"+p2.getPrix());

        Produit p3=new Produit(2510,"Vitalait","Yaourt");
        Produit p4=new Produit(3250,"Sicam","Tomate",1.2f);

        p3.setPrix(5);
        System.out.println("test de la méthode affiche");
        p2.afficher();
        p4.afficher();
        System.out.println("to String p2");
        System.out.println(p2.toString());
        System.out.println(p2);
        System.out.println("to String p3");
        System.out.println(p3.toString());
        System.out.println(p3);

        Date d1=new Date();

        p3.setDate_exp(d1);

        Produit p5=new Produit(1,"Delice","YAourt",d1);
        System.out.println("Après modification de date");
        p5.afficher();
        System.out.println(p5);
        System.out.println(p5.getDate_exp());


        System.out.println(p3);
        p2.affecterPrix(0.7f);
        Magasin m1 = new Magasin(8850, "Nabeul");
        System.out.println(m1);
        m1.ajouter(p1);
        m1.ajouter(p2);
        m1.ajouter(p3);
        m1.ajouter(p4);
        System.out.println(m1);
        Magasin m2 = new Magasin(8050, "Hammamet");
        System.out.println(m2);
        m2.ajouter(p1);
        m2.ajouter(p2);
        m2.ajouter(p3);
        m2.ajouter(p4);
        System.out.println(m2);
        Magasin m3 = new Magasin(1100, "Mrezga");
        System.out.println(m3);
        m3.ajouter(p1);
        m3.ajouter(p2);
        m3.ajouter(p3);
        m3.ajouter(p4);
        System.out.println(m3);

        System.out.println("Total des Produits = " + (Magasin.getTotalProduit() + Magasin.getTotalProduit() + Magasin.getTotalProduit()));




        Magasin carrefour  = new Magasin(1, "Centre_ville");
        Magasin Monoprix = new Magasin(2, "Menzah 6");


        Employee CM1 = new Caissier (10,"baha","hammamet",20,123 );
        Employee CM2 = new Caissier (11,"CM2","hammamet",27,124 );
        Employee Vm1 = new Responsable(11,"Vm5","add",78,10);

       System.out.println(CM1);
         System.out.println(CM1.calculerSalaire());
    }
   

     
   

}