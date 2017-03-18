package os.Query;

import os.Model.Expression;

public class whileQuery extends Query {
    Query wq;
    Expression exp;

    public whileQuery (Query wq, Expression exp) {
        this.wq = wq;
        this.exp = exp;
    }

    public Query getwq() {
        return this.wq;
    }

    public Expression getExp() {
        return this.exp;
    }
}