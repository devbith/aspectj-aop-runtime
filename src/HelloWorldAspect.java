
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.After;

@Aspect
public class HelloWorldAspect {

  @After("execution (* HelloWorld.*(..))")
  public void greetAspect() {
      System.out.print(", World");
  }
}
