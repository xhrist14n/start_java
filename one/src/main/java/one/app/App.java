package one.app;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Iniciando App" );

        DialogoEntrada dialogo_entrada= new DialogoEntrada();

        Entrada entrada = new Entrada();

        Double decimal = dialogo_entrada.ingresarDecimal("Ingrese un decimal");

        String nombre = dialogo_entrada.ingresarDato("Ingrese un nombre");

        boolean valido = entrada.validarNombre(nombre);

        while(valido == false){
            nombre = dialogo_entrada.ingresarDato("Ingrese un nombre");
            valido = entrada.validarNombre(nombre);
        }

        System.out.println( "Finalizo App" );
    }
}
