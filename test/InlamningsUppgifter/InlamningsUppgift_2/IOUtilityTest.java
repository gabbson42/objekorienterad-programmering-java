package InlamningsUppgifter.InlamningsUppgift_2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

class IOUtilityTest {

    IOUtility ioUtility = new IOUtility();

    Path inFile = Paths.get("test/InlamningsUppgifter/InlamningsUppgift_2/gym_medlemmar.txt");
    Path outFile = Paths.get("test/InlamningsUppgifter/InlamningsUppgift_2/pt_fil.txt");

    @Test
    public void readDataFromFileTest(){

        List<Member> members = ioUtility.readDataFromFile(inFile);

        assertEquals(20, members.size());
        assertNotEquals(21, members.size());

    }

    @Test
    public void readSpecificDataFromFile(){

        List<Member> members = ioUtility.readDataFromFile(inFile);

        assertEquals("Fredrik Berggren", members.get(0).getName());
        assertNotEquals("Kalle Bergqvist", members.get(0).getName());

        assertEquals("851020-6728", members.get(0).getSocialSecurityNumber());
        assertNotEquals("940503-2648", members.get(0).getSocialSecurityNumber());

        assertEquals("2021-12-30", members.get(0).getMembershipUpdateDate());
        assertNotEquals("2023-12-30", members.get(0).getMembershipUpdateDate());

        assertEquals("Platina", members.get(0).getMemberLvl());
        assertNotEquals("Guld", members.get(0).getMemberLvl());

    }

    @Test
    public void writeDataToFileTest(){

        Member c1 = new Member("Fredrik Berggren", "Skolgränd 8, 16819 Norrköping",
                "fredde@fakemail.se", "851020-6728", "2019-12-30",
                "2021-12-30", "Platina");

        Member c2 = new Member("Astrid Larsson", "Järnvägsvägen 5, 64230 Gävle",
                "asta@fakemail.de", "540815-4382", "2021-12-04",
                "2022-12-04", "Platina");

        Member c3 = new Member("Pia Johansson", "Idrottsvägen 1, 77845 Landskrona",
                "anne31@fakemail.de", "361026-1822", "2024-07-18",
                "2025-07-18", "Standard");

        List<Member> testMembers = Arrays.asList(c1,c2,c3);

        ioUtility.writeDataToFile(outFile, testMembers);

        try(BufferedReader br = Files.newBufferedReader(outFile)){
            String s = br.readLine();
            assertTrue(s.equalsIgnoreCase("Fredrik Berggren"));
            s = br.readLine();
            assertTrue(s.equalsIgnoreCase("Astrid Larsson"));
            s = br.readLine();
            assertTrue(s.equalsIgnoreCase("Pia Johansson"));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

}