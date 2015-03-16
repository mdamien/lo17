# LO17 fuck yeah project

## Présentation
Awesome project. Such wow. Many pizzas.
![yeah](http://i.giphy.com/wWdA3Z9n3qWMU.gif)

## TODO list
[x] structuration du projet
[x] fusion des scripts
[ ] fin du script parse.pl
[ ] interface global.xml / base de données
[ ] schéma de validation du fichier global.xml, script ANT à coder (pour remplir quelle tâche ? Regarder le paragraphe des suggestion)

## Structure du projet
Lancer le script parse.pl qui va parser chaque élément de l'archive et en extraire les informations pertinentes. Le script main va ensuite insérer ces informations dans un gros fichier (global.xml). Ce fichier global.xml va initaliser une base de données relationnelle (PostgreSQL), dont développer en Java une sorte de mini moteur de recherche capable de comprendre.

## Suggestions en vrac
- possibilité de valdier/vérifier un fichier xml avec des documents de définition type RelaxNG (d'où le fichier syntaxe.xml). Je pense notamment au fichier de corpus (global.xml), dont la structure serait à contrôler. Reste bien sûr, à définir cette structure qui ne doit pas se résumer à la somme des balises de chaque fichier .html parsé... plus d'informations dans l'annexe du sujet du projet.
- rajouté un fichier build.xml, ANT pourrait s'avérer utile pour faire des tâches disons... "administratives" (décompresser une archive, valider/vérifier des documents...). Le professeur n'a pas jugé ça vraiment utile mais ne l'a pas proscrit non plus.
