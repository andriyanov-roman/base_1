package entities.mvc;

import entities.valid.Validator;

import java.util.Scanner;

/**
 * Created by user on 04.04.2015.
 */
public class CommonView {
    public static Scanner scanner = new Scanner(System.in);
    public Validator validator = new Validator();
    private String [] titles = {"Title1", "Title2", "Title3"};
    private int columnWidth = 16;

    public static Boolean hasNext() {
        return scanner.hasNext();
    }
    public static String next() {
        scanner.useDelimiter("\n");
        return scanner.next();
    }

    public String[] getTitles() {
        return titles;
    }

    public void setTitles(String[] titles) {
        this.titles = titles;
    }

    public int getColumnWidth() {
        return columnWidth;
    }

    public void setColumnWidth(int columnWidth) {
        this.columnWidth = columnWidth;
    }

    public static void alert(String txt){
        System.out.println(txt);
    }
    public static void alertInline(String txt){
        System.out.print(txt);
    }
    public void showMainMenu() {
        alert("[MAIN MENU]");
    }

    public String fillInLetterField (String title){
        alertInline(title);
        String input = next();
        if (validator.isLettersOnly(input)) {
            return input;
        }
        alert("Error! Field must have the letters only");
        return fillInLetterField(title);
    }
    public Double fillInDoubleField (String title) {
        alertInline(title);
        String input = next();
        if (validator.canBeDouble(input)){
            return Double.valueOf(input);
        }
        return fillInDoubleField(title);
    }
    public Double fillInDoublePosField (String title, Double maxValue) {
        alertInline(title);
        String input = next();
        if (validator.canBeDouble(input)) {
            if (validator.canBeInPositiveRange(Double.valueOf(input), maxValue)){
                return Double.valueOf(input);
            }
            alert("\tError! Value mast be a positive and less then "+maxValue);
            return fillInDoublePosField(title, maxValue);
        }
        alert("\tError! You can input only digits");
        return fillInDoublePosField(title, maxValue);
    }
    public Boolean DialogYesNo (String title) {
        alertInline(title+"(y/n): ");
        if (next().equals("y")) {
            return true;
        }
        else {
            return false;
        }
    }
}
