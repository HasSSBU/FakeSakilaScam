package SakilaScam;

public class ActorModel {

    private String firstName;
    private String lastName;

    public ActorModel(String fName, String lName){
        this.firstName = fName;
        this.lastName = lName;

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
