

public class Programa {
    public static void main(String[] args) {
    System.out.println("*-----* PROGRAMA DE MATRICULA  *----* ");
    System.out.println("*======= FACULDADE FAFIFOFO  =======* ");
    
    
// instanciar objeto da classe aluno
 /*    Aluno aluno = new Aluno();
    aluno.setNome("Ana Booleana Amaral"); 
    aluno.setSexo("Feminino"); 
    aluno.setIdade(25);
    aluno.atualizarCurso("Ciencia de Dados");
    aluno.setMatricula(179904001);
    aluno.setEmail("ana.aluna@ceub.com");

    Aluno alunos1 = new Aluno();
    alunos1.setNome("Felipe Figueiredo Martins"); 
    alunos1.setSexo("Masculino"); 
    alunos1.setIdade(29);
    alunos1.atualizarCurso("Matematica");
    alunos1.setMatricula(199904001);
    alunos1.setEmail("felipefigueiredo.aluna@ceub.com"); */


/*   ArrayList alunos = new ArrayList<Aluno>(); 
alunos.add(aluno);
alunos.add(alunos1); */


// apresentar informações na tela
    
  /*   System.out.println("Nome da Aluna: " + aluno.getNome());
    System.out.println("Curso: " + aluno.getCurso());
    System.out.println("Sexo: " + aluno.getSexo());
    System.out.println("Matricula:  " + aluno.getMatricula());
    System.out.println("Email:  " + aluno.getEmail()); */
  
// criar array para aparecer informações dos alunos 

// instanciar objeto da classe professor  
 
  /*   Professor professor = new Professor(); 
    professor.setNome("Claudio Moraes Brandão");
    professor.setIdade(45);
    professor.setSexo("Masculino");
    professor.setDisciplina("Estrutura de Dados");
    professor.setSalario(2500);
    professor.setEmail("claudio.prof@ceub.com");*/ 
    

// apresentar informações da classe professor na tela

    /*  System.out.println("Nome do Professor:  " + professor.getNome());
    //System.out.println("Sexo:  " + professor.getSexo());
    System.out.println("Disciplina:  " + professor.getDisciplina());
    System.out.println("Email:  " + professor.getEmail());
    System.out.println("Salario:    " + professor.getSalario()); */
   
   //  System.out.println("** Dados do Professor ** ");
   //  String dados = professor.exibeDados();
   //  System.out.println(dados);
   //  System.out.println("");

   //  System.out.println("** Dados do Aluno ** ");
   //  String dadosAluno = aluno.exibeDados(); 
   //  System.out.println(dadosAluno);

    
   //  professor.exibeDados(msg);
    // aluno.exibeDados(msg); 
    

// instanciar objeto da classe Curso 
/*   Curso curso = new Curso(); 
curso.setNome("Matematica");
curso.setAlunos(alunos); 
curso.setProfessor(professor);
curso.setTurno("Noturno");
curso.setSemestre(8);

//curso.exibeDadosCurso(msg); 

System.out.println(curso.exibeDadosCurso()); */


// instanciando classe aluno    
Aluno aluno = 
new Aluno("Mariah", 19, "mariah@ucc.com", "F", 18997, "Fisica"); 

System.out.println(aluno.exibeDados());

// instanciando classe professor

Professor professor = new Professor("Januario Campos", 18, "januario@ucc.com", "M", 
"Estrutura de Dados", 2500); 

System.out.println(professor.exibeDados());

// instanciando classe funcionarios

Funcionarios funcionarios = 
new Funcionarios("Marta Sousa", 39, "marta@ucc.com", "F", "Coordenadora", 5800); 

System.out.println(funcionarios.exibeDados());


// CHAMANDO O MÉTODO ARMAZENAR 

aluno.armazenar();
funcionarios.armazenar();
professor.armazenar(); 


} // fim da classe main 
    
   



} // fim da classe Programa



/*     try {
        salvarArquivo(); 
    } catch (IOException e) {
    e.printStackTrace();
}


    } // fim do public static

public static void salvarArquivo(Pessoa armazena) throws IOException { 
    String str = armazena.exibeDados(); 
    BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt")); 
    writer.writer(str); 
    Writer.close(); */