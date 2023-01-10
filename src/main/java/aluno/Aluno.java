package aluno;

import java.time.LocalDate;
import java.util.Locale;

public class Aluno implements Comparable<Aluno>{

    private String nome;

    private Integer numeroMatricula;

    private LocalDate dataNascimento;

    public Aluno(Integer numeroMatricula, String nome, LocalDate dataNascimento) {
        this.numeroMatricula = numeroMatricula;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    public Integer getNumeroMatricula() {
        return numeroMatricula;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    @Override
    public int compareTo(Aluno other) {
        Integer resultado = this.nome.toLowerCase().compareTo(other.nome.toLowerCase());
        if (resultado == 0){
            return  this.numeroMatricula.compareTo(other.numeroMatricula);
        } else {
            return resultado;
        }

    }

    @Override
    public String toString() {
        return "{ Matrícula: "+this.numeroMatricula +", Nome: " + this.nome + " }";
    }
}
