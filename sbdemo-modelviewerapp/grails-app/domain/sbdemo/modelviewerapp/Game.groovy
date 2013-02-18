package sbdemo.modelviewerapp

class Game {

    Team homeTeam
    Team visitorTeam

    Integer homeScore
    Integer visitorScore

    Date time;

    static mapping = {
        version false
    }

    static constraints = {
    }

    @Override
    public String toString() {

        if(null == homeTeam) {
            return "GameItem not initialized.";
        }

        String winningTeam = homeScore > visitorScore ? homeTeam : visitorTeam;
        String losingTeam =  homeScore > visitorScore ? visitorTeam: homeTeam;
        Integer winningScore = homeScore > visitorScore ? homeScore : visitorScore;
        Integer losingScore = homeScore > visitorScore ? visitorScore : homeScore;

        String location = homeScore > visitorScore ? "at home" : "away from home";

        "The ${winningTeam} defeated the ${losingTeam} ${winningScore} to ${losingScore} ${location} on ${String.format('%tD', time)}.";
    }
}
