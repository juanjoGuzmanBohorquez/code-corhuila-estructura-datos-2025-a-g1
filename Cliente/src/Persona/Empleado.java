package Persona;

public class Empleado extends Persona{
    private String nombre;
    private int edad;
    private String direccion;
    private String telefono;
    private String correo;
    private String cargo;
    private String salario;
    private String codigoDeempleado;

    public Empleado(String nombre, int edad, String direccion, String telefono, String correo, String cargo, String salario, String codigoDeempleado) {
        super(nombre, edad, direccion);

    this.telefono = telefono;
        this.correo = correo;
        this.cargo = cargo;
        this.salario = salario;
        this.codigoDeempleado = codigoDeempleado;
    }



    @Override

    public void MostrarInformacion(){
        super.MostrarInformacion();

        System.out.println("Telefono: "+telefono);
        System.out.println("Correo: "+correo);
        System.out.println("Cargo: "+cargo);
        System.out.println("Salario: "+salario);
        System.out.println("CodigoDeempleado: "+codigoDeempleado);
    }

}
