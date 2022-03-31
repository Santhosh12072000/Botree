package JFS.BookShopApp;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class ExpParser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExpressionParser expressionParser=new SpelExpressionParser();
		  Expression expression=expressionParser.parseExpression("'AnyString'");
		  String result=(String)expression.getValue();
		  System.out.println(result);

	}

}
