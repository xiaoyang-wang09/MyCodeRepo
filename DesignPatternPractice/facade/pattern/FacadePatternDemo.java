package facade.pattern;

/**
 * package facade.pattern
 * A demo class to test Facade Design Pattern
 *
 * The whole code is cited from TOPIC I Design Patterns_SEG2105
 * @author WWW.tutorialspoint.com
 * @version 1.0(07/17/21)
 */
public class FacadePatternDemo {

    /** test all the methods in ShapeMaker */
    public static void main(String[] args){
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSqaure();
    }
}
