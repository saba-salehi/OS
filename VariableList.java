package os.Model;

import java.util.HashMap;
import java.util.Map;
import os.Query.*;

public class VariableList {
	Map<String, String> values;
	
	public VariableList() {
		values = new HashMap<String, String>();
	}
	
	public void add(String name, String value) {
		this.values.put(name, value);
	}

	public String execute(Query q) {
		if (q instanceof echoQuery)
		{
			echoQuery eq = (echoQuery) q;
			return eq.getExp().evaluate();
		}
		else if (q instanceof forQuery)
		{
			forQuery fq = (forQuery) q;
			execute(fq.getq1());
			while(fq.getExp().evaluate().equals("1"))
			{
				execute(fq.getq3());
				execute(fq.getq2());
			}
		}
		else if (q instanceof ifQuery)
		{
			ifQuery ifq = (ifQuery) q;
			if(ifq.getExp().evaluate().equals("1"))
				execute(ifq.getiq());
		}
		else if (q instanceof setQuery)
		{
			setQuery sq = (setQuery) q;
			values.put(sq.getName(), sq.getExp().evaluate());
		}
		else if (q instanceof whileQuery)
		{
			whileQuery whileq = (whileQuery) q;
			while(whileq.getExp().evaluate().equals("1"))
				execute(whileq.getwq());
		}
//		throw exception
		return "";
	}
}
