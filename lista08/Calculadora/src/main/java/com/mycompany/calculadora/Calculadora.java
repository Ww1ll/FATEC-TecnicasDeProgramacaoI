package com.mycompany.calculadora;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author labs
 */
public class Calculadora {

    private JFrame janela;
    private JPanel painelPrincipal;
    private Label label1, lblr, lbl3;
    private TextField t1, t2, t3;

    public static void main(String[] args) {
        new Calculadora().montaTela();

    }

    private void montaTela() {
        preparaJanela();
        preparaPainelPrincipal();
        preparaLabel();
        preparaText();
        preparaBotaoCarregar();
        preparaBotaoSubtrair();
        preparaBotaoDiv();
        preparaBotaoMulti();
        preparaBotaoSair();
        mostraJanela();
    }

    private void preparaJanela() {
        janela = new JFrame("Exemplo");

    }

    private void mostraJanela() {
        janela.pack();
        janela.setSize(600, 300);
        janela.setVisible(true);
    }

    private void preparaPainelPrincipal() {
        painelPrincipal = new JPanel();
        //painelPrincipal.setLayout(new BoxLayout(painelPrincipal, BoxLayout.PAGE_AXIS));
        
        FlowLayout f =(FlowLayout)painelPrincipal.getLayout();
        janela.add(painelPrincipal);
    }

    private void preparaLabel() {
        label1 = new Label("Calculando a Soma de 2 números");
        painelPrincipal.add(label1);
    };

    private void preparaText() {
        t1 = new TextField("");
        t2 = new TextField("");
        lblr = new Label("Resultado= ");
        lbl3 = new Label(" ");
        painelPrincipal.add(t1);
        painelPrincipal.add(t2);
        painelPrincipal.add(lblr);
        painelPrincipal.add(lbl3);
    };

    
    /*SOMA*/
    private void preparaBotaoCarregar() {
        JButton botaoDiv = new JButton("SOMA");
        botaoDiv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int soma = Integer.parseInt(t1.getText()) + Integer.parseInt(t2.getText());
                String r = Integer.toString(soma);
                lbl3.setText(r);
            }
        });

        painelPrincipal.setLocation(50, 100);
        painelPrincipal.add(botaoDiv);

    }
    
       /*SOMA*/
    
    /*subtracao*/
    
    private void preparaBotaoSubtrair() {
        JButton botaoCarregar = new JButton("SUBTRACAO");
        botaoCarregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int sub = Integer.parseInt(t1.getText()) - Integer.parseInt(t2.getText());
                String r = Integer.toString(sub);
                lbl3.setText(r);
            }
        });

        painelPrincipal.setLocation(75, 100);
        painelPrincipal.add(botaoCarregar);

    }
    
    /*subtracao*/
    
     /*multi*/
    
    private void preparaBotaoMulti() {
        JButton botaoCarregar = new JButton("MULTIPLICAR");
        botaoCarregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int multi = Integer.parseInt(t1.getText()) * Integer.parseInt(t2.getText());
                String r = Integer.toString(multi);
                lbl3.setText(r);
            }
        });

        painelPrincipal.setLocation(75, 100);
        painelPrincipal.add(botaoCarregar);

    }
    
    /*multi*/
    
      /*div*/
    
    private void preparaBotaoDiv() {
        JButton botaoCarregar = new JButton("DIVISAO");
        botaoCarregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                if(Integer.parseInt(t2.getText()) == 0) {
                    lbl3.setText("Nao divisivel");
                } 
                int div = Integer.parseInt(t1.getText()) / Integer.parseInt(t2.getText());
                String r = Integer.toString(div);
                lbl3.setText(r);
                
            }
        });

        painelPrincipal.setLocation(75, 100);
        painelPrincipal.add(botaoCarregar);

    }
    
    /*div*/
   
    
    private void preparaBotaoSair() {
        JButton botaoSair = new JButton("Sair");
        botaoSair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        painelPrincipal.add(botaoSair);
    }
}
