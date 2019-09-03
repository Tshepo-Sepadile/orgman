package ac.za.cput.adp3.xyzcongolmerate.factory.user;

import ac.za.cput.adp3.xyzcongolmerate.domain.user.UserRole;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserRoleFactoryTest {

    UserRole userRole;

    @Test
    public void buildUserRole() {
        userRole = UserRoleFactory.buildUserRole("12345", "t@xyz.com", "15");
        Assert.assertNotNull(userRole);
        Assert.assertEquals("12345", userRole.getOrgCode());

    }
}