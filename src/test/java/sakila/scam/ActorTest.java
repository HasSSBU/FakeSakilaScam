package sakila.scam;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ActorTest {

    Actor testActor = new Actor("Fake","Name");
    Actor testActor2 = new Actor();

    @Test
    void testGetFirstName() {
        Assertions.assertEquals("Fake",testActor.getFirstName());
    }
    @Test
    void testGetLastName(){
        Assertions.assertNull(testActor2.getLastName());
    }

    @Test
    void testSetId(){
        testActor.setActorId(203);
        Assertions.assertEquals(203,testActor.getActorId());
    }
    @Test
    void testSetFirstName(){
        testActor.setFirstName("notFake");
        Assertions.assertEquals("notFake",testActor.getFirstName());
    }
    @Test
    void testSetLastName(){
        testActor.setLastName("lastName");
        Assertions.assertEquals("lastName",testActor.getLastName());
    }
}
