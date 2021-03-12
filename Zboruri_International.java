package Flight_Management;



import java.io.*;
import java.util.List;


public class Zboruri_Internationale {
    String filename;
    String departure;
    String destination;
    String hour_departure;
    String hour_destination;
    String date_Fly;


    public Zboruri_Internationale() {
    }

    private void readfrom_csv(String filename) {
        String line = "";
        String splitBy = ",";

        try {
            BufferedReader br = new BufferedReader(new FileReader(filename));

            while((line = br.readLine()) != null) {
                String[] employee = line.split(splitBy);
                System.out.println("Employee [First Name=" + employee[0] + ", Last Name=" + employee[1] + ", Designation=" + employee[2] + ", Contact=" + employee[3] + ", Salary= " + employee[4] + ", City= " + employee[5] + "]");
            }
        } catch (IOException var6) {
            var6.printStackTrace();
        }

    }

    private void find_fly(String filename, String source, String destinatie) {
        String line = "";
        String splitBy = ",";
        this.departure = this.destination = "";
        boolean var6 = false;

        try {
            BufferedReader br = new BufferedReader(new FileReader(filename));

            while((line = br.readLine()) != null) {
                String[] employee = line.split(splitBy);
                if ((employee[0].equals(source)) &&(employee[1].equals(destinatie))) {

                     this.departure = source;
                      this.destination = destinatie;
                    System.out.println("Zbor gasit");
                }
            }
        } catch (IOException var9) {
            System.out.println("Zbor negasit");
            var9.printStackTrace();
        }

    }

    private void adauga_Zboruri(String filename,String destination,String source,String luna,String an,String zi,String pret) throws IOException {
        String line = "";
        String splitBy = ",";
        this.departure = this.destination = "";
        boolean var6 = false;
        PrintWriter writer = new PrintWriter(new FileWriter(filename, true));
// feed in your array (or convert your data to an array)
        String[] entries = "first#second#third".split("#");


    }
    public void writeData(String source,String destination,String luna,String an,String zi,String pret, String filename)
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
    private void sterge_Zboruri(String filename,String source,String destination,String luna,String an,String zi,String pret)
    {
        String line = "";
        String splitBy = ",";
        this.departure = this.destination = "";
        boolean find=false;

        try {
            BufferedReader br = new BufferedReader(new FileReader(filename));

            while((line = br.readLine()) != null) {
                String[] employee = line.split(splitBy);

                if ((employee[0].equals(source)) &&(employee[1].equals(destination)) &&
                        (employee[2].equals(luna)) && (employee[3].equals(an)) && (employee[4].equals(zi))
                && (employee[5].equals(pret)))
                {
                   employee[0]="";
                   employee[1]="";
                   employee[2]="";
                   employee[3]="";
                   employee[4]="";
                   employee[5]="";
                    System.out.println("Employee [First Name=" + employee[0] + ", Last Name=" + employee[1] + ", Designation=" + employee[2] + ", Contact=" + employee[3] + ", Salary= " + employee[4] + ", City= " + employee[5] + "]");
;
                }
                System.out.println("Employee [First Name=" + employee[0] + ", Last Name=" + employee[1] + ", Designation=" + employee[2] + ", Contact=" + employee[3] + ", Salary= " + employee[4] + ", City= " + employee[5] + "]");

            }
        } catch (IOException var9) {

            var9.printStackTrace();
        }

    }


    public static void main(String[] args) {
        String filename = "C:\\Users\\Dobran\\Proiect_Java_2021\\src\\Flight_Management\\Zboruri.csv";
        Zboruri_Internationale zboruri_international = new Zboruri_Internationale();
        zboruri_international.readfrom_csv(filename);
        zboruri_international
                .find_fly(filename, "Bacau", "Timisoara");
        zboruri_international
              .writeData("Bucuresti","Constanta","Martie","2021","31","300",filename);

        zboruri_international.sterge_Zboruri(filename,"Bucuresti","Constanta","Martie","2021","31","300");


    }
}
