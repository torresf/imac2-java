# Réponses

## Exercice 2
1.
Un générateur pseudo aléatoire est un algorithme qui permet de générer un nombre respectant certaines règles qui se rapproche de l'aléatoire parfait (impossible à reproduire par une machine)
La graine est l'état de départ de l'algorithme. Elle permet de respecter le principe de reproductibilité.

3.
Pour respecter le principe d'immutabilité.

5.
Le copié-collé peut vite devenir bloquant et altérer la modulabilité du code

9.
Ces notions sont liées à l'héritage.
Ici, Fighter est un sous-type de Robot.
Le polymorphisme intervient au moment de l'execution : 
Le compilateur doit appeler la méthode définie dans le sous type. 
Ici, la méthode `rollDice()` doit être appelée selon la classe de l'objet : Robot ou le sous-type Fighter.