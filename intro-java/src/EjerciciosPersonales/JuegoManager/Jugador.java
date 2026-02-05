package EjerciciosPersonales.JuegoManager;

import java.util.ArrayList;

public class Jugador {
    private final int id;
    private String nombre;
    private int vida = 100;
    private int muertes = 0;

    Jugador(int id, String nombre){
        this.id = id;
        this.nombre = nombre;
    }

    public boolean recibirDanio(int danio){
        this.vida -= danio;
        if (this.vida <= 0){
            this.vida = 100;
            this.muertes++;
            return true;
        }else {
            return false;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVida() {
        return vida;
    }

    public int getMuertes() {
        return muertes;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString(){
        return "Id "+this.id+" nombre "+this.nombre+" vida "+this.vida+" muertes "+this.muertes;
    }
}