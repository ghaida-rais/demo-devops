
package com.beedigital.beestore.dto;

import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProduitRequestDTOTest {

    private static Validator validator;

    @BeforeAll
    static void setUp() {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        validator = factory.getValidator();
    }

    @Test
    void getNom() {
        ProduitRequestDTO dto = new ProduitRequestDTO();
        dto.setNom("Laptop");
        assertEquals("Laptop", dto.getNom());
    }

    @Test
    void getDescription() {
        ProduitRequestDTO dto = new ProduitRequestDTO();
        dto.setDescription("Ordinateur portable");
        assertEquals("Ordinateur portable", dto.getDescription());
    }

    @Test
    void getPrix() {
        ProduitRequestDTO dto = new ProduitRequestDTO();
        dto.setPrix(1500.0);
        assertEquals(1500.0, dto.getPrix());
    }

    @Test
    void getStock() {
        ProduitRequestDTO dto = new ProduitRequestDTO();
        dto.setStock(10);
        assertEquals(10, dto.getStock());
    }

    @Test
    void getCategorie() {
        ProduitRequestDTO dto = new ProduitRequestDTO();
        dto.setCategorie("Informatique");
        assertEquals("Informatique", dto.getCategorie());
    }

    @Test
    void getActif() {
        ProduitRequestDTO dto = new ProduitRequestDTO();
        assertTrue(dto.getActif());
    }

    @Test
    void setNom() {
        ProduitRequestDTO dto = new ProduitRequestDTO();
        dto.setNom("Clavier");
        assertEquals("Clavier", dto.getNom());
    }

    @Test
    void setDescription() {
        ProduitRequestDTO dto = new ProduitRequestDTO();
        dto.setDescription("Description test");
        assertEquals("Description test", dto.getDescription());
    }

    @Test
    void setPrix() {
        ProduitRequestDTO dto = new ProduitRequestDTO();
        dto.setPrix(89.90);
        assertEquals(89.90, dto.getPrix());
    }

    @Test
    void setStock() {
        ProduitRequestDTO dto = new ProduitRequestDTO();
        dto.setStock(25);
        assertEquals(25, dto.getStock());
    }

    @Test
    void setCategorie() {
        ProduitRequestDTO dto = new ProduitRequestDTO();
        dto.setCategorie("Accessoires");
        assertEquals("Accessoires", dto.getCategorie());
    }

    @Test
    void setActif() {
        ProduitRequestDTO dto = new ProduitRequestDTO();
        dto.setActif(false);
        assertFalse(dto.getActif());
    }

    @Test
    void testEquals() {
        ProduitRequestDTO dto1 = new ProduitRequestDTO();
        ProduitRequestDTO dto2 = new ProduitRequestDTO();

        dto1.setNom("Laptop");
        dto2.setNom("Laptop");

        assertEquals(dto1, dto2);
    }

    @Test
    void canEqual() {
        ProduitRequestDTO dto = new ProduitRequestDTO();
        assertTrue(dto.canEqual(new ProduitRequestDTO()));
    }

    @Test
    void testHashCode() {
        ProduitRequestDTO dto1 = new ProduitRequestDTO();
        ProduitRequestDTO dto2 = new ProduitRequestDTO();

        dto1.setNom("Laptop");
        dto2.setNom("Laptop");

        assertEquals(dto1.hashCode(), dto2.hashCode());
    }

    @Test
    void testToString() {
        ProduitRequestDTO dto = new ProduitRequestDTO();
        dto.setNom("Laptop");

        assertTrue(dto.toString().contains("Laptop"));
    }

    // Tests des validations

    @Test
    void nomVide_doitEtreInvalide() {
        ProduitRequestDTO dto = new ProduitRequestDTO();
        dto.setNom("");

        assertFalse(validator.validate(dto).isEmpty());
    }

    @Test
    void prixNegatif_doitEtreInvalide() {
        ProduitRequestDTO dto = new ProduitRequestDTO();
        dto.setNom("Laptop");
        dto.setPrix(-10.0);
        dto.setStock(5);

        assertFalse(validator.validate(dto).isEmpty());
    }

    @Test
    void stockNegatif_doitEtreInvalide() {
        ProduitRequestDTO dto = new ProduitRequestDTO();
        dto.setNom("Laptop");
        dto.setPrix(100.0);
        dto.setStock(-1);

        assertFalse(validator.validate(dto).isEmpty());
    }
}
