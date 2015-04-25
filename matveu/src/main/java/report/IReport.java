package report;

import java.io.IOException;
import java.util.ArrayList;

public interface IReport  {

    ArrayList<String> generateReport() throws IOException;;
    ArrayList reportFromShapesByPerimeter() throws IOException;
    ArrayList reportFromShapesBySquare() throws IOException;
    ArrayList reportFromCatalogCarsByPrice() throws IOException;
    ArrayList reportFromCatalogCarsByYear() throws IOException;



}
