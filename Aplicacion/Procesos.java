public class Procesos{
    
    private static double saldo;
    private static double ahorros;
    private static double meta;
    private static double deudas;

    public static void nuevoSaldo(double n){
        saldo = saldo + n;
        System.out.println("Proceso realizado satisfactoriamente");
    }

    public static void nuevoAhorros(double n){
        if(n <= saldo){
        saldo = saldo - n;
        ahorros = ahorros + n;
        System.out.println("Proceso realizado satisfactoriamente");
            if(ahorros != 0){
                if(ahorros >= meta){
                    System.out.println("¡Tu meta de ahorros de " + Procesos.getMeta()+ " ha sido cumplida!");
                }
            }
        }else{
            System.out.println("Saldo insuficiente");
        }
    }

    public static void pagarDeudasAhorros(double n){
        if(n <= ahorros){
            deudas = deudas - n;
            ahorros = ahorros - n;
            System.out.println("Se ha pagado satisfactoriamente");
        }else{
            System.out.println("Ahorros insuficientes");
        }
    }

    public static void pagarDeudasSaldo(double n){
        if(n <= saldo){
            deudas = deudas - n;
            saldo = saldo - n;
            System.out.println("Se ha pagado satisfactoriamente");
        }else{
            System.out.println("Saldo insuficiente");
        }
    }

    public static String toStringProcesos(){
        return "Su saldo es de: " + "$" + (int)Procesos.getSaldo() + "\n" +
        "Sus ahorros son: " + "$" + (int)Procesos.getAhorros() + "\n" +
        "Su meta a cumplir es de: " + "$" + (int)Procesos.getMeta() + "\n" +
        "El valor de sus deudas es: " + "$" + (int)Procesos.getDeudas();
    }

    public static double getSaldo(){
        return saldo;
    }
 
    public static double getAhorros(){
        return ahorros;
    }
 
    public static double getMeta(){
        return meta;
    }
 
    public static double getDeudas(){
        return deudas;
    }
 
    public void setSaldo(double s){
        saldo = s;
    }
 
    public static void setMeta(double m){
        meta = m;
    }
 
    public static void setDeudas(double d){
        deudas = d;
    }
}