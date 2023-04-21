package ch09.Timer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TimerTest implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) { 
        // Timer에 의하여 1초에 한번씩 호출됨
        // Called once per second by Timer
        System.out.println("Beep");
    }   
}

