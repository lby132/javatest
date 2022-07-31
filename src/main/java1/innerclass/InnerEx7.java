package main.java1.innerclass;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InnerEx7 {
    public static void main(String[] args) {
        Button b = new Button("Start");
        b.addActionListener(new EventHandler2());
    }
}

class EventHandler2 implements ActionListener {
    public void actionPerformed(ActionEvent event) {
        System.out.println("ActionEvent occurred!!!");
    }
}

// 아무것도 화면에 나타나지 않고 종료된다. 단지 익명 클래스로 변환하는 예를 보여주기 위한 코드