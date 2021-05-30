public class Exception2
{
public static void main(String[]args)
{
System.out.println("main start");
try
{
System.out.println(args[0]);
}catch(Exception obj)
{
System.out.println("empty arg");
}
System.out.println("end of main");
}
}
