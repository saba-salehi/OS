package os.Query;

import os.Model.Expression;

public class forQuery extends Query {
	Query q1, q2, q3;
	Expression exp;

	public forQuery (Query q1, Query q2, Query q3, Expression exp) {
		this.q1 = q1;
		this.q2 = q2;
		this.q3 = q3;
		this.exp = exp;
	}

	public Query getq1() {
		return this.q1;
	}

	public Query getq2() {
		return this.q2;
	}

	public Query getq3() {
		return this.q3;
	}

	public Expression getExp() {
		return this.exp;
	}
}