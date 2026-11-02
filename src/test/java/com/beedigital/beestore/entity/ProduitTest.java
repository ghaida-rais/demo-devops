
package com.beedigital.beestore.entity;

import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class ProduitTest {

    @Test
    void onCreate() {
        Produit produit = new Produit();
        produit.setActif(null);

        produit.onCreate();

        assertNotNull(produit.getDateCreation());
        assertTrue(produit.getActif());
    }

    @Test
    void getId() {
        Produit produit = Produit.builder().id(1L).build();
        assertEquals(1L, produit.getId());
    }

    @Test
    void getNom() {
        Produit produit = Produit.builder().nom("Laptop").build();
        assertEquals("Laptop", produit.getNom());
    }

    @Test
    void getDescription() {
        Produit produit = Produit.builder().description("Ordinateur portable").build();
        assertEquals("Ordinateur portable", produit.getDescription());
    }

    @Test
    void getPrix() {
        Produit produit = Produit.builder().prix(1500.0).build();
        assertEquals(1500.0, produit.getPrix());
    }

    @Test
    void getStock() {
        Produit produit = Produit.builder().stock(10).build();
        assertEquals(10, produit.getStock());
    }

    @Test
    void getCategorie() {
        Produit produit = Produit.builder().categorie("Informatique").build();
        assertEquals("Informatique", produit.getCategorie());
    }

    @Test
    void getActif() {
        Produit produit = new Produit();
        assertTrue(produit.getActif());
    }

    @Test
    void getDateCreation() {
        LocalDateTime date = LocalDateTime.now();
        Produit produit = Produit.builder().dateCreation(date).build();
        assertEquals(date, produit.getDateCreation());
    }

    @Test
    void setId() {
        Produit produit = new Produit();
        produit.setId(1L);
        assertEquals(1L, produit.getId());
    }

    @Test
    void setNom() {
        Produit produit = new Produit();
        produit.setNom("Clavier");
        assertEquals("Clavier", produit.getNom());
    }

    @Test
    void setDescription() {
        Produit produit = new Produit();
        produit.setDescription("Description test");
        assertEquals("Description test", produit.getDescription());
    }

    @Test
    void setPrix() {
        Produit produit = new Produit();
        produit.setPrix(89.90);
        assertEquals(89.90, produit.getPrix());
    }

    @Test
    void setStock() {
        Produit produit = new Produit();
        produit.setStock(25);
        assertEquals(25, produit.getStock());
    }

    @Test
    void setCategorie() {
        Produit produit = new Produit();
        produit.setCategorie("Accessoires");
        assertEquals("Accessoires", produit.getCategorie());
    }

    @Test
    void setActif() {
        Produit produit = new Produit();
        produit.setActif(false);
        assertFalse(produit.getActif());
    }

    @Test
    void setDateCreation() {
        Produit produit = new Produit();
        LocalDateTime date = LocalDateTime.now();

        produit.setDateCreation(date);

        assertEquals(date, produit.getDateCreation());
    }

    @Test
    void testEquals() {
        Produit p1 = Produit.builder()
                .id(1L).nom("Laptop").prix(1500.0).build();

        Produit p2 = Produit.builder()
                .id(1L).nom("Laptop").prix(1500.0).build();

        assertEquals(p1, p2);
    }

    @Test
    void canEqual() {
        Produit produit = new Produit();
        assertTrue(produit.canEqual(new Produit()));
    }

    @Test
    void testHashCode() {
        Produit p1 = Produit.builder().id(1L).nom("Laptop").build();
        Produit p2 = Produit.builder().id(1L).nom("Laptop").build();

        assertEquals(p1.hashCode(), p2.hashCode());
    }

    @Test
    void testToString() {
        Produit produit = Produit.builder().nom("Laptop").build();

        assertTrue(produit.toString().contains("Laptop"));
    }

    @Test
    void builder() {
        LocalDateTime date = LocalDateTime.now();

        Produit produit = Produit.builder()
                .id(1L)
                .nom("Laptop")
                .description("Ordinateur portable")
                .prix(1500.0)
                .stock(10)
                .categorie("Informatique")
                .actif(true)
                .dateCreation(date)
                .build();

        assertEquals(1L, produit.getId());
        assertEquals("Laptop", produit.getNom());
        assertEquals("Ordinateur portable", produit.getDescription());
        assertEquals(1500.0, produit.getPrix());
        assertEquals(10, produit.getStock());
        assertEquals("Informatique", produit.getCategorie());
        assertTrue(produit.getActif());
        assertEquals(date, produit.getDateCreation());
    }
}
