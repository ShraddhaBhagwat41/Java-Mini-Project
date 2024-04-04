package View.Scheme;

import javax.swing.*;

public class AddSchemePanel extends JPanel {
    JTextField txt_scheme_ID;
    JTextField txt_scheme_Name;
    JTextField txt_duration;
    JTextField txt_int_rate;
    JTextField txt_eligibility;

    JTextField txt_scheme_type;
    JButton addSchemeBtn;
    public AddSchemePanel(){
        txt_scheme_ID=new JTextField();
        txt_scheme_Name=new JTextField();
        txt_duration=new JTextField();
        txt_int_rate=new JTextField();
        txt_eligibility=new JTextField();

        txt_scheme_type=new JTextField();
        addSchemeBtn=new JButton("Add Scheme");

        txt_scheme_ID.setText("scheme_ID");
        txt_scheme_Name.setText("scheme_Name");
        txt_duration.setText("duration");
        txt_int_rate.setText("int_rate");
        txt_eligibility.setText("eligibility");
        txt_scheme_type.setText("scheme_type");

        add(txt_scheme_ID);
        add(txt_scheme_Name);
        add(txt_duration);
        add(txt_int_rate);
        add(txt_eligibility);
        add(txt_scheme_type);
        add(addSchemeBtn);
    }

    public JButton getAddSchemeBtn() {
        return addSchemeBtn;
    }

    public JTextField getTxt_int_rate() {
        return txt_int_rate;
    }

    public JTextField getTxt_eligibility() {
        return txt_eligibility;
    }

    public JTextField getTxt_duration() {
        return txt_duration;
    }



    public JTextField getTxt_scheme_ID() {
        return txt_scheme_ID;
    }

    public JTextField getTxt_scheme_Name() {
        return txt_scheme_Name;
    }

    public JTextField getTxt_scheme_type() {
        return txt_scheme_type;
    }


}
