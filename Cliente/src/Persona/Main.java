package Persona;

public class Main {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("Mbappe",12," #123", "1508-333","mbappe@15cha.com","Compra frecuente de productos");
        Empleado empleado = new Empleado("Cristiano ", 23, " #344", "222-2345", "Cristiano07@gmail.com", "Gerente", "200 Euro","150945");

        System.out.println("Informacion del Cliente");
        cliente.MostrarInformacion();
        System.out.println("Informacion del Empleado");
        empleado.MostrarInformacion();
    }
}
