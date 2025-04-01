package Persona;

public class Cliente extends Persona {
    private String nombre;
    private int edad;
    private String direccion;
    private String telefono;
    private String correo;
    private String historiaDecompra;

    public Cliente(String nombre, int edad, String direccion, String telefono, String correo, String historiaDecompra) {
       super(nombre, edad, direccion);
        this.telefono = telefono;
        this.correo = correo;
        this.historiaDecompra = historiaDecompra;

    }



    @Override

    public void MostrarInformacion(){
        super.MostrarInformacion();

        System.out.println("Telefono: "+telefono);
        System.out.println("Correo: "+correo);
        System.out.println("Historia de compra: "+historiaDecompra);
    }
}
