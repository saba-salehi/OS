package os.Query;

import os.Model.Expression;

public class ifQuery extends Query {
    Query iq;
    Expression exp;

    public ifQuery (Query iq, Expression exp) {
        this.iq = iq;
        this.exp = exp;
    }

    public Query getiq() {
        return this.iq;
    }

    public Expression getExp() {
        return this.exp;
    }
}
