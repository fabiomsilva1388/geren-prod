
package br.senac.tads.pi3.projetox.gerenprod.exceptions;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JTextField;



public class Exceptions {
    public static ArrayList<String> mensagensErro = new ArrayList<>();

    public static ArrayList<String> getMensagensErro() {
        return mensagensErro;
    }
    
    /**
     * 
     * @param txt pelo JtextField
     * @throws IllegalArgumentException
     */
  public static void validarCampoTexto(JTextField txt){
        
        
        try{
            if(txt.getText().equals("")){
                throw new IllegalArgumentException();
            }
               // txt.setBackground(Color.white);     
                txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));   
        }
        catch (IllegalArgumentException e){
            mensagensErro.add("Erro 1");
            //txt.setBackground(Color.red);
            txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0,0), 1, true));
            
        }

    }
    /**
     * 
     * @param txt pelo JtextField
     * @throws NumberFormatException
     * @throws IllegalArgumentException
     */
    public static void validarNumero(JTextField txt) {
        
         try{

            if(txt.getText().equals("")){
                  
                 throw new IllegalArgumentException();
             }
            int valorConvertido = Integer.parseInt(txt.getText());
            txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true)); 
        }
        catch (NumberFormatException e)
        {
           
           mensagensErro.add("Erro 2");
           txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0,0), 1, true));
           
        }
        catch (IllegalArgumentException e)
        {
           mensagensErro.add("Erro 3");
           txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0,0), 1, true));
        }
         
    }
    /**
     *
     * @param txt pelo JtextField
     * @throws NumberFormatException
     * @throws IllegalArgumentException
     */
    

    public static void validarDecimal(JTextField txt) {
        
         try{
             
             if(txt.getText().equals("")){
                 throw new IllegalArgumentException();
             }
             
             double valor = Double.parseDouble(txt.getText().replace(',', '.'));
             txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true)); 
        }
        catch (NumberFormatException e)
        {
           mensagensErro.add("Erro 4");
           txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0,0), 1, true));
           
        }
        catch (IllegalArgumentException e)
        {
           mensagensErro.add("Erro 5");
           txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0,0), 1, true));
        }
        catch(Exception e)
        {
           mensagensErro.add("Erro 6");
           txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0,0), 1, true));
           
        }
         
    }
    public static void limparMensagesErro() {
        
        mensagensErro.clear();
    }
    

}
