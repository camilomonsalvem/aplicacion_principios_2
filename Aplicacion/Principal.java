import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Principal.mostrarMenu();
    }

    public static void mostrarMenu() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("");
        System.out.println("¡Bienvenido a tu app financiera!");
        System.out.println("");
        System.out.println("------------- Menú -------------");
        System.out.println("");
        System.out.println("1:   Ingresar saldo");
        System.out.println("2:   Ingresar meta de ahorros");
        System.out.println("3:   Ingresar ahorros");
        System.out.println("4:   Ingresar deudas");
        System.out.println("5:   Consultar saldo");
        System.out.println("6:   Consultar meta de ahorros");
        System.out.println("7:   Consultar ahorros");
        System.out.println("8:   Consultar deudas");
        System.out.println("9:   Pagar deudas");
        System.out.println("10:  Consultar tus datos");
        System.out.println("0:   Salir");
        System.out.println("");
        System.out.println("---------------------------------");
        System.out.println("");
        System.out.print("Ingrese el numero del menú al que desea ingresar: ");

        int num = entrada.nextInt();

        while (true) {
            if (num == 0) {
                System.out.println("¡Hasta la proxima!");
                break;
            }
            switch (num) {
                case 1:
                    System.out.println("");
                    System.out.print("Ingrese el valor: ");
                    Procesos.nuevoSaldo(entrada.nextDouble());
                    break;
                case 2:
                    System.out.println("");
                    System.out.print("Ingrese su meta de ahorros a cumplir: ");
                    Procesos.setMeta(entrada.nextDouble());
                    break;
                case 3:
                    System.out.println("");
                    System.out.print("Su saldo disponible es: ");
                    System.out.println("$ " + (int)Procesos.getSaldo());
                    System.out.print("Ingrese sus ahorros: ");
                    Procesos.nuevoAhorros(entrada.nextDouble());
                    break;
                case 4:
                    System.out.println("");
                    System.out.print("Ingrese valor de deudas: ");
                    Procesos.setDeudas(entrada.nextDouble());
                    break;
                case 5:
                    System.out.println("");
                    System.out.println("Su saldo actual es de: ");
                    System.out.println("$ " + (int)Procesos.getSaldo());
                    break;
                case 6:
                    System.out.println("");
                    System.out.println("Su meta de ahorros actual es de: ");
                    System.out.println("$ " + (int)Procesos.getMeta());
                    break;
                case 7:
                    System.out.println("Su ahorro es de: ");
                    System.out.println("$ " + (int)Procesos.getAhorros());
                    break;
                case 8:
                    System.out.println("");
                    System.out.println("Sus deudas restantes son: ");
                    System.out.println("$ " + (int)Procesos.getDeudas());
                    break;
                case 9:
                    System.out.println("");
                    System.out.println("Con que fondo deseas pagar: ");
                    System.out.println("1: Saldo (" + "Disponible: $ " + (int)Procesos.getSaldo() + ")" );
                    System.out.println("2: Ahorros (" + "Disponible: $ " + (int)Procesos.getAhorros() + ")" );
                    System.out.print("Escribe el número correspondiente a continuación: ");
                    
                    int num2 = entrada.nextInt();

                    switch (num2){
                        case 1:
                            System.out.println("");
                            System.out.print("Tu deuda actual es de: ");
                            System.out.println("$ " + (int)Procesos.getDeudas());
                            System.out.print("Ingrese el valor que desea pagar: ");
                            Procesos.pagarDeudasSaldo(entrada.nextDouble());
                            break;
                        case 2:
                            System.out.println("");
                            System.out.print("Tu deuda actual es de: ");
                            System.out.println("$ " + (int)Procesos.getDeudas());
                            System.out.print("Ingrese el valor que desea pagar: ");
                            Procesos.pagarDeudasAhorros(entrada.nextDouble());
                            break;
                        default:
                            System.out.println("Valor incorrecto, intentalo nuevamente...");
                            break;
                    }

                    break;

                case 10:
                    System.out.println("");
                    System.out.println(Procesos.toStringProcesos());
                    break;
                default:
                    System.out.println("");
                    System.out.println("No existe una opción para este numero, ingresa uno diferente...");
            }

            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("------------- Menú -------------");
            System.out.println("");
            System.out.println("1:   Ingresar saldo");
            System.out.println("2:   Ingresar meta de ahorros");
            System.out.println("3:   Ingresar ahorros");
            System.out.println("4:   Ingresar deudas");
            System.out.println("5:   Consultar saldo");
            System.out.println("6:   Consultar meta de ahorros");
            System.out.println("7:   Consultar ahorros");
            System.out.println("8:   Consultar deudas");
            System.out.println("9:   Pagar deudas");
            System.out.println("10:  Consultar tus datos");
            System.out.println("0:   Salir");
            System.out.println("");
            System.out.println("---------------------------------");
            System.out.println("");
            System.out.print("Ingrese el numero del menú al que desea ingresar: ");

            num = entrada.nextInt();
        }
    }
}