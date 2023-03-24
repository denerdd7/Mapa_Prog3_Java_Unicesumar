/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author Dener
 */
public class Locatario {
    private String nome, cpf, telefone;
    private int anoNascimento;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }
    
    public boolean verificarMaiorIdade(){
        int anoAtual = Calendar.getInstance().get(Calendar.YEAR);
        
        if((anoAtual - anoNascimento) >= 18){
            return true;
    }
        else
            return false;
    }
    
    public void cadastrarLocatario(){
        this.setNome(JOptionPane.showInputDialog("Qual o nome do Locatário?"));
        this.setCpf(JOptionPane.showInputDialog("Qual o CPF?"));
        this.setTelefone(JOptionPane.showInputDialog("Qual o Telefone?"));
        this.setAnoNascimento(Integer.parseInt(JOptionPane.showInputDialog("Qual o ano de nascimento?")));
    }    
}
