package report;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Администратор on 25.04.2015.
 */
public class FactoryReportImpl implements IReport {
    @Override
    public ArrayList<String> generateReport() throws IOException {
        return new ArrayList<String>();
    }

    @Override
    public ArrayList reportFromShapesByPerimeter() throws IOException {
        return null;
    }

    @Override
    public ArrayList reportFromShapesBySquare() throws IOException {
        return null;
    }

    @Override
    public ArrayList reportFromCatalogCarsByPrice() throws IOException {
        return null;
    }

    @Override
    public ArrayList reportFromCatalogCarsByYear() throws IOException {
        return null;
    }
}
