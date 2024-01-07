package com.votreentreprise;

import java.util.ArrayList;
import java.util.List;

public class Produit {
    // Attributes
    private Long id;
    private String nom;
    private double prix;
    private int quantite;

    // Constructor
    public Produit(Long id, String nom, double prix, int quantite) {
        this.id = id;
        this.nom = nom;
        this.prix = prix;
        this.quantite = quantite;
    }

    // Methods
    public void afficherDetails() {
        System.out.println("ID du produit: " + id);
        System.out.println("Nom du produit: " + nom);
        System.out.println("Prix du produit: " + prix + " euros");
        System.out.println("Quantité disponible: " + quantite);
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public static void main(String[] args) {
        // Example usage
        Produit produit1 = new Produit(1L, "Ordinateur portable", 899.99, 10);
        produit1.afficherDetails();

        produit1.setQuantite(8);
        produit1.afficherDetails();
    }
}



