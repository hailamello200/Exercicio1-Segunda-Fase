/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author haila.159517
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        List<Disciplina> materias = new ArrayList<>();
        List<Professor> prof = new ArrayList<>();
        int esc = 0;
        do {
            esc = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opção: "
                    + "\n 1. Cadastro de Disciplina"
                    + "\n 2. Cadastro de Professor"
                    + "\n 3. Cadastro de Aluno"
                    + "\n 4. Consulta de Disciplina"
                    + "\n 5. Consulta de Professor"
                    + "\n 6. Consulta de Aluno"
                    + "\n 7. Sair"));
            switch (esc) {
                case 1:

                    do {
                        String nome;
                        String departamento;
                        char status;

                        nome = JOptionPane.showInputDialog("Informe o nome da disciplina:");
                        departamento = JOptionPane.showInputDialog("Qual o departamento:");
                        status = JOptionPane.showInputDialog("Status [A]tivo ou [I]nativo").charAt(0);
                        materias.add(new Disciplina(nome, departamento, status));
                    } while ((JOptionPane.showConfirmDialog(null, "Deseja Continuar? ")) == 0);
                    break;
            }
          case 2:
          
               do {
             String disciplinasDisponiveis = "";
             for (Disciplina materia : materias) {
              disciplinasDisponiveis += "\n" + materias.indexOf(materia) + " " + materia.getNome();
        }

        do {
            int cargaHoraria;
            float salario=0;
            float valorHora;
            String nome;
            String rg;
            String cpf;
            Date dataNascimento;
            int idade = 0;
            SimpleDateFormat conversor = new SimpleDateFormat("dd/MM/yyyy");
            nome = JOptionPane.showInputDialog("Informe o nome");
            rg = JOptionPane.showInputDialog("Informe o Rg");
            cpf = JOptionPane.showInputDialog("Informe o Cpf");
            dataNascimento = conversor.parse(JOptionPane.showInputDialog("Informe a data de nascimento:"));

        } while ((JOptionPane.showConfirmDialog(null, "Deseja Continuar? ")) == 0);
        String pessoasCadastradas = "";
        // for ( disciplina : disciplinas){
        //   pessoasCadastradas += "\n"  + ""
        //         +"\n" +nome() + ""
        //  + "\n" +.getRg() +""
        // + "\n" +cadastro.getCpf()+""
        //+ "\n" +cadastro.getIdade() + "Anos";
    }

    // JOptionPane.showMessageDialog (
    //    null, disciplinasDisponiveis);
    //  JOptionPane.showMessageDialog (
    //null,pessoasCadastradas

    
    }
