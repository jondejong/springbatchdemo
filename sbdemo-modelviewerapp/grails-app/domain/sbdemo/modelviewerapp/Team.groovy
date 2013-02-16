package sbdemo.modelviewerapp

class Team {

    String name
    String nickName;

    Integer wins
    Integer losses

    BigDecimal winPercentage;

    @Override
    public String toString() {
        return "${name} ${nickName}"
    }

    static mapping = {
        version false

    }

    static constraints = {
    }
}
