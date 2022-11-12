package Pac;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * TODO shreyama This type ...
 *
 */
public class Test {

  public static void main(String[] args) {

    Resource r = new ClassPathResource("conf.xml");
    BeanFactory factory = new XmlBeanFactory(r);
    Question q = (Question) factory.getBean("quest");
    q.display();

  }

}
