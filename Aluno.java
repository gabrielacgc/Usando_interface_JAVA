/* O super() é um método especial que chama o construtor do método de onde você herdou a classe. 
Ou seja, é uma forma de aproveitar o que já foi estabelecido como um padrão para instanciar um objeto novo. */


import java.io.BufferedWriter;
import java.io.FileWriter;


class Aluno extends Pessoa {
    private int matricula; 
    private String curso; 



// MÉTODO CONSTRUTOR sem PARAMETRO 
// public Aluno() { 
//     super("Juvenal", 23, "juvenal@ucc.com", "M"); 
//     this.matricula = 0; 
//     this.curso = ""; 
//    }

// MÉTODO CONSTRUTOR com PARAMETRO 
public  Aluno(String nome, int idade, String email, String sexo, int matricula, String curso) {
    super(nome, idade, email, sexo); 
    this.matricula = matricula; 
    this.curso = curso; 
}





// método da classe aluno (ações)    


public void atualizarCurso(String novoCurso) {
     this.curso = novoCurso; 
}

public void apagaMatricula() {
    this.matricula = 0; 
}



//--------------- GET AND SETTERS ---------------------  //

// get Matricula

    public int getMatricula() {
        return matricula;
    }

// set matricula

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

// get curso

    public String getCurso() {
        return curso;
    }


    // sobrescrita - poliformismo 
    @Override
    public String exibeDados() {
        return "Nome: " + getNome() + "\nIdade " + getIdade() +  
        "\nEmail:  " + getEmail() + "\nSexo : "  + getSexo() +
        "\nMatricula:  " + getMatricula() + "\nCurso:  " + curso  ;
    
    }

// simplificação do metodo aluno 

    public String exibeDadosSimplificado() {
        return "Nome do Aluno" + getNome() + "\nMatricula : " + matricula; 
    }

    // sobrecarga
    
    public void exibeDados(String msg) {
        System.out.println(msg);
        System.out.println("Nome: " + getNome() + "\nIdade " + getIdade() +  
        "\nEmail:  " + getEmail() + "\nSexo : "  + getSexo() +
        "\nMatricula:  " + getMatricula() + "\nCurso:  " + curso);
        System.out.println(" ");
    }


    @Override
    public boolean armazenar() {
        String str = this.exibeDados();
        try {
            BufferedWriter writer =
            new BufferedWriter(new FileWriter(getNome() + ".txt"));    
            writer.write(str);    
            writer.close();   
            return true;   
        } catch (Exception e) {
            return false;
        }
    }
        

    




} // fim da classe Pessoa