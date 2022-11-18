package sakila.scam;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ActorModelTest {

    ActorModel testActor = new ActorModel("Fake", "Name");

    @Test
    void testGetFirstName() {
        Assertions.assertEquals("Fake",testActor.getFirstName());
    }
    @Test
    void testGetLastName() {
        Assertions.assertEquals("Name",testActor.getLastName());
    }
}
