Rappeler les grandes lignes du projet de TD et introduire l'étape du projet que vous présentez.

- Pour la partie concernant la génération du fichier XML :
Le processus que vous avez suivi pour cette génération
L'analyse des fichiers html (les informations qu'ils contiennent, leur structure, etc) (vous pouvez l'illustrer par des figures commentées)
Le choix des balises de structure retenues et les méthodes pour en évaluer la pertinence (unicité, pouvoir discriminant, exhaustivité, ...)
Les éléments essentiels de vos algorithmes perl pour réaliser l'extraction (a priori pas de ligne de code ou exceptionnellement quelques expressions régulières si elles se justifient pour expliquer votre méthode)
Les méthodes que vous avez réalisées ou que vous auriez pu réaliser pour vérifier la qualité de l'extraction (tous les éléments uniques présents, complétude des textes, pour les balises des différentes parties d'un article, extraction des balises présentes, vérification de leur capacité d'identification unique de la partie concernée,log d'exécution et comportement si balise vide, etc.). Pensez que votre corpus pourrait contenir des milliers de fichiers.

- Pour la partie indexation
Le processus suivi pour obtenir des représentants du vocabulaire significatif du corpus qui serviront à l'indexation.
Calcul du tfxidf.
Analyse des valeurs de tfxidf et méthodes suivies pour définir un critère de sélection des mots de la stop liste.
Création des lemmes et analyse critique des résultats obtenus (vous pouvez réaliser votre analyse critique sur les résultats disponibles sur le site (fichier filtreCorpus_30_03_2015.txt dans le répertoire TDANAMORPHO)
Génération des tables inverses selon le type (mots du texte ou du titre, date, rubrique, etc.).
