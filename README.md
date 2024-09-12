# GestionPersonnelSpa - Backend

Bonjour à tous,

Je suis Chancelin, Lead Technique du projet. Ce dépôt est exclusivement réservé au développement du **backend** du projet. Merci de veiller à ce que toutes vos contributions concernent uniquement le backend.  
Pour les contributions liées au **frontend**, veuillez utiliser le dépôt correspondant.

Merci pour votre collaboration et votre engagement.

## Installation et Lancement du Serveur de Développement

1. Clonez le dépôt en utilisant la commande :
   ```bash
   git clone <lien_du_dépôt>
   ```

2. Assurez-vous d'avoir [Node.js](https://nodejs.org) et [Angular CLI](https://angular.io/cli) installés sur votre machine.

3. Installez les dépendances nécessaires :
   ```bash
   npm install
   ```

4. Lancez le serveur de développement :
   ```bash
   ng serve
   ```

5. Accédez à l'application dans votre navigateur à l'adresse : `http://localhost:4200/`. L'application se rechargera automatiquement en cas de modification des fichiers source.

## Génération de Composants

Utilisez la commande suivante pour générer un nouveau composant Angular :
```bash
ng generate component nom-du-composant
```
Vous pouvez aussi utiliser :
```bash
ng generate directive|pipe|service|class|guard|interface|enum|module
```

## Compilation du Projet

Pour compiler le projet, exécutez :
```bash
ng build
```
Les fichiers compilés seront stockés dans le répertoire `dist/`.

## Exécution des Tests Unitaires

Pour exécuter les tests unitaires avec [Karma](https://karma-runner.github.io), utilisez :
```bash
ng test
```

## Exécution des Tests End-to-End

Pour exécuter les tests end-to-end, utilisez :
```bash
ng e2e
```
**Remarque** : Vous devez d'abord ajouter un package qui implémente les fonctionnalités de test end-to-end si cela n'est pas déjà fait.

## Aide Supplémentaire

Pour plus d'informations sur les commandes Angular CLI, tapez :
```bash
ng help
```
ou consultez la page [Angular CLI Overview and Command Reference](https://angular.dev/tools/cli).

---
