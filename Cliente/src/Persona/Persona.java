package Persona;

public class Persona   {
    private String nombre;
    private int edad;
    private String direccion;
     public Persona(String nombre, int edad, String direccion) {
         this.nombre = nombre;
         this.edad = edad;
         this.direccion = direccion;

     }


    public void MostrarInformacion(){
         System.out.println("Nombre: "+nombre);
            System.out.println("Edad: "+edad);
            System.out.println("Direccion: "+direccion);
    }

}
