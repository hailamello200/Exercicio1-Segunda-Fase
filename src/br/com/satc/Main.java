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

        do {
            String nome;
            String departamento;
            char status;

            nome = JOptionPane.showInputDialog("Informe o nome da disciplina:"
                    + "\n 0- POO"
                    + "\n 1- Redes"
                    + "\n 2- Estrutura de Dados"
                    + "\n 3- Linguagem de Programação");
            departamento = JOptionPane.showInputDialog("Qual o departamento:"
                    + "\n 0- A"
                    + "\n 1- B"
                    + "\n 2- C");
            status = JOptionPane.showInputDialog("Status [A]tivo ou [I]nativo").charAt(0);
            materias.add(new Disciplina(nome, departamento, status));
        } while ((JOptionPane.showConfirmDialog(null, "Deseja Continuar? ")) == 0);

        String disciplinasDisponiveis = "";
        for (Disciplina materia : materias) {
            disciplinasDisponiveis
                    += "\n" + materias.lastIndexOf(materia) + " " + materia.getNome();
        }

        do {

            String nome, rg, cpf;
            Date dataNascimento;
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
    
