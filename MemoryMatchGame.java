package memorymatchgame;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class MemoryMatchGame {

    public static void main(String[] args) {

        MyFrame n = new MyFrame();

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MyFrame().setVisible(true);
                MyFrame n = new MyFrame();
            }
        });

    }

}
