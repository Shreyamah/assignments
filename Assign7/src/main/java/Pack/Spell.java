package Pack;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

/**
 * TODO shreyama This type ...
 *
 */
public class Spell {

  /**
   * @param args
   */
  public static void main(String[] args) {

    ExpressionParser parser = new SpelExpressionParser();

    Expression exp = parser.parseExpression("'Hello'");
    String message = (String) exp.getValue();
    System.out.println(message);

  }

}
