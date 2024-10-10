/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioIJAVA;

import javax.swing.JOptionPane;

/**
 *
 * @author hande
 */
public class ejercicioIJAVA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String strNum = JOptionPane.showInputDialog("Ingrese # de empleados?");
        double doubleDeduction = 0.0;
        double doubleSalario = 0.0;
        double doubleSEM = 0.0;
        double doubleIVM = 0.0;
        double finalDeduction = 0.0;
        int intNum = Integer.parseInt(strNum);
        
        for (int i = 1; i <= intNum; i++) {
            String strSalario = JOptionPane.showInputDialog("Ingrese el salario?");
            doubleSalario = Double.parseDouble(strSalario);
            doubleIVM = doubleSalario * 0.0925;
//            System.out.println(doubleIVM);
            doubleSEM = doubleSalario * 0.0508;            
//            System.out.println(doubleSEM);
            doubleDeduction = doubleIVM + doubleSEM;
//            System.out.println(doubleDeduction);
            finalDeduction = finalDeduction+doubleDeduction;   
        }
        System.out.println("La empresa debera abonar a la CCSS monto de "+finalDeduction+" por concepto de SEM Y IVM");
        



        
        
        
        
        
        
        
        
        
    }
    
}
