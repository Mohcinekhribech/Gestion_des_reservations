import java.util.List;

public class Supplement {
    private int id ;
    private String type ;
    private  float tarif ;
    private List<Type_Reservation>typeReservations;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getTarif() {
        return tarif;
    }

    public void setTarif(float tarif) {
        this.tarif = tarif;
    }

    public List<Type_Reservation> getTypeReservations() {
        return typeReservations;
    }

    public void setTypeReservations(List<Type_Reservation> typeReservations) {
        this.typeReservations = typeReservations;
    }
}
