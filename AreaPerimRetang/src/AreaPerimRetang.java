import java.util.Scanner;

public class AreaPerimRetang {
    public static void main(String[] args) throws Exception {
        // Declaração de variáveis do programa
        double lado1, lado2, perim, area;

        // Para utilizar a leitura de dados pelo teclado
        Scanner entrada = new Scanner(System.in);

        // {Entrada de dados}
        System.out.print("Digite o valor do primeiro lado: ");
        lado1 = Math.abs(entrada.nextDouble()); //garante Lado1 com valor positivo

        System.out.print("Digite o valor do segundo lado: ");
        lado2 = Math.abs(entrada.nextDouble()); //garante Lado2 com valor positivo

        System.out.println(); // Salta uma linha

        // {Processamento de dados}
        perim = 2 * lado1 + 2 * lado2; //fórmula do perímetro do retângulo
        area = lado1 * lado2;

        // {Saída de dados}
        System.out.println("Perímetro: " + perim);
        System.out.println("Área.....: " + area);

        entrada.close();
    }
}
