package ch09.Timer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

public class CallbackTest {
    public static void main(String[] args) {
        ActionListener al = new TimerTest();

        // actionPerformed()를 호출해달라고 Timer에 등록함 
        // Register the Timer to call actionPerformed()
        Timer t = new Timer(1000, al); 

        t.start();
        
        for(int i = 0; i < 1000; i++) { 
            // try-catch
            // try : 예외가 발생할 수 있는 코드를 try 블록 안에 넣음
            // try: put code that can throw an exception inside a try block

            // catch : try 블록 안에서 예외가 발생하면 처리할 코드를 넣음
            // catch: put code to handle when an exception occurs inside the try block

            try{ 
                // 1초에 한 번씩 잤다가 깨어나는 것을 1000번 반복함
                // 1초에 한 번씩 실행되는지를 보기 위해서 반복

                // Sleeping and waking up once per second, repeated 1000 times.
                // Repeat to see if it runs once per second.
                Thread.sleep(1000);
            } catch (InterruptedException e) {

            }
        }

    }
}
