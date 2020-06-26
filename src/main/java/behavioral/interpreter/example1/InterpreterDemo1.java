package behavioral.interpreter.example1;

public class InterpreterDemo1 {

    public static void main(String[] args) {
        //String context = "Lions";
        //String context = "Tigers";
        //String context = "Bears";
        //String context = "Lions Tigers";
        String context = "Lions Bears";
        //String context = "Tigers Bears";

        Expression define = buildIterpreterTree();
        // Bears and (Lions or (Tigers and Bears))
        System.out.println(context + " is " + define.interpret(context));
    }

    private static Expression buildIterpreterTree() {
        Expression lions  = new TerminalExpression("Lions");
        Expression tigers = new TerminalExpression("Tigers");
        Expression bears  = new TerminalExpression("Bears");

        // Tigers and Bears
        Expression alternation1 = new AndExpression(tigers, bears);

        // Lions or (Tigers and Bears)
        Expression alternation2 = new OrExpression(lions, alternation1);
        // Bears and (Lions or (Tigers and Bears))
        return new AndExpression(bears, alternation2);
    }

}
