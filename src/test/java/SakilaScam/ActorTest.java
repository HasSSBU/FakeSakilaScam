package SakilaScam;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ActorTest {

    Actor testActor = new Actor("Fake","Name");

    @Test
    public void testGetters() {
        Assertions.assertEquals("Fake",testActor.getFirstName());
        Assertions.assertEquals("Name",testActor.getLastName());
    }

    @Test
    public void testSetters(){
        testActor.setActor_id(203);
        testActor.setFirstName("notFake");
        testActor.setLastName("lastName");

        Assertions.assertEquals(203,testActor.getActor_id());
        Assertions.assertEquals("notFake",testActor.getFirstName());
        Assertions.assertEquals("lastName",testActor.getLastName());
    }
}
