//Carlos Eduardo Gonçalves - 2706946
import java.util.ArrayList;
import java.util.List;

public class DBSerie {
    private static DBSerie controleUnico;
    private Serie s;
    private List<Serie> series;
    
    private DBSerie(){        
        series = new ArrayList<>();
        s = new Serie();
    }
    
    //MÉTODO SINGLETON
    public static DBSerie geraDBSerie(){  
        if (controleUnico == null) {
            controleUnico = new DBSerie();
        }
        return controleUnico;
    }
    
    public List<Serie> getDBSerie(){
        return series;
    }
    
    public Serie consSerieNome(Serie s) {
        String nome = s.getNome();
        
        for (Serie serie : series) {
            if (serie.getNome().equalsIgnoreCase(nome)) {
                return serie;  
            }
        }
        return null; 
    }
    
    public Serie editSerie(Serie novo) throws DadoVazioException, QuantidadeInvalidaException {
        String nome = novo.getNome();

        for (Serie serie : series) {
            if (serie.getNome().equalsIgnoreCase(nome)) {
                
                serie.setGenero(novo.getGenero());
                serie.setTemporadas(novo.getTemporadas());
                serie.setDescricao(novo.getDescricao());
                serie.setLancamento(novo.getLancamento());
                serie.setTamanho((int) novo.getTamanho());
                serie.setEpisodios(novo.getEpisodios());                
                serie.setStatus(novo.getStatus());
                
                serie.getEslq().setQuantidade(novo.getEslq().getQuantidade()); //Reflexividade
                serie.getEslq().setLocal(novo.getEslq().getLocal()); //Reflexividade

                return serie;
            }
        }

        return null;
    }
    
    public boolean delSerie(Serie s) {
        String nome = s.getNome();

        for (Serie serie : series) {
            if (serie.getNome().equalsIgnoreCase(nome)) {
                series.remove(serie);
                return true;
            }
        }

        return false; 
    }
    
    public Serie inserirSerie(Serie s){
        series.add(s);
        return s;
    }
}
