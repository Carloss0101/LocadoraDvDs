//Carlos Eduardo Gonçalves  2706946

public class Serie extends Dvd{
    private int temporadas;
    private int episodios;
    private String status;
    
    public Serie() {
        temporadas = 0;
        episodios = 0;
        status = "";
    }
   
    public int getTemporadas() {
        return temporadas;
    }
    
    public int getEpisodios() {
        return episodios;
    }
    
    public String getStatus() {
        return status;
    }
    
    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }
    
    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }
    
    public void setStatus(String status) {
        this.status = status;
    } 
    
}
