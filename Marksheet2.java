package programs;
import java.util.Scanner;
public class Marksheet2 {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter the number of units: ");
	        int numUnits = scanner.nextInt();
	        
	        int[] unitmarks = new int[numUnits];

	        String[] unitcode = new String[numUnits];
	        
	        String[] unitname = new String[numUnits];
	        
	        
	        
	        for (int i = 0; i < numUnits; i++) {
	           
	            System.out.println("Enter the unit code: ");
	            unitcode[i] = scanner.next();
	            
	            System.out.println("Enter the unit name: ");
	            unitname[i] = scanner.next();

	            System.out.println("Enter the unit scores: ");
	            unitmarks[i] = scanner.nextInt();
	       
	        }
	        int total=0;
	        for (int i=0; i<numUnits; i++) { total=total+unitmarks[i];}
	        String name,rollNo;
	        int semester;
	        
	        System.out.println("enter your name ");
	        Scanner entry= new Scanner(System .in);
	        name = entry.nextLine();
	        
	        System.out.println(" enter your Roll_No");
	        Scanner e= new Scanner(System .in);
	        rollNo=e.nextLine();
	        
	        System.out.println("Enter the semester");
	        Scanner en= new Scanner(System .in);
	        semester= en.nextInt();
	        
	        System.out.println("");
	            float average=total/numUnits;
	            char grade=('A');
	            if (total>=70) {grade='A';}
	            else if (total>=60) {grade='B';}
	            else if (total>=50) {grade='C';}
	            else if (total>=40) {grade='D';}
	            else if (total<40) {grade='E';}
	            
	            System.out.println("\t\tDepartment of Computer Science");
	            System.out.println("\t\t\tEnd of semester results");
	            System.out.println("------------------------------------------------------------------------------------");
	            System.out.println("|Name:-"+name+"\t\t Roll_No: "+rollNo+"\t\t Semester:"+semester);
	            System.out.println("");
	            System.out.println("____________________________________________________________________________________");
	            System.out.println("|Unit Code \t\t |Unit Name: \t\t Score");
	            System.out.println("------------------------------------------------------------------------------------");
	            System.out.println("|"+unitcode[0]+"\t\t| "+unitname[0]+"\t\t|"+unitmarks[0]);
	            System.out.println("");
	            System.out.println("| "+unitcode[1]+"\t\t | "+unitname[1]+"\t\t |"+unitmarks[1]);
	            System.out.println("");
	            System.out.println("| "+unitcode[2]+"\t\t | "+unitname[2]+"\t\t |"+unitmarks[2]);
	            System.out.println("");
	            System.out.println("| "+unitcode[3]+"\t\t | "+unitname[3]+"\t\t |"+unitmarks[3]);
	            System.out.println("------------------------------------------------------------------------------------");
	            System.out.println("|Total\t\t\t\t\t|"+total);
	            System.out.println("------------------------------------------------------------------------------------");
	            System.out.println("|Average\t\t\t\t|"+average);
	            System.out.println("------------------------------------------------------------------------------------");
	            System.out.println("|Grade\t\t\t\t\t|"+grade);
	            System.out.println("------------------------------------------------------------------------------------");
	            System.out.println("\t\t\t\t\tRecommendation|");
	            System.out.println("------------------------------------------------------------------------------------");
	            System.out.println("Grading Criteria \t\t Overall Grade(A-D) \t Recommend Pass \n 70-100 \t A \n 60-70 \t\t B \n 50-60 \t\t C \n 40-50 \t\t D \n Below 40 \t f");
	            System.out.println("------------------------------------------------------------------------------------");
	            
	            
	            
	}
}
