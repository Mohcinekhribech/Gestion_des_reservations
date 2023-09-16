import java.util.Date;
import java.util.List;

public class Reservation {
    private int num_reservation;

    public int getNum_reservation() {
        return num_reservation;
    }

    public void setNum_reservation(int num_reservation) {
        this.num_reservation = num_reservation;
    }

    public Date getDate_reservation() {
        return date_reservation;
    }

    public void setDate_reservation(Date date_reservation) {
        this.date_reservation = date_reservation;
    }

    public Date getDate_arrive() {
        return date_arrive;
    }

    public void setDate_arrive(Date date_arrive) {
        this.date_arrive = date_arrive;
    }

    public Date getDate_depart() {
        return date_depart;
    }

    public void setDate_depart(Date date_depart) {
        this.date_depart = date_depart;
    }

    public int getNmbr_chambre() {
        return nmbr_chambre;
    }

    public void setNmbr_chambre(int nmbr_chambre) {
        this.nmbr_chambre = nmbr_chambre;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<Chambre> getChambres() {
        return chambres;
    }

    public void setChambres(List<Chambre> chambres) {
        this.chambres = chambres;
    }

    public Type_Reservation getTypeReservation() {
        return typeReservation;
    }

    public void setTypeReservation(Type_Reservation typeReservation) {
        this.typeReservation = typeReservation;
    }

    private Date date_reservation;
    private Date date_arrive ;
    private Date date_depart ;
    private int nmbr_chambre;
    private Client client;
    private List <Chambre> chambres;
    private Type_Reservation typeReservation;

}
