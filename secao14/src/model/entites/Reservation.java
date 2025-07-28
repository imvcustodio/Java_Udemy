package model.entites;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {
    private Integer roomNumber;
    private Date checkIn;
    private Date checkOut;

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    public Reservation(Integer roomNumber, Date checkIn, Date checkOut) {
        this.roomNumber = roomNumber;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Date getCheckin() {
        return checkIn;
    }

    public void setCheckin(Date checkIn) {
        this.checkIn = checkIn;
    }
    public Date getCheckout() {
        return checkOut;
    }
    public void setCheckout(Date checkOut) {
        this.checkOut = checkOut;
    }
    public long duration(){
        long diff = checkOut.getTime() - checkIn.getTime();/*getTime pega o valor em milissegundos de cada um
        das datas e com esse menos eu calculo a diferença dos mesmos*/
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);/*tipo enumerado complexo que possui algumas
        funcionalidades como a converção de tempo em milissegundos para dias, no primeiro parametro eu passo a variavel
        que armazena essa quantidade de milissegundos e no segundo parametro eu passo o formato que esta a variavel
        que eu passei pra conversao nesse caso a minha diff esta em milissegundos então eu converto ela para dias
        atraves da minha expressão*/

    }

    public void updateDates(Date checkIn, Date checkOut){
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    @Override
    public String toString(){
        return ("Reservation: Room "+roomNumber+", check-in "+sdf.format(checkIn)+", check-out "+sdf.format(checkOut)+","+duration()+" Nights");
    }
}
