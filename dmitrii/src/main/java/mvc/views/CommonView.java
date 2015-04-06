package mvc.views;

import java.util.Scanner;

/**
 * Created by user on 04.04.2015.
 */
public class CommonView {
    public static Scanner scanner = new Scanner(System.in);
    private String [] titles = {"Title1", "Title2", "Title3"};
    private int columnWidth = 16;

    public static Boolean hasNext() {
        return scanner.hasNext();
    }
    public static String next() {
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

    public void alert(String txt){
        System.out.println(txt);
    }
    public void alertInline(String txt){
        System.out.print(txt);
    }
    public void showMainMenu() {

    }
    public void displayInTable (String tableName ){
        Table table = new Table(tableName, titles,columnWidth);
        table.renderTableHead();
        displayTableBody();
        table.renderTableEnd();
    }

    private void displayTableBody() {
    }

}
