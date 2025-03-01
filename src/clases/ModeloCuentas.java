package clases;

public class ModeloCuentas {


    String numeroCuenta;
    int monto;

    public ModeloCuentas(String numeroCuenta, int monto) {
        this.numeroCuenta = numeroCuenta;
        this.monto = monto;
    }


    @Override
    public String toString() {
        return numeroCuenta + " - " + monto + ".";
    }
}
