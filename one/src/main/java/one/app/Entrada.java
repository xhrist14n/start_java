package one.app;

import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Entrada 
{
    private Scanner scanner;
    public void iniciar(){
        if(scanner == null){
            scanner = new Scanner(System.in);
        }        
    }
    public String formatearDecimal(double number){
        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        String decimal = "";
        decimal = decimalFormat.format(number);
        return decimal;
    }
    public Boolean validarNombre(String nombre){
        Boolean flag = false;
        Pattern pattern = Pattern.compile("^[A-Z a-z]*$");
        Matcher matcher = pattern.matcher(nombre);
        flag = matcher.matches();
        return flag;
    }
    public String ingresarDato(String mensaje){
        System.out.println(mensaje);
        iniciar();
        String data = "";
        try{
            data = scanner.nextLine();
        }catch(Exception ex){
            data = ingresarDato(mensaje);
        }
        return data;
    }
    public int ingresarNumero(String mensaje){
        System.out.println(mensaje);
        iniciar();
        int data = 0;
        try{
            data = scanner.nextInt();
        }catch(Exception ex){
            data = ingresarNumero(mensaje);
        }
        return data;
    }
    public char ingresarCaracter(String mensaje){
        System.out.println(mensaje);
        iniciar();
        char data;
        try{
            data = scanner.next().charAt(0);
            data = Character.toUpperCase(data);
        }catch(Exception ex){
            data = ingresarCaracter(mensaje);
        }
        return data;
    }
    public double ingresarDecimal(String mensaje){
        System.out.println(mensaje);
        iniciar();
        double data = 0;
        try{
            data = scanner.nextDouble();
        }catch(Exception ex){
            data = ingresarDecimal(mensaje);
        }
        return data;
    }
}
