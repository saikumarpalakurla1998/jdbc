class Parent
{
void display()
{
System.out.println("Saikumar------");
}
}
class Child extends Parent
{
void display()
{
super.display();
System.out.println("Kumar------");
}
}
class MethodoverridingEx1
{
public static void main(String[] args)
{
Child ch = new Child();
ch.display();
}
}