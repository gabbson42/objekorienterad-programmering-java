package InlamningsUppgifter.InlamningsUppgift_2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.util.List;

public class IOUtility {

    private List<Member> memberList;
    private List<Member> ptList;

    LocalDate todaysDate = LocalDate.now();

    public List<Member> readMemberFromFile(Path inFile){

        try(BufferedReader br = Files.newBufferedReader(inFile)){

            br.readLine();
            while(br.readLine() != null) {
                String line = br.readLine().trim();
                String [] parts = line.split(";");

                Member member = new Member(parts[0], parts[1], parts[2], parts[3], parts[4], parts[5], parts[6]);
                memberList.add(member);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return memberList;
    }

    public void writeMemberToFile(Path outFile, Member member){

        String memberInfo = member.getName() + ";" + member.getSocialSecurityNumber() + ";" + todaysDate;
        try(BufferedWriter bw = Files.newBufferedWriter(outFile, StandardOpenOption.APPEND)){
            bw.append(memberInfo);
            bw.newLine();
        }
        catch(IOException e){
            e.printStackTrace();
        }

    }
}
