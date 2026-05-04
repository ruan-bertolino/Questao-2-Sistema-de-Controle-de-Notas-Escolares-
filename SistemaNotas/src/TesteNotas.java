
import java.util.Scanner;

public class TesteNotas {
	public  static void main(String[]args) {
		//scanner
		Scanner sc = new Scanner(System.in);
		//criando turma 
		GerenciadorTurma  turma1 = new GerenciadorTurma("3° Ano A");
		//alunos
		Aluno aluno1 = new Aluno("Ruan", "001", 7.0, 6.5, 8.0);
		Aluno aluno2 = new Aluno("Maria", "002", 5.0, 4.5, 6.0);
        Aluno aluno3 = new Aluno();
        
        aluno3.setNome("João");
        aluno3.setMatricula("003");
        aluno3.lançarNotas(9.0, 8.5, 7.5);
        aluno3.calcularMedia(); 
        
        // Cadastrando os alunos na turma
        turma1.cadastrarAluno(aluno1);
        turma1.cadastrarAluno(aluno2);
        turma1.cadastrarAluno(aluno3);
        
        int opcao;
        do {
            System.out.println("===== SISTEMA DE NOTAS – 3º Ano A =====");
            System.out.println("1 – Emitir boletins de todos os alunos");
            System.out.println("2 – Exibir quantidade de alunos aprovados");
            System.out.println("3 – Exibir aluno com maior média");
            System.out.println("4 – Lançar notas para um aluno pelo índice");
            System.out.println("0 – Sair do sistema");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    turma1.emitirBoletins();
                    break;
                case 2:
                    System.out.println("Quantidade de aprovados: " + turma1.contarAprovados());
                    break;
                case 3:
                    turma1.exibirMaiorMedia();
                    break;
                case 4:
                    System.out.print("Digite o índice do aluno (0 a " + (turma1.getContador() - 1) + "): ");
                    int indice = sc.nextInt();
                    if (indice >= 0 && indice < turma1.getContador()) {
                        System.out.print("Digite as 3 notas: ");
                        double n1 = sc.nextDouble();
                        double n2 = sc.nextDouble();
                        double n3 = sc.nextDouble();
                        turma1.getAluno(indice).lançarNotas(n1, n2, n3);
                        turma1.getAluno(indice).calcularMedia();
                        System.out.println("Notas lançadas com sucesso!");
                        System.out.println("Boletim atualizado:");
                        turma1.getAluno(indice).exibirBoletim();
                    } else {
                        System.out.println("Índice inválido.");
                    }
                    break;
                case 0:
                    System.out.println("Sistema encerrado...");
                    break;
                default:
                    System.out.println("Opção inválida.Tente novamente.");
            }
        } while (opcao != 0);

        sc.close();
	}
}
