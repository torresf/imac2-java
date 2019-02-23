# Questions :


## Exercice 1
1. 
Quel est le type de 's' ?
--> String
Comment le compilateur fait-il pour savoir qu'il existe une méthode length() sur 's' ?
--> Il vérifie le type.

2. 
Qu'affiche le code suivant ?
--> true, false
--> new String(s1) appelle le constructeur par copie de String et instantie un nouvel objet de type String alors que s2 = s1 assigne la même référence à s1 et s2.

4.
--> s6 et s7 réfèrent à la même chaine de caractère "toto" (la même référence)

5.
java.lang.String ne doit être immutable pour ne pas modifier la référence vers la chaîne de caractère.

6.
s8.toUpperCase() renvoie la nouvelle chaine de caractère sans modifier s8

## Exercice 2

`javac -sourcepath src/fr/umlv/morse -d bin/fr/umlv/morse Morse.java`
`java -cp bin/fr/umlv/morse Morse Ceci est drole`
1. 
java.lang.StringBuilder est une séquence mutable de chaine de caractère.

2. 
Sa méthode append(String) renvoie un objet de type StringBuilder pour pouvoir l'assigner à une auter variable.

3.
L'avantage est que l'on peut modifier la chaine de caractère dans créer de nouvel objet String.

4.
On peut utiliser ' ' à la place de " " car la chaîne est constituée d'un seul caractère (espace)

5.
Le + va entrainer beaucoup trop d'instructions au compilateur pour concaténer les chaines de caractère, alors que StringBuilder.append() n'en génèrera qu'un.

## Exercice 3
1. 
`java.util.regex.Pattern` est une représentation compilé d'une expression régulière.
Sa méthode _compile_ permet justement de compiler la chaine de caractère (regex) en Pattern
`java.util.regex.Matcher` va interpréter un Pattern et le comparer à une chaine de caractère.