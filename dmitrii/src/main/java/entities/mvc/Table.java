package entities.mvc;

/**
 * Created by mit_OK! on 01.04.2015.
 */
public class Table {
    private String tableName;
    private String[] titles;
    private int columnWidth;

    private int getFullWidth () {
        return columnWidth * titles.length;
    }
    private int getTotalColumns (){
        return titles.length;
    }
    public Table(String tableName, String[] titles, int columnWidth) {
        this.tableName = tableName;
        this.titles = titles;
        this.columnWidth = columnWidth;
    }
    public void renderTableHead (){
        toDash(getFullWidth());
        toCenterTableName();
        toPlusDash();

    }
    public void renderTableEnd (){
        Table.toDash(getFullWidth());
    }
    public void toFullWidthRowRight (String txt){
        System.out.format("\n|%1$" + (getFullWidth() - 2) + "s|", txt);
    }
     public void toFullWidthRowLeft (String txt) {
         System.out.print("\n|");
         System.out.print(txt);
         for (int i = 0; i < getFullWidth()-txt.length()-2; i++) {
             System.out.print(" ");
         }
         System.out.print("|");
    }
    public static void toDash (int fullWidthOfLine) {
        System.out.println();
        for (int i = 0; i < fullWidthOfLine; i++) {
            System.out.print("-");
        }
    }
    public void toCenterTableName () {
        int offset = -1;
        if (tableName.length()%2==0) {offset=-2;}
        int right = (getFullWidth()-tableName.length())/2;
        int left = right+tableName.length()+offset;
        System.out.format("\n|%1$"+left+"s%2$"+right+"s|", tableName,"");
    }
    public void toPlusDash () {
        System.out.println();
        for (int i = 0; i < getTotalColumns(); i++) {
            int j;
            for (j = 0; j < columnWidth-1; j++) {
                System.out.print("-");
            }
            if (j!=(columnWidth-2)) {System.out.print("+");}
            else {System.out.print("|");}
        }
    }
    public void toRow (String[] cells){
        System.out.print("\n|");
        for (int i = 0; i < cells.length; i++) {
            if (i==0){System.out.format("%1$" + (columnWidth - 2) + "s|", cells[i]);}
            else {System.out.format("%1$" + (columnWidth - 1) + "s|", cells[i]);}
        }
    }
    public void toCenterTitles (){
        System.out.print("\n|");
        for (int i = 0; i < titles.length; i++) {
            int right = (columnWidth-titles[i].length())/2;
            int left = right+titles[i].length();
            if (titles[i].length()%2==0){left=left-1;}
            if (i==0) {System.out.format("%1$"+(left-1)+"s%2$"+right+"s|", titles[i],"");}
            else {System.out.format("%1$"+left+"s%2$"+right+"s|", titles[i],"");}
        }
    }
}
