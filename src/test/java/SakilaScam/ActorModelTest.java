package SakilaScam;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ActorModelTest {

    ActorModel testActor = new ActorModel("Fake", "Name");

    @Test
    void testGetters() {
        Assertions.assertEquals("Fake",testActor.getFirst_name());
        Assertions.assertEquals("Name",testActor.getLast_name());
    }
}
