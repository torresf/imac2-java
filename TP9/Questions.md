# Réponses

## Exercice 1
1.
La classe Link doit être accessible seulement par les classes du package. Il faut donc déclarer la visibilité de la classe en package: `class Link`, et la visibilité des champs en `private`.

2.
`java fr.umlv.data.Link`

## Exercice 2
1.
Si l'indice est invalide, il faut lever une IllegalArgumentException.

4.
On est obliger de cast l'`Object` en `String` pour utiliser la méthode `length()` de `String`.
En java, on aime pas les cast car on force l'object à changer de classe sans connaître sa classe d'origine, ce qui peut renvoyer une ClassCastException si le transtypage est impossible.

## Exercice 3
1.
L'intérêt du d'utiliser un type paramétré nous permettra de ne pas utiliser de cast et d'utiliser des méthode de l'object de la liste sans se soucier de son type.

2.
