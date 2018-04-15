package listaexerciciodmob;

public class ListaTresJava extends AbstractListaExercicios {

    /**
     * String que será usada para gerar o menu
     */
    public static String menu = "Escolha o exercício abaixo:\n" +
            "\n   1. Exercício 1" +
            "     2. Exercício 2" +
            "\n   3. Exercício 3" +
            "     4. Exercício 4" +
            "\n   5. Exercício 5" +
            "     6. Exercício 6" +
            "\n   7. Exercício 7" +
            "     8. Exercício 8" +
            "\n   9. Exercício 9" +
            "     10. Exercício 10" +
            "\n  ";

    public static void main(String[] args) {
        ListaTresJava lista3 = new ListaTresJava();
        lista3.getCallExercicio(menu, 0, "exercicio");
    }
    
    public void exercicio1() {
        int valores[] = new int[15];
        
        int maior = 0;
        int menor = 0;
        
        for(int i = 0; i < 15; i++){
            System.out.println("Digite o "+(i+1)+"o número");
            valores[i] = entrada.nextInt();

            if(i == 0){
                menor = valores[i];
                maior = valores[i];
                continue;
            }
            
            menor = valores[i] < menor ? valores[i] : menor;
            maior = valores[i] > maior ? valores[i] : maior;
        }
        
        System.out.println("Maior valor: "+maior);
        System.out.println("Menor valor: "+menor);
    }
    
    public void exercicio2() {
        int tabuada = 0;
        
        while(tabuada <= 9){
            for(int i = 0; i < 10; i++){
                System.out.println(tabuada+" * "+i+" = "+tabuada * i);
            }
            tabuada++;
            System.out.println("---------");
        }
    }
    
    public void exercicio3() {
        int primeiro = 1;
        int segundo = 1;
        double soma = 0;
        
        while(primeiro != 101){
            soma += primeiro / segundo;
            primeiro += 2;
            segundo +=1;
        }
        
        System.out.println("RESULTADO: "+soma);
    }
    
    public void exercicio4() {
        for(int i = 1000; i <= 1999; i++){
            
            if(i % 11 == 5) System.out.println("Número encontrado: "+i);
        }
    }
    
    public void exercicio5() {
        int countPares = 0;
        int countImpares = 0;

        System.out.println("Insira um número: ");
        int numeroInserido = entrada.nextInt();

        while(numeroInserido <= 1000){
            if(numeroInserido%2==0){
                countPares+=numeroInserido;
            } else {
                countImpares+=numeroInserido;
            }

            System.out.println("Insira um número: ");
            numeroInserido = entrada.nextInt();
        }
        
        System.out.println("Soma dos pares: "+countPares);
        System.out.println("Soma dos ímpares: "+countImpares);
    }
    
    public void exercicio6() {

        while(true) {
            double conjunto[] = new double[3];
            double ordem = 0;
            for(int i = 0; i < 3; i++){
                System.out.println("Número "+(i+1)+" do conjunto:");
                conjunto[i] = entrada.nextDouble();
                if(i == 0){
                    ordem = conjunto[i];
                    continue;
                }
                if(conjunto[i] <= ordem) getCallExercicio(menu, 0, "exercicio");
            }
            
            double soma = 0;
            double produto = 0;
            
            for(int i =0; i<conjunto.length;i++) {
                soma += conjunto[i];
                
                if(i == 0){
                    produto = soma;
                    continue;
                }
                produto *= conjunto[i];
            }
            double media = soma / conjunto.length;
            
            System.out.println("Soma: "+soma);
            System.out.println("Produto: "+produto);
            System.out.println("Média: "+media);
        }
    }
    
    public void exercicio7(){
        double medias[] = new double[10];
        double maior = 0;
        double menor = 0;
        double totalNotas = 0;
        
        for(int i = 0; i < medias.length; i++){
            System.out.println("Insira a média:");
            medias[i] = entrada.nextDouble();

            if(medias[i] < 0) break;

            if(i == 0) {
                maior = medias[i];
                menor = medias[i];
                totalNotas += medias[i];
                continue;
            }

            totalNotas += medias[i];
            maior = medias[i] > maior ? medias[i] : maior;
            menor = medias[i] < menor ? medias[i] : menor;
        }

        System.out.println("Maior media: "+maior);
        System.out.println("Menor media: "+menor);
        System.out.println("Maior da turma: "+(totalNotas / medias.length));
    }

    public void exercicio8(){
        System.out.println("Insira um número n:");
        int n = entrada.nextInt();


        int countPares = 0;
        int countImpares = 0;
        int i = 1;

        System.out.println("Primeiros "+n+" números pares:");
        while (countPares < n) {
            if(i%2==0){
                countPares++;
                System.out.print(i+" ");
            }
            i++;
        }

        int b = 1;
        System.out.println("\nPrimeiros "+n+" números ímpares:");
        while (countImpares < n) {
            if(b%2 != 0){
                countImpares++;
                System.out.print(b +" ");
            }
            b++;
        }
    }

    public void exercicio9(){
        System.out.println("Insira um número para verificar se é primo:");
        int num = entrada.nextInt();

        System.out.println(verificaNumeroPrimo(num) ? "É primo" : "Não é primo");
    }

    public void exercicio10(){
        // Recebendo o número limite
        System.out.println("Insira o número limite para listar os números primos:");
        int limite = entrada.nextInt();

        int countNumeros = 0;

        // Verificando se cada número da iteração é primo, caso sim, soma no contador
        for(int i = 1; countNumeros < limite; i++){

            // Chama o método que verifica se o número atual na iteração é primo
            if(verificaNumeroPrimo(i)) {
                System.out.println(i);
                countNumeros++;
            }
        }
    }


    private boolean verificaNumeroPrimo(int num) {
        // 1 não é um número primo, porque ele tem apenas um divisor que é ele mesmo.

        // se um número primo é divisível apenas por 1 e ele mesmo, então pode-se considerar que para ser primo
        // o número tem 2 divosores

        // Inicializando o contador de divisores
        int qtdDivisores = 0;

        // Percorre todos os número até o número passado, e divido o número pelo número atual da iteração
        for(int i = 1; i <= num; i++) {
            // Se o número parâmetro dividido pelo número atual da iteração sobra 0, incremento o contador de divisores
            if(num % i == 0) qtdDivisores++;
        }

        // Retorna o booleano, true = primo
        return qtdDivisores == 2;
    }
}
