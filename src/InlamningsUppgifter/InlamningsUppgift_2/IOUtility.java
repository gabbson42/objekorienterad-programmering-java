package InlamningsUppgifter.InlamningsUppgift_2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class IOUtility {

    private List<Member> memberList;

    LocalDate todaysDate = LocalDate.now();

    public List<Member> readMemberFromFile(Path inFile){

        this.memberList = new ArrayList<>();

        try(BufferedReader br = Files.newBufferedReader(inFile)){

            String line;
            br.readLine();
            while((line = br.readLine()) != null) {
                String [] parts = line.split(";");

                Member member = new Member(parts[0], parts[1], parts[2], parts[3], parts[4], parts[5], parts[6]);
                this.memberList.add(member);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return memberList;
    }

    public void writeMemberToFile(Path outFile, Member member){

        String memberInfo = member.getName() + ";" + member.getSocialSecurityNumber() + ";" + todaysDate;
        try(BufferedWriter bw = Files.newBufferedWriter(outFile, StandardOpenOption.APPEND);
            BufferedReader br = Files.newBufferedReader(outFile)){

            if(br.readLine() == null){
                bw.append("Medlem;Personnummer;Besöksdatum");
                bw.newLine();
            }
            bw.append(memberInfo);
            bw.newLine();
        }
        catch(IOException e){
            e.printStackTrace();
        }

    }
}
