/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

import javax.swing.JOptionPane;

/**
 *
 * @author Dener
 */
public class Quadra {
    private int valorMinuto;
    private String nome, tipoDaQuadra;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getValorMinuto() {
        return valorMinuto;
    }

    public void setValorMinuto(int valorMinuto) {
        System.out.println("Cheguei aqui -----" + Integer.toString(valorMinuto));
        this.valorMinuto = valorMinuto;
    }

    public String getTipoDaQuadra() {
        return tipoDaQuadra;
    }

    public void setTipoDaQuadra(String tipoDaQuadra) {
        this.tipoDaQuadra = tipoDaQuadra;
    }
    
    public void cadastrarQuadra(){
        this.setNome(JOptionPane.showInputDialog("Qual o nome da Quadra?"));
        this.setTipoDaQuadra(JOptionPane.showInputDialog("Qual o tipo da Quadra?"));
        this.setValorMinuto(Integer.parseInt(JOptionPane.showInputDialog("Qual o valor do minuto?")));
    }    
}
