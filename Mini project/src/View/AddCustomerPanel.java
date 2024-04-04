package View;

import javax.swing.*;

public class AddCustomerPanel extends JPanel {
    JTextField txt_customer_id;
    JTextField txt_name;
    JTextField txt_gender;
    JTextField txt_age;
    JTextField txt_address;
    JTextField txt_mobile;
    JTextField txt_aadhar_no;
    JButton addCustomerBtn;
    public AddCustomerPanel()
    {
        txt_customer_id=new JTextField();
        txt_name=new JTextField();
        txt_gender=new JTextField();
        txt_age=new JTextField();
        txt_address=new JTextField();
        txt_mobile=new JTextField();
        txt_aadhar_no=new JTextField();
        addCustomerBtn=new JButton("Add Customer");

        txt_customer_id.setText("id");
        txt_name.setText("name");
        txt_gender.setText("gender");
        txt_age.setText("age");
        txt_address.setText("address");
        txt_mobile.setText("mobile");
        txt_aadhar_no.setText("aadhar_no");

        add(txt_customer_id);
        add(txt_name);
        add(txt_gender);
        add(txt_age);
        add(txt_address);
        add(txt_mobile);
        add(txt_aadhar_no);
        add(addCustomerBtn);
    }

    public JButton getAddCustomerBtn() {
        return addCustomerBtn;
    }

    public JTextField getTxt_gender() {
        return txt_gender;
    }

    public JTextField getTxt_age() {
        return txt_age;
    }

    public JTextField getTxt_address() {
        return txt_address;
    }

    public JTextField getTxt_custommer_id() {
        return txt_customer_id;
    }

    public JTextField getTxt_name() {
        return txt_name;
    }

    public JTextField getTxt_mobile() {
        return txt_mobile;
    }

    public JTextField getTxt_aadhar_no() {
        return txt_aadhar_no;
    }

}


