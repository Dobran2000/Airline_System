package Flight_Management;

import java.io.*;

public class Reservation {

    Reservation() {

    }

    public void read_reservation_csv(String filename) {
        String line = "";
        String splitBy = ",";

        try {
            BufferedReader br = new BufferedReader(new FileReader(filename));

            while ((line = br.readLine()) != null) {
                String[] employee = line.split(splitBy);
                System.out.println
                        ("Username = " + employee[0] +
                        " Last Name = " + employee[1]
                        + " Source= " + employee[2]
                        + " Destination = " + employee[3]
                        + " Month = " + employee[4]
                        + " Year= " + employee[5]
                        + " Day= " + employee[6]
                        + " Price= " + employee[6]);
            }
        } catch (IOException var6) {
            var6.printStackTrace();
        }
    }

    public void add_new_reservation(String filename, String username,
                                     String last_name, String source, String destination,
                                     String month, String year, String day, String price) {
        PrintWriter csvWriter;
        try {
            StringBuffer oneLineStringBuffer = new StringBuffer();

            File file = new File(filename);
            if (!file.exists()) {
                file = new File(filename);

            }
            csvWriter = new PrintWriter(new FileWriter(file, true));

            oneLineStringBuffer.append("\n");
            oneLineStringBuffer.append(username);
            oneLineStringBuffer.append(",");
            oneLineStringBuffer.append(last_name);
            oneLineStringBuffer.append(",");
            oneLineStringBuffer.append(source);
            oneLineStringBuffer.append(",");
            oneLineStringBuffer.append(destination);
            oneLineStringBuffer.append(",");
            oneLineStringBuffer.append(month);
            oneLineStringBuffer.append(",");
            oneLineStringBuffer.append(year);
            oneLineStringBuffer.append(",");
            oneLineStringBuffer.append(day);
            oneLineStringBuffer.append(",");
            oneLineStringBuffer.append(price);

            csvWriter.print(oneLineStringBuffer);

            csvWriter.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void show_reservation(String filename) {
        String line = "";
        String splitBy = ",";

        try {
            BufferedReader br = new BufferedReader(new FileReader(filename));

            while ((line = br.readLine()) != null) {
                String[] employee = line.split(splitBy);
                System.out.println("Username = " + employee[0] +
                        " Last Name = " + employee[1]
                        + " Source= " + employee[2]
                        + " Destination = " + employee[3]
                        + " Month = " + employee[4]
                        + " Year= " + employee[5]
                        + " Day= " + employee[6]
                        + " Price= " + employee[6]);
            }
        } catch (IOException var6) {
            var6.printStackTrace();
        }

    }

    public void delete_reservation(String filename, String username, String last_name,
                                   String source, String destination, String luna,
                                   String an, String zi, String pret) {
        String line = "";
        String splitBy = ",";

        boolean find = false;

        try {
            BufferedReader br = new BufferedReader(new FileReader(filename));

            while ((line = br.readLine()) != null) {
                String[] employee = line.split(splitBy);

                if ((employee[0].equals(username)) && (employee[1].equals(last_name)) &&
                        (employee[2].equals(source)) && (employee[3].equals(destination))
                        && (employee[4].equals(luna))
                        && (employee[5].equals(an))
                        && (employee[6].equals(zi)
                        && (employee[7].equals(pret)))) {
                    employee[0] = "";
                    employee[1] = "";
                    employee[2] = "";
                    employee[3] = "";
                    employee[4] = "";
                    employee[5] = "";
                    employee[6] = "";
                    employee[7] = "";

                }
                System.out.println("Username = " + employee[0] +
                        " Last Name = " + employee[1]
                        + " Source= " + employee[2]
                        + " Destination = " + employee[3]
                        + " Month = " + employee[4]
                        + " Year= " + employee[5]
                        + " Day= " + employee[6]
                        + " Price= " + employee[6]);

            }
        } catch (IOException var9) {

            var9.printStackTrace();
        }


    }
}

