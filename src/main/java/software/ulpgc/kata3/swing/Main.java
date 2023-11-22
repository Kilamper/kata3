package software.ulpgc.kata3.swing;

import software.ulpgc.kata3.Histogram;

public class Main {
    public static void main(String[] args) {
        Histogram histogram = new Histogram(5, 4, 7, 8, 3, 5, 4, 7, 8, 9, 3, 5, 7, 6, 1);
        MainFrame frame = new MainFrame();
        frame.histogramDisplay().shows(histogram);
        frame.setVisible(true);
    }
}
