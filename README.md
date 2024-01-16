Exercice de POEC Java

Contexte : J'ai effectué cet exercice dans le cadre mon POEC java, au sein de l'école ASTON informatique.
Le but de cet exercice était de nous faire manipuler les classes, l'héritage et les Interfaces.

L’énoncé de l'exercice se trouve ici :
https://ferretrenaud.ovh/renaud91/formation.java/-/tree/master/exercices/enonces/Exo03-Banque?ref_type=heads

Des screenshot des énoncés sont également visible dans le dossier : /src/enonces  
  
Sur la branche master on trouve la partie p1 et p2 : création des différentes classes Compte, Client, CompteRemunere, CompteASeuil  
  
Sur la branche p3 : création des interfaces ICompteRemunere et IcompteASeuil, et de la classe CompteASeuilRemunere qui hérite de CompteRemunere, et qui implemente ICompteASeuil. Les interfaces définissent des méthodes abstraites, qui sont donc codées dans les classes qui les implémentent.
  
Sur la branche p3bis : on a factorisé certaines méthodes dans une interface ICompte, les interfaces ICompteRemunere et IcompteASeuil héritent de ICompte. Et les méthodes sont codées directement dans les interfaces avec le mot clé default qui écrase abstract. La classe CompteASeuilRemunere hérite de compteRemunere, qui implémente l'interface IcompteRemunere, avec ses méthodes calculerInterets() et verserInterets(). Ainsi, en vérifiant qu'un compte fait partie de la famille des ICompteRemunere, on peut verser les intérêts, sans savoir si c'est une CompteASeuilRemunere ou un CompteRemunere.
  

**Lessons' learnt:**

**Bonne Pratique** : ne pas mettre le nom de la classe en dure dans la méthode toString(), mais le récupérer de façon dynamique avec this.getClass().getSimpleName()  

**Take Away** : Quand on hérite d'une classe, on hérite aussi des interfaces qu'elle implémente
