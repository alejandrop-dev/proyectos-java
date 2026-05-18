package Ejercicio4;
public class OperacionCanceladaException extends Exception{
    
    public OperacionCanceladaException(){
        super("El usuario canceló la operación");
    }
    
}
