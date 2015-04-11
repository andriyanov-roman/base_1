package entities.figures;

/**
 * Created by user on 11.04.2015.
 */
public abstract class ShapeAbs {

        private String name;
        private double dimension;
        private double perimeter;
        private double square;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getDimension() {
            return dimension;
        }

        public void setDimension(double dimension) {
            this.dimension = dimension;
        }

        public abstract double getPerimeter() ;


        public abstract double getSquare() ;

        @Override
        public String toString() {
            return name + ": " +
                    " dimension=" + dimension;
        }

}
