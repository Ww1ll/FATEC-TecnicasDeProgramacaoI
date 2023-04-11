/*
 * 
Criar uma classe Pessoa com as seguintes características: 
•atributos: idade e dia, mês e ano de nascimento, nome da pessoa 

•métodos: 
calculaIdade(),que  recebe  a  data  atual  em  dias, mês  e  anos  e  calcula  e armazena no atributo idade a idade atual da pessoa; 
informaIdade(), que retorna o valor da idade oinformaNome(),que retorna o nome da pessoa 
ajustaDataDeNascimento(), que recebedia, mês e ano de nascimento como parâmetros e preenche nos atributos correspondentes do objeto.

•Criar  dois  objetos  da  classe  Pessoa,  um  representando  Albert Einstein  (nascido  em 14/3/1879) e o outro representando Isaac Newton (nascido em 4/1/1643) 

•Fazer uma classe principal que instancie os objetos, inicialize e mostre quais seriam as idades de Einstein e Newton caso estivessem vivos.
 */

package com.mycompany.pessoa;

import javax.swing.JOptionPane;

/**
 *
 * @author labs
 */
public class Pessoa {
    
    int idade, diaNascimento, mesNascimento, anoNascimento;
    int mesAtual, anoAtual;
    int deltaMes, deltaAno;
    int idadeAtual;
    String nome;
    
    Pessoa () {}
    
    //método para setar a idade
    public void ajustaDataNascimento(int Dia, int Mes, int Ano){
        diaNascimento = Dia;
        mesNascimento = Mes;
        anoNascimento = Ano;
    }
    
    public void setAnoAtual (int Dia, int Mes, int Ano){
        int diaAtual = Dia;
        mesAtual = Mes;
        anoAtual = Ano;
    }
    
    public void setNome (String Nome){
        nome = Nome;
    }
    
    public String informaNome (){
        return nome;
    }
    
    
    public void calculadIdade(){
        //int deltaDia = diaAtual - diaNascimento;
        deltaMes = mesAtual - mesNascimento;
        deltaAno = anoAtual - anoNascimento;
        
        if (deltaMes >= 6){
          idadeAtual = deltaAno + 1;
        } else {
            idadeAtual = deltaAno;
        }
    }
        
    public int informaIdade(){
        return idadeAtual;
    }
    
    

    public static void main(String[] args) {
       
        int dia, dia1, dia2;
        int mes, mes1, mes2;
        int ano, ano1, ano2;
        
        
        String nome1 = JOptionPane.showInputDialog("Digite o Nome da Pessoa 1: ");
        String nome2 = JOptionPane.showInputDialog("Digite o Nome da Pessoa 2: ");
    
        String d1 = JOptionPane.showInputDialog("Digite o Dia do Nascimento da Pessoa 1: ");
        String d2 = JOptionPane.showInputDialog("Digite o Dia do Nascimento da Pessoa 2: ");    
        dia1 = Integer.parseInt(d1);
        dia2 = Integer.parseInt(d2);
        
        String m1 = JOptionPane.showInputDialog("Digite o Mês do Nascimento da Pessoa 1: ");
        String m2 = JOptionPane.showInputDialog("Digite o Mês do Nascimento da Pessoa 2: ");
        mes1 = Integer.parseInt(m1);
        mes2 = Integer.parseInt(m2);

        String a1 = JOptionPane.showInputDialog("Digite o Ano do Nascimento da Pessoa 1: ");
        String a2 = JOptionPane.showInputDialog("Digite o Ano do Nascimento da Pessoa 2: ");
        ano1 = Integer.parseInt(a1);
        ano2 = Integer.parseInt(a2);
        
        String d3 = JOptionPane.showInputDialog("Digite o Dia Atual: ");    
        dia = Integer.parseInt(d3);
    
        String m3 = JOptionPane.showInputDialog("Digite o Mês Atual: ");
        mes = Integer.parseInt(m3);
      
        String a3 = JOptionPane.showInputDialog("Digite o Ano Atual: ");
        ano = Integer.parseInt(a3);
       
        
        
        Pessoa einstein = new Pessoa();
        Pessoa newton = new Pessoa();
        
        //seta nome
        einstein.setNome(nome1);
        newton.setNome(nome2);
        
        //mostra nome
        //einstein.informaNome();
        //newton.informaNome();
        
        //seta ano atual
        einstein.setAnoAtual(dia, mes, ano);
        newton.setAnoAtual(dia, mes, ano);
        
        //seta ano de nascimento
        einstein.ajustaDataNascimento(dia1, mes1, ano1);
        newton.ajustaDataNascimento(dia2, mes2, ano2);
        
        //calcula idade do sujeito
        einstein.calculadIdade();
        newton.calculadIdade();
        
        //mostra idade do sujeito
        JOptionPane.showMessageDialog(null,"A idade do " + einstein.informaNome()+ " é " +  einstein.informaIdade());
        JOptionPane.showMessageDialog(null,"A idade do " + newton.informaNome() + " é " + newton.informaIdade());
   
        
}
    
}


