// Operator Application: User chooses 2 numbers and an operator to perform mathematical operation

package vttp.d1;

import java.io.Console;

public class Operator {
    public static void main(String[] args) {
        Console cons = System.console();
        Float result = 0f; 
        String operator = cons.readLine("Choose an operator: add, subtract, multiply, divide\n");
        String opnd0 = cons.readLine("Choose 1st number: ");
        String opnd1 = cons.readLine("Choose 2nd number: ");

        int val0 = Integer.parseInt(opnd0);
        int val1 = Integer.parseInt(opnd1);
        String opSymbol = ("");

        switch(operator) {
            case "add":
                result = (float)(val0 + val1);
                opSymbol = "+";
                break;
            case "subtract":
                result = (float)(val0 - val1);
                opSymbol = "-";
                break;
            case "multiply":
                result = (float)(val0 * val1);
                opSymbol = "x";
                break;
            case "divide":
                result = (float)(val0/val1);
                opSymbol = "/";
            }

            System.out.printf("Result: %d %s %d = %.3f", val0, opSymbol, val1, result);
     }
}
