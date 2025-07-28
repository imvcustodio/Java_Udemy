package applocation;

import model.entites.Reservation;

import java.sql.PreparedStatement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ProgramHotel {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Room number: ");
        int roomNumber = scanner.nextInt();
        System.out.print("Check-in date (dd/MM/yyyy): ");
        Date checkIn = sdf.parse(scanner.next());
        System.out.print("Check-out date (dd/MM/yyyy): ");
        Date checkOut = sdf.parse(scanner.next());// de string para date, nao posso usar o format, e sim o parse.

        if(!checkOut.after(checkIn)){// o after() e uma metodo da classe Date do java que pode comparar datas assim como tambem o befor()
            System.out.println("Error in reservation: Check-out must be after than check-in date");
        }else{
            Reservation reservation = new Reservation(roomNumber, checkIn, checkOut);
            System.out.println("Reservation: "+reservation);

            System.out.println();
            System.out.println("enter data to update the reservation: ");
            System.out.print("Check-in date (dd/MM/yyyy): ");
            checkIn = sdf.parse(scanner.next());
            System.out.print("Check-out date (dd/MM/yyyy): ");
            checkOut = sdf.parse(scanner.next());

            Date now = new Date();

            if(checkIn.before(now) || checkOut.before(now)){
                System.out.println("Error in reservation: Reservations dates for updates must be in the future");
            }else if(!checkIn.before(checkOut)){
                System.out.println("Error in reservation: Check-out must be before check-in date");
            }else{
                System.out.println("Reservation: "+reservation);
            }
        }







        scanner.close();
    }
}
