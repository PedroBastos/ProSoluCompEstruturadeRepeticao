public class Main {
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite quantos numeros serão digitados para ser feito a soma: ");
        int quantidade = ler.nextInt(); //ENTRADA DE QUANTOS NUMEROS SERÃO REPITIDOS
        int f = 0; //ATÉ AQUI 0 NUMEROS FORAM LIDOS
        int soma = 0; //SOMA ZERO AINDA SEM NENHUM VALOR

        while (f < quantidade){ //SE QUANTAS VEZES PRECISAR REPETIR VAR ""QUANTIDADE" FOR MENOR QUE "f", CONTINUAR EXECUTANDO.
            System.out.println("Digite o próximo número:");
            int numero = ler.nextInt();
            soma += numero;
            f++;
        }
            System.out.println("A soma dos valores é " + soma);
    }
}
