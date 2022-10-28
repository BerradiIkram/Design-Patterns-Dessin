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

#Tests du modèle
Test Design pattern Composite

![TT](https://user-images.githubusercontent.com/86124754/198733734-a8fd1aaa-3d36-4227-9680-8b414a7b6d49.PNG)

Résutat

![ttt](https://user-images.githubusercontent.com/86124754/198734240-1071a8a5-1b1b-4dd2-a243-5f29426571c6.PNG)

Test Design les fonction calculeSurface et calculeprémitre.

![tttt](https://user-images.githubusercontent.com/86124754/198734802-5ee33145-1a26-4648-bea2-4c0f5bbc84da.PNG)

![Capture](https://user-images.githubusercontent.com/86124754/198734927-c17c2d74-ee98-4b13-8988-9371dc4c4efe.PNG)

#Design Pattern Strategy

![Capture12](https://user-images.githubusercontent.com/86124754/198735280-fa59d57c-785e-46f4-8022-31647f962ed3.PNG)

![Capture123](https://user-images.githubusercontent.com/86124754/198735443-5f01497d-29ff-43f4-aec8-ce96a46ed209.PNG)

#Design Pattern Observer

![Capture ((((](https://user-images.githubusercontent.com/86124754/198735769-43d548ee-e3a1-4e65-b9e9-85016d899153.PNG)

![Captureee](https://user-images.githubusercontent.com/86124754/198735911-ac20de8f-b692-4468-901a-0a7398bd6d01.PNG)






















