package br.com.dio.principal;

import br.com.dio.pessoa.Medico;
import br.com.dio.pessoa.Paciente;
import br.com.dio.pessoa.Pessoa;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.*;
        
public class Principal {
    
    public static void main(String[] args) {
        // TODO code application logic here
        showMessageDialog(null, "Bem vindo.\n\nNas telas a seguir, informe os dados do MÉDICO.\n\n");
        String nomeMedico = showInputDialog("Informe o NOME do médico");
        String cpfMedico = showInputDialog("MÉDICO: " + nomeMedico + "\n\nInforme o CPF do médico");
        String especialidadeMedico = showInputDialog("MÉDICO: " + nomeMedico + "\n\nInforme a ESPECIALIDADE do médico");
        double rendaAnualMedico = parseDouble(showInputDialog("MÉDICO: " + nomeMedico + "\n\nInforme a RENDA ANUAL do médico"));
        showMessageDialog(null, "Obrigado pelas informações.\n\nAgora você deverá informar os dados do PACIENTE.\n\n");
        String nomePaciente = showInputDialog("Informe o NOME do paciente");
        String cpfPaciente = showInputDialog("PACIENTE: " + nomePaciente + "\n\nInforme o CPF do paciente");
        double pesoPaciente = parseDouble(showInputDialog("PACIENTE: " + nomePaciente + "\n\nInforme o PESO do paciente"));
        double alturaPaciente = parseDouble(showInputDialog("PACIENTE: " + nomePaciente + "\n\nInforme o ALTURA do paciente"));
        String sexoPaciente = showInputDialog("PACIENTE: " + nomePaciente + "\n\nInforme o SEXO do paciente (M ou F)");
        showMessageDialog(null, "Informações inseridas. Clique em 'OK' para exibir os resultados.\n\n");
        List<Pessoa> listPessoas = new ArrayList();
        listPessoas.add(new Paciente(pesoPaciente, alturaPaciente, sexoPaciente, nomePaciente, cpfPaciente));
        listPessoas.add(new Medico(especialidadeMedico, rendaAnualMedico, nomeMedico, cpfMedico));
        String resultado = " **** DADOS DO PACIENTE ***** \n\n" + listPessoas.get(0) + 
                            "\n-------------------------------------------------------------" +
                            "\n\n **** DADOS DO MÉDICO ***** \n\n" + listPessoas.get(1) + "\n\n";
        
        showMessageDialog(null, resultado);
    }
}
