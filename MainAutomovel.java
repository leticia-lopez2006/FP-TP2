

public class MainAutomovel {

    // Metodo principal
    public static void main(String[] args) {

        // Cria um objeto da classe Automovel com matrícula, marca e cilindrada
        Automovel a1 = new Automovel("11-11-AA", "Toyota", 1400);

        // Imprime a representação em string do objeto a1
        System.out.println(a1.toString());

        // Imprime a matrícula do automóvel a1
        System.out.println(a1.getMatricula());

        // Imprime o número total de automóveis criados até agora
        System.out.println(Automovel.getTotalAutomoveis());

        // Cria um segundo objeto Automovel, apenas com matrícula e marca
        Automovel a2 = new Automovel("22-22-BB","Fiat");

        // Imprime a representação em string do objeto a2
        System.out.println(a2.toString());

        // Define a cilindrada do automóvel a2 para 1800
        a2.setCilindrada(1800);

        // Imprime novamente a representação de a2 (agora com a nova cilindrada)
        System.out.println(a2.toString());

        // Imprime o número total de automóveis criados (deve ter aumentado)
        System.out.println(Automovel.getTotalAutomoveis());

        // Calcula e imprime a diferença de cilindrada entre a1 e a2
        System.out.println(a1.calcularDiferencaCilindrada(a2));

        // Verifica se a cilindrada de a1 é maior que a de a2 e imprime o resultado
        System.out.println(a1.isCilindradaMaior(a2));

        // Verifica se a cilindrada de a1 é maior que 2000 e imprime o resultado
        System.out.println(a1.isCilindradaMaior(2000));
    }
}

