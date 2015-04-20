# LO17 fuck yeah project

## Présentation
Awesome project. Such wow. Many pizzas.
![yeah](http://i.giphy.com/wWdA3Z9n3qWMU.gif)

## TODO list
- [x] structuration du projet
- [x] fusion des scripts
- [x] fin du script parse.pl
- [x] tf, idf et tf/idf calculés
- [x] choix des mots à garder (analyse statistique)
- [x] nouveau global.xml à faire fonctionner (retoucher script discri.pl)
- [x] lemmatisation
- [x] fichiers inverses
- [x] mettre sources dans package par defaut (non, provoque des problèmes d'import)
- [x] re-implement levenstein
- [ ] correcteur orthographique lemmatisant (distance de levenstein, nb de lettres communes)
- [ ] interface BDD
- [ ] pondérer les résultats : minimiser le score des inversions, prendre en compte les erreurs du clavier (AZERTY ?)

## Comment qu'on fait avec ANTLR et ANTLRWORKS
- éxecuter le jar d'antlrworks (dans un terminal)
- ouvrir le fichier .g qui nous intéresse dans l'immédiat
- générer le code java et le copier dans le projet Eclipse -> src -> td
