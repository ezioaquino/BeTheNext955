package aluno;

import java.time.LocalDate;

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
        return this.nome.compareTo(other.nome);
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome;
    }
}
