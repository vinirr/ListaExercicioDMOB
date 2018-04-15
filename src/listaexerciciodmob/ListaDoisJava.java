package listaexerciciodmob;

import java.util.*;

public class ListaDoisJava extends AbstractListaExercicios{

    /**
     * String que será usada para gerar o menu
     */
    public static String menu = "" +
            "\n 1. Exercício 1" +
            "\n 2. Exercício 2" +
            "\n 3. Exercício 3" +
            "\n 4. Exercício 4" +
            "\n 5. Exercício 5" +
            "\n";

    public static void main(String[] args) {
        ListaDoisJava lista2 = new ListaDoisJava();
        lista2.getCallExercicio(menu, 0, "exercicio");
    }

    public void exercicio1() {
        System.out.println("Entre com o número a ser verificado");
        float num = entrada.nextInt();

        System.out.println("RESULTADO:");
        System.out.print(num > 0 ? "Número positivo e " : "Número negativo e ");
        System.out.print(num % 2 == 0 ? "par" : "ímpar");
    }

    public void exercicio2() {
        System.out.println("Informe o valor do primeiro lado do triângulo:");
        int lado1 = entrada.nextInt();

        System.out.println("Informe o valor do segundo lado do triângulo:");
        int lado2 = entrada.nextInt();

        System.out.println("Informe o valor do terceiro lado do triângulo:");
        int lado3 = entrada.nextInt();

        if(((lado1 + lado2) > lado3) && ((lado2 + lado3) > lado1) && ((lado3 + lado1) > lado2)){
            System.out.println("RESULTADO:");
            if(lado1 == lado2 && lado1 == lado3) System.out.println("Triâgulo equilátero");
            else if(lado1 == lado2 || lado2 == lado3 || lado1 == lado3) System.out.println("Triâgulo isóceles");
            else System.out.println("Triângulo escaleno");

        } else {
            System.out.println("Medidas inválidas para um triângulo");
        }
    }

    public void exercicio3() {
        System.out.println("Informe a primeira nota:");
        float n1 = entrada.nextFloat();
        System.out.println("Informe a segunda nota:");
        float n2 = entrada.nextFloat();
        System.out.println("Informe a terceira nota:");
        float n3 = entrada.nextFloat();

        System.out.println("RESULTADO:");
        System.out.println("Média: "+(n1 + n2 + n3)/3);
        System.out.println("Maior nota: " + (n1 > n2 && n1 > n3 ? n1 : n2 > n1 && n2 > n3 ? n2 : n3));
    }

    public void exercicio4() {
        System.out.println("Informe o primeiro valor:");
        float n1 = entrada.nextFloat();
        System.out.println("Informe o segundo valor:");
        float n2 = entrada.nextFloat();
        System.out.println("Informe o terceiro valor:");
        float n3 = entrada.nextFloat();

        entrada.nextLine();
        System.out.println("Informe o código (c = crecente | d = decrescente):");
        String codigo = entrada.nextLine();

        ArrayList<Float> list = new ArrayList<>();
        list.add(n1);
        list.add(n2);
        list.add(n3);

        Collections.sort(list);

        System.out.println("RESULTADO:");
        switch (codigo) {
            case "c":
                System.out.println("Ordem crescente: ");
                for (Float item : list) {
                    System.out.print(item +", ");
                }
                break;
            case "d":
                System.out.println("Ordem decrescente: ");
                Collections.reverse(list);
                for (Float item : list) {
                    System.out.print(item +", ");
                }
                break;
            default:
                System.out.println("Código inválido");
                break;
        }
    }

    public void exercicio5() {
        System.out.println("Informe o primeiro valor:");
        float n1 = entrada.nextFloat();
        System.out.println("Informe o segundo valor:");
        float n2 = entrada.nextFloat();
        System.out.println("Informe o terceiro valor:");
        float n3 = entrada.nextFloat();

        entrada.nextLine();
        System.out.println("Informe o opção (1 = média | 2 = soma | 3 = multiplicação):");
        int opcao = entrada.nextInt();

        System.out.println("RESULTADO:");
        switch (opcao) {
            case 1:
                System.out.println("Média: "+ (n1+n2+n3)/3);
                break;
            case 2:
                System.out.println("Soma: "+ (n1+n2+n3));
                break;
            case 3:
                System.out.println("Multiplicação: "+ (n1*n2*n3));
                break;
            default:
                System.out.println("Opção inválida");
        }
    }
}