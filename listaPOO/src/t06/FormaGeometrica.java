package t06;

public abstract class FormaGeometrica {
    private int lados;
    private int comprimento;
    private int altura;
    private String nome;

    FormaGeometrica(int lados, int comprimento, int altura, String nome) {
        this.lados = lados;
        this.comprimento = comprimento;
        this.altura = altura;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getLados() {
        return lados;
    }

    public void setLados(int lados) {
        this.lados = lados;
    }

    public int getComprimento() {
        return comprimento;
    }

    public void setComprimento(int comprimento) {
        this.comprimento = comprimento;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
}
