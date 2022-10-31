package SakilaScam;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ActorTest {

    Actor testActor = new Actor("Fake","Name");

    @org.junit.Test
    public void testGetters() {
        Assertions.assertEquals(testActor.getFirstName(), "Fake");
        Assertions.assertEquals(testActor.getFirstName(), "Name");
    }

    @org.junit.Test
    public void testSetters(){
        testActor.setActor_id(203);
        testActor.setFirstName("notFake");
        testActor.setLastName("lastName");

        Assertions.assertEquals(testActor.getActor_id(), 203);
        Assertions.assertEquals(testActor.getFirstName(), "notFake");
        Assertions.assertEquals(testActor.getFirstName(), "lastName");
    }
}
