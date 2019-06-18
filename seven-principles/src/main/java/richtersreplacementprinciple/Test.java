package richtersreplacementprinciple;

/**
 * @author madongyu
 * @projectName design-pattern-ma
 * @description: TODO
 * @date 2019/6/1817:31
 */
public class Test {
    public static void resize(Rectangle rectangle){
        while (rectangle.getWidth() >= rectangle.getHeight()){
            rectangle.setHeight(rectangle.getHeight() + 1);
            System.out.println("width:"+rectangle.getWidth() + ",height:"+rectangle.getHeight());
        }
        System.out.println("resize 方法结束" +
                "\nwidth:"+rectangle.getWidth() + ",height:"+rectangle.getHeight());
    }


    /*public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(20);
        rectangle.setHeight(10);
        resize(rectangle);
    }*/


}
