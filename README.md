LO17 fuck yeah project
======================

Présentation
------------
Awesome project. Such wow. Many pizzas.
![yeah](http://i.giphy.com/wWdA3Z9n3qWMU.gif)

Structure du code
-----------------

### Première étape
Lancer le script main.pl, qui se charge de lister tous les fichiers contenus dans l'archive et de leur appliquer le script parse.pl qui va parser chaque élément de l'archive et en extraire les informations pertinentes. Le script main va ensuite insérer ces informations dans un gros fichier (global.xml), qui sera ensuite utilisé pour initialiser une base de données postgres

### Seconde étape
Le fichier global.xml va initaliser une base de données PostgreSQL.

### Troisième étape
Développer en Java une sorte de mini moteur de recherche.

Suggestions en vrac
-------------------
* possibilité de valdier/vérifier un fichier xml avec des documents de définition type RelaxNG (d'où le fichier syntaxe.xml). Je pense notamment au fichier de corpus (global.xml), dont la structure serait à contrôler. Reste bien sûr, à définir cette structure qui ne doit pas se résumer à la somme des balises de chaque fichier .html parsé.
* rajouté un fichier build.xml, ANT pourrait s'avérer utile pour faire des tâches disons... "administratives" (décompresser une archive, valider/vérifier des documents...)
* il y a pas mal de javascript dans les fichiers, inutile de les indexer.
