package SakilaScam;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ActorModelTest {

    ActorModel testActor = new ActorModel("Fake", "Name");

    @Test
    void testGetters() {
        Assertions.assertEquals("Fake",testActor.getFirstName());
        Assertions.assertEquals("Name",testActor.getLastName());
    }
}
