package entites;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {
    private String name;
    private String email;
    private Date birthDate;

    private static SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

    public Client(String name, String email, Date birthDate) {
        this.name = name;
        this.email = email;
        this.birthDate = birthDate;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Date getBirthDate() {
        return birthDate;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name);
        sb.append(", ");
        sb.append("("+formatter.format(birthDate)+")");//precisaei formatar com o formatter aqui tambem pois estava imprimindo por conta do toString o valor com horas e fuso ignorando o meu formatter
        sb.append(", ");
        sb.append(email);
        return sb.toString();
    }
}
