package View.Enrolls;

import javax.swing.*;

public class AddEnrollsPanel extends JPanel {JTextField cust_id;

    JTextField sch_id;
    JTextField date;
    JTextField amt;
    JButton addEnrollsBtn;
    public AddEnrollsPanel()
    {
        cust_id=new JTextField();
        sch_id=new JTextField();
        amt=new JTextField();
        date=new JTextField();
        addEnrollsBtn=new JButton("Add Enrollment");

        cust_id.setText("cust_id");

        sch_id.setText("sch_id");
        date.setText("date");
        amt.setText("amt");

        add(cust_id);
        add(sch_id);
        add(date);
        add(amt);
        add(addEnrollsBtn);

    }

    public JButton getAddEnrollsBtn() {
        return addEnrollsBtn;
    }

    public JTextField getCust_id() {
        return cust_id;
    }

    public JTextField getSch_id() {
        return sch_id;
    }

    public JTextField getDate() {
        return date;
    }

    public JTextField getAmt() {
        return amt;
    }


}
