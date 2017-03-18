package os.Query;

import os.Model.Expression;
import os.Model.VariableList;

public class setQuery extends Query {
	String name;
	Expression exp;
	public setQuery(String name, Expression exp) {
		this.name = name;
		this.exp = exp;
	}

	public String getName() {
		return this.name;
	}

	public Expression getExp() {
		return this.exp;
	}
}
