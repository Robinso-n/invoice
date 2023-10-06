import java.util.Scanner;
public class saf{
        public static void main(String[] args){
        int choice;
        System.out.println("\t\t\tCarrier info\n");
        System.out.println("0:Sh20 (30mins, 3hrs)");
        System.out.println("1:Sh10 (15Mins, 1hr)");
        System.out.println("2:Sh20 (15Mins, Midnight)");
        System.out.println("3:Okoa 50 \n4:Okoa 20 \n5:Okoa 10 \n6:Okoa 5 \n7:Okoa20(900MB 1hr) \n8:Okoa Internet \n98:More");
        Scanner input=new Scanner(System.in);
        choice=input.nextInt();

        switch(choice){
            case 0:{

                System.out.println("Existing Unpaid Okoa; 0");
                System.out.println("New Okoa Request: 20");
                System.out.println("TOTAL DEPT will be: 20");
                System.out.println("1:Accept \n 2:Decline \n 0:BACK 00:HOME");
                do {
                choice=input.nextInt();

                }
                while(choice !=0);
                break;
            }
            case 1:{

                do{
                    System.out.println("Existing Unpaid Okoa; ");
                    System.out.println("New Okoa Request: 10");
                    System.out.println("TOTAL DEPT will be: 0");
                    System.out.println("1:Accept \n 2:Decline \n 0:BACK 00:HOME");
                    choice=input.nextInt();}
                    while(choice !=0);
                break;

            }
            case 2:{
                choice=input.nextInt();
                do{
                System.out.println("Existing Unpaid Okoa; 0");
                System.out.println("New Okoa Request: 20");
                System.out.println("TOTAL DEPT will be: 20");
                System.out.println("1:Accept \n 2:Decline \n 0:BACK 00:HOME");}
                while(choice !=0);
                break;
            }
            case 3:{
                choice=input.nextInt();
                do{
                    System.out.println("Existing Unpaid Okoa; 0");
                    System.out.println("New Okoa: 50");
                    System.out.println("TOTAL DEPT will be: 50");
                    System.out.println("1:Accept \n 2:Or GET EXTRA (CONVERT to 150 bob\nKredo for Call & SMS valid midnight ) \n 0:BACK 00:HOME");}
                    while(choice !=0);
                break;}
            case 4:{
                choice=input.nextInt();
                do{
                    System.out.println("Existing Unpaid Okoa; 0");
                    System.out.println("New Okoa: 20");
                    System.out.println("TOTAL DEPT will be: 20");
                    System.out.println("1:Accept \n 2:Or GET EXTRA (CONVERT to 150 bob\nKredo for Call & SMS valid midnight ) \n 0:BACK 00:HOME");}
                    while(choice !=0);
                break;}

            case 5:{
                choice=input.nextInt();
                do{
                    System.out.println("Existing Unpaid Okoa; 0");
                    System.out.println("New Okoa Request: 10");
                    System.out.println("TOTAL DEPT will be: 10");
                    System.out.println("1:Accept \n 2:Decline \n 0:BACK 00:HOME");}
                    while(choice !=0);
                break;}
            case 6:{
                choice=input.nextInt();
                do{
                    System.out.println("Existing Unpaid Okoa; 0");
                    System.out.println("New Okoa Request: 5");
                    System.out.println("TOTAL DEPT will be: 5");
                    System.out.println("1:Accept \n 2:Decline \n 0:BACK 00:HOME");}
                    while(choice !=0);
                break;}
            case 7:{
                choice=input.nextInt();
                do{
                    System.out.println("Okoa 90MB @sh20 for 1hr");
                    System.out.println("1:Accept \n 2:Decline \n 0:BACK 00:HOME");}
                    while(choice !=0);
                break;}
            case 8:{choice=input.nextInt();
                do{
                    System.out.println("Okoa bundles");
                    System.out.println("1: Sh20(900MB, 1hr)");
                    System.out.println("2: Sh20(90MB, 24hrs)");
                    System.out.println("3: Sh10(30MB, 24hrs)");
                    System.out.println("4: Sh5(10MB, 24hrs)");
                    System.out.println("0:BACK");}
                    while(choice !=0);
                break;
                }
            case 98:{
                choice=input.nextInt();
                do{
                    System.out.println("9: Okoa Minutes\n10:Okoa SMS\n11:Lipa Okoa\n#:Check Balance\n0:BACK");}
                    while(choice !=0);
                break;
    }

}
    }
}
