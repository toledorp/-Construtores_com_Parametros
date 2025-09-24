/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.fatec.alunos;

/**
 *
 * @author fatec-dsm2
 */
public class Alunos {
    
    private String nome;
    private String matricula;
    
    public Alunos(String nome, String matricula){
        this.nome = nome;
        this.matricula = matricula;
    }
    
    public void exibirDados(){
        System.out.println("Nome: " + nome);
        System.out.println("Matricula: " + matricula);
    }

    public static void main(String[] args) {
        Alunos alunos = new Alunos("Ana", "1234567");
        alunos.exibirDados();
    }
}
