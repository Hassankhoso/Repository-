
import java.util.Scanner;
class CPN{
public static void main(String[] arg)
{
    double matriculation;
double intermediate;
int    test_marks;
double cpn;
Scanner obj=new Scanner(System.in);
System.out.println("Enter Matriculation Marks in percentage:");

matriculation=obj.nextDouble();

System.out.println("Enter Intermediate Marks in percentage:");

intermediate=obj.nextDouble();

System.out.println("Enter Test Marks:");

test_marks =obj.nextInt();

cpn=(matriculation*0.25) + (intermediate*0.15) + (test_marks*0.80);

System.out.println("Cpn is:"+(cpn));
}
}
