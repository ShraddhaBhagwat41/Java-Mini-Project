package View.Enrolls;

import javax.swing.*;

public class EditEnrolls extends JPanel {
    JTextField txt_c_temp;
    JTextField get_enr_id;
    JButton getEnrollsBtn;
    JTextField txt_s_temp;
    JTextField txt_date;

    JTextField txt_amt;
    JButton editEnrollsBtn;
    public EditEnrolls(){
        txt_c_temp=new JTextField();
        txt_s_temp=new JTextField();
        txt_date=new JTextField();
        txt_amt=new JTextField();
        editEnrollsBtn=new JButton("Edit Enrollment");
        get_enr_id=new JTextField();
        getEnrollsBtn=new JButton("Get Enrollment to edit");
        get_enr_id.setText("enr_idx");
        txt_c_temp.setText("c_temp");
        txt_s_temp.setText("s_temp");
        txt_date.setText("date");
        txt_amt.setText("amt");

        add(get_enr_id);
        add(getEnrollsBtn);
        add(txt_c_temp);
        add(txt_s_temp);
        add(txt_date);
        add(txt_amt);
        add(editEnrollsBtn);


    }

    public void setEditEnrollsBtn(JButton editEnrollsBtn) {
        this.editEnrollsBtn = editEnrollsBtn;
    }

    public JButton getEditEnrollsBtn() {
        return editEnrollsBtn;
    }

    public void setGet_enr_id(JTextField get_enr_id) {
        this.get_enr_id = get_enr_id;
    }

    public JButton getGetEnrollsBtn() {
        return getEnrollsBtn;
    }

    public void setGetEnrollsBtn(JButton getEnrollsBtn) {
        this.getEnrollsBtn = getEnrollsBtn;
    }

    public JTextField getGet_enr_id() {
        return get_enr_id;
    }

    public void setTxt_amt(JTextField txt_amt) {
        this.txt_amt = txt_amt;
    }

    public JTextField getTxt_amt() {
        return txt_amt;
    }

    public void setTxt_c_temp(JTextField txt_c_temp) {
        this.txt_c_temp = txt_c_temp;
    }

    public JTextField getTxt_c_temp() {
        return txt_c_temp;
    }

    public void setTxt_date(JTextField txt_date) {
        this.txt_date = txt_date;
    }

    public JTextField getTxt_date() {
        return txt_date;
    }

    public void setTxt_s_temp(JTextField txt_s_temp) {
        this.txt_s_temp = txt_s_temp;
    }

    public JTextField getTxt_s_temp() {
        return txt_s_temp;
    }
}
