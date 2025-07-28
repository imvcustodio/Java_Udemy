package entites;

public class Pensionato {
    private String nome;
    private String email;
    private int roomNumber;
    public Pensionato(String nome, String email, int roomNumber) {
        this.nome = nome;
        this.email = email;
        this.roomNumber = roomNumber;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getRoomNumber() {
        return roomNumber;
    }
    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }
    public String toString(){
        return (getRoomNumber() + ": "+ getNome()+","+ getEmail());
    }
}
