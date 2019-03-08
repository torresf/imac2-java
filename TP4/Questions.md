# Questions :

## Exercice 2
1. 
Si chaque ArrayShoppingCart a un nombre maximum de livre différent, 
il n'est pas intéressant de stocker ce nombre dans un champ statique.

7.
- `sysout + Ctrl + Space` : snippet pour écrire `System.out.println();`
- `toStr + Ctrl + Space` : génère le code suivant pour redéfinir la méthode toString() :
```java
@Override
public String toString() {
	// TODO Auto-generated method stub
	return super.toString();
}
```
- `get + Ctrl + Space` : génère un getter
- `set + Ctrl + Space` : génère un setter
- Cliquer sur le bouton `Generate constructor using fields...` et séléctionner le champ foo
- `Alt + Shift + R` : Sélectionne toutes les occurences dans le fichier pour tout modifier d'un coup
- `Alt + Shift + L` : permet de créer une variable à partir de la sélection
- `Ctrl + 1` : instancie une nouvelle variable
- `Ctrl + click` sur le nom d'un classe renvoie à sa déclaration ou son implémentation.
- `Ctrl + click` sur super.toString() renvoie à la déclaration de toString().
- `Ctrl + Shift + G` : Fait une recherche du champ sélectionné pour savoir dans quelles méthode il est utilisé.
- `Ctrl + Shift + O` importe automatiquement les paquet manquants.


## Exercice 3
1. 
Il faut spécifier le type d'élément dans l'ArrayList (ici, type Book)

4. 
Pour compiler une boucle foreach sur une collection, le compilateur va créer une instance de la classe à chaque tour de boucle.

5. 
La complexité est O(n) dans le pire des cas pour trouver l'élément.

6.
Complexité : O(n)

7. 
On utilise l'itérateur quand on ne sait pas ou se trouve l'élément recherché.