package Flight_Management;
import java.io.*;
import java.util.Scanner;

public class Zboruri_Internationale {
    String departure;
    String destination;

    public Zboruri_Internationale() {
    }

    public void readfrom_csv(String filename) {
        String line = "";
        String splitBy = ",";

        try {
            BufferedReader br = new BufferedReader(new FileReader(filename));

            while ((line = br.readLine()) != null) {
                String[] employee = line.split(splitBy);
                System.out.println("Source= " + employee[0] +
                        " Destination= " + employee[1]
                        + " Month= " + employee[2]
                        + " Year= " + employee[3]
                        + " Day = " + employee[4]
                        + "Price=  " + employee[5]);
            }
        } catch (IOException var6) {
            var6.printStackTrace();
        }

    }

    public void show_flights(String filename) {
        String line = "";
        String splitBy = ",";

        try {
            BufferedReader br = new BufferedReader(new FileReader(filename));

            while ((line = br.readLine()) != null) {
                String[] employee = line.split(splitBy);
                System.out.println("Source= " + employee[0] +
                        " Destination= " + employee[1]
                        + " Month= " + employee[2]
                        + " Year= " + employee[3]
                        + " Day = " + employee[4]
                        + "Price=  " + employee[5]);
            }
        } catch (IOException var6) {
            var6.printStackTrace();
        }

    }

    public void find_fly(String filename, String source, String destinatie,
                     String month,String year,String day, String price) {
        String line = "";
        String splitBy = ",";
        boolean var6 = false;

        try {
            BufferedReader br = new BufferedReader(new FileReader(filename));

            while ((line = br.readLine()) != null) {
                String[] employee = line.split(splitBy);
                if ((employee[0].equals(source)) && (employee[1].equals(destinatie))
                &&(employee[2].equals(month)) && (employee[3].equals(year)) &&
                        (employee[4].equals(day)) && (employee[5].equals(price)))
                {
                    System.out.println("Zbor gasit");
                }
            }
        } catch (IOException var9) {
            System.out.println("Zbor negasit");
            var9.printStackTrace();
        }

    }

    public void writeData(String source, String destination, String luna, String an, String zi, String pret, String filename) {

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
            oneLineStringBuffer.append(source);
            oneLineStringBuffer.append(",");
            oneLineStringBuffer.append(destination);
            oneLineStringBuffer.append(",");
            oneLineStringBuffer.append(luna);
            oneLineStringBuffer.append(",");
            oneLineStringBuffer.append(an);
            oneLineStringBuffer.append(",");
            oneLineStringBuffer.append(zi);
            oneLineStringBuffer.append(",");
            oneLineStringBuffer.append(pret);


            csvWriter.print(oneLineStringBuffer);

            csvWriter.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public void sterge_Zboruri(String filename, String source, String destination, String luna, String an, String zi, String pret) {
        String line = "";
        String splitBy = ",";
        this.departure = this.destination = "";
        boolean find = false;

        try {
            BufferedReader br = new BufferedReader(new FileReader(filename));

            while ((line = br.readLine()) != null) {
                String[] employee = line.split(splitBy);

                if ((employee[0].equals(source)) && (employee[1].equals(destination)) &&
                        (employee[2].equals(luna)) && (employee[3].equals(an)) && (employee[4].equals(zi))
                        && (employee[5].equals(pret))) {
                    employee[0] = "";
                    employee[1] = "";
                    employee[2] = "";
                    employee[3] = "";
                    employee[4] = "";
                    employee[5] = "";
                    System.out.println("Employee [First Name=" + employee[0] + ", Last Name=" + employee[1] + ", Designation=" + employee[2] + ", Contact=" + employee[3] + ", Salary= " + employee[4] + ", City= " + employee[5] + "]");
                    ;
                }
                System.out.println("EFirst Name=" + employee[0] + ", Last Name=" + employee[1] + ", Designation=" + employee[2] + ", Contact=" + employee[3] + ", Salary= " + employee[4] + ", City= " + employee[5] + "]");

            }
        } catch (IOException var9) {

            var9.printStackTrace();
        }

    }


}