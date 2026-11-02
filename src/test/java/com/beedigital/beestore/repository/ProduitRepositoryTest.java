
package com.beedigital.beestore.repository;

import com.beedigital.beestore.entity.Produit;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class ProduitRepositoryTest {

    @Autowired
    private ProduitRepository produitRepository;

    @Test
    void findByActifTrue() {
        Produit actif = Produit.builder()
                .nom("Laptop")
                .prix(1500.0)
                .stock(10)
                .actif(true)
                .build();

        Produit inactif = Produit.builder()
                .nom("Souris")
                .prix(50.0)
                .stock(20)
                .actif(false)
                .build();

        produitRepository.save(actif);
        produitRepository.save(inactif);

        List<Produit> resultat = produitRepository.findByActifTrue();

        assertEquals(1, resultat.size());
        assertEquals("Laptop", resultat.get(0).getNom());
    }

    @Test
    void findByCategorieIgnoreCase() {
        Produit produit = Produit.builder()
                .nom("Laptop")
                .prix(1500.0)
                .stock(10)
                .categorie("Informatique")
                .build();

        produitRepository.save(produit);

        List<Produit> resultat =
                produitRepository.findByCategorieIgnoreCase("INFORMATIQUE");

        assertEquals(1, resultat.size());
        assertEquals("Laptop", resultat.get(0).getNom());
    }

    @Test
    void findByNomContainingIgnoreCase() {
        Produit produit = Produit.builder()
                .nom("Clavier mécanique")
                .prix(89.90)
                .stock(25)
                .build();

        produitRepository.save(produit);

        List<Produit> resultat =
                produitRepository.findByNomContainingIgnoreCase("CLAVIER");

        assertEquals(1, resultat.size());
        assertEquals("Clavier mécanique", resultat.get(0).getNom());
    }

    @Test
    void findByPrixBetween() {
        Produit produit1 = Produit.builder()
                .nom("Souris")
                .prix(50.0)
                .stock(10)
                .build();

        Produit produit2 = Produit.builder()
                .nom("Laptop")
                .prix(1500.0)
                .stock(5)
                .build();

        produitRepository.save(produit1);
        produitRepository.save(produit2);

        List<Produit> resultat =
                produitRepository.findByPrixBetween(40.0, 100.0);

        assertEquals(1, resultat.size());
        assertEquals("Souris", resultat.get(0).getNom());
    }
}
