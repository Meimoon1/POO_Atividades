public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.nome = "Melissa";
        p1.sobrenome = "Matos";
        p1.idade = 23;

        Aluno a1 = new Aluno();
        a1.nome = "Jussara";
        a1.sobrenome = "Araújo";
        a1.idade = 22;
        a1.matricula = "1919929202";
        a1.turma = "A";
        a1.curso = "Física";

        Dados dados = new Dados();
        dados.adicionar(p1);
        dados.adicionar(a1);

        Pessoa p2 = new Pessoa();
        p2.nome = "Melissa";
        p2.sobrenome = "Matos";
        p2.idade = 23;

        System.out.println(dados.buscar(p2));
        dados.remover(p2);
        
        
        
        
    }
}
