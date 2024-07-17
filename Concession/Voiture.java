package Concession;

public class Voiture {
    private String model;
    private String marque;

    public Voiture() {

    }

    public Voiture(String model, String marque) {
        this.model = model;
        this.marque = marque;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    @Override
    public String toString() {
        return this.getMarque() + " de model " + this.getModel();
    }
}
