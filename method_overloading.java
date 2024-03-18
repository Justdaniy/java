class mthd_ovrld
{
void sum(int x,int y)
{
int s=x+y;
System.out.println("sum of first value="+s);
}
void sum(int x,int y,int z)
{
int s1=x+y+z;
System.out.println("sum of second value="+s1);
}}
class main
{
public static void main(String args[])
{
mthd_ovrld m=new mthd_ovrld();
m.sum(1,1);
m.sum(1,1,1);
}}
