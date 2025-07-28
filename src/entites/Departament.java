package entites;

public class Departament {
    private String name;

    public Departament() {}//sobrecarga

    public Departament(String name) {//sobrecarga isso significa que a classe vai funcionar independente se ele informar o parametro ou nn, pois tenho 2 construtores um sem parametro e um com
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
