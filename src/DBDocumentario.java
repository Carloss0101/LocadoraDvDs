//Carlos Eduardo Gonçalves - 2706946
import java.util.ArrayList;
import java.util.List;

public class DBDocumentario {
    private static DBDocumentario controleUnico;
    private Documentario d;
    private List<Documentario> documentarios;
    
    private DBDocumentario(){        
        documentarios = new ArrayList<>();
        d = new Documentario();
    }
    
    //MÉTODO SINGLETON
    public static DBDocumentario geraDBDocumentario(){  
        if (controleUnico == null) {
            controleUnico = new DBDocumentario();
        }
        return controleUnico;
    }
    
    public List<Documentario> getDBDocumentario(){
        return documentarios;
    }
    
    public Documentario consDocNome(Documentario d) {
        String nome = d.getNome();
        
        for (Documentario documentario : documentarios) {
            if (documentario.getNome().equalsIgnoreCase(nome)) {
                return documentario;  
            }
        }
        return null; 
    }
    
    public Documentario editDocumentario(Documentario novo) throws DadoVazioException, QuantidadeInvalidaException {
        String nome = novo.getNome();

        for (Documentario documentario : documentarios) {
            if (documentario.getNome().equalsIgnoreCase(nome)) {
                
                documentario.setGenero(novo.getGenero());
                documentario.setDescricao(novo.getDescricao());
                documentario.setLancamento(novo.getLancamento());
                documentario.setTamanho((int) novo.getTamanho());
                documentario.setTema(novo.getTema());                
                documentario.setNarrador(novo.getNarrador());
                documentario.setIdioma(novo.getIdioma());
                
                documentario.getEslq().setQuantidade(novo.getEslq().getQuantidade()); //Reflexividade
                documentario.getEslq().setLocal(novo.getEslq().getLocal()); //Reflexividade

                return documentario;
            }
        }

        return null;
    }
    
    public boolean delDocumentario(Documentario d) {
        String nome = d.getNome();

        for (Documentario documentario : documentarios) {
            if (documentario.getNome().equalsIgnoreCase(nome)) {
                documentarios.remove(documentario);
                return true;
            }
        }

        return false; 
    }
    
    public Documentario inserirDocumentario(Documentario d){
        documentarios.add(d);
        return d;
    }
}
