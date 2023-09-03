package p1.p2.model;
/**
 * Класс содержит все элементы выражения.
 */
public class Model {
    /**
     * a - первый элемент выражения
     * b - второй элемент выражения
     * c - результат выражения
     * action - действие с элементами a и b.
     */
    private double a,b,c;
    private String action;
    public double getA() {return a;}
    public void setA(double a) {this.a = a;}
    public double getB() {return b;}
    public void setB(double b) {this.b = b;}
    public double getC() {return c;}
    public void setC(double c) {this.c = c;}
    public String getAction() {return action;}
    public void setAction(String action) {this.action = action;}
}
