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
public class Locacao {
    private int tempoMinuto;
    private char necessitaEquipamento;
    
    Locatario locatario = new Locatario();
    Quadra quadra = new Quadra();

    public int getTempoMinuto() {
        return tempoMinuto;
    }

    public void setTempoMinuto(int tempoMinuto) {
        this.tempoMinuto = tempoMinuto;
    }

    public char getNecessitaEquipamento() {
        return necessitaEquipamento;
    }

    public void setNecessitaEquipamento(char necessitaEquipamento) {
        this.necessitaEquipamento = necessitaEquipamento;
    }

    public Locatario getLocatario() {
        return locatario;
    }

    public void setLocatario(Locatario locatario) {
        this.locatario = locatario;
    }

    public Quadra getQuadra() {
        return quadra;
    }

    public void setQuadra(Quadra quadra) {
        this.quadra = quadra;
    }
    
    
    public double calcularLocacao(){
        if(getTempoMinuto() >= 120){            
            getQuadra().setValorMinuto((int) (getQuadra().getValorMinuto() - (getQuadra().getValorMinuto() * (10.0/100))));            
        }
       
        double valorLocacao = getTempoMinuto() * getQuadra().getValorMinuto();
        
        if ("s".equals(String.valueOf(getNecessitaEquipamento()))){
            valorLocacao = valorLocacao + 50;
        }        
                
        return valorLocacao;
    }
    
    public void mostrarResumoLocacao(){
        JOptionPane.showMessageDialog(null, 
            "Locatario" + 
            "\nNome: " + locatario.getNome() +
            "\nCPF: " + locatario.getCpf() +
            "\nTelefone: " + locatario.getTelefone() +
            "\nAno de Nascimento: " + locatario.getAnoNascimento() +
            "\n\nQuadra" + 
            "\nNome da Quadra: " + quadra.getNome() +
            "\nTipo: " + quadra.getTipoDaQuadra() +
            "\nValor do Minuto: " + quadra.getValorMinuto() +
            "\n\nLocação" +
            "\nTempo em Minutos: " + getTempoMinuto() + 
            "\nNecessita Equipamentos: " + getNecessitaEquipamento() +
            "\nValor Calculado: " + calcularLocacao()
        );
    }
    
    public void cadastrarLocacao(){
        quadra.cadastrarQuadra();
        locatario.cadastrarLocatario();
        locatario.verificarMaiorIdade();
        if(!locatario.verificarMaiorIdade()){
            System.exit(0);
        }
        this.setTempoMinuto(Integer.parseInt(JOptionPane.showInputDialog("Quanto tempo vai usar a quadra em minutos?")));
        this.setNecessitaEquipamento(JOptionPane.showInputDialog("Necessita equipamento? (S)Sim, (N)Não:").charAt(0));
        mostrarResumoLocacao();
    }    
}
