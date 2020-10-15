package one.app;

import javax.swing.JOptionPane;

public class DialogoEntrada 
{
    
    
    public String ingresarDato(String mensaje){
        String data = "";
        data = JOptionPane.showInputDialog(mensaje);
        return data;
    }
    public int ingresarNumero(String mensaje){
        int data =0 ;
        data = Integer.parseInt(JOptionPane.showInputDialog(mensaje));
        return data;
    }
    public double ingresarDecimal(String mensaje){
        double data =0 ;
        data = Double.parseDouble(JOptionPane.showInputDialog(mensaje));
        return data;
    }
}
