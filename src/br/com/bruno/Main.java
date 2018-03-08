/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bruno;

import br.com.bruno.Objeto.Disciplina;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import static javax.print.attribute.Size2DSyntax.MM;
import javax.swing.JOptionPane;

/**
 *
 * @author bruno.154417
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        
        String Nome = JOptionPane.showInputDialog(" Qual nome ? ");
        String Depart = JOptionPane.showInputDialog(" Qual seu departamento ? ");
        char Status = JOptionPane.showInputDialog(" Qual seu status ? ").charAt(0);
        
        Disciplina dis = new Disciplina(Nome , Depart , Status);
       
        
        Integer cargaHoraria = Integer.parseInt(JOptionPane.showInputDialog(" informe a carga horaria "));
        float valorHora = Float.parseFloat(JOptionPane.showInputDialog(" informe valor da hora "));
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date dataN = sdf.parse(JOptionPane.showInputDialog(" Informe data de nascimento "));
        
        
        
        
        
        
        
        
    }
    
}
