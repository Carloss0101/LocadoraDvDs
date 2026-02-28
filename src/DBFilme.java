//Carlos Eduardo Gonçalves - 2706946
import java.util.ArrayList;
import java.util.List;

public class DBFilme {
    private static DBFilme controleUnico;
    private Filme f;
    private List<Filme> filmes;
    
    private DBFilme(){        
        filmes = new ArrayList<>();
        f = new Filme();
    }
    
     //MÉTODO SINGLETON
    public static DBFilme geraDBFilme(){  
        if (controleUnico == null) {
            controleUnico = new DBFilme();
        }
        return controleUnico;
    }
    
    public List<Filme> getDBFilme(){
        return filmes;
    }
    
    public Filme consFilmeNome(Filme f) {
        String nome = f.getNome();
        
        for (Filme filme : filmes) {
            if (filme.getNome().equalsIgnoreCase(nome)) {
                return filme;  
            }
        }
        return null; 
    }
    
    public Filme editFilme(Filme novo) throws DadoVazioException, QuantidadeInvalidaException {
        String nome = novo.getNome();

        for (Filme filme : filmes) {
            if (filme.getNome().equalsIgnoreCase(nome)) {
                
                filme.setGenero(novo.getGenero());
                filme.setDuracao(novo.getDuracao());
                filme.setDescricao(novo.getDescricao());
                filme.setLancamento(novo.getLancamento());
                filme.setTamanho((int) novo.getTamanho());
                filme.setClassificacao(novo.getClassificacao());

                filme.getEslq().setQuantidade(novo.getEslq().getQuantidade()); //Reflexividade
                filme.getEslq().setLocal(novo.getEslq().getLocal()); //Reflexividade

                return filme;
            }
        }

        return null;
    }
    
    public boolean delFilme(Filme f) {
        String nome = f.getNome();

        for (Filme filme : filmes) {
            if (filme.getNome().equalsIgnoreCase(nome)) {
                filmes.remove(filme);
                return true;
            }
        }

        return false; 
    }

    public Filme inserirFilme(Filme f){
        filmes.add(f);
        return f;
    }
}
