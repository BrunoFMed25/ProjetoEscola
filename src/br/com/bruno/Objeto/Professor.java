/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bruno.Objeto;

import java.util.ArrayList;

/**
 *
 * @author bruno.154417
 */
public class Professor {
    
    
    private Integer cargahoraria;
    private float valorHora;
    private Integer idade;

    public Professor(Integer cargahoraria, float valorHora, Integer idade) {
        this.cargahoraria = cargahoraria;
        this.valorHora = valorHora;
        this.idade = idade;
    }
    
    public float calcularHorario(float cargaHoraria, float valorHora){
        return cargaHoraria + valorHora;
    }

    @Override
    public String toString() {
        return "Professor{" + ", cargahoraria=" + cargahoraria + ", valorHora=" + valorHora + ", idade=" + idade + '}';
    }
    

    public Integer getCargahoraria() {
        return cargahoraria;
    }

    public void setCargahoraria(Integer cargahoraria) {
        this.cargahoraria = cargahoraria;
    }

    public float getValorHora() {
        return valorHora;
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }
    
    
    
}
