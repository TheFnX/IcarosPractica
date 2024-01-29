package Ejercicio02;

public class Espadachín extends Personaje {
    private int ataque;

    public Espadachín(int salud, int ataque) {
        super(salud);
        this.ataque = ataque;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    @Override
    public String entrenar() {
        this.ataque += 10;
    }
}
