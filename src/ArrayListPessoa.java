
import java.io.IOException;
import static java.lang.System.exit;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


public class ArrayListPessoa {
    
  public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);
        boolean continueLoop = true; // determina se mais entradas são necessárias
        ArrayList<PessoasContato> lista = new ArrayList<>();
        Metodos metodo1 = new Metodos();

        do {

            try {
                while (true) {

                    Metodos.menu();
                    Integer opcao = scan.nextInt();

                    switch (opcao) {

                        case 1:
                            metodo1.Insercao();
                            break;
                        case 2:
                            metodo1.edicao();
                            break;
                        case 3:
                            metodo1.remocao();
                            break;
                        case 4:
                            metodo1.impressao();
                            break;
                        case 0:

                            exit(0);
                            break;

                        default:
                            System.out.println("\nOpcao Invalida");
                            break;

                    }

                }

            } catch (InputMismatchException inputMismatchException) {

                System.err.printf("%nException: %s%n", inputMismatchException);
                scan.nextLine(); // descarta entrada para o usuário tentar de novo
                System.out.printf("Voce Deve Digitar Numeros Inteiros.Escolha novamente uma opcao.%n");

            }

        } while (continueLoop);

    }
     
    
}
