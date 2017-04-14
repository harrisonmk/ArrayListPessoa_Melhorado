
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Metodos {
    
   Scanner scan = new Scanner(System.in);
    ArrayList<PessoasContato> lista1 = new ArrayList<>();

    public static void menu() {

        System.out.println("\nDigite 1 para inserir seus dados:");
        System.out.println("Digite 2 para Editar um usuario da Lista");
        System.out.println("Digite 3 para remover um usuario da lista");
        System.out.println("Digite 4 para mostrar a lista:");
        System.out.println("Digite 0 para Sair.");
        System.out.print("Opcao: ");

    }

    public void Insercao() {

        System.out.print("\nDigite seu nome Completo: ");
        String nome1 = scan.nextLine();
        System.out.print("Digite seu Tel: ");
        String tel1 = scan.nextLine();

        PessoasContato pessoa1 = new PessoasContato();  // cria o objeto//      
        pessoa1.setNome(nome1);
        pessoa1.setTel(tel1);
        

        lista1.add(pessoa1); //adiciona o objeto dentro da lista//

    }

    void remocao() {

        /* System.out.println("\nDigite o nome da pessoa a ser removido");
	String k = scan.nextLine();
	
	PessoasContato aRemover = null;
	
	
for ( PessoasContato p : lista1 )
	{
		if (p.getNome().equals(k))
		{
			aRemover = p;
		}
	}
	String msg = lista1.remove(aRemover) ? "Usuario Removido" : "Usuario nao existe";
	System.out.println(msg);*/
        System.out.print("\nDigite o nome da pessoa a ser removido: ");
        String k = scan.nextLine();

        PessoasContato RemoverPessoa = null;

        for (int i = 0; i < lista1.size(); i++) {

            PessoasContato p = lista1.get(i);

            if (p.getNome().equals(k)) {

                RemoverPessoa = p;

            }

        }
        String msg = lista1.remove(RemoverPessoa) ? "Usuario Removido" : "Usuario nao existe";
        System.out.println("\n" + msg);
    }

    public void edicao() {

        System.out.print("\nDigite o nome da pessoa a ser editado: ");
        String k = scan.nextLine();

        PessoasContato EditarPessoa = null;
        String name;
        String tel;

        for (PessoasContato p : lista1) {

            if (p.getNome().equals(k)) {

                EditarPessoa = p;

                System.out.print("\nDigite seu nome Completo: ");
                name = scan.nextLine();
                System.out.print("Digite seu Tel: ");
                tel = scan.nextLine();

                EditarPessoa.setNome(name);
                EditarPessoa.setTel(tel);

            } else {
                EditarPessoa = null;
            }

        }

        String msg1 = (EditarPessoa != null) ? "Usuario Editado" : "Usuario Nao Existe na Lista";
        System.out.println("\n" + msg1);

    }

    public void impressao() throws IOException {

        Collections.sort(lista1); //Ordena os objetos por nome// 
        //for (int i = 0; i < lista1.size(); i++) {
        //  System.out.println(lista1.get(i));            
        //}

        try (FileWriter arq = new FileWriter("Contatos.txt")) {
            PrintWriter gravarArq = new PrintWriter(arq);

            for (int i = 0; i < lista1.size(); i++) {
                gravarArq.println("---------------------------------------------");
                gravarArq.println();
                gravarArq.println("  Usuario ");
                gravarArq.println();
                gravarArq.println("\n Nome: " + lista1.get(i).getNome());
                gravarArq.println("\n Tel: " + lista1.get(i).getTel());

                gravarArq.println("---------------------------------------------");
            }
        }

        if (lista1.isEmpty()) {

            System.out.println("\nLista Vazia");
        } else {

            for (PessoasContato p : lista1) {

                System.out.println(p);

            }
        }

    } 
    
    
}
