// UTILIZANDO ABSTRACT 
import java.io.BufferedWriter;
import java.io.FileWriter;

class Funcionarios extends Pessoa {
private String cargo; 
private float salario; 


// MÉTODO CONSTRUTOR

public Funcionarios(String nome, int idade, String email, String sexo, String cargo, float salario) {
    super(nome, idade, email, sexo);
    this.cargo = cargo; 
    this.salario = salario; 
    
}

// métodos getters and setters

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }


@Override
public String exibeDados() {
    return "Nome: " + getNome() + "\nIdade " + getIdade() + 
    "\nEmail:  " + getEmail() + "\nSexo : "  + getSexo() + 
    "\nCargo:"  + getCargo() + "\nSalario : " + getSalario(); 
      
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
    
    
   
}
