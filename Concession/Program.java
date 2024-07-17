package Concession;

import java.util.Scanner;

public class Program {

    static Concession concession = new Concession("M2i Autos");
    static boolean isActive = true;

    public static void main(String[] args) {
        System.out.println("Bienvenue à la concession " + concession);
        switchAction(isActive);
    }

    public static void menu(){
        System.out.println();
        System.out.println("Que souhaitez vous faire ?");
        System.out.println("1 - Afficher les liste des véhicules");
        System.out.println("2 - Afficher les liste des marques");
        System.out.println("3 - Ajouter un véhicule");
        System.out.println("4 - Supprimer un véhicule");
        System.out.println("5 - Quitter l'application");
        System.out.println();
    }

    public static void switchAction(boolean isActive){
        Scanner sc = new Scanner(System.in);
        while(isActive){
            menu();
            int choix = sc.nextInt();

            switch (choix){
                case 1: {
                    showVehicle();
                    break;
                }
                case 2: {
                    showMarques();
                    break;
                }
                case 3: {
                    addCar();
                    break;
                }
                case 4: {
                    deleteCar();
                    break;
                }
                case 5: {
                    isActive = false;
                }
            }
        }
    }

    public static void showVehicle(){
        if(concession.getVoitures().isEmpty()){
            System.out.println("Aucun véhicule dans la concession");
        } else {
            System.out.println(concession.getVoitures());
        }
    }

    public static void showMarques(){
        if(concession.ListMarques().isEmpty()){
            System.out.println("Auncune marque dans la concession");
        } else {
            System.out.println(concession.ListMarques());
        }
    }

    public static void addCar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Saisir la marque du véhicule");
        String marque = sc.next();
        System.out.println("Saisir le modèle du véhicule");
        String model = sc.next();
        Voiture voiture = new Voiture(model, marque);
        concession.ajoutVoiture(voiture);
        System.out.println("Le véhicule a été ajouté");
    }

    public static void deleteCar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Saisir la voiture à supprimer");
        for(int i = 0 ; i < concession.getVoitures().size(); i++){
            Voiture voiture = concession.getVoitures().get(i);
            System.out.println( i + " - " + voiture.getMarque() + " " + voiture.getModel());
        }
        int idVehicule = sc.nextInt();
        if(idVehicule < 0 || idVehicule > concession.getVoitures().size()){
            System.out.println("Veuillez entrer un id de voiture valide");
        }else{
            concession.supprimerVoiture(idVehicule);
            System.out.println("Le véhicule à été supprimé");
        }
    }
}
