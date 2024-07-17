package Concession;

import java.util.ArrayList;
import java.util.List;

public class Concession {
    private String raisonSocial;

    List<Voiture> voitures;

    public Concession() {
        this.voitures = new ArrayList<Voiture>();
    }

    public Concession(String rs) {
        this.voitures = new ArrayList<Voiture>();
        this.setRaisonSocial(rs);
    }

    public String getRaisonSocial() {
        return raisonSocial;
    }

    public void setRaisonSocial(String raisonSocial) {
        this.raisonSocial = raisonSocial;
    }

    public List<Voiture> getVoitures() {
        return voitures;
    }

    public void setVoitures(List<Voiture> voitures) {
        this.voitures = voitures;
    }

    public void ajoutVoiture(Voiture voiture) {
        this.getVoitures().add(voiture);
    }

    public void supprimerVoiture(int voiture) {
        this.getVoitures().remove(voiture);
    }

    public ArrayList<String> ListMarques() {
        ArrayList<String> marques = new ArrayList<String>();
        for (Voiture voiture : this.getVoitures()) {
            if(!marques.contains(voiture.getMarque())) {
                marques.add(voiture.getMarque());
            }
        }
        return marques;
    }

    @Override
    public String toString() {
        return this.getRaisonSocial();
    }
}
