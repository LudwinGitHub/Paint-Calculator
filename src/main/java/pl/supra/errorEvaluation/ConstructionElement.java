package pl.supra.errorEvaluation;

public class ConstructionElement {
    private int width;
    private int height;

    public ConstructionElement(int width, int height) {
        this.width = width;
        this.height = height;
    }
    public int getArea(){
      return   width * height;
    }
}
