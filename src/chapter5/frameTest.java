package chapter5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.TextEvent;

public class frameTest extends JFrame {
    TextArea text;
    Button button;
    Label label;
    frameTest(){
        setLayout(new FlowLayout());
        text=new TextArea(25,30);
        button=new Button("compute");
        label=new Label();
        add(text);
        add(button);
        add(label);
        text.addTextListener(this::textValueChanged);
        button.addActionListener(this::actionPerformed);
        setBounds(300,300,350,600);
        setVisible(true);
        validate();
    }

    public void textValueChanged(TextEvent e){


    }

    public void actionPerformed(ActionEvent e)
    {
        String s=text.getText();
        label.setText("输出内容："+s);
    }
}
