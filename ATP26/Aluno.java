
public class Aluno extends Pessoa{
    public String matricula;
    public String turma;
    public String curso;

    @Override
    public boolean equals(Object obj) {
      Aluno a = (Aluno)obj;
      return(this.matricula == a.matricula &&  this.turma == a.turma && this.curso == a.curso);
    }

    @Override
    public String toString() {
        return "Matrícula: " + matricula + "\nTurma: " + turma + "\nCurso:" + curso + "\n";
    }
}
