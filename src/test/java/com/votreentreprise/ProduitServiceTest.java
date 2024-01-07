package com.votreentreprise;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ProduitServiceTest {

    private ProduitService produitService;

    @Before
    public void setUp() {
        produitService = new ProduitService();
    }

    @Test
    public void ajouterProduit_AvecSucces() {
        Produit produit = new Produit(1L, "Produit1", 10.0, 5);
        produitService.ajouterProduit(produit);

        Produit produitAjoute = produitService.consulterProduit(1L);
        assertNotNull(produitAjoute);
        assertEquals(produit, produitAjoute);
    }

    @Test
    public void ajouterProduit_DuplicateID() {
        Produit produit1 = new Produit(1L, "Produit1", 10.0, 5);
        Produit produit2 = new Produit(1L, "Produit2", 15.0, 8);

        produitService.ajouterProduit(produit1);
        produitService.ajouterProduit(produit2);

        Produit produitAjoute = produitService.consulterProduit(1L);
        assertNotNull(produitAjoute);
        assertEquals(produit1, produitAjoute);
    }

    @Test
    public void ajouterProduit_DuplicateName() {
        Produit produit1 = new Produit(1L, "Produit1", 10.0, 5);
        Produit produit2 = new Produit(2L, "Produit1", 15.0, 8);

        produitService.ajouterProduit(produit1);
        produitService.ajouterProduit(produit2);

        Produit produitAjoute = produitService.consulterProduit(1L);
        assertNotNull(produitAjoute);
        assertEquals(produit1, produitAjoute);
    }

    @Test
    public void ajouterProduit_NegativePrice() {
        Produit produit = new Produit(1L, "Produit1", -5.0, 5);
        produitService.ajouterProduit(produit);

        Produit produitAjoute = produitService.consulterProduit(1L);
        assertNull(produitAjoute);
    }

    @Test
    public void ajouterProduit_NegativeQuantity() {
        Produit produit = new Produit(1L, "Produit1", 10.0, -5);
        produitService.ajouterProduit(produit);

        Produit produitAjoute = produitService.consulterProduit(1L);
        assertNull(produitAjoute);
    }

    // D'autres tests pour les autres fonctionnalités CRUD...

}