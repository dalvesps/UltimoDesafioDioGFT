package br.com.dio.pessoa;

import br.dio.interfaces.Saude;

public class Paciente extends Pessoa implements Saude{
    private double peso;
    private double altura;
    private String sexo;

    public Paciente(double peso, double altura, String sexo, String nome, String cpf) {
        super(nome, cpf);
        this.peso = peso;
        this.altura = altura;
        this.sexo = sexo;
    }
    
    @Override
    public String toString(){
        return "Peso: " + peso + 
                "\nAltura: " +  formatarValores(altura) + " m" +
                "\nSexo: " + sexo.toUpperCase() + 
                "\nIMC: " + formatarValores(calcularIMC()) +
                "\nPeso ideal: " + formatarValores(calcularPesoIdeal()) + " kg" +
                "\nSituação: " + calcularSituacao();
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public double calcularIMC() {
        double imc;
        //imc = peso / (altura * altura);
        imc = peso / Math.pow(altura, 2);
        return imc;
    }

    @Override
    public double calcularPesoIdeal() {
        double pesoIdeal = 0;
        switch (sexo.toUpperCase()){
            case "M":
                pesoIdeal = 72.7 * altura - 58;
            break;
            
            case "F":
                pesoIdeal = 62.1 * altura - 44.7;
            break;
        }
        return pesoIdeal;
    }

    @Override
    public String calcularSituacao() {
        String situacao = "";
        if (calcularIMC() < 20) {
            situacao = "Abaixo do peso";
        }else if (calcularIMC() <25) {
            situacao = "Normal";
        }else if (calcularIMC() < 30) {
            situacao = "Excesso de peso";
        }else if (calcularIMC() < 35) {
            situacao = "Obesidade";
        }else{
            situacao = "Obesidade mórbida";
        }
        return situacao;
    }
}
