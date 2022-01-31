package br.com.dio.pessoa;

import java.text.DecimalFormat;

public abstract class Pessoa {
    DecimalFormat df = new DecimalFormat("#0.00");
    private String nome;
    private String cpf;

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }
    
    @Override
    public String toString(){
        return "Nome: " + nome + "\nCPF: " + cpf;
    }

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
    
    public String formatarValores(double valor){
        return df.format(valor);        
    }
    
}
