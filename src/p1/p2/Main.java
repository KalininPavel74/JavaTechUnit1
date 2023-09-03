package p1.p2;

import p1.p2.control.Control;
import p1.p2.view.ViewConlole;
import p1.p2.model.Model;

/**
 * @author Калинин Павел
 * Главный класс для создания объектов, их связывания и список заданий.
 * Пример задания:
 * {@code control.action(1.25, 2.5, "+"); }
 */
public class Main {
    /**
     * Точка входа в программу.
     * @param args - не используется
     */
    public static void main(String[] args) {
        Control control = new Control(new Model(), new ViewConlole());
        control.action(1.25, 2.5, "+");
        control.action(1.2, 5, "-");
        control.action(5.25, 25.88, "*");
        control.action(0.255, 2.555, "/");
    }    
}
