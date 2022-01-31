package br.com.dio.pessoa;

import br.dio.interfaces.ImpostoDeRenda;

public class Medico extends Pessoa implements ImpostoDeRenda{
    private String especialidade;
    private double rendaAnual;

    public Medico(String especialidade, double rendaAnual, String nome, String cpf) {
        super(nome, cpf);
        this.especialidade = especialidade;
        this.rendaAnual = rendaAnual;
    }

    @Override
    public String toString(){
        return "Especialidade: " + especialidade + 
                "\nRenda anual: R$ " + formatarValores(rendaAnual) + 
                "\nValor do IR: R$ " + formatarValores(calcularIR());
    }

    @Override
    public double calcularIR() {
        double aliq, vParcela;
        
        if (rendaAnual <= 21453.24) {
            aliq = 0.0;
            vParcela = 0.00;
        }else if (rendaAnual <= 32151.48) {
            aliq = 7.50;
            vParcela = 1608.99;
        }else if (rendaAnual <= 42869.16) {
            aliq = 15.0;
            vParcela = 4020.35;
        }else if (rendaAnual <= 53565.72) {
            aliq = 22.5;
            vParcela = 7235.54;
        }else{
            aliq = 27.5;
            vParcela = 9913.83;
        }
        
        return (rendaAnual - vParcela) * (aliq / 100);
    }    
}
