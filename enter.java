import java.util.*;
public  class enter
{
static  double total,amt;
enter()
{
total=amt=0;
}
static void main () 
{
int m,n,ch,amt=0;
String st;
String a[] = {"                 ","*","*","*","*","*","*","*","W","E","L","C","O","M","E"," ","T","O"," ","G","R","A","N","D"," ","H","Y","A","T","T"," ","E","N","T","E","R","T","A","I","N","M","E","N","T","*","*","*","*","*","*","*","                  "};
 Scanner sc=new Scanner(System.in);
for ( m=0;m<a.length;m++)
{
System.out.print(a[m]);
for ( n=0;n<99999999.99;n++)
{
}
}
System.out.println("FACILITIES                   COST(PER FACILITY)");
System.out.println("1.SPA(FOR 1 HOUR)             3000 Rs");
System.out.println("2.SPA(FOR 3 HOUR)             3570 Rs");
System.out.println("3.SCUBA DIVING                5000 Rs");
System.out.println("4.ELEPHANT TRAIL              4500 Rs");
System.out.println("5.PARAGLIDING                 7500 Rs");
System.out.println("6.BIRD WATCHING               2570 Rs");
System.out.println("7.TREKKING                    6000 Rs");
System.out.println("8.FOR EXIT TO MAIN MENU.......");
System.out.println("PLEASE ENTER YOUR CHOICE FROM 1-8 NUMBERS");
ch=sc.nextInt(); 
switch(ch)
{
case 1:
{
System.out.println("NUMBER OF PEOPLE ?");
n=sc.nextInt();
amt=n*3000;
total=total+amt;
enter.main();
}
break;
case 2:
{
System.out.println("NUMBER OF PEOPLE ?");
n=sc.nextInt();
amt=n*3750;
total=total+amt;
enter.main();
}
break;
case 3:
{
System.out.println("NUMBER OF PEOPLE ?");
n=sc.nextInt();
amt=n*5000;
total=total+amt;
enter.main();
}
break;
case 4:
{
System.out.println("NUMBER OF PEOPLE ?");
n=sc.nextInt();
amt=n*4500;
total=total+amt;
enter.main();
}
break;
case 5:
{
System.out.println("NUMBER OF PEOPLE ?");
n=sc.nextInt();
amt=n*7500;
total=total+amt;
enter.main();
}
break;
case 6:
{
System.out.println("NUMBER OF PEOPLE ?");
n=sc.nextInt();
amt=n*2570;
total=total+amt;
enter.main();
}
break;
case 7:
{
System.out.println("NUMBER OF PEOPLE ?");
n=sc.nextInt();
amt=n*6000;
total=total+amt;
enter.main();
}
break;
case 8:
{
restaurant.main();
}
break;
 default:
 System.out.println("ENTER ABOVE NUMBERS ONLY......");
enter.main();
}
}
}

