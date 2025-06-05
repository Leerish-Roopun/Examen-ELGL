public class Mouette99 extends Véhicule {

    private int nombreDeGiletsDeSauvetage;


    public Mouette(int nombreDePassagersMaximum, double prixAchat, int nombreDeGiletsDeSauvetage) {
        super(nombreDePassagersMaximum, prixAchat);

        if (nombreDeGiletsDeSauvetage > nombreDePassagersMaximum) {
            this.nombreDeGiletsDeSauvetage = nombreDeGiletsDeSauvetage;
        } else {
            throw new IllegalArgumentException("Pas assez de gilets, création impossible");
        }
        //this.nombreDeGiletsDeSauvetage = nombreDeGiletsDeSauvetage;
    }


    public void setNombreDeGiletsDeSauvetage(int nombreDeGiletsDeSauvetage) {
        this.nombreDeGiletsDeSauvetage = nombreDeGiletsDeSauvetage;
    }

    @Override
    public String toString() {
        return super.toString() + " de type:  Mouette avec " + nombreDeGiletsDeSauvetage + (nombreDeGiletsDeSauvetage > getNombreDePassagersMaximum() ? " gilets de secours" : " gilets de secours (PAS ASSEZ DE GILETS!)");

    }
}