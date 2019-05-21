# Questions :

## Exercice 1
2. 
null null -> on ne peut pas accéder à ces champs car on a pas de constructeur par défaut

3. 
L'accès à ces champs est privé. On peut créer des accesseurs

4. 
private, par défaut, protected, public.
Pour respecter le principe d'encapsulation.

5.
Un accesseur est une fonction publique qui retourne le champ d'une classe (getter) ou modifie ce champ (setter)
Ici, on doit mettre des getters.

6.
On peut la déclarer final. C'est important pour respecter le principe d'immutabilité.

8.
Il faut utiliser this.title pour initialiser le titre. this fait référence à l'instance courante de l'objet

10.
Le constructeur regarde le nombre d'arguments et le type.

11.
On appelle le premier constructeur dans le deuxième

## Exercice 2

1.
true, false, car == compare la référence vers l'objet et la le contenu de l'objet.

3. 
indexOf :
Retourne l'index de la première occurence de l'élément dans la liste, ou -1 si la liste ne contient pas l'élément

4.
b3 ne semble pas faire partie de la liste (pourtant si)

5. 
Le problème est que la méthode indexOf utilise la méthode equals de l'object. Il faut donc override equals pour comparer nos éléments.

8.
l'annotation @Override permet de redéfinir une fonction héritée d'une classe parente.

9.
Lance une exception.
Le problème est qu'on passe une variable null à la méthode equals()
On bloque le programme et on affiche l'erreur pour prévenir le développeur et lui permettre de corriger le problème
Pour corriger ce problème, on peut ajouter des conditions pour vérifier si les champs sont null ou pas et ne pas créer d'objet si ces champs sont null

10.
L'utilisation de null doit se faire seulement avec les valeurs numériques et pas les objets.

11.
Objects.requireNonNull(title) dans le constructeur

## Exercice 3

2.
On peut utiliser override pour forcer le compilateur à chercher si une méthode avec le même nom existe bien déjà dans la classe parent, mais c'est facultatif.