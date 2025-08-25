class Aluno {
    private String nome;
    private int idade;
    private double nota;

    public Aluno(String nome, int idade, double nota) {
        this.nome = nome;
        this.idade = idade;
        this.nota = nota;
    }

    public void exibirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Nota: " + nota);
    }

    public boolean aprovado() {
        return nota >= 6.0;
    }
}

public class Prog02_POO {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Maria", 20, 8.5);
        Aluno aluno2 = new Aluno("João", 22, 5.0);

        System.out.println("=== Dados dos Alunos ===");
        aluno1.exibirInfo();
        System.out.println("Situação: " + (aluno1.aprovado() ? "Aprovado" : "Reprovado"));

        System.out.println();
        aluno2.exibirInfo();
        System.out.println("Situação: " + (aluno2.aprovado() ? "Aprovado" : "Reprovado"));
    }
}
