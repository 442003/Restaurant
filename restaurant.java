import java.util.*;
public  class restaurant
{


static void main () 
{
int m,n,r=0,opt=0,ch;

String nam;
String a[] = {"                            ","*","*","*","*","*","*","*","W","E","L","C","O","M","E"," ","T","O"," ","G","R","A","N","D"," ","H","Y","A","T","T"," ","M","A","I","N"," ","M","E","N","U","*","*","*","*","*","*","*","           "};
Scanner sc=new Scanner(System.in);
for ( m=0;m<a.length;m++)
{
System.out.print(a[m]);
for ( n=0;n<99999999.99;n++)
{
}
}


System.out.println("                                                                                    ");                        
System.out.println("                             ...................WORLDS NO 1 HOTEL...................");
System.out.println("  ---------------------------------------------FACILITY AVALIABLE---------------------------------------------");
System.out.println("  ------------------------------------------------------------------------------------------------------------");
System.out.println("          1.HOTEL INFORMATION");
System.out.println("          2.ROOM RESERVATION");
System.out.println("          3.FOOD MANIA");
System.out.println("          4.ENTERTAINMENT");
System.out.println("          5.BILL");
System.out.println("          6.EXIT");
System.out.println(" ------------------------------------------------------------------------------------------------------------");
System.out.println(" ------------------------------------------------------------------------------------------------------------");
System.out.println("PLEASE ENTER YOUR CHOICE..............HURRY............BOOKINGS GOING ON...........");
 ch=sc.nextInt();
switch(ch)
{
case 1:
{
information.main();
}
break;
case 2:
{
room.main();
}
break;
case 3:
{
food_court.main();
}
break;
case 4:
{
enter.main();
}
break;
case 5:
{
bill.main();
}
break;
case 6:
{
System.out.println("THANK YOU........HOPE YOU ENJOYED OUR HOSPITALITY AND FACILITY......DO VISIT AGAIN.......");

break;
}



default:
System.out.println("PLEASE ENTER THE NUMBERS PROVIDED ONLY(1,2,3,4)");
restaurant.main();
}
}

}
