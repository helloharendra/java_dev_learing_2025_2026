package GUI;

import java.awt.*;

public class MyFrame {
    public static void main (String[]args){
        Frame f = new Frame ("My first GUI");

        Label l = new Label("Hello Students");
        Button b = new Button("Click me");
        Label l1= new Label("Plus Button");
        Button b2 = new Button("+");


        f.setLayout(new FlowLayout());
        f.add(l);
         f.add(b);
        f.add(l1);
         f.add(b2);

         f.setSize(500,300);
         f.setVisible(true);

    }
}