
public class GerenciadorTurma {
	private String nomeTurma;
	private  Aluno[]  alunos;
	private int contador;
	//construtor parametrizado
	public GerenciadorTurma(String nomeTurma ) {
		this.nomeTurma = nomeTurma;
		this.alunos = new Aluno[4];
		this.contador = 0;
	}	
	//inscrição de aluno
	public void cadastrarAluno(Aluno aluno) {
		if (contador < alunos.length) {
		alunos[contador] = aluno;
		contador++;
		}else {
			System.out.println("Turma com capacidade máxima atingida.");
	}
	}
	//emitir boletins
	public void emitirBoletins() {
		System.out.println("----Boletins da Turma - "+ nomeTurma +"----");
		for (int i=0; i < contador; i++) {
			alunos[i].exibirBoletim();
			System.out.println();
		}
	}
	//contador aprovados
	public int contarAprovados() {
		int aprovados = 0;
		for(int i = 0; i < contador; i++ ) {
			if(alunos[i].verificarSituacao().equals("APROVADO")) {
				aprovados++;
			}			
		} return aprovados;	
	}
	//exibir maior media 
	public void exibirMaiorMedia() {
		if (contador == 0) {
			System.out.println("Nenhum aluno cadastrado na turma ");
			return;
		}
		
		Aluno alunoMaiorMedia = alunos[0] ;
		for (int i = 1; i < contador; i++) {
			if (alunos[i].getMedia() > alunoMaiorMedia.getMedia()) {
				alunoMaiorMedia = alunos[i];
			}
			
		}
		System.out.println("Aluno com maior media ; ");
		System.out.println("Nome; "+alunoMaiorMedia.getNome());
		System.out.printf("Media; %.2f%n", alunoMaiorMedia.getMedia() );
	}
	public int getContador() {
	    return contador;
	}

	public Aluno getAluno(int indice) {
	    return alunos[indice];
	}

}




