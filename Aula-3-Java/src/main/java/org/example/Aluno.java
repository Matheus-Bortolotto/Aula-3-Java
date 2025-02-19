package org.example;

public class Aluno {

    //O método calcularMediaSemestral recebe os parametros nota1, nota2, notaTrabalho e devolve a Média Semestral
    public double calcularMediaSemestralAluno(double nota1, double nota2, double notaTrabalho) {
        double mediaSemestral = ((nota1 * 0.4) + (nota2 * 0.4) + (notaTrabalho * 0.2));
        return mediaSemestral;
    }

    //O método validarNotaCorteExame recebe o parametro mediaSemestral e devolve a Nota de Corte do Exame
    public double validarNotaCorteExameAluno(double mediaSemestral) {
        double notaCorteExame = 10.0 - mediaSemestral;
        return notaCorteExame;
    }

    //O método calcularMediaExame recebe os parametros mediaSemestral e notaExame e devolve a Média do Exame
    public double calcularMediaExameAluno(double mediaSemestral, double notaExame)
    {
        double mediaExame = (mediaSemestral + notaExame) / 2;
        return mediaExame;
    }
}
