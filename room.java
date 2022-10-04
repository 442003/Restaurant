import java.util.*;
public  class room
{
static  double total,amt;
room()
{
total=amt=0;
}
static void main ()
{
int m,n,ch,amt=0;
String st;
String a[] = {"         ","*","*","*","*","*","*","*","W","E","L","C","O","M","E"," ","T","O"," ","G","R","A","N","D"," ","H","Y","A","T","T"," ","R","O","O","M","S","*","*","*","*","*","*","*","                  "};
Scanner sc=new Scanner(System.in);
for ( m=0;m<a.length;m++)
{
System.out.print(a[m]);
for ( n=0;n<99999999.99;n++)
{
}
}
System.out.println("ROOM                     COST(PER ROOM)");
System.out.println("1.ORDINARY ROOM               4000 Rs");
System.out.println("2.ORDINARY ROOM WITH AC       6000 Rs");
System.out.println("3.DELUXE ROOM                 8000 Rs");
System.out.println("4.PREMIUM ROOM                10000 Rs");
System.out.println("5.ROOM FACING WATER FALL      15000 Rs");
System.out.println("6.COTTAGE(10 PEOPLE)          25000 Rs");
System.out.println("7.COTTAGE(30 PEOPLE)          30000 Rs");
System.out.println("8.FOR EXIT TO MAIN MENU.......");
System.out.println("PLEASE ENTER YOUR CHOICE FROM 1-8 NUMBERS");
ch=sc.nextInt(); 
switch(ch)
{
case 1:
{
System.out.println("HOW MANY ROOMS DO YOU WANT ?");
n=sc.nextInt();
amt=n*4000;
total=total+amt;
room.main();
}
break;
case 2:
{
System.out.println("HOW MANY ROOMS DO YOU WANT ?");
n=sc.nextInt();
amt=n*6000;
total=total+amt;
room.main();
}
break;
case 3:
{
System.out.println("HOW MANY ROOMS DO YOU WANT ?");
n=sc.nextInt();
amt=n*8000;
total=total+amt;
room.main();
}
break;
case 4:
{
System.out.println("HOW MANY ROOMS DO YOU WANT ?");
n=sc.nextInt();
amt=n*10000;
total=total+amt;
room.main();
}
break;
case 5:
{
System.out.println("HOW MANY ROOMS DO YOU WANT ?");
n=sc.nextInt();
amt=n*15000;
total=total+amt;
room.main();
}
break;
case 6:
{
System.out.println("HOW MANY ROOMS DO YOU WANT ?");
n=sc.nextInt();
amt=n*25000;
total=total+amt;
room.main();
}
break;
case 7:
{
System.out.println("HOW MANY ROOMS DO YOU WANT ?");
n=sc.nextInt();
amt=n*30000;
total=total+amt;
room.main();
}
break;
case 8:
{
restaurant.main();
}
break;
 default:
 System.out.println("ENTER ABOVE NUMBERS ONLY......");
room.main();
}
}
}

