﻿# SYGESCOM_API
 
 # DESCRIPTION
 SYGESCOM_API est la version v2 de SYGESCOM dévéloppée en JAVA 8 sous l'architecture MVC avec thymeleaf comme moteur de template.
 Cette version est basé sur l'atrchitecture en micros-services(REST API) avec un front en Angular. On aura donc:
  
  - Coté backent
     * JAVA 17
     * Maven 5.0.2
     * OpenDoc(swagger3 pour la documentation)
     * JUnit pour les test unitaires
     * Postman pour les tests unitaires et d'integrations
     * Docker
     * Github action pour la partie CI/CD
     * Mysql pour la base de donnée

 - Coté front
     * Angular 16 (TypeScript)
     * NodeJs(npm pour les dependances)
     * Bootsrap

# INSTALLATION DU PROJET
    * Il faut cloné le projet: 
    * S'assurer que JAVA17 est installé et configuré 
    * Run: `mvn clean install -DskipTests` 
    * Créer la base de donnée sur: `create dabase sygescom_api`
    *les parametre de connexion à la BD son dans le fichier: application.properties


# ARCHITECTURE DE TRAVAIL
 Ce projet est un projet collaboratif, ainsi, chaque developpeur doit créer une branche pour faire ces taches. voici la procedure
 * Clonner le projet
 * Créer une branche avec la nommenclature suivante: `nomutilisateur_feature_fonctionnalité`
    - nomutilisateur: par exemple coulwao
    - feature_fonctionalité: par exemple feature_userForm(pour la fonctionalité de la mise en place du formulaire des utilisateurs)
 * s'assurer de mettre à jour la version que sur la branche créer: git pull(a partir de la branche créé.
 * Après chaque fonctionnalité faire un `git -a -m"details de la fonctionalité"` et `git push origin`
