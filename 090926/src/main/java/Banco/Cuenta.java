package Banco;

import java.util.Objects;

public class Cuenta {
    private float saldo;
    private String numCuenta;
    private String nombre;

    public Cuenta(String nombre, String numCuenta, float saldo) {
        this.validarValoresContructor(nombre, numCuenta, saldo);
        this.nombre = nombre;
        this.numCuenta = numCuenta;
        this.saldo = saldo;
    }

    private void validarValoresContructor(
            String nombre,
            String numCuenta,
            float saldo
    ) throws ConstruccionCuentaException, ValorInvalidoException {
        if (saldo < 0) {
            throw new ValorInvalidoException("El saldo es negativo");
        }
        if (Objects.isNull(nombre) || nombre.isBlank()) {
            throw new ConstruccionCuentaException("Nombre cliente es requerido");
        }
        if (Objects.isNull(numCuenta) || numCuenta.isBlank()) {
            throw new ConstruccionCuentaException("Número de cuenta es requerido");
        }
    }

    public void ingresar(float monto) {
        if (monto < 0) {
            throw new ValorInvalidoException("El monto debe ser POSITIVO");
        }
        this.saldo += monto;
    }

    public void retirar(float monto) {
        if (monto < 0) {
            throw new ValorInvalidoException("El monto debe ser POSITIVO");
        }
        if (this.saldo < monto) {
            throw new ValorInvalidoException("No tiene saldo suficiente");
        }
        this.saldo -= monto;
    }

    public void mostrarInfo() {
        IO.println("Nombre: " + this.nombre);
        IO.println("Cuenta: " + this.numCuenta);
        IO.println("Saldo: " + this.saldo);
    }

    public float getSaldo() {
        return saldo;
    }

    public String getNumCuenta() {
        return numCuenta;
    }

    public String getNombre() {
        return nombre;
    }
}