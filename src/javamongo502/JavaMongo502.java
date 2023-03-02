package javamongo502;

public class JavaMongo502 {

    public static void main(String[] args) {
        
        Connection conexion = new Connection();
        
        conexion.Mostrar();
        //conexion.insertar("Nadar");
        System.out.println("Otro");
        //conexion.Mostrar();
        System.out.println("Otro mas");
        //conexion.Actualizar("Nadar", "Brincar");
        conexion.Eliminar("Brincar");
        conexion.Mostrar();
        
        
    }
    
}
