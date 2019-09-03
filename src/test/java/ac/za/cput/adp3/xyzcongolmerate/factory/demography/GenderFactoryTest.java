package ac.za.cput.adp3.xyzcongolmerate.factory.demography;

import ac.za.cput.adp3.xyzcongolmerate.domain.demography.Gender;
import org.junit.Assert;
import org.junit.Test;

public class GenderFactoryTest {

    Gender gender;

    @Test
    public void buildGender() {

        gender = GenderFactory.buildGender("Male");
        Assert.assertNotNull(gender.getGenderId());
        Assert.assertEquals("Male", gender.getGenderDescription());
    }
}