# BeeStore — Configuration et couverture de tests avec JaCoCo

## 1. Présentation du projet

BeeStore est un projet de développement logiciel dont la qualité doit être vérifiée à travers des tests automatisés. L'intégration de JaCoCo permet de mesurer la couverture du code exécuté pendant les tests et d'identifier les parties qui nécessitent davantage de vérifications.

## 2. Configuration de Maven

Le fichier `pom.xml` centralise les dépendances et les plugins nécessaires au projet.

La configuration doit inclure :
- **Spring Boot** pour le développement de l'application.
- **Spring Data JPA** pour la gestion de la persistance des données.
- **Spring Web** pour les fonctionnalités web.
- **Spring Boot Starter Test** pour l'exécution des tests automatisés.
- **JaCoCo** pour analyser la couverture du code.

La version de Java doit correspondre à celle définie dans la configuration du projet.

## 3. Intégration de JaCoCo

Le plugin `jacoco-maven-plugin` est ajouté à la configuration Maven.

Il permet de :
- Préparer l'environnement de mesure avant l'exécution des tests.
- Collecter les données relatives au code exécuté.
- Produire un rapport détaillé de couverture.
- Vérifier que le projet respecte les seuils minimaux définis.

Deux indicateurs peuvent notamment être contrôlés : la couverture des instructions et celle des branches conditionnelles.

## 4. Exécution des tests

Pour nettoyer le projet, compiler le code, exécuter les tests et préparer les rapports, utiliser la commande suivante :

```bash
mvn clean verify
```

Cette commande exécute le cycle Maven jusqu'à la phase `verify`, qui permet notamment de générer le rapport JaCoCo et de contrôler les seuils configurés.

## 5. Consultation du rapport

Après une exécution réussie, le rapport HTML est normalement disponible à l'emplacement suivant :

`target/site/jacoco/index.html`

Ouvrir ce fichier dans un navigateur pour consulter les statistiques de couverture et repérer les classes, méthodes et branches insuffisamment testées.

## 6. Contrôle de la couverture minimale

Les seuils de couverture sont définis dans le plugin JaCoCo du fichier `pom.xml`.

Pour cette configuration, les objectifs sont :
- **Instructions :** au moins 50 % de couverture.
- **Branches :** au moins 30 % de couverture.

Si les seuils ne sont pas atteints, la vérification Maven peut échouer. Il faut alors examiner le rapport et compléter les tests automatisés pour couvrir les parties manquantes.

## 7. Conclusion

L'utilisation de JaCoCo dans BeeStore facilite l'évaluation de la qualité des tests et le suivi de la couverture du code. L'association de Maven, des tests automatisés et des rapports JaCoCo permet de détecter les zones insuffisamment testées et d'améliorer progressivement la fiabilité de l'application.
