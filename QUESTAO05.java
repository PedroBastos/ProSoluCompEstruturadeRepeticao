//Faça um programa que imprima todos os resultados das tabuadas de 1, 2, 3, 4,5, 6, 7, 8, 9 e 10. Utilize laço while e outras estruturas que julgar necessárias.
public class Main {
    public static void main(String[]args){
        int num =1;
    while (num <=10) {
        int repetir = 1;
        System.out.print("A tabuada do " + num + ": \n");
        while (repetir <= 10) {
            System.out.println(num + " X " + repetir + " = " + (num * repetir));
            repetir++;
        }
        System.out.println();
        num++;
    }
    }
}
