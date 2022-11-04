package SakilaScam;

public class ActorModel {

    private String first_name;
    private String last_name;

    public ActorModel(String fName, String lName){
        this.first_name = fName;
        this.last_name = lName;

    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }
}
