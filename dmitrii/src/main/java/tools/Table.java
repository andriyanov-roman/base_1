package tools;

/**
 * Created by mit_OK! on 01.04.2015.
 */
public class Table {
    public static void toDash (int fullWidth) {
        System.out.println();
        for (int i = 0; i < fullWidth; i++) {
            System.out.print("-");
        }
    }
    public static void toHeader (int fullWidth, String CompanyName) {
        int margin = fullWidth/2-1;
        System.out.format("\n|%1$" + margin + "s%2$" + margin + "s|", CompanyName, "");
    }
    public  static void toPlusDash (int colWidth, int totalColumns) {
        System.out.println();
        for (int i = 0; i < totalColumns; i++) {
            int j;
            for (j = 0; j < colWidth-1; j++) {
                System.out.print("-");
            }
            if (j!=(colWidth-2)) {System.out.print("+");}
            else {System.out.print("|");}
        }
    }
    public static void toRow (int colWidth, String[] cells){
        System.out.print("\n|");
        for (int i = 0; i < cells.length; i++) {
            if (i==0){System.out.format("%1$" + (colWidth - 2) + "s|", cells[i]);}
            else {System.out.format("%1$" + (colWidth - 1) + "s|", cells[i]);}
        }
    }
    public static void toRowCenter (int colWidth, String[] cells){
        System.out.print("\n|");
        for (int i = 0; i < cells.length; i++) {
            int right = (colWidth-cells[i].length())/2;
            int left = right+cells[i].length();
            if (cells[i].length()%2==0){left=left-1;}
            if (i==0) {System.out.format("%1$"+(left-1)+"s%2$"+right+"s|", cells[i],"");}
            else {System.out.format("%1$"+left+"s%2$"+right+"s|", cells[i],"");}
        }
    }
}
