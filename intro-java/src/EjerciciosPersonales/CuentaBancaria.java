package EjerciciosPersonales;
/*
    🧪 EJERCICIO: SISTEMA DE CUENTAS BANCARIAS
📌 OBJETIVO
Entender:
atributos de objeto
atributos static
cuándo usar cada uno
cómo se comportan al crear varios objetos
🧱 REQUISITOS
1️⃣ Crear una clase CuentaBancaria
Debe tener:
🔹 Atributos de OBJETO (NO static)
saldo → dinero de la cuenta
titular → nombre del dueño
Cada cuenta tiene sus propios valores.
🔹 Atributo de CLASE (static)
totalCuentas → cantidad total de cuentas creadas
Debe aumentar cada vez que se crea una nueva cuenta.
2️⃣ Constructor
Recibe titular y saldoInicial
Asigna esos valores
Incrementa totalCuentas
3️⃣ Métodos (NO static)
depositar(double monto)
retirar(double monto)
👉 Modifican el saldo de ESA cuenta, no de las demás.
4️⃣ Método static
getTotalCuentas()
Devuelve cuántas cuentas se crearon
5️⃣ Método main
En main debes:
Crear 2 cuentas distintas
Depositar dinero en una
Retirar dinero de la otra
Imprimir:
saldo de cada cuenta
total de cuentas creadas
     */
public class CuentaBancaria {

    double saldo;
    String titular;

    static int totalCuentas;

    CuentaBancaria(String titular, double saldoInicial){
        this.titular = titular;
        this.saldo = saldoInicial;
        totalCuentas++;
    }

    public void depositar(double monto){
        this.saldo += monto;
    }

    public void retirar(double monto){
        this.saldo -= monto;
    }

    public static int getTotalCuentas(){
        return totalCuentas;
    }

    static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaBancaria("Slather",5000);
        CuentaBancaria cuenta2 = new CuentaBancaria("Edwin",5000);

        cuenta1.depositar(1000);
        cuenta2.retirar(500);

        System.out.println("Cuenta de "+cuenta1.titular+":"+cuenta1.saldo);
        System.out.println("Cuenta de "+cuenta2.titular+":"+cuenta2.saldo);
        System.out.println("Total de cuentas: "+getTotalCuentas());
    }
}
