package Flight_Management;

import java.io.*;

public class Users {
    Users()
    {

    }
    public void read_user_csv(String filename)
    {
        String line = "";
        String splitBy = ",";

        try {
            BufferedReader br = new BufferedReader(new FileReader(filename));

            while ((line = br.readLine()) != null) {
                String[] employee = line.split(splitBy);
                System.out.println("Username = " + employee[0] +
                        " Email= " + employee[1]
                        + " Age= " + employee[2]
                        + " Contact_Number= " + employee[3]
                        + " Password = " + employee[4]);
            }
        } catch (IOException var6) {
            var6.printStackTrace();
        }
    }
    public void create_account(String filename,String username, String email,
                               String age, String contact_number, String password)
    {

        PrintWriter csvWriter;
        try {
            /*1. declare stringBuffer*/
            StringBuffer oneLineStringBuffer = new StringBuffer();

            File file = new File(filename);
            if (!file.exists()) {
                file = new File(filename);

            }
            csvWriter = new PrintWriter(new FileWriter(file, true));

            oneLineStringBuffer.append("\n");
            oneLineStringBuffer.append(username);
            oneLineStringBuffer.append(",");
            oneLineStringBuffer.append(email);
            oneLineStringBuffer.append(",");
            oneLineStringBuffer.append(age);
            oneLineStringBuffer.append(",");
            oneLineStringBuffer.append(contact_number);
            oneLineStringBuffer.append(",");
            oneLineStringBuffer.append(password);


            csvWriter.print(oneLineStringBuffer);

            csvWriter.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void login_user(String filename,String username,String password)
    {
        String line = "";
        String splitBy = ",";

        try {
            BufferedReader br = new BufferedReader(new FileReader(filename));

            while ((line = br.readLine()) != null) {
                String[] employee = line.split(splitBy);
                if((employee[0].equals(username)) &&(employee[1].equals(password)))
                {
                    System.out.println("Logare reusita");
                }

            }
        } catch (IOException var6) {
            var6.printStackTrace();
        }
    }
}

