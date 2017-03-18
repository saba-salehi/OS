package os.Query;

import os.Model.Expression;
public class echoQuery extends Query {
	Expression exp;
	public echoQuery(Expression exp) {
		this.exp = exp;
	}

	public Expression getExp() {
		return this.exp;
	}
}
