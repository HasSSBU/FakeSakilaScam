package SakilaScam;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ActorTest {

    Actor testActor = new Actor("Fake","Name");
    Actor testActor2 = new Actor();

    @Test
    void testGetters() {
        Assertions.assertEquals("Fake",testActor.getFirstName());
        Assertions.assertEquals("Name",testActor.getLastName());
    }

    @Test
    void testGetters2(){
        Assertions.assertNull(testActor2.getFirstName());
        Assertions.assertNull(testActor2.getLastName());
    }

    @Test
    void testSetters(){
        testActor.setActorId(203);
        testActor.setFirstName("notFake");
        testActor.setLastName("lastName");

        Assertions.assertEquals(203,testActor.getActorId());
        Assertions.assertEquals("notFake",testActor.getFirstName());
        Assertions.assertEquals("lastName",testActor.getLastName());
    }
}
