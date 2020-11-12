Sample project for OpenClassroom's fundamentals of Java

Le programme comporte trois phases : 

Lecture des symptômes ligne par ligne dans le fichier 

Regroupement et compte du nombre d’occurrences de chaque symptômes 

Ecrire le résultat dans un fichier nommé « result.out »

Pour se faire, j'utilise pour chaque phase une interface, puis une classe implémentée à partir de cette interface
et pour finir une classe concrète avec les fonctions spécifiques à l'execution des operations recherchées 

J'ai voulu utilisé une stratégie de design Pattern.

J'ai codé Le package Construstion où sont contenus les interfaces qui implémentent la/les méthodes qui changeront, par exemple 
pour la lecture, j'utilise l'interface ISymptomReader qui contient la méthode getSymptoms() qui permettra de lire 
et récurpérer des données.

Dans le packages traitementsDeDonnées j'ai implémenté les classes qui se serviront du pattern.










