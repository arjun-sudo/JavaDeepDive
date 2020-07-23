public class Crickter {

    private String name;
    private double battingAverage;
    private String nation;
    private static String leagueClub;

    private int seasonsPlayed;
//    static keyword
    private static int years;

    public Crickter(String name, double battingAverage ) {
        this.name = name;
        this.battingAverage = battingAverage;
        years++;
        this.seasonsPlayed = seasonsPlayed;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public void setLeagueClub(String leagueClub) {
        this.leagueClub = leagueClub;
    }



    @Override
    public String toString() {
      return "Player Name:"+name+" , "+"Batting Average:"+battingAverage+" , "+"Nation:"+nation+" , "+"League :"+leagueClub+"Season Played:"+seasonsPlayed;
    }

    public static int getYears() {
        return years;
    }
}

