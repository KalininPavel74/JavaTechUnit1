package p1.p2.view;
/**
 * Отображение результата.
 */
public class ViewConlole {
    /**
     * 
     * @param a - первый элемент выражения.
     * @param b - второй элемент выражения.
     * @param action - действие
     * @param c - результат выражения
     */
    public void expression(double a, double b, String action, double c) {
        System.out.printf("Выражение: %.2f %s %.2f = %.2f\n", a,action,b,c); 
    }
}
