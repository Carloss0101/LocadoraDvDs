//Carlos Eduardo Gonçalves  2706946

public class Filme extends Dvd  implements InterfaceConversorDuracao{
    private int duracao;
    private int classificacao;
    
    public Filme() {
        duracao = 0;
        classificacao = 0;
    }
    
    //SobreCarga
    public Filme(int duracao, int classificacao) {
        this.duracao = duracao;
        this.classificacao = classificacao;
    }
    
    //Sobrescrita
    public float calcularDuracaoEmHoras() {
        return (float) this.duracao / 60.0f; 
    }
    
    public int getDuracao() {
        return duracao;
    }
    
    public int getClassificacao() {
        return classificacao;
    }
    
    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
    
    public void setClassificacao(int classificacao) {
        this.classificacao = classificacao;
    }
}
