
public class Aluno {
	private String nome;
	private String matricula;
	private double nota1 , nota2 , nota3; //notas bimestrais 
	private double media;
	
	//construtor paramerizado
	
	
	public Aluno(String nome, String matricula, double nota1, double nota2, double nota3) {
		this.nome = nome;
		this.matricula = matricula;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
		calcularMedia();
	}
	//construtor default 

	public Aluno() {
		this.nome = "Sem nome ";
		this.matricula = "000";
		this.nota1 = 0.0;
		this.nota2 = 0.0;
		this.nota3 = 0.0;
	}
	public void lançarNotas(double n1, double n2 , double n3) {
		this.nota1 = n1;
		this.nota2 = n2;
		this.nota3 = n3;		
	}
	public void calcularMedia() {
		this.media = (nota1 + nota2 + nota3 ) / 3;
	}
	public String  verificarSituacao() {
		if (media >= 6.0) {
			return "APROVADO";
		} else if (media >= 4.0) {
			return "RECUPERACAO";
		} else {
			return "REPROVADO";
		}
	}
	
	//boletim do aluno
	public void exibirBoletim() {
		System.out.println("nome ;"+ nome);
		System.out.println("matricula ;" + matricula);
		System.out.println("nota1 "+ nota1);
		System.out.println("nota2 "+ nota2);
		System.out.println("nota3 "+ nota3);
		System.out.println("media " + media);
		System.out.println("status " +verificarSituacao());
	}
	
	//getters e setters automaticos pelo source 
	
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

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	public double getNota3() {
		return nota3;
	}

	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}

	public double getMedia() {
		return media;
	}

	public void setMedia(double media) {
		this.media = media;
	}
	
	
	
	
}
