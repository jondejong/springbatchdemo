package sbdemo.modelviewerapp

class Team {

    String name
    String nickName;

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
