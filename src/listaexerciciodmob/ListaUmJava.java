package listaexerciciodmob;

public class ListaUmJava extends AbstractListaExercicios{

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
        ListaUmJava lista1 = new ListaUmJava();
        lista1.getCallExercicio(menu, 0, "exercicio");
    }

    public void exercicio1() {
        System.out.println("Entre com o primeiro número");
        double n1 = entrada.nextInt();

        System.out.println("Entre com o segundo número");
        double n2 = entrada.nextInt();

        double media = (n1+n2)/2;

        System.out.println("RESULTADO:");
        System.out.println("Soma: "+ (n1+n2));
        System.out.println("Diferença: "+ (n1-n2));
        System.out.println("Produto: "+ (n1*n2));
        System.out.println("Média: "+ media);
    }

    public void exercicio2() {
        System.out.println("Digite a temperatura em graus Centígrados");
        double centigrados = entrada.nextDouble();

        double fahrenheit = (9 * centigrados + 160) / 5;
        System.out.println("RESULTADO:");
        System.out.println("Conversão em Fahrenheit: "+ fahrenheit);
    }

    public void exercicio3() {
        System.out.println("Digite o raio:");
        double raio = entrada.nextDouble();

        System.out.println("Digite a altura:");
        double altura = entrada.nextDouble();

        double volume = Math.PI * (raio * raio) * altura;
        System.out.println("RESULTADO:");
        System.out.println("Volume: "+volume);
    }

    public void exercicio4() {
        System.out.println("Entre com o primeiro número");
        float n1 = entrada.nextFloat();

        System.out.println("Entre com o segundo número");
        float n2 = entrada.nextFloat();

        float temp = n1;
        n1 = n2;
        n2 = temp;

        System.out.println("RESULTADO:");
        System.out.println("Número 1: "+ n1);
        System.out.println("Número 2: "+ n2);
    }

    public void exercicio5() {
        System.out.println("Entre com o número inteiro");
        float n = entrada.nextInt();

        System.out.println("RESULTADO:");
        System.out.println("Quadrado do número: "+ n*n);
    }
}