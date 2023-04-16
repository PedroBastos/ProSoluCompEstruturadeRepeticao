/*7. Faça um programa que apresente o menu abaixo e pare de apresenta-lo quando
o usuário digitar a opção S.
“N. Novo arquivo
A. Abrir arquivo
F. Fechar arquivo
S. Sair”
Quando o usuário escolher N exibir “novo arquivo criado com sucesso!”,
quando o usuário escolher A exibir “Abrindo arquivo!”, quando o usuário
escolher F exibir “Arquivo fechado com sucesso!” e quando o usuário escolher
S exibir “Obrigado por utilizar o sistema!”.
Obs:Utilize laço while e outras estruturas que julgar necessárias*/

public class Main {
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);
        char opcao = ('\0');                    //ESTA STRING APRESENTA NUMERO NULO

       while (opcao != 'S'){
           System.out.println("N. Novo Arquivo");
           System.out.println("A. Abrir Arquivo");
           System.out.println("F. Fechar Arquivo");
           System.out.println("S. Sair");
           opcao = ler.next().charAt(0);

       switch (opcao){
           case 'N':
               System.out.println("Novo arquivo criado com sucesso.");
               break;
           case 'A':
               System.out.println("Abrindo arquivo");
               break;
           case 'F':
               System.out.println("Arquivo fechado com sucesso!");
               break;
           case 'S':
               System.out.println("Obrigado por utilizar nosso sistema! ;)");
               break;
           default:
               System.out.println("Opção inválida! Tente novamente.");
       }
       break;
       }
    }
}
