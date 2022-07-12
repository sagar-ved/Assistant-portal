/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recruitment.assistant.portal;
import java.sql.*;
import java.util.*;

/**
 *
 * @author sagarved
 */
public class RecruitmentAssistantPortal {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args){
        
        try {
             //  Block of code to try
            connecttodatabase();
            Database_Creation();
            //queryexecutionforAdminData();
            NecessaryFunctions NF = new NecessaryFunctions();
            
            //String table, String Admin
            String temp = NF.IDgenrator("AdminData","GUEST");
            System.out.println(temp);
             }
        catch(Exception e) {
            //  Block of code to handle errors
            System.out.println(e);
            }
    } 
    
   public static Connection connecttodatabase() throws Exception{
    String url = "jdbc:mysql://localhost:3306/RAPortal";
        String uname = "root";
        String pass = "1234567890";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url,uname,pass);
        //System.out.print("Connection Establish! Level 1 \n");
        return con;
    }
   
    /**
     CREATE ALL NEW TABLES WITH EXCEPTION HANDLING
     **/
   public static void Database_Creation() throws Exception{
   try{		      
            Scanner sc = new Scanner(System.in);
            Connection con = connecttodatabase();
            //System.out.print("Connection Establish! Level 2 \n");
            PreparedStatement create = con.prepareStatement("CREATE TABLE IF NOT EXISTS AdminData (UserName varchar(10) NOT NULL, UserPassword VARCHAR(15) NOT NULL, AdminName  VARCHAR(30) NOT NULL,PRIMARY KEY (UserName));");
            //System.out.print("Database Created! Level 3 \n");
            create.executeUpdate();
//            create = con.prepareStatement("create table if not exists UserDemographicData( ParticipantID varchar(15) not null, ParticipantName varchar(50) not null, Gender varchar(10) not null, Dateofbirth date not null, worksas varchar(20) not null, phonenumber varchar(12) not null,email varchar(50) not null, FavouriteLanguage varchar(20) not null, Highesteducation varchar(30) not null, state varchar(30) not null, country varchar(30) not null, fieldofinterest varchar(100) not null, termsandconditions varchar(50) not null, score int(5), primary key(ParticipantID));");
            create = con.prepareStatement("create table if not exists UserDemographicData( ParticipantID varchar(15) not null, ParticipantName varchar(50) not null, Gender varchar(10) not null, Dateofbirth date not null, profession varchar(20) not null, phonenumber varchar(12) not null,email varchar(50) not null, FavouriteLanguage varchar(20) not null, Highesteducation varchar(30) not null, state varchar(30) not null, country varchar(30) not null, fieldofinterest varchar(100) not null, termsandconditions varchar(50) not null, score int(5), primary key(ParticipantID));");
            create.executeUpdate();
            System.out.print("Database Created! Level 4 \n");
            
            
            
            /*while (true){
                System.out.println("1:Insertion \n2:Deletion \n3:Exit");
                System.out.print("Enter Choice:");
                int choice = sc.nextInt();
                switch (choice){
                    case 1: System.out.print("Enter uname:");
                            String uname = sc.next();
                            System.out.print("Enter pass:");
                            String pass = sc.next();
                            create = con.prepareStatement("insert into AdminData values(\"" + uname + "\",\"" + pass + "\");");
                            create.executeUpdate();
                    case 3: return;
                }
            }*/
      } 
   catch (Exception e) {
          System.out.println(e);
            } 
   finally {
       System.out.println("Function Created");
        };
        
   }
      /**
     QUERY OPERATIONS FOR ADMINDATA TABLE WITH EXCEPTION HANDLING
     **/
        public static void queryexecutionforAdminData() throws Exception{
        try{
            Connection query = connecttodatabase();
        Scanner sc = new Scanner(System.in);
        
        
        System.out.print("Enter Choice:");
                int choice = sc.nextInt();
                switch (choice){
                    case 1: System.out.print("Enter uname:");
                            String uname = sc.next();
                            System.out.print("Enter pass:");
                            String pass = sc.next();
                            PreparedStatement create = query.prepareStatement("insert into AdminData values(\"" + uname + "\",\"" + pass + "\");");
                            create.executeUpdate();
                            break;
                            
                    case 2: System.out.print("Enter uname:");
                            uname = sc.next();
                            System.out.print("Enter new pass:");
                            pass = sc.next();
                            create = query.prepareStatement("update AdminData set UserPassword  =  \""+pass+"\" where UserName = \""+uname+"\";");
                            create.executeUpdate();
                            break;
                            
                    case 3: break;
                }
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("Query executed for Admin table");
        }
        }
         /**
     QUERY OPERATIONS FOR  TABLE WITH EXCEPTION HANDLING
     **/
        

}
    

