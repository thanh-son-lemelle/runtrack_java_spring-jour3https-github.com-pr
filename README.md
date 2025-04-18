
# Jour 3 – Accès aux données avec Spring Boot

## 🗂️ Sommaire
- [Job 1 : Comprendre JPA](#job-1--comprendre-jpa)
- [Job 2 : Configurer H2](#job-2--configurer-h2)
- [Job 3 : Créer l'entité Person](#job-3--créer-lentité-person)
- [Job 4 : Créer le Repository](#job-4--créer-le-repository)
- [Job 5 : Afficher les données](#job-5--afficher-les-données)
- [Job 6 : Modifier et supprimer les données](#job-6--modifier-et-supprimer-les-données)

---

## ✅ Job 1 : Comprendre JPA

**Question :** Qu'est-ce que JPA et comment facilite-t-il l'accès aux bases de données ?

**Réponse :**  
JPA (Java Persistence API) est une spécification Java permettant de gérer la persistance des données dans une base de données relationnelle. Elle permet de mapper des objets Java à des tables en base via des annotations. Spring Data JPA facilite l'utilisation de JPA en générant automatiquement les méthodes de base pour manipuler les entités, sans écrire de requêtes SQL.

---

## ✅ Job 2 : Configurer H2

**Question :** Pourquoi les bases de données en mémoire, comme H2, sont-elles utiles pendant le développement ?

**Réponse :**  
Les bases comme H2 sont utiles en développement car elles sont légères, rapides, ne nécessitent pas d'installation, et se réinitialisent à chaque lancement. Cela permet de tester l’application avec un environnement propre à chaque fois.

---

## ✅ Job 3 : Créer l'entité Person

**Question :** Quelle est l'importance des annotations, telles que `@Entity`, dans le contexte de JPA ?

**Réponse :**  
L’annotation `@Entity` indique que la classe Java est une entité persistante, c’est-à-dire qu’elle sera mappée à une table dans la base de données. Les annotations comme `@Id`, `@GeneratedValue`, etc., définissent la structure et le comportement de cette entité vis-à-vis de la base.

---

## ✅ Job 4 : Créer le Repository

**Question :** Comment Spring Data facilite-t-il la création de requêtes de base de données ?

**Réponse :**  
Spring Data JPA permet de créer des interfaces qui étendent `JpaRepository` ou `CrudRepository`. Ces interfaces offrent des méthodes toutes prêtes comme `findAll()`, `save()`, `deleteById()`, etc. De plus, on peut définir des méthodes personnalisées à partir du nom de la méthode (ex : `findByName`), et Spring les implémente automatiquement.

---

## ✅ Job 5 : Afficher les données

**Question :** Comment pouvez-vous créer et lire des entités avec Spring Data JPA ?

**Réponse :**  
On utilise la méthode `save()` pour créer ou mettre à jour une entité, et `findAll()` ou `findById()` pour lire les données. Grâce à l’injection du repository dans un contrôleur, ces opérations sont accessibles depuis des routes HTTP (REST ou web MVC avec Thymeleaf).

---

## ✅ Job 6 : Modifier et supprimer les données

**Question :** Comment la méthode `save()` de Spring Data JPA peut-elle être utilisée à la fois pour la création et la mise à jour ?

**Réponse :**  
La méthode `save()` regarde si l’objet a déjà un identifiant (`id`). Si oui, elle effectue une mise à jour de l'entité existante. Sinon, elle crée une nouvelle entrée dans la base. C’est donc une méthode polyvalente, utilisée à la fois pour créer et mettre à jour.

--

