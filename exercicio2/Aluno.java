public class Aluno{
      String nome, numeroMatricula;
      int idade;

      public void imprimirDadosCadastrais(){
                System.out.println("Nome: " + this.nome + " - Idade: " + this.idade +
                                          " - Numero Matricula: " + this.numeroMatricula);
      }
      public static void main(String [] args){
          Aluno sir1 = new Aluno();
          Aluno sir2 = new Aluno();
          Aluno sir3 = new Aluno();
          Aluno sir4 = new Aluno();

          sir1.nome = "Carlos";
          sir1.idade = 3;
          sir1.numeroMatricula = "10";
          sir2.nome = "Pedro";
          sir2.idade = 6;
          sir2.numeroMatricula = "15";
          sir3.nome = "Bruna";
          sir3.idade = 3;
          sir3.numeroMatricula = "11";
          sir4.nome = "Maria";
          sir4.idade = 11;
          sir4.numeroMatricula = "16";
          sir1.imprimirDadosCadastrais();
          sir2.imprimirDadosCadastrais();
          sir3.imprimirDadosCadastrais();
          sir4.imprimirDadosCadastrais();
      }
  }
