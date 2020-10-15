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

        DialogoEntrada entrada = new DialogoEntrada();

        Double decimal = entrada.ingresarDecimal("Ingrese un decimal");

        System.out.println( "Finalizo App" );
    }
}
