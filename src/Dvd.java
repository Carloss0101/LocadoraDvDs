//Carlos Eduardo Gonçalves  2706946

public abstract class Dvd {
    private String nome;    
    private String genero;
    private String descricao;
    private int lancamento;
    private int tamanho;
    private Estoque e1;
    
    public Dvd() {
        nome = "";
        genero = "";
        lancamento = 0000; 
        tamanho = 0;
        e1 = new Estoque();
    }
    
    public String getNome() {
        return nome;
    }
    
    public String getGenero() {
        return genero;
    }
    
    public String getDescricao() {
        return descricao;
    }
    
    public int getLancamento() {
        return lancamento;
    }
    
    public int getTamanho() {
        return tamanho;
    }
    
    public Estoque getEslq() {
        return e1;
    }
    
    public void setNome(String nome) throws DadoVazioException {
        if(nome == null || nome.trim().isEmpty()) {
            throw new DadoVazioException();
        } else {
            this.nome = nome;
        }
    }
    
    public void setGenero(String genero) throws DadoVazioException {
        if(genero == null || genero.trim().isEmpty()) {
            throw new DadoVazioException();
        } else {
            this.genero = genero;
        }
    }
    
    public void setDescricao(String descricao) throws DadoVazioException {
        if(descricao == null || descricao.trim().isEmpty()) {
            throw new DadoVazioException();
        } else {
            this.descricao = descricao;
        }
    }
    
    public void setLancamento(int lancamento) {
        this.lancamento = lancamento;
    }
    
    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
}
