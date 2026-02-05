package EjerciciosPersonales;

public class PruebaClase {
    int numero = 10;

    public void ejecutar(){
        while (numero!=0){
            System.out.println("Antes: "+numero);
            numero = restar(numero,1);
            System.out.println("Después: "+numero);
        }
    }

    static void main(String[] args) {
        PruebaClase a = new PruebaClase();
        a.ejecutar();
    }

    public static int restar(int a, int b){
        int res = a-b;
        return res;
    }
}


