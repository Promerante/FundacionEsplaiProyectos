package Banco;

public class Cajero {
    public void transferencia(Cuenta origen, Cuenta destino, float cantidad) {

        try{
            origen.retirar(cantidad);
            origen.ingresar(cantidad);
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
        IO.println("OPERACION EXITOSA");
    }
}
