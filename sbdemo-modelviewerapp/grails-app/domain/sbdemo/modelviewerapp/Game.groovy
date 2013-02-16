package sbdemo.modelviewerapp

class Game {

    Team homeTeam
    Team awayTeam

    Integer homeScore
    Integer awayScore

    Date time;

    static mapping = {
        version false
    }

    static constraints = {
    }
}
