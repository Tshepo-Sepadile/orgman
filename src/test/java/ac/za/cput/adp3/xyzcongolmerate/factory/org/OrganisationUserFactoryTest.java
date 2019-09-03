package ac.za.cput.adp3.xyzcongolmerate.factory.org;

import ac.za.cput.adp3.xyzcongolmerate.domain.org.OrganisationUser;
import org.junit.Assert;
import org.junit.Test;


public class OrganisationUserFactoryTest {

    OrganisationUser organisationUser;

    @Test
    public void buildOrganisationUser() {
        organisationUser = OrganisationUserFactory.buildOrganisationUser("12345", "t@xyz.com");
        Assert.assertNotNull(organisationUser);
        Assert.assertEquals("12345", organisationUser.getOrgCode());
        Assert.assertEquals("t@xyz.com", organisationUser.getUserEmail());
    }
}