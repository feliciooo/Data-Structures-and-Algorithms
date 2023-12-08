import java.util.*;

public class Rentura_StudentList {

    public static void main(String[] args) {
        
        Map <String, String> stuMap = new HashMap<>();
        Scanner sc = new Scanner (System.in);
        
        for(int i = 1; i <= 3; i++){
        
            System.out.println("Enter student number " + i + ": ");
            String stuNum = sc.nextLine();
            
            System.out.println("Enter first name " + i + ": ");
            String stuName = sc.nextLine();
            
            stuMap.put(stuNum, stuName);
        
        }
        
        for(Map.Entry e : stuMap.entrySet()){
       
            System.out.println(e.getKey() + " " + e.getValue());
       }
        
            String thirdKey = stuMap.keySet().toArray()[2].toString();
            stuMap.remove(thirdKey);
       
            System.out.println("Enter your student number: ");
            String stuNum2 = sc.nextLine();
            
            System.out.println("Enter your first name: ");
            String stuName2 = sc.nextLine();
            
            stuMap.put(stuNum2, stuName2);
            
        for(Map.Entry e : stuMap.entrySet()){
       
            System.out.println(e.getKey() + " " + e.getValue());
       }
    }
}