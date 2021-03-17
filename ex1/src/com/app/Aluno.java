package com.app;

import java.util.ArrayList;
import java.util.Date;

public class Aluno {
    private int codigo;

    private String nome;
    private String matricula;
    private Date dataMatricula;
    private ArrayList<Double> notas;
    private double media;

    public Aluno(int codigo, String nome, String matricula, Date dataMatricula, ArrayList<Double> notas, double media) {
        this.codigo = codigo;
        this.nome = nome;
        this.matricula = matricula;
        this.dataMatricula = dataMatricula;
        this.notas = notas;
        this.media = media;
    }

    public Aluno() {
        notas = new ArrayList<>();
        dataMatricula = new Date();
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Date getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(Date dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public ArrayList<Double> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Double> notas) {
        this.notas = notas;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public void addNota(double n) {
        this.notas.add(n);
    }

    public void media() {
        for (Double nota : this.notas)
            media += nota;
        media /= this.notas.size();
    }

    public void printObject() {
        System.out.println("Dados do Aluno");
        System.out.println(
                "Objeto Aluno {" + "\n" +
                "codigo: " + this.codigo +
                "nome: " + this.nome +
                "matricula: " + this.matricula +
                "matricula: " + this.matricula +
                "notas: " + this.notas +
                "media: " + this.media +
                "}"
        );
    }

}
