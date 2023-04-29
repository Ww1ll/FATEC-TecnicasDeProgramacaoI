    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.loja;

/**
 *
 * @author labs
 */
public class Faturar {
    private int numeroItem;
    private String descricaoItem;
    private int quantidade;
    private double precoUnitario;

    public Faturar(int numeroItem, String descricaoItem, int quantidade, double precoUnitario) {
        this.numeroItem = numeroItem;
        this.descricaoItem = descricaoItem;
        this.quantidade = quantidade >  0 ? quantidade : 0 ;
        this.precoUnitario = precoUnitario > 0 ? precoUnitario : 0;
    }
    
    public Faturar(){
    }

    public int getNumeroItem() {
        return numeroItem;
    }

    public void setNumeroItem(int numeroItem) {
        this.numeroItem = numeroItem;
    }

    public String getDescricaoItem() {
        return descricaoItem;
    }

    public void setDescricaoItem(String descricaoItem) {
        this.descricaoItem = descricaoItem;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
            this.quantidade = quantidade;  
        
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }
    
    public double getFaturarTotal(){
        
        return quantidade * precoUnitario;  
    }


}
