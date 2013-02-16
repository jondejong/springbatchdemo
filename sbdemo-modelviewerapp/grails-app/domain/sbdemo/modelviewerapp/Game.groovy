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
}
