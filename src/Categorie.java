import java.util.List;

public class Categorie {
    private  int num_cat ;
    private int nombre_lit;
    private float tarif;
    private List<Chambre> chambres;

    public int getNum_cat() {
        return num_cat;
    }

    public void setNum_cat(int num_cat) {
        this.num_cat = num_cat;
    }

    public int getNombre_lit() {
        return nombre_lit;
    }

    public void setNombre_lit(int nombre_lit) {
        this.nombre_lit = nombre_lit;
    }

    public float getTarif() {
        return tarif;
    }

    public void setTarif(float tarif) {
        this.tarif = tarif;
    }

    public List<Chambre> getChambres() {
        return chambres;
    }

    public void setChambres(List<Chambre> chambres) {
        this.chambres = chambres;
    }
}
