package clases;

import java.util.ArrayList;
import java.util.Scanner;

public class CuentasBancarias {


    public String numeroCuenta;
    public int monto;
    ArrayList<ArrayList<ModeloCuentas>> listadoCuentas = new ArrayList<>();
    ArrayList<ModeloCuentas> cuentas = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    int cuenta;
    String numeroCuentaBancaria;


    public void RegistrarCuentasBancaria() {

        System.out.println("Ingrese el numero de cuenta: ");
        numeroCuenta = sc.nextLine();
        System.out.println("Ingrese el monto: ");
        monto = sc.nextInt();


        this.numeroCuenta = numeroCuenta;
        this.monto = monto;

        cuentas.add(new ModeloCuentas(numeroCuenta, monto));

        listadoCuentas.add(cuentas);
        System.out.println("Cuenta registrada correctamente");

    }


}
