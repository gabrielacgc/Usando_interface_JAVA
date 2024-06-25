
import java.util.ArrayList;

/* Associação é um relacionamento entre duas ou mais classes, em que uma classe usa objetos de outra classe como parte de suas operações. 
Esses objetos são normalmente passados para a classe que usa através de parâmetros de método ou variáveis de instância. 
A associação pode ser de dois tipos: unidirecional ou bidirecional. 
Na associação unidirecional, uma classe usa objetos de outra classe, mas a outra classe não usa objetos da primeira classe. 
Na associação bidirecional, as duas classes usam objetos um do outro. */

/* O QUE É ARRAY LIST? O ArrayList é uma classe Java que implementa uma lista. A diferença entre o ArrayList 
e um array tradicional é que o ArrayList é uma lista redimensionável, 
ou seja, ela não possui um tamanho fixo e é possível manipular seus elementos de forma dinâmica.
O ArrayList é uma implementação da interface List do Java e faz parte do pacote java.util.  */

/* O que é o Método Construtor?  */


/* O que é o atributo Final? torna o atributo da classe uma constante e, 
só pode ser inicializado uma única vez, ou diretamente na declaração da classe ou no método construtor. */

/*
* 
*/


class Curso {
    private String nome; 
    private String turno;
    private int semestre;
    private ArrayList<Aluno> alunos; 
    private Professor professor;
    
    

// MÉTODO CONSTRUTOR COM PARAMETRO 

    
// get nome    
    
    public String getNome() {
        return nome;
    }

// set nome

    public void setNome(String nome) {
        this.nome = nome;
    }


// get turno

public String getTurno() {
    return turno;
}

// set turno

public void setTurno(String turno) {
    this.turno = turno;
}

// get semestre

public int getSemestre() {
    return semestre;
}

// set semestre

public void setSemestre(int semestre) {
    this.semestre = semestre;
}

// get alunos 

public ArrayList<Aluno> getAlunos() {
    return alunos;
}

// set alunos

public void setAlunos(ArrayList<Aluno> alunos) {
    this.alunos = alunos;
}


// get professor

    public Professor getProfessor() {
        return professor;
    }

    // set professor

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
    
// método exibe dados curso  {
/*    public void exibeDadosCurso(String msg) {
        System.out.println(msg);
        System.out.println("Nome do Aluno: " + aluno.getNome() + "\nIdade " + aluno.getIdade() +  
        "\nEmail:  " + aluno.getEmail() + "\nSexo : "  + aluno.getSexo() +
        "\nMatricula:  " + aluno.getMatricula() + "\n" + "\n" + 
        
        "Nome do Professor: " + professor.getNome() + "\nIdade " + professor.getIdade()  +  
        "\nEmail:  " + professor.getEmail() + "\nSexo : "  + professor.getSexo() +
        "\nDisciplina:  " + professor.getDisciplina() + "\nSalario:  " + professor.getSalario() + "\n" + "\n" + */

    // criar um metodo mais simplificado para chamar as informacoes do curso/aluno e professor

    public String exibeDadosCurso() {
        return "Nome do Curso: " + nome +  "\nTurno: " + getTurno() + "\nQtdSemestre: " + getSemestre() + 
        "\nNome do Aluno: " + exibeAlunos() + 
        "\n \n" + 
        "\nProfessor: " + professor.exibeDados();
    }  

    
// Novo metodo
public String exibeAlunos() {
    String str = ""; 
    for (Aluno aluno : alunos) {
        str += "\n" + aluno.exibeDados(); 

    }
    return str; 
}



} // fim da classe curso 