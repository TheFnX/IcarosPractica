package Ejercicio02;

public class Torre extends Personaje {
    private int nivel;

    public Torre(int salud, int nivel) {
        super(salud);
        this.nivel = nivel;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    @Override
    public void entrenar() {
        this.nivel += 1;
    }
}
