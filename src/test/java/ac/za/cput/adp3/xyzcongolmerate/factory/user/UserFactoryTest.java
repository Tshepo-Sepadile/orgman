package ac.za.cput.adp3.xyzcongolmerate.factory.user;

import ac.za.cput.adp3.xyzcongolmerate.domain.user.User;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserFactoryTest {

    User user;

    @Test
    public void buildUser() {
        user = UserFactory.buildUser("t@xyz.com", "Tshepo", "Sepadile");
        Assert.assertNotNull(user);
        Assert.assertEquals("Tshepo", user.getFirstName());


    }
}