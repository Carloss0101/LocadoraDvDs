//Carlos Eduardo Gonçalves  2706946

public class Documentario extends Dvd{
    private String tema;
    private String narrador;
    private String idioma;
    
    public Documentario() {
        tema = "";
        narrador = "";
        idioma = "";
    }
    
    public String getTema() {
        return tema;
    }
    
    public String getNarrador() {
        return narrador;
    }
    
    public String getIdioma() {
        return idioma;
    }
    
    public void setTema(String tema) {
        this.tema = tema;
    }
    
    public void setNarrador(String narrador) {
        this.narrador = narrador;
    }
    
    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }
    
    
}
