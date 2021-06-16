/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

/**
 *
 * @author Carlos HF
 * Infelizmente não tive/tenho conhecimento suficiente para trabalhar com código java, 
 * por favor desconsiderar o pessimo código apresentado e atrasado
 * e não considerar a formatação de valores como correta, pois o sistema nao funciona
 * obrigado
 */


import javax.swing.*;
        
public class Teste {
    public static void main(String[] args){
        Double pesoc, alturac, imc;
        pesoc = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso para calcular: "));
        alturac = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura para calcular: "));
        imc = pesoc /(alturac *alturac);
        if (imc <17) {
            JOptionPane.showMessageDialog (null, "Seu IMC é :" + imc);
            JOptionPane.showMessageDialog (null, "Resultado : Muito abaixo do peso {ATENÇÃO)");
            JOptionPane.showMessageDialog (null, "Obrigado por utilizar, cuide da sua saúda :)");
            
        } else if (imc> = 17 && imc <= 18,49) {
            JOptionPane.showMessageDialog (null, "Seu IMC é:" + imc);
            JOptionPane.showMessageDialog (null, "Resultado: Abaixo do peso {CUIDADO)");
            JOptionPane.showMessageDialog (null, "Obrigado por utilizar, cuide da sua saúda :)");
        } else if (imc> = 18,50 && imc <= 24,99) {
            JOptionPane.showMessageDialog (null, "Seu IMC é:" + imc);
            JOptionPane.showMessageDialog (null, "Resultado: Peso normal(MUITO BOM)");   
            JOptionPane.showMessageDialog (null, "Obrigado por utilizar, cuide da sua saúda :)");
        } else if (imc> = 25 && imc <= 29,99) {
            JOptionPane.showMessageDialog (null, "Seu IMC é:" + imc);
            JOptionPane.showMessageDialog (null, "Resultado: Acima do peso (CUIDADO) ");  
            JOptionPane.showMessageDialog (null, "Obrigado por utilizar, cuide da sua saúda :)");
        } else if (imc> = 30 && imc <= 34,99) {
            JOptionPane.showMessageDialog (null, "Seu IMC é:" + imc);
            JOptionPane.showMessageDialog (null, "Resultado: Obesidade I (CUIDADO)");
            JOptionPane.showMessageDialog (null, "Obrigado por utilizar, cuide da sua saúda :)");
        } else if (imc> = 35 && imc <= 39,99) {
            JOptionPane.showMessageDialog (null, "Seu IMC é :" + imc);
            JOptionPane.showMessageDialog (null, "Resultado: Obesidade II (SEVERA - PROCURE UM MÉDICO)");
            JOptionPane.showMessageDialog (null, "Obrigado por utilizar, cuide da sua saúda :)");
        } else if (imc> = 40) {
            JOptionPane.showMessageDialog (null, "Seu IMC é:" + imc);
            JOptionPane.showMessageDialog (null, "Resultado: Obesidade III (MÓRBIDA - PROCURE UM MÉDICO)");   
                JOptionPane.showMessageDialog (null, "Obrigado por utilizar, cuide da sua saúda :)");
        
}

