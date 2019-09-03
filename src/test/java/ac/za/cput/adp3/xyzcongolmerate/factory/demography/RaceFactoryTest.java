package ac.za.cput.adp3.xyzcongolmerate.factory.demography;

import ac.za.cput.adp3.xyzcongolmerate.domain.demography.Race;
import org.junit.Assert;
import org.junit.Test;

public class RaceFactoryTest {

    Race race;

    @Test
    public void buildRace() {
        race = RaceFactory.buildRace("African");
        Assert.assertNotNull(race.getRaceId());
        Assert.assertEquals("African", race.getRaceDescription());
    }
}