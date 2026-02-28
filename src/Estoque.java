//Carlos Eduardo Gonçalves  2706946

public class Estoque {
    private int quantidade;
    private String local;
    
    public Estoque() {
        quantidade = 0;
        local = "";
    }
    
    public int getQuantidade() {
        return quantidade; 
    }
    
    public String getLocal() {
        return local; 
    }
    
    public void setQuantidade(int quantidade) throws QuantidadeInvalidaException {
        if(quantidade >= 0) {
            this.quantidade = quantidade;
        } else {
            throw new QuantidadeInvalidaException();
        }
    }
    
    public void setLocal(String local) {
        this.local = local;
    }
}
