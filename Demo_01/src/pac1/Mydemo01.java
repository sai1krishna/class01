package pac1;

import org.testng.annotations.Test;

public class Mydemo01 {
  @Test (priority=1)
  public void f() {
	  System.out.println("f");  
  }
  @Test (priority=2, enabled= false)
  public void g() {
	  System.out.println("g");  
  }
  @Test (priority=3)
  public void h() {
	  System.out.println("h");  
  }
  
}
