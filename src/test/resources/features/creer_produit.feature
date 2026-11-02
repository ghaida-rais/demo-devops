
# language: fr

Fonctionnalité: Création d'un produit
  En tant que gestionnaire de catalogue
  Je veux créer un nouveau produit
  Afin de le rendre disponible à la vente

  Scénario: Création d'un produit avec des données valides
    Etant donné un produit nommé "Clavier mécanique" au prix de 89.90 avec un stock de 25
    Quand je soumets la création du produit
    Alors le produit est créé avec succès
    Et le produit créé a pour nom "Clavier mécanique"
