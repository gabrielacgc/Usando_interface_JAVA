import java.io.BufferedWriter;
import java.io.FileWriter;


class Professor extends Pessoa {

private String disciplina; 
private float salario; 


// MÉTODO CONSTRUTOR 
public Professor(String nome, int idade, String email, String sexo,String disciplina, float salario) {
super(nome, idade, email, sexo);
this.disciplina = disciplina; 
this.salario = salario; 

}

// ATRIBUTOS DE CLASSE 
// public final static int QUANTIDADE_CURSO_MATRICULADO = 2; 


// método da classe professor 
public void cadastroAluno() {

}

// get disciplina

    public String getDisciplina() {
        return disciplina;
    }

// set disciplina

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

// get salario

    public float getSalario() {
        return salario;
    }

// set salario 

    public void setSalario(float salario) {
        this.salario = salario;
    }

// Sobrescrever o método --> utilizando poliformismo

 @Override
public String exibeDados() {
    return "Nome: " + getNome() + "\nIdade " + getIdade()  +  
    "\nEmail:  " + getEmail() + "\nSexo : "  + getSexo() +
    "\nDisciplina:  " + getDisciplina() + "\nSalario:  " + salario;

}
// Sobrecarga de método 
public void exibeDados(String msg) {
    System.out.println(msg);
    System.out.println("Nome: " + getNome() + "\nIdade " + getIdade()  +  
    "\nEmail:  " + getEmail() + "\nSexo : "  + getSexo() +
    "\nDisciplina:  " + getDisciplina() + "\nSalario:  " + salario); 
    System.out.println(" ");
    
}

// METODO STATIC da CLASSE

public static String exibeMensagemPadrao() {
    return "Mensagem Padrão"; 
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
    


// quando utilizar o atributo de classe não é necessario instanciar o objeto 
// quando utlizar o metodo static da classe não é necessario instanciar o objeto 
 



} // fim da classe Professor