/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recruitment.assistant.portal;

import java.sql.*;
import java.util.Scanner;
//import static recruitment.assistant.portal.RecruitmentAssistantPortal.connecttodatabase;

/**
 *
 * @author sagarved
 */
public class NecessaryFunctions extends RecruitmentAssistantPortal{
    
    public String IDgenrator(String table, String IDtype)throws Exception{
//        RecruitmentAssistantPortal RAP = new RecruitmentAssistantPortal();
        Connection query = RecruitmentAssistantPortal.connecttodatabase();
//        Scanner sc = new Scanner(System.in);
        //PreparedStatement create = query.prepareStatement("select count(*) from AdminData;");
        //System.out.println(create);
        
        //Statement creation
        Statement S = query.createStatement();
        ResultSet RS = S.executeQuery("select count(*) from "+ table+";");
        int idcounter=0;
        while(RS.next()){
        idcounter = Integer.parseInt(RS.getString("count(*)"));          
        }
        
        return(IDtype+desiredoutput(idcounter+1));
       
        //System.out.println(count);        
                
    }
    
    public String desiredoutput(int num){
        String stringformattednumber = String.format("%05d", num);
        return stringformattednumber;      
    }
    
    public String FullName(String Firstname, String Lastname)throws Exception{
        String fullname = Firstname+" "+Lastname;
        return fullname;
    }
    
    public String dateofbirth(String day,String month, String year) throws Exception{
        String dateofbirth = year+" "+month+" "+day;
        return dateofbirth;
    }
    
    
    
    
}
