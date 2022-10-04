import java.util.*;
public  class food_court
{
static  double total,amt;
food_court()
{
total=amt=0;
}
static void main () 
{
int m,n,ch,amt=0;
String st;
String a[] = {"            ","*","*","*","*","*","*","*","W","E","L","C","O","M","E"," ","T","O"," ","G","R","A","N","D"," ","H","Y","A","T","T"," ","F","O","O","D","*","*","*","*","*","*","*","*","                  "};
 Scanner sc=new Scanner(System.in);
for ( m=0;m<a.length;m++)
{
System.out.print(a[m]);
for ( n=0;n<99999999.99;n++)
{
}
}
System.out.println("ITEMS                       COST(PER ITEM)");
System.out.println("1.RAJASTHANI THALI                   300 Rs");
System.out.println("2.SOUTH INDIAN THALI                 450 Rs");
System.out.println("3.MAHARASHTRIAN THALI                300 Rs");
System.out.println("4.CHINESE COMBO                      700 Rs");
System.out.println("5.JAPANESE COMBO                     850 Rs");
System.out.println("6.GUJRATHI THALI                     500 Rs");
System.out.println("7.SPECIAL GRAND HYATT COMB0         1000 Rs");
System.out.println("8.FOR EXIT TO MAIN MENU.......");
System.out.println("PLEASE ENTER YOUR CHOICE FROM 1-8 NUMBERS");
ch=sc.nextInt(); 
switch(ch)
{
case 1:
{
System.out.println("PLEASE ENTER THE QUANTITY OF FOOD ITEMS ?");
n=sc.nextInt();
amt=n*300;
total=total+amt;
food_court.main();
}
break;
case 2:
{
System.out.println("PLEASE ENTER THE QUANTITY OF FOOD ITEMS ?");
n=sc.nextInt();
amt=n*450;
total=total+amt;
food_court.main();
}
break;
case 3:
{
System.out.println("PLEASE ENTER THE QUANTITY OF FOOD ITEMS ?");
n=sc.nextInt();
amt=n*300;
total=total+amt;
food_court.main();
}
break;
case 4:
{
System.out.println("PLEASE ENTER THE QUANTITY OF FOOD ITEMS ?");
n=sc.nextInt();
amt=n*700;
total=total+amt;
food_court.main();
}
break;
case 5:
{
System.out.println("PLEASE ENTER THE QUANTITY OF FOOD ITEMS ?");
n=sc.nextInt();
amt=n*850;
total=total+amt;
food_court.main();
}
break;
case 6:
{
System.out.println("PLEASE ENTER THE QUANTITY OF FOOD ITEMS ?");
n=sc.nextInt();
amt=n*500;
total=total+amt;
food_court.main();
}
break;
case 7:
{
System.out.println("PLEASE ENTER THE QUANTITY OF FOOD ITEMS ?");
n=sc.nextInt();
amt=n*1000;
total=total+amt;
food_court.main();
}
break;
case 8:
{
restaurant.main();
}
break;
 default:
 System.out.println("ENTER ABOVE NUMBERS ONLY......");
 food_court.main();
}
}
}
