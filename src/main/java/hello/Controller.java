package hello;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class Controller {
    private String username;
    private String backcolor;
    private String color;

    private int tryParse(String value) {
        try {
            return Integer.parseInt(value);
        } catch (NumberFormatException exp) {
            return 0;
        }
    }

    public Controller() {
    }

    public Controller(InputForm form) {
        this.username = form.getUsername();
        int r = tryParse(form.getR());
        int g = tryParse(form.getG());
        int b = tryParse(form.getB());

        this.backcolor = "#"
                +Integer.toString(r, 16)
                +Integer.toString(g, 16)
                +Integer.toString(b, 16);
        if ((max(r, max(g, b)) + min(r, min(g, b)))/2 > 180) {
            this.color = "#000000";
        } else {
            this.color = "#FFFFFF";
        }
    }

    public String getUsername() {
        return username;
    }

    public String getBackcolor() {
        return backcolor;
    }

    public String getColor() {
        return color;
    }
}
