
public class Automovel {

    private String matricula;
    private String marca;
    private int cilindrada;

    private static final String MATRICULA_POR_OMISSAO = "sem matrícula";
    private static final String MARCA_POR_OMISSAO = "sem marca";
    private static final int CILINDRADA_POR_OMISSAO = 0;

    private static int totalAutomoveis = 0;

    /* Criação de um construtor, que tem o mesmo nome que a classe (todos os contrutores têm de ter a mesma aparência) */
    /* Neste csao devem existir 4 construtores, um vazio, um cheio, um com string e um com int */
    public Automovel() {
        matricula = MATRICULA_POR_OMISSAO;
        marca = MARCA_POR_OMISSAO;
        cilindrada = CILINDRADA_POR_OMISSAO;
        totalAutomoveis++;
    }

    public Automovel(String matricula, String marca, int cilindrada) {
        this.matricula = matricula;
        this.marca = marca;
        this.cilindrada = cilindrada;
        totalAutomoveis++;
    }

    public Automovel(String matricula, String marca) {
        this.matricula = matricula;
        this.marca = marca;
        cilindrada = CILINDRADA_POR_OMISSAO;
        totalAutomoveis++;
    }

    public Automovel(String marca, int cilindrada) {
        matricula = MATRICULA_POR_OMISSAO;
        this.marca = marca;
        this.cilindrada = cilindrada;
        totalAutomoveis++;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getMarca() {
        return marca;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String toString() {
        return "Automóvel: matrícula = " + matricula + " marca = " + marca + " cilindrada = " + cilindrada;
    }

    public int calcularDiferencaCilindrada(Automovel outroAutomovel) {
        return (this.getCilindrada() - outroAutomovel.getCilindrada());
    }

    /* Como retorna só verdadeiro e falso, não ´«e necessário o ciclo if */
    public boolean isCilindradaMaior(Automovel outroAutomovel) {
        return (this.getCilindrada() > outroAutomovel.getCilindrada());
    }

    public boolean isCilindradaMaior(int cilindrada) {
        return (this.getCilindrada() > cilindrada);
    }

    public static int getTotalAutomoveis() {
        return totalAutomoveis;
    }
}
