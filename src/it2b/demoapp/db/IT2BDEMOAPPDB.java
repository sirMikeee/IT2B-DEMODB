package it2b.demoapp.db;
import java.util.Scanner;

public class IT2BDEMOAPPDB {

    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    String response;
        
    do{ 
        System.out.println("1. ADD");
        System.out.println("2. VIEW");
        System.out.println("3. UPDATE");
        System.out.println("4. DELETE");
        System.out.println("5. EXIT");
        
        System.out.println("Enter action: ");
        int action = sc.nextInt();
        IT2BDEMOAPPDB sample = new IT2BDEMOAPPDB();
        switch(action){
            case 1:
                sample.addCitizens();
            break;
            case 2:
                
            break;
        }
        
        System.out.println("Do you want to continue? (yes/no): ");
        response = sc.next();
        
    } while(response.equalsIgnoreCase("yes"));
    
        System.out.println("Thank you, see you soonest!");
    }
    
    
    public void addCitizens(){
        Scanner sc = new Scanner(System.in);
        config conf = new config();
        
        System.out.print("First Name: ");
        String fname = sc.next();
        System.out.print("Last Name: ");
        String lname = sc.next();
        System.out.print("Email: ");
        String email = sc.next();
        System.out.print("Status: ");
        String status = sc.next();

        String sql = "INSERT INTO tbl_citizens (c_fname, c_lname,c_email, c_status) VALUES (?, ?, ?, ?)";


        conf.addRecord(sql, fname, lname, email, status);


    }
    
    
    
}
