# Réponses

## Exercice 1
1.
La classe Point ne compile pas car on essaye ne modifier un attribut final dans la méthode translate.
Si on enlève le final, on peut le modifier mais on perd l'immutabilité.

2.
On déclare ces deux champs en privé.

6.
On peut créer un nouveau point dans le constructeur. (new Point())

7.
Il faut créer une copie défensive dans getCenter() (new Point())

10.
Les `...` dans la signature correspondent à une collection dans la signature de la méthode. 
On peut donc boucler sur ce paramètre dans la méthode.

## Exercice 2
1.
L'héritage permet d'éviter de dupliquer du code en réutilisant des méthodes dans des classes différentes. Cela permet d'appliquer de principe de polymorphisme. Il est donc judicieux de faire de l'héritage lorsque l'on a affaire à deux classes liées, l'une  étant souvent une spécification de l'autre.

3.
Si le rayon interne est supérieur au rayon externe, on lance une IllegalArgumentException.

4.
Il faut également surcharger la méthode surface pour calculer la bonne surface.

#### Que peut-on conclure de ce TP ?
Ce TP montre l'intérêt et les différentes subtilités de l'héritage et du polymorphisme. 
Il faut en effet faire attention lors de la manipulation de champs d'une classe, et tester pour vérifier que notre code respecte le principe d'immutabilité.