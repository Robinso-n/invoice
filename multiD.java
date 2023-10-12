package marksheet;
import java.util.Scanner;
public class multiD {
	public static void main(String[] args) {
		 int marks[][]=new int[4][3];
		 int roll[]=new int[4];
         String name[]=new String[4];
         float average[]= new float[4];
         char grade[]= new char[4];
         int total[]=new int [4];
         char result[]=new char [4];     
         
         for(int i=0; i<4 ; i++){
             Scanner sc= new Scanner(System.in);
        	 System.out.print("Enter the student Roll Number : ");
        	 roll[i]=sc.nextInt();
        	 
        	 System.out.print("Enter the student Name :");
        	 name[i]=sc.next();
             System.out.print("Enter the three Marks :  ");
             for(int j=0; j<3; j++){
                     marks[i][j]= sc.nextInt();
             total[i]+=marks[i][j];
             average[i]=total[i]/3;
             if (average[i]>50) {result[i]='p';} else {result[i]='f';}
             if (average[i]>70) {grade[i]='A';}
             else if (average[i]>50) {grade[i]='B';}
             else if (average[i]<50) {grade[i]='c';}
            	 
             
             }
             System.out.println("The total is:  "+total[i]);
             
             }
         System.out.println("**********************************************************");
         System.out.println("\t\t\tSTUDENT MARKLIST");
         System.out.println("**********************************************************");
         System.out.println("ROLL \t NAME   \t MARK1 \t MARK2 \tMARK3 \tTOTAL \tRESULT \t AVERAGE \t GRADE");
         
         for(int i=0; i<4; i++) {
        	 
        	 
        	 System.out.println(""+roll[i]+" \t "+name[i]+ "   \t "+marks[i][0]+" \t "+marks[i][1]+" \t"+marks[i][2]+" \t"+total[i]+" \t"+result[i]+"\t "+average[i]+" \t\t"+grade[i]);
         
	};
}}
