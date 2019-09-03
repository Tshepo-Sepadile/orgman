package ac.za.cput.adp3.xyzcongolmerate.factory.org;

import ac.za.cput.adp3.xyzcongolmerate.domain.org.Organisation;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class OrganisationFactoryTest {

    Organisation organisation;

    @Test
    public void buildOrganisation() {
        organisation = OrganisationFactory.buildOrganisation("XYZ Conglomerate");
        Assert.assertNotNull(organisation.getOrgCode());
        Assert.assertEquals("XYZ Conglomerate", organisation.getOrgName());
    }
}