package es.Studium;

public class Ejemplo2
{
public static void main(String args[])
{
int valor=5, cero=0;
int[] array = {1, 2, 3};
try
{
array[4]= 5; // Acceso a una posici�n no disponible
valor = valor/cero; // Divisi�n por cero
}
catch(ArithmeticException e)
{
System.out.println( "Divisi�n por cero" );
}
catch(Exception e)
{
System.out.println( "Se ha producido un error " + e.getMessage());
}
}
}
