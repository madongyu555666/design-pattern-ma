package richtersreplacementprinciple;

/**
 * @author madongyu
 * @projectName design-pattern-ma
 * @description: TODO
 * @date 2019/6/1817:28
 */
public class Rectangle implements Quadrangle{
    private long height;
    private long width;
    @Override
    public long getWidth() {
        return width;
    }
    @Override
    public long getHeight() {
        return height;
    }
    public void setHeight(long height) {
        this.height = height;
    }
    public void setWidth(long width) {
        this.width = width;
    }
    /*private long height;
    private long width;

    public long getHeight() {
        return height;
    }

    public void setHeight(long height) {
        this.height = height;
    }

    public long getWidth() {
        return width;
    }

    public void setWidth(long width) {
        this.width = width;
    }*/
}
