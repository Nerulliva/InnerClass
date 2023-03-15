package core;

public class Squadra {

    private String nome;
    private Statistiche statistiche;

    public Squadra(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setStatistiche(Statistiche stat){
        this.statistiche = stat;
    }

    public Statistiche getStatistiche(){
        return this.statistiche;
    }

    class Statistiche{
        private int golFatti;

        public int getGolFatti() {
            return golFatti;
        }

        public void setGolFatti(int golFatti) {
            this.golFatti = golFatti;
        }
    }
}
