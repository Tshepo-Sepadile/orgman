package ac.za.cput.adp3.xyzcongolmerate.factory.misc;

import ac.za.cput.adp3.xyzcongolmerate.domain.misc.Role;
import ac.za.cput.adp3.xyzcongolmerate.factory.demography.RaceFactory;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RoleFactoryTest {

    Role role;

    @Test
    public void buildRole() {
        role = RoleFactory.buildRole("Administrator");
        Assert.assertNotNull(role.getRoleId());
        Assert.assertEquals("Administrator", role.getRoleName());
    }
}