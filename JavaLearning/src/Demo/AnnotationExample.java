package Demo;

class ParentClass
{
  void eatchicken()
  {
	  System.out.println("hii");
  }
}
class Subclass extends ParentClass
{
	  @Override
	  void eatchicken()
	  {
		  System.out.println("hello");
	  }
}
public class AnnotationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ParentClass pc = new Subclass();
		pc.eatchicken();
	}

}
