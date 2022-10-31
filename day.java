//Author  : Vaishnavi Sheoran.
//Date      : 20/01/2020.
//Purpose: Printing the day of entered date.

import java.io.*;
class day
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int k,m,w,M=0;
Long year,c,y;
boolean b1,b2;
System.out.println("\n\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\n");
System.out.println("Input the date");
k=Integer.parseInt(br.readLine());
System.out.println("Input the no. for the month");
m=Integer.parseInt(br.readLine());
System.out.println("Input the year");
year=Long.parseLong(br.readLine());
b1=year%4==0;
b2=year%4!=0;
if(m>2&&m<=12)
{
M=m-2;
}
else if(m>0&&m<=2)
{
M=m+10;
year-=1;
}
c=year/100;
y=year%100;
w=(int)((k+(Math.floor(2.6*M-0.2))-2*c+y+(Math.floor(y/4))+(Math.floor(c/4)))%7);
System.out.println("\n\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\n");
if(((m==1||m==3||m==5||m==7||m==8||m==10||m==12)&&k>0&&k<=31)||((m==4||m==6||m==9||m==11)&&k>0&&k<=30)||(m==2&&k>0&&k<=29&&b1)||(m==2&&k>0&&k<=28&&b2))
{
if(w<0)
{
w+=7;
}
if(w==0)
{
System.out.println("Sunday");
}
if(w==1)
{
System.out.println("Monday");
}
if(w==2)
{
System.out.println("Tuesday");
}
if(w==3)
{
System.out.println("Wednesday");
}
if(w==4)
{
System.out.println("Thursday");
}
if(w==5)
{
System.out.println("Friday");
}
if(w==6)
{
System.out.println("Saturday");
}
}
else
{
if(m<1||m>12)
{
System.out.println("WRONG MONTH");
}
else
{
System.out.println("WRONG DATE");
}
}
System.out.println("\n\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f");
}
}

const reportWebVitals = onPerfEntry => {
  if (onPerfEntry && onPerfEntry instanceof Function) {
    import('web-vitals').then(({ getCLS, getFID, getFCP, getLCP, getTTFB }) => {
      getCLS(onPerfEntry);
      getFID(onPerfEntry);
      getFCP(onPerfEntry);
      getLCP(onPerfEntry);
      getTTFB(onPerfEntry);
    });
  }
};

export default reportWebVitals;
