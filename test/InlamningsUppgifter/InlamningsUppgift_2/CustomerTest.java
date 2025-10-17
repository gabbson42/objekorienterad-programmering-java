package InlamningsUppgifter.InlamningsUppgift_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    Customer c = new Customer("Fredrik Berggren", "Skolgränd 8, 16819 Norrköping",
            "fredde@fakemail.se", "851020-6728", "2019-12-30",
            "2021-12-30", "Platina");

    @Test
    public void getNameTest(){

        assertEquals("Fredrik Berggren", c.getName());
        assertNotEquals("Kalle Bergqvist", c.getName());

    }

    @Test
    public void getAddressTest(){

        assertEquals("Skolgränd 8, 16819 Norrköping", c.getAddress());
        assertNotEquals("Fakegränd 7, 17645 Fakeköping", c.getAddress());

    }

    @Test
    public void getEmailTest(){

        assertEquals("fredde@fakemail.se", c.getEmail());
        assertNotEquals("kalle@fakemail.se", c.getEmail());

    }

    @Test
    public void getSocialSecurityNumberTest(){

        assertEquals("851020-6728", c.getSocialSecurityNumber());
        assertNotEquals("940503-2648", c.getSocialSecurityNumber());

    }

    @Test
    public void getJoinDateTest(){

        assertEquals("2019-12-30", c.getJoinDate());
        assertNotEquals("2020-12-30", c.getJoinDate());

    }

    @Test
    public void getMembershipUpdateDateTest(){

        assertEquals("2021-12-30", c.getMembershipUpdateDate());
        assertNotEquals("2023-12-30", c.getMembershipUpdateDate());

    }

    @Test
    public void getMemberLvlTest(){

        assertEquals("Platina", c.getMemberLvl());
        assertNotEquals("Guld", c.getMemberLvl());

    }

}