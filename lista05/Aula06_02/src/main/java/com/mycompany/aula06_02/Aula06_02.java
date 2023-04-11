/*
Criar uma Classe chamada Equacao que contenha como atributos 3 valores inteiros, A,
B e C. Na classe definir um método para leitura dos valores, um método construtor e um
método para calcular as raízes da equação.
R1 = (-b+ (raiz de delta)) / (2*a)
R2 = (-b-(raiz de delta)) / (2*a)
Considerar que:
- Se delta = 0, as raízes são iguais;
- Se delta <0, não existem raízes reais;
- Se delta >0, existem 2 raízes diferentes
No método principal do programa (main) , criar um objeto a partir da classe criada, solicitar
e atribuir os valores e invocar o método que calcula as raízes a partir do objeto criado.
*/

package com.mycompany.aula06_02;

import static java.lang.Math.sqrt;
import javax.swing.JOptionPane;


public class Aula06_02 {

    public static void main(String[] args) throws Exception {
       
       equacao eq1 = new equacao();
        
        
       String A = JOptionPane.showInputDialog(null, "Informe um valor ", "Calcular bhaskara", JOptionPane.INFORMATION_MESSAGE);
       
       String B = JOptionPane.showInputDialog(null, "Informe outro valor ", "Calcular bhaskara", JOptionPane.INFORMATION_MESSAGE);
       
       String C = JOptionPane.showInputDialog(null, "Informe outro valor ", "Calcular bhaskara", JOptionPane.INFORMATION_MESSAGE);
       
       
       eq1.setA(Integer.parseInt(A));
       eq1.setB(Integer.parseInt(B));
       eq1.setC(Integer.parseInt(C));
     
        
        eq1.calcularRaiz();
        
        JOptionPane.showMessageDialog(null, "A raiz de X1 é: " + eq1.getR1(), "Calcular bhaskara", JOptionPane.DEFAULT_OPTION);
        
        JOptionPane.showMessageDialog(null, "A raiz de X2 é: " + eq1.getR2(), "Calcular bhaskara", JOptionPane.DEFAULT_OPTION);
        
   
     
    }
    
    public static class equacao{
    
        int a, b, c;
        float R1, R2;

        
        public equacao() {
 
        }

        public int getA() {
            return a;
        }

        public void setA(int a) {
            this.a = a;
        }

        public int getB() {
            return b;
        }

        public void setB(int b) {
            this.b = b;
        }

        public int getC() {
            return c;
        }

        public void setC(int c) {
            this.c = c;
        }
        
        public void calcularRaiz(){
            
            double delta = b * b - 4 *a*c;
            
            R1 = (float) ((-1 * b  + (sqrt(delta))) / (2*a));
            
            R2 = (float) ((-1 * b  - (sqrt(delta))) / (2*a));
            

            
            
        }
        
        public float getR1(){
            return R1;
        }
        
                
        public float getR2(){
            return R2;
        }
        
        
        
    }
   
    
    
}
