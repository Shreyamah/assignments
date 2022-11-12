package Packs;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * TODO shreyama This type ...
 *
 */
public class App {

  /**
   * @param args
   */
  public static void main(String[] args) {

    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "Spring-Customer.xml" });

    CustomerService cust = (CustomerService) context.getBean("customerService");

    System.out.println(cust);

    context.close();

  }

}
