import java.util.List;

public class Type_Reservation {
    private int id ;
    private String pansion ;
    private float tarif ;
    private List<Reservation> reservations;
    private List<Supplement> supplements;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPansion() {
        return pansion;
    }

    public void setPansion(String pansion) {
        this.pansion = pansion;
    }

    public float getTarif() {
        return tarif;
    }

    public void setTarif(float tarif) {
        this.tarif = tarif;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }

    public List<Supplement> getSupplements() {
        return supplements;
    }
    
    public void setSupplements(List<Supplement> supplements) {
        this.supplements = supplements;
    }
}
