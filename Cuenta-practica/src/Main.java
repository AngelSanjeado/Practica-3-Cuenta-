import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Cuenta> cuentas = new ArrayList<>();

        Cuenta c0 = new Cuenta(0, 100);
        Cuenta c1 = new Cuenta(1, 100);
        Cuenta c2 = new Cuenta(2, 100);
        Cuenta c3 = new Cuenta(3, 100);
        Cuenta c4 = new Cuenta(4, 100);
        Cuenta c5 = new Cuenta(5, 100);
        Cuenta c6 = new Cuenta(6, 100);
        Cuenta c7 = new Cuenta(7, 100);
        Cuenta c8 = new Cuenta(8, 100);
        Cuenta c9 = new Cuenta(9, 100);

        cuentas.add(c0);
        cuentas.add(c1);
        cuentas.add(c2);
        cuentas.add(c3);
        cuentas.add(c4);
        cuentas.add(c5);
        cuentas.add(c6);
        cuentas.add(c7);
        cuentas.add(c8);
        cuentas.add(c9);

        System.out.println("----Bienvenido a tu cajero automático----");
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Ingrese un usuario: ");
            int usuario = sc.nextInt();

            if (usuario != cuentas.get(usuario).getId()){
                System.out.println("Usuario invalido \nIntente de nuevo...");
                continue;
            }

            System.out.println("Menú principal");
            System.out.printf("1. %s\n2. %s\n3. %s\n4. %s\n", "Consultar saldo", "Retirar", "Depositar", "Salir");
            System.out.println("Ingrese una opción: ");
            int opcion = sc.nextInt();

            switch (opcion){

                case 1:
                    System.out.printf("El saldo es: %.2f", cuentas.get(usuario).getBalance());
                    break;

                case 2:
                    System.out.print("Ingrese una cantidad a retirar: ");
                    double retiro = sc.nextDouble();
                    System.out.println(cuentas.get(usuario).withdraw(retiro) ? "\nRetiro exitoso" : "\nSaldo insuficiente");
                    break;

                case 3:
                    System.out.print("Ingrese una cantidad a depositar: ");
                    double deposito = sc.nextDouble();
                    System.out.println(cuentas.get(usuario).deposit(deposito) ? "\nDeposito exitoso." : "\nMonto invalido.");
                    break;

                case 4:
                    System.out.println("Saliendo...");
                    return;
            }



        }while (true);
    }
}
