
package com.beedigital.beestore.dto;

import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class ProduitResponseDTOTest {

    @Test
    void getId() {
        ProduitResponseDTO dto = ProduitResponseDTO.builder().id(1L).build();
        assertEquals(1L, dto.getId());
    }

    @Test
    void getNom() {
        ProduitResponseDTO dto = ProduitResponseDTO.builder().nom("Laptop").build();
        assertEquals("Laptop", dto.getNom());
    }

    @Test
    void getDescription() {
        ProduitResponseDTO dto = ProduitResponseDTO.builder().description("Ordinateur").build();
        assertEquals("Ordinateur", dto.getDescription());
    }

    @Test
    void getPrix() {
        ProduitResponseDTO dto = ProduitResponseDTO.builder().prix(1500.0).build();
        assertEquals(1500.0, dto.getPrix());
    }

    @Test
    void getStock() {
        ProduitResponseDTO dto = ProduitResponseDTO.builder().stock(10).build();
        assertEquals(10, dto.getStock());
    }

    @Test
    void getCategorie() {
        ProduitResponseDTO dto = ProduitResponseDTO.builder().categorie("Informatique").build();
        assertEquals("Informatique", dto.getCategorie());
    }

    @Test
    void getActif() {
        ProduitResponseDTO dto = ProduitResponseDTO.builder().actif(true).build();
        assertTrue(dto.getActif());
    }

    @Test
    void getDateCreation() {
        LocalDateTime date = LocalDateTime.now();
        ProduitResponseDTO dto = ProduitResponseDTO.builder().dateCreation(date).build();
        assertEquals(date, dto.getDateCreation());
    }

    @Test
    void setId() {
        ProduitResponseDTO dto = new ProduitResponseDTO();
        dto.setId(1L);
        assertEquals(1L, dto.getId());
    }

    @Test
    void setNom() {
        ProduitResponseDTO dto = new ProduitResponseDTO();
        dto.setNom("Clavier");
        assertEquals("Clavier", dto.getNom());
    }

    @Test
    void setDescription() {
        ProduitResponseDTO dto = new ProduitResponseDTO();
        dto.setDescription("Description test");
        assertEquals("Description test", dto.getDescription());
    }

    @Test
    void setPrix() {
        ProduitResponseDTO dto = new ProduitResponseDTO();
        dto.setPrix(89.90);
        assertEquals(89.90, dto.getPrix());
    }

    @Test
    void setStock() {
        ProduitResponseDTO dto = new ProduitResponseDTO();
        dto.setStock(25);
        assertEquals(25, dto.getStock());
    }

    @Test
    void setCategorie() {
        ProduitResponseDTO dto = new ProduitResponseDTO();
        dto.setCategorie("Accessoires");
        assertEquals("Accessoires", dto.getCategorie());
    }

    @Test
    void setActif() {
        ProduitResponseDTO dto = new ProduitResponseDTO();
        dto.setActif(false);
        assertFalse(dto.getActif());
    }

    @Test
    void setDateCreation() {
        ProduitResponseDTO dto = new ProduitResponseDTO();
        LocalDateTime date = LocalDateTime.now();
        dto.setDateCreation(date);
        assertEquals(date, dto.getDateCreation());
    }

    @Test
    void testEquals() {
        ProduitResponseDTO dto1 = ProduitResponseDTO.builder()
                .id(1L).nom("Laptop").prix(1500.0).build();

        ProduitResponseDTO dto2 = ProduitResponseDTO.builder()
                .id(1L).nom("Laptop").prix(1500.0).build();

        assertEquals(dto1, dto2);
    }

    @Test
    void canEqual() {
        ProduitResponseDTO dto = new ProduitResponseDTO();
        assertTrue(dto.canEqual(new ProduitResponseDTO()));
    }

    @Test
    void testHashCode() {
        ProduitResponseDTO dto1 = ProduitResponseDTO.builder()
                .id(1L).nom("Laptop").build();

        ProduitResponseDTO dto2 = ProduitResponseDTO.builder()
                .id(1L).nom("Laptop").build();

        assertEquals(dto1.hashCode(), dto2.hashCode());
    }

    @Test
    void testToString() {
        ProduitResponseDTO dto = ProduitResponseDTO.builder()
                .nom("Laptop").build();

        assertTrue(dto.toString().contains("Laptop"));
    }

    @Test
    void builder() {
        LocalDateTime date = LocalDateTime.now();

        ProduitResponseDTO dto = ProduitResponseDTO.builder()
                .id(1L)
                .nom("Laptop")
                .description("Ordinateur portable")
                .prix(1500.0)
                .stock(10)
                .categorie("Informatique")
                .actif(true)
                .dateCreation(date)
                .build();

        assertEquals(1L, dto.getId());
        assertEquals("Laptop", dto.getNom());
        assertEquals("Ordinateur portable", dto.getDescription());
        assertEquals(1500.0, dto.getPrix());
        assertEquals(10, dto.getStock());
        assertEquals("Informatique", dto.getCategorie());
        assertTrue(dto.getActif());
        assertEquals(date, dto.getDateCreation());
    }
}
