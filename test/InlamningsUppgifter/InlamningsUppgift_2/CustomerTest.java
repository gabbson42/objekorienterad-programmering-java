package InlamningsUppgifter.InlamningsUppgift_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    Customer c = new Customer("Fredrik Berggren", "Skolgränd 8, 16819 Norrköping",
            "fredde@fakemail.se", "851020-6728", "2019-12-30", "2021-12-30", "Platina");

    @Test
    public void getNameTest(){

        assertTrue(c.getName().equals("Fredrik Berggren"));
        assertFalse(c.getName().equals("Kalle Bergqvist"));

    }

    @Test
    public void getAddressTest(){

        assertTrue(c.getAddress().equals("Skolgränd 8, 16819 Norrköping"));
        assertFalse(c.getAddress().equals("Fakegränd 7, 17645 Fakeköping"));

    }

    @Test
    public void getEmailTest(){

        assertTrue(c.getEmail().equals("fredde@fakemail.se"));
        assertFalse(c.getEmail().equals("kalle@fakemail.se"));

    }

    @Test
    public void getSocialSecurityNumberTest(){

        assertTrue(c.getSocialSecurityNumber().equals("851020-6728"));
        assertFalse(c.getSocialSecurityNumber().equals("940503-2648"));

    }

    @Test
    public void getMembershipPurchaseDateTest(){

        assertTrue(c.getMembershipPurchaseDateTest().equals("2019-12-30"));
        assertFalse(c.getMembershipPurchaseDateTest().equals("2020-12-30"));

    }

    @Test
    public void getMembershipUpdateDateTest(){

        assertTrue(c.getMembershipUpdateDateTest().equals("2021-12-30"));
        assertFalse(c.getMembershipUpdateDateTest().equals("2023-12-30"));

    }

    @Test
    public void getMembershipLevelTest(){

        assertTrue(c.getMembershipLevelTest().equals("Platina"));
        assertFalse(c.getMembershipLevelTest().equals("Guld"));

    }

}