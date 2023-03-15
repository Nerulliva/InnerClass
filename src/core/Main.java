package core;

public class Main {
    public static void main(String[] args){
        Squadra sq1 = new Squadra("Roma");

        Squadra.Statistiche stat = sq1.new Statistiche();

        stat.setGolFatti(3);
        sq1.setStatistiche(stat);

        System.out.println(sq1.getStatistiche().getGolFatti());
    }
}
