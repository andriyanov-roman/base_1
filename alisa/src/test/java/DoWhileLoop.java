import java.io.IOException;

/**
 * Created by User on 05.07.2015.
 */
public class DoWhileLoop {
    public static void main(String[] args)throws IOException {// to handle input errors
        char choice;
        do{
            System.out.println("Help on:");
            System.out.println(" 1. if");
            System.out.println(" 2. switch");
            System.out.println(" 3. while");
            System.out.println(" 4. do-while");
            System.out.println(" 5. for\n");
            System.out.println("Chose one:");
            choice = (char)System.in.read();// console input functions
        }while(choice < '1'|| choice > '5');
        System.out.println("\n");
         switch (choice){
             case '1':
                 System.out.println("The if:\n");
                 System.out.println("if (condition) statement;");
                 System.out.println("else statement;");
                 break;
             case '2':
                 System.out.println("The switch:\n");
                 System.out.println("switch (expression) {");
                 System.out.println("case constant:");
                 System.out.println("statement sequence");
                 System.out.println(" break;");
                 System.out.println(" //...");
                 System.out.println(" }");
                 break;
             case '3':
                 System.out.println("The while:\n");
                 System.out.println("while (condition) statement;");
                 break;
             case '4':
                 System.out.println("The do-while:\n");
                 System.out.println("do{");
                 System.out.println(" statement;");
                 System.out.println("} while (condition);");
                 break;
             case'5':
                 System.out.println("The for:\n");
                 System.out.println("for(int; condition; iteration)");
                 System.out.println("statement;");
                 break;
         }
    }
}