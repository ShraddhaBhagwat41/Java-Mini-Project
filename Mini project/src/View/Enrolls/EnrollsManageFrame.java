package View.Enrolls;

import javax.swing.*;

public class EnrollsManageFrame extends JFrame {EnrollsInitialPanel eip;

    public EnrollsManageFrame(){
        super("Manage Enrolls");
        eip = new EnrollsInitialPanel();
        add(eip);

        pack();
        setSize(500,600);
    }

    public EnrollsInitialPanel getEip() {
        return eip;
    }
}
