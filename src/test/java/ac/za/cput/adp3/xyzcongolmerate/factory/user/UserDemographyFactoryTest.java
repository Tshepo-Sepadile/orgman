package ac.za.cput.adp3.xyzcongolmerate.factory.user;

import ac.za.cput.adp3.xyzcongolmerate.domain.user.UserDemography;
import org.junit.Assert;
import org.junit.Test;

import java.util.Date;


public class UserDemographyFactoryTest {

    UserDemography userDemography;

    @Test
    public void buildUserDemography() {
        userDemography = UserDemographyFactory.buildUserDemography("t@xyz.com", "Mrs", "F", "A", new Date());
        Assert.assertNotNull(userDemography);
        Assert.assertEquals("Mrs", userDemography.getUserTitle());
    }
}