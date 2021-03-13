package Flight_Management;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Main extends Zboruri_Internationale {

    public static void main(String[] args) {
        String filename = "C:\\Users\\Dobran\\Proiect_Java_2021\\src\\Flight_Management\\Zboruri.csv";
        Zboruri_Internationale zboruri_international = new Zboruri_Internationale();
        Reservation reservation=new Reservation();
        String filename_reservation="C:\\Users\\Dobran\\Proiect_Java_2021\\src\\Flight_Management\\Rezervari.csv";
        Users users=new Users();
        Scanner scanner = new Scanner(System.in);
        boolean citeste = true;
        do {
            System.out.println("******************************************");
            System.out.println("Welcome to AliBaba_Airline_System");
            System.out.println("Users_View- show the users");
            System.out.println("Create_Account- create a new account");
            System.out.println("Login");
            System.out.println("Admin_Manager");
            System.out.println("********************************************");

            System.out.println("Please introduce the command: ");

            String comand = scanner.next();

            switch (comand) {
                case "Users_View":
                    String file="C:\\Users\\Dobran\\Proiect_Java_2021\\src\\Flight_Management\\Users.csv";
                    users.read_user_csv(file);
                    break;
                case "Create_Account":
                    String file2="C:\\Users\\Dobran\\Proiect_Java_2021\\src\\Flight_Management\\Users.csv";
                    System.out.println("Please introduce the dates for create a account: ");
                    System.out.println("Username: ");
                    String username=scanner.next();
                    System.out.println("Email: ");
                    String email=scanner.next();
                    System.out.println("Age: ");
                    String age=scanner.next();
                    System.out.println("Contact_Number: ");
                    String contact_number=scanner.next();
                    System.out.println("Password: ");
                    String password=scanner.next();
                    users.create_account(file2,username,email,age,contact_number,password);
                    break;
                case "Login":
                    System.out.println("Please introduce username and password= ");
                    String filename3="C:\\Users\\Dobran\\Proiect_Java_2021\\src\\Flight_Management\\Users.csv";
                    System.out.println("Please introduce username = ");
                    String username3=scanner.next();
                    System.out.println("Please introduce password= ");
                    String password3=scanner.next();
                    users.login_user(filename3,username3,password3);
                    System.out.println("**************************");
                    System.out.println("1-Show the flights");
                    System.out.println("2-Find the flight && Reservation ");
                    System.out.println("***************************");
                    System.out.println("Please introduce the option: ");
                    String choose=scanner.next();
                    if(choose.equals("1"))
                    {
                        zboruri_international.show_flights(filename);
                    }
                    else if(choose.equals("2")) {
                        zboruri_international.readfrom_csv(filename);
                        String source3 = scanner.next();
                        String destinatie3 = scanner.next();
                        String month3 = scanner.next();
                        String year3 = scanner.next();
                        String day3 = scanner.next();
                        String price3 = scanner.next();
                        zboruri_international
                                .find_fly(filename, source3, destinatie3, month3, year3, day3, price3);
                        System.out.println("Please introduce the reservation dates: ");
                        System.out.println("Username: ");
                        String username5 = scanner.next();
                        System.out.println("Last Name: ");
                        String last_name5 = scanner.next();
                        reservation.add_new_reservation(filename_reservation,
                                username5,last_name5,source3,destinatie3,month3,year3,day3,price3);
                        reservation.show_reservation(filename_reservation);

                    }

                    break;

                    case "Admin_Manager":

                    String username10="Admin";
                    String password10="parola";
                    System.out.println("Please introduce the admin username= ");
                    String username11=scanner.next();
                    System.out.println("Please introduce the admin password= ");
                    String password11=scanner.next();
                    if((username11.equals(username10)) && (password11.equals(password10))) {
                        System.out.println("");
                        System.out.println("Read-citeste zboruri");
                        System.out.println("ADD- adauga zboruri");
                        System.out.println("DELETE- sterge zboruri");
                        System.out.println("SHOW-afisare zboruri");
                        System.out.println("Please introduce the option: ");
                        String options = scanner.next();

                        if (options.equals("Read"))
                        {
                            zboruri_international.readfrom_csv(filename);
                        }
                        else
                      if(options.equals("ADD"))
                      {
                          System.out.println("Please enter the flight you want to add = ");
                          String source2 = scanner.next();
                          String destination2 = scanner.next();
                          String luna2 = scanner.next();
                          String an2 = scanner.next();
                          String zi2 = scanner.next();
                          String price2 = scanner.next();
                          zboruri_international
                                  .writeData(source2, destination2, luna2, an2, zi2, price2, filename);


                      }
                      else if(options.equals("DELETE"))
                      { System.out.println("Please enter the flight you want to delete= ");
                          String source = scanner.next();
                          String destination = scanner.next();
                          String luna = scanner.next();
                          String an = scanner.next();
                          String zi = scanner.next();
                          String price = scanner.next();
                          zboruri_international.sterge_Zboruri(filename, source, destination, luna, an, zi, price);


                      }
                      else if(options.equals("SHOW"))
                      {
                          zboruri_international.show_flights(filename);
                      }
                    }
                    break;

                    default:
                    System.out.println("The command entered doesn't exist");
            }

        }while(citeste == true);


    }
}
