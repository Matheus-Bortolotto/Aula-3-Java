package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        //Passo 1 - Realizar a Entrada de Notas utilizando a classe Scanner
        double retornoNota1 = realizarEntrada("Digite a primeira nota: ");
        double retornoNota2 = realizarEntrada("Digite a segunda nota: ");
        double retornoNotaTrabalho = realizarEntrada("Digite a nota do trabalho: ");

        //Passo 2 - Efetuar instância de objeto aluno
        Aluno aluno = new Aluno();

        //Passo 3 - Com as Nota1, Nota2 e Nota do Trabalho, qualquer Média Semestral
        double retornoMediaSemestral = aluno.calcularMediaSemestralAluno(retornoNota1, retornoNota2, retornoNotaTrabalho);

        //Passo 4 - Verificar se o aluno(a) foi aprovado(a) ou reprovado(a) com a Média Semestral >= 7
        //Desvio Condicional Composto (if/else)
        if (retornoMediaSemestral >= 7){
            System.out.println("Aluno(a) aprovado(a) com média: " + retornoMediaSemestral);
        }else{
            System.out.println("Aluno(a) deverá realizar exame. Sua média: " + retornoMediaSemestral);

            //Os passos 5, 6, 7 somente serão executados caso o aluno(a) não atingirem a média semestral
            //Passo 5 - Verificar nota de corte que o aliuno(a) precisa tirar na prova exame
            double retornoValidacaoNotaCorteExame = aluno.validarNotaCorteExameAluno(retornoMediaSemestral);
            System.out.println("Sua nota de corte no exame é: " + retornoValidacaoNotaCorteExame);

            //Passo 6 - Realizar input da nota do exame
            double retornoNotaExame = realizarEntrada("Digite a nota do exame: ");

            //Passo 7 - Realizar cálculo da média Exame (ME = (MS + NE) / 2)
            double retornoMediaExame = aluno.calcularMediaExameAluno(retornoMediaSemestral, retornoNotaExame);

            //Passo 8 - Verificar se o aluno(a) foi aprovado(a) ou reprovado(a) com a Média Exame >= 5
            //Desvio Condicional Composto (if/else)
            if(retornoMediaExame >= 5){
                System.out.println("Aluno(a) aprovado(a). Sua média final é: " + retornoMediaExame);
            }else{
                System.out.println("Aluno(a) reprovado(a). Sua média final é: " + retornoMediaExame);
            }
        }
    }

    //O método realizarEntrada ao ser acionado deverá passar como parametro notaInput
    private static double realizarEntrada(String notaInput){

        //Efetuar instância de objeto Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.print(notaInput);
        double nota = scanner.nextDouble();
        scanner.close();

        return nota;
    }
}