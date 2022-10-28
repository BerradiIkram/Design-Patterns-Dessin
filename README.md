## Examen Blanc Design Pattern-Dessin
#Diagramme de classe du modèle en appliquant les design patterns appropriés.
#Design Pattern Composite
Un Dessin contient un ensemble de figures géométriques qui peuvent être soit des rectangles ou des cercles.
Donner la possibilité de Créer un groupe de figures. Chaque groupe peut contenir d’autres groupes.
#Design Pattern Strategy
Une méthode « traiter » qui permet de traiter le contenu du dessin en utilisant une famille d’algorithmes qui sont interchangeables dynamiquement. Ce signifie qu’au moment de l’exécution, l’objet dessin pour changer d’algorithme avec un autre de la même famille. Chaque algorithme peut évoluer indépendamment de la classe dessin qui les utilise.
#Design Pattern Observateur
Nous introduisons un Objet Paramétrage dont l’état est défini par attributs par défaut comme l’épaisseur du contour, la couleur du contour et la couleur de remplissage. On voudrait qu’à chaque fois que l’état de cet objet change, toutes les figures doivent être notifiées pour se mettre à jour.

![Diagramme sans nom drawio (3)](https://user-images.githubusercontent.com/86124754/198730635-9e757672-a9e7-4643-8ec5-464612d97e32.png)
#Implémentation du modèle en utilisant un projet Maven sans prendre en considération des aspects techniques.
![AA](https://user-images.githubusercontent.com/86124754/198733032-58b04c29-6bf6-46d9-b63a-9aeb2c03f61d.PNG)




