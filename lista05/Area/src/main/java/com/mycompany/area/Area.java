/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.area;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;


public class Area {
  
    public static class Triangulo
    {
    float base;
    float altura;
    float area;
        
    //método para leitura
    public void SetDimensoes (float Base, float Altura){   
        base = Base;
        altura = Altura;
    }
    
//método de calculo
    public float GetArea(){
        area = (base * altura) / 2;
        return area;
    }
        
    }


    public static void main(String[] args) {
        
        float base, area;
        try {
        String b = JOptionPane.showInputDialog("Base do Triângulo: ");
        String a = JOptionPane.showInputDialog("Altura do Triângulo: ");
        
        base = Float.parseFloat(b);
        area = Float.parseFloat(a);
        
        Triangulo triangulinho = new Triangulo();
        triangulinho.SetDimensoes(base, area);
        
        JOptionPane.showMessageDialog(null,"Area = " + triangulinho.GetArea());
        }
        catch (HeadlessException | NumberFormatException e){
        JOptionPane.showMessageDialog(null,"Tente Novamente! ");
        }
        
      
        
    }
    
}
    


