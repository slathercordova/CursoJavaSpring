package EjerciciosPersonales.JuegoManager;

import java.util.ArrayList;

/*
🧠 EJERCICIO 2 – CONTADOR GLOBAL + ESTADO PROPIO
📌 Contexto
Vas a modelar una clase Jugador para un videojuego.
Cada Jugador tiene sus propios datos, pero el juego también debe llevar estadísticas globales.
🎯 REQUISITOS (OBLIGATORIOS)
1️⃣ Atributos de instancia (NO static)
Cada jugador debe tener:
nombre (String)
vida (int, empieza en 100)
muertes (int, empieza en 0)
2️⃣ Atributos static (COMPARTIDOS)
La clase debe tener:
totalJugadores → cuántos jugadores han sido creados
totalMuertes → suma de las muertes de TODOS los jugadores
3️⃣ Constructor
Recibe solo el nombre
Inicializa:
vida = 100
muertes = 0
Incrementa totalJugadores
4️⃣ Métodos de instancia (NO static)
🔸 recibirDanio(int danio)
Resta vida
Si la vida llega a 0 o menos:
aumenta muertes
aumenta totalMuertes
reinicia la vida a 100
👉 OJO: aquí es donde se suele confundir static con no static.
5️⃣ Métodos static
🔹 getTotalJugadores()
🔹 getTotalMuertes()
6️⃣ main
En el main debes:
Crear 3 jugadores
Hacer que reciban daño varias veces
Mostrar:
vida y muertes de cada jugador
total de jugadores
total de muertes globales
 */

public class GameManager {
    private static ArrayList<Jugador> listaJugadores = new ArrayList<>();
    private static int totalJugadores;
    private static int totalMuertes;
    private static int contadorID = 0;

    public static int getTotalJugadores() {
        totalJugadores = listaJugadores.size();
        return totalJugadores;
    }

    public static int getTotalMuertes() {
        return totalMuertes;
    }

    public static void ranking(){
        System.out.println("Listando tabla final");
        listaJugadores.stream().sorted((a,b) -> a.getMuertes() - b.getMuertes()).forEach(j-> System.out.println(j.getNombre()+" | Muertes:"+j.getMuertes()));
    }

    public static int getNextId(){
        return ++contadorID;
    }

    public static void aplicarDano(Jugador j, int danio){
        boolean murio = j.recibirDanio(danio);
        if (murio){
            totalMuertes++;
        }
    }

    public static Jugador crearJugador(String nombre){
        Jugador j = new Jugador(getNextId(),nombre);
        listaJugadores.add(j);
        return j;
    }

    static void main(String[] args) {
        Jugador jug1 = crearJugador("Slather");
        Jugador jug2 = crearJugador("Edwin");
        Jugador jug3 = crearJugador("Yahel");

        System.out.println("Jugador 1 Recibió un headshot y murió");
        aplicarDano(jug1,105);

        System.out.println("Jugador 2 Recibió 2 disparos de 20 y 25 de daño - no murió");
        aplicarDano(jug2,20);
        aplicarDano(jug2,25);

        System.out.println("Jugador 3 Recibió un headshot con casco y se quedó a 1 de vida, luego le volvieron a disparar y murio");
        aplicarDano(jug3,99);
        aplicarDano(jug3,1);
        System.out.println("Jugador 3 Luego revivió y volvió a morir porque es feeder");
        aplicarDano(jug3, 150);
        System.out.println("Jugador 3 Luego revivió y se suicido porque ya está fedeeando");
        aplicarDano(jug3, 100);

        System.out.println("===============================");
        System.out.println(jug1.getId());
        System.out.println(jug1.getNombre());
        System.out.println("Vida: "+jug1.getVida());
        System.out.println("Muertes: "+jug1.getMuertes());

        System.out.println("===============================");
        System.out.println(jug2.getId());
        System.out.println(jug2.getNombre());
        System.out.println("Vida: "+jug2.getVida());
        System.out.println("Muertes: "+jug2.getMuertes());

        System.out.println("===============================");
        System.out.println(jug3.getId());
        System.out.println(jug3.getNombre());
        System.out.println("Vida: "+jug3.getVida());
        System.out.println("Muertes: "+jug3.getMuertes());

        System.out.println("===============================");
        System.out.println("Total de jugadores: "+GameManager.getTotalJugadores());
        System.out.println("Total de muertes globales: "+GameManager.getTotalMuertes());

        System.out.println("===============================");
        System.out.println(listaJugadores.toString());

        GameManager.ranking();
    }
}
