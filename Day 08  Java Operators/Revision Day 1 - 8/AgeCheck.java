class AgeCheck
{
public static void  main(String args[])
{
String name = args[0];
int age = Integer.parseInt(args [1]);
System.out.println("Name : " +name);
String result = (age >= 18 && age <= 60) ? "Registration : Allowed" : "Registration : Not Allowed";
System.out.println(result);
}
}