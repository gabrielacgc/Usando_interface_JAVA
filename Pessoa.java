
abstract public class Pessoa implements Exibivel, Armazenavel {
    private String nome; 
    private int idade; 
    private String email; 
    private String sexo; 


// METODO CONSTRUTOR 
public Pessoa(String nome, int idade, String email, String sexo) {
    this.nome = nome;
    this.idade = idade; 
    this.email = email;
    this.sexo = sexo;  
}



// MÉTODO ABSTRATO DA CLASSE PESSOA 
// public abstract String exibeDados(); 


// método da classe Pessoa (ações)
// public String exibeDados() {
//     return "Nome: " + nome + "\nIdade " + idade +  "\nEmail:  " + email + "\nSexo : "  + sexo;

// }

// get nome

    public String getNome() {
        return nome;
    }

// set nome

    public void setNome(String nome) {
        this.nome = nome;
    }

// get idade

    public int getIdade() {
        return idade;
    }

// set idade

    public void setIdade(int idade) {
        this.idade = idade;
    }

// get email

    public String getEmail() {
        return email;
    }

// set email 

    public void setEmail(String email) {
        this.email = email;
    }

// get sexo

    public String getSexo() {
        return sexo;
    }

// set sexo

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }




} // fim da classe pessoa