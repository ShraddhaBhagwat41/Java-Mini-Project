package View.Enrolls;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class EnrollsCentralPanel extends JPanel {

        ArrayList<JLabel> labels=new ArrayList<>();
        public EnrollsCentralPanel(){super();}
        public void createLabels(int count){
            for(int i=1; i<=count; i++){
                JLabel label=new JLabel();
                label.setLayout(new FlowLayout());
                label.setSize(500, 50);
                labels.add(label);
                this.add(label);
                validate();
                repaint();
            }
        }
    public void setLabels(ArrayList<JLabel> labels) {
        this.labels = labels;
    }

    public ArrayList<JLabel> getAllLabels() {
        return labels;
    }
}

