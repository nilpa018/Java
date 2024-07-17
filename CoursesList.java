import java.util.HashMap;
import java.util.Scanner;

/**
 * Projet 3 : la liste des courses
 * Il s’agit d’une application qui gérera une liste de course et votre caddie de course
 * L’application devra dans un premier temps gérer la liste des courses (nom produit et sa quantité),
 * affichage, ajout et suppression.
 * Dans un deuxième temps, la gestion du caddie sera à prendre en compte
 * Demander à l’utilisateur un choix pour telle ou telle fonctionnalité et avoir un moyen de sortir de
 * l’application
 * Les produits du caddie seront représenté par une paire clé valeur (nom produit, prix)
 * Dés qu’un produit est positionné dans le caddie il sera automatiquement archivé de la liste (liste qui
 * dit que les produits ont été pris)
 * Afficher la liste des produits le caddie
 * Afficher un produit qui reste dans la liste
 * Enlever le produit du caddie, donc automatiquement le produit se retrouve sur la liste. (optionnel)
 */

public class CoursesList {
    public static void main(String[] args) {
        HashMap<String, Integer> coursesList = new HashMap<String, Integer>();
        HashMap<String, Integer> caddieList = new HashMap<String, Integer>();


        while(true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Que voulez vous faire ?");
            System.out.println("1 = Afficher les listes, 2 = Ajouter un article, 3 = Supprimer un article, 4 = quitter l'application");
            String choix = sc.nextLine();
            switch (choix) {
                case "1" -> {
                    if (coursesList.isEmpty() && caddieList.isEmpty()) {
                        System.out.println("Les listes sont vides !");
                        break;
                    }else if (caddieList.isEmpty() && !coursesList.isEmpty()) {
                        System.out.println("La liste du caddie est vide !");
                        System.out.println("La liste de courses est : " + coursesList);
                    } else if (!caddieList.isEmpty() && coursesList.isEmpty()) {
                        System.out.println("La liste de course est vide !");
                        System.out.println("La liste du caddie est : " + caddieList);
                    } else if (!coursesList.isEmpty() && !caddieList.isEmpty()) {
                        System.out.println("La liste de courses est : " + coursesList);
                        System.out.println("La liste du caddie est : " + caddieList);
                    }

                        System.out.println("Souhaitez vous faire un mouvement ?");
                        System.out.println("1 = Ajouter au Caddie, 2 = Remettre dans la Liste, 3 = revenir au menu");
                        String choixAction = sc.nextLine();
                        if (choixAction.equals("1")) {
                            System.out.println("Renseignez le nom de l'article à mettre dans le panier");
                            System.out.println("Votre liste de courses est : " + coursesList);
                        } else if (choixAction.equals("2")) {
                            System.out.println("Renseignez le nom de l'article à remettre dans la liste");
                            System.out.println("Votre liste de caddies est : " + caddieList);
                        } else if (choixAction.equals("3")) {
                            break;
                        }
                        String article = sc.nextLine();
                        transfertAction(choixAction, article, coursesList, caddieList);
                }
                case "2" -> {
                    System.out.println("Renseignez un article");
                    String article = sc.nextLine();
                    System.out.println("Renseignez la quantité");
                    int quantity = sc.nextInt();
                    coursesList.put(article, quantity);
                    System.out.println("L'article à été ajouté");
                }
                case "3" -> {
                    System.out.println("Inscrivez le nom de l'article à supprimer");
                    String articleASupprimer = sc.nextLine();
                    coursesList.remove(articleASupprimer);
                    System.out.println("L'article à été supprimé");
                }
                case "4" -> System.exit(0);
            }
        }
    }

    private static void transfertAction(String choixAction, String article, HashMap<String, Integer> coursesList, HashMap<String, Integer> caddieList) {
        switch (choixAction){
            case "1" -> {
                int getQuantity = coursesList.get(article);
                caddieList.put(article, getQuantity);
                coursesList.remove(article);
                System.out.println("L'article à été ajouté au caddie");
                break;
            }
            case "2" -> {
                int getQuantity = caddieList.get(article);
                coursesList.put(article, getQuantity);
                caddieList.remove(article);
                System.out.println("L'article à été remis dans la liste");
                break;
            }
            case "3" -> {
                break;
            }

        }
    }
}
