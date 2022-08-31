/* Declare a class A with some methods and 1 parameterized constructor. Derive another
 class B from class A. In class B there are some methods and 1 parameterized constructor.
 Derive class C from class B. Demonstrate how base class parameterized constructor gets call
 from child class constructor in multilevel inheritance.
*/
public class Q38
{
    public static void main(String[] args)
    {
        C obj = new C(10);
        obj.display();
    }
}
class A
{
    int num; //Data member
    A()
    {
        num = 0;
    }
    A(int x) //Parameterized constructor
    {
        num = x;
        System.out.println("Value of num = " + num);
    }
    static void display() //Member function
    {
        //System.out.println("Value of x = " + num);
        System.out.println("This is class A's method");
    }
}
class B extends A
{
  int num;
  B()
  {
      num = 0;
  }
  B(int x)
  {
      num = x;
      System.out.println("Value of num = " + num);
  }
  static void display()
  {
      System.out.println("This is class B's method");
  }
}
class C extends B
{
    int num;
    C(int x)
    {
        num = x;
    }
    static void display()
    {
        System.out.println("This is class C's method");
    }
}