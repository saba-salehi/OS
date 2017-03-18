package os.CLI;

import os.Model.Expression;
import os.Query.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parser {
    public static Query parse(String str)
    {
        str.trim();
        Pattern echo_pattern = Pattern.compile("[eE][cC][hH][oO].*\\((.*)\\)");
        Matcher m = echo_pattern.matcher(str);
        if (m.find()) {
            Expression exp = new Expression(m.group(1));
            return new echoQuery(exp);
        }
        Pattern for_pattern = Pattern.compile("[fF][oO][rR].*\\((.*);(.*);(.*)\\).*\\{(.*)\\}");
        m = for_pattern.matcher(str);
        if (m.find()) {
            Query q1 = parse(m.group(1));
            Expression exp = new Expression(m.group(2));
            Query q2 = parse(m.group(3));
            Query q3 = parse(m.group(4));
            return new forQuery(q1, q2, q3, exp);
        }
        Pattern if_pattern = Pattern.compile("[iI][fF].*\\((.*)\\).*\\{(.*)\\}");
        m = if_pattern.matcher(str);
        if (m.find()) {
            Expression exp = new Expression(m.group(1));
            Query q1 = parse(m.group(2));
            return new ifQuery(q1, exp);
        }
        Pattern set_pattern = Pattern.compile("[sS][eE][tT].*\\((.*),(.*)\\)");
        m = set_pattern.matcher(str);
        if (m.find()) {
            Expression exp = new Expression(m.group(2));
            return new setQuery(m.group(1), exp);
        }
        Pattern while_pattern = Pattern.compile("[wW][hH][iI][lL][eE].*\\((.*)\\).*\\{(.*)\\}");
        m = while_pattern.matcher(str);
        if (m.find()) {
            Expression exp = new Expression(m.group(1));
            Query q1 = parse(m.group(2));
            return new whileQuery(q1, exp);
        }
        return null;
    }
}
