import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

            //neste trecho o usuário digita os valores inteiros
            Scanner terminal = new Scanner(System.in);
            System.out.println("Digite um número inteiro: ");
            int parametroUm = terminal.nextInt();
            System.out.println("Digite outro número inteiro: ");
            int parametroDois = terminal.nextInt();

            try {
                contar(parametroUm, parametroDois);
            }
            catch (ParametrosInvalidosException exception){
                System.out.println("O segundo parâmetro deve ser maior que o primeiro");
            }

            terminal.close();
    }
    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        //validando valor do parâmetro
        if (parametroUm > parametroDois){
            throw new ParametrosInvalidosException();
        }

        int contagem = parametroDois - parametroUm;
        int contador;
        //neste for é impresso na tela a quantidade de números do intervalo entre os números digitados
        for (contador = 1; contador < contagem; contador++) {
            System.out.println("Imprimindo o número " + contador);
        }
    }
}

