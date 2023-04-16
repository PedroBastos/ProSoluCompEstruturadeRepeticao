//Faça um programa que imprima todos os resultados da tabuada de 5. Utilize laço while e outras estruturas que julgar necessárias.

public class Main {
    public static void main(String[] args) {
        int num = 5;
        int repetir = 1;

        while(repetir <= 10 ){
           System.out.println("5 x " + repetir + " = " + (num * repetir));
           repetir++;
           //PARA REPETIR SEMPRE TEM QUE SER A VARIAVEL DO WHILE
        }
    }
