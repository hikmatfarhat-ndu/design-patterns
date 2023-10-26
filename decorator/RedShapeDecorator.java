package decorator;
/* we could have implemented the Shape interface directly
 * instead of using abstract class ShapeDecorator
 * But we would have to implement many "common" methods
 * in each implementation class
 */
public class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(Shape decoratedShape){
        super(decoratedShape);
    }
    @Override
    public void draw(){
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }
    private void setRedBorder(Shape decoratedShape){
        System.out.println("Border Color: Red");
    }
}
