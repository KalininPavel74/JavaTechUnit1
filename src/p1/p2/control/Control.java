package p1.p2.control;

import p1.p2.model.Model;
import p1.p2.view.ViewConlole;

public class Control { 

    Model model;
    ViewConlole view;

    public Control(Model model, ViewConlole view) {
        this.model = model;
        this.view = view;
    }

    public void action(double a, double b, String action) {
        model.setA(a);
        model.setB(b);
        model.setAction(action);
        switch (action) {
            case "+" : model.setC(a+b); break;
            case "-" : model.setC(a-b); break;
            case "*" : model.setC(a*b); break;
            case "/" : model.setC(a/b); break;
            default: return;
        }
        view();
    }

    private void view() {
        view.expression(model.getA(), model.getB(), model.getAction(), model.getC());
    }
}