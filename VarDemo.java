class VariableType
{
  int a=10;
  static int b=200;
}
public class VarDemo
{
public static void main(String []args)
{
  System.out.println("Static variable is "+(VariableType.b));
  System.out.println("Instance variable "+(new VariableType().a));
}
}
