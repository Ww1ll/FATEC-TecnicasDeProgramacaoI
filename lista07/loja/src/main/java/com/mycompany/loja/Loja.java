
package com.mycompany.loja;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author labs
 */
public class Loja {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int codItem = 0;
        String descItem = " ";
        int qtdItem = 0;
        double precUnit = 0;
       
       
        System.out.println("----------FATURA---------");
        System.out.println("");
        
        try {
            
        System.out.println("Digite o numero do ítem: ");
        codItem = sc.nextInt();
        
        }catch(InputMismatchException e) { 
            System.out.println("Formato inválido");
        }
        
        System.out.println("Informe a descrição do ítem: ");
        descItem = sc.next();
        
        System.out.println("Digite a quantidade de ítens: ");
        qtdItem = sc.nextInt();
        
        System.out.println("Informe o preço unitário: ");
        precUnit = sc.nextFloat();
        
        
        Faturar faturar = new Faturar(codItem, descItem, qtdItem, precUnit);
        
        
        System.out.println("O número do ítem " + faturar.getNumeroItem());
        System.out.println("Descrição do item " + faturar.getDescricaoItem());
        System.out.println("Quantidade do item " + faturar.getQuantidade());
        System.out.println("Preço do item2 " + faturar.getPrecoUnitario());
        
        System.out.println("Fatura total do item" + faturar.getFaturarTotal());
      

        sc.close();
    }
}
