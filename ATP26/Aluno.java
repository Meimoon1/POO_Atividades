
public class Aluno extends Pessoa{
    public String matricula;
    public String turma;
    public String curso;

    //só usa equals para string
    //tem que comparar todos os dados da filha e da mãe
    @Override
    public boolean equals(Object obj) {
      if(obj instanceof Aluno){
        Aluno outro = (Aluno)obj;
        // esse super.equals() não precisa repetir todas as comparações da mãe
        if(this.matricula.equals(outro.matricula)&& this.turma.equals(outro.turma) && this.curso.equals(outro.turma)&& super.equals(outro)){

        }
      }
      return false;
    }

    @Override
    public String toString() {   
        return super.toString() + "Matrícula: " + matricula + "\nTurma: " + turma + "\nCurso:" + curso + "\n";
    }
}
