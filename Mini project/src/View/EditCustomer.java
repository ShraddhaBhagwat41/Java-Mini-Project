package View;

import javax.swing.*;

public class EditCustomer extends JPanel {
    JTextField get_cust_id;
    JButton getCustomerBtn;
    JTextField txt_customer_id;
    JTextField txt_name;
    JTextField txt_gender;
    JTextField txt_age;
    JTextField txt_address;
    JTextField txt_mobile;
    JTextField txt_aadhar_no;
    JButton editCustomerBtn;
    public EditCustomer(){
        txt_customer_id=new JTextField();
        txt_name=new JTextField();
        txt_gender=new JTextField();
        txt_age=new JTextField();
        txt_address=new JTextField();
        txt_mobile=new JTextField();
        txt_aadhar_no=new JTextField();
        editCustomerBtn=new JButton("Edit Customer");
        get_cust_id=new JTextField();
        getCustomerBtn=new JButton("Get Customer to edit");

        get_cust_id.setText("cust_idx");
        txt_customer_id.setText("id");
        txt_name.setText("name");
        txt_gender.setText("gender");
        txt_age.setText("age");
        txt_address.setText("address");
        txt_mobile.setText("mobile");
        txt_aadhar_no.setText("aadhar_no");

        add(get_cust_id);
        add(getCustomerBtn);
        add(txt_customer_id);
        add(txt_name);
        add(txt_gender);
        add(txt_age);
        add(txt_address);
        add(txt_mobile);
        add(txt_aadhar_no);
        add(editCustomerBtn);


    }
    public JButton getEditCustomerBtn() {
        return editCustomerBtn;
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

    public JTextField getGet_cust_id() {
        return get_cust_id;
    }
    public JButton getGetCustomerBtn(){return getCustomerBtn;}

    public void setGet_cust_id(JTextField get_cust_id) {
        this.get_cust_id = get_cust_id;
    }

    public void setGetCustomerBtn(JButton getCustomerBtn) {
        this.getCustomerBtn = getCustomerBtn;
    }

    public void setEditCustomerBtn(JButton editCustomerBtn) {
        this.editCustomerBtn = editCustomerBtn;
    }

    public void setTxt_aadhar_no(JTextField txt_aadhar_no) {
        this.txt_aadhar_no = txt_aadhar_no;
    }

    public void setTxt_age(JTextField txt_age) {
        this.txt_age = txt_age;
    }

    public JTextField getTxt_customer_id() {
        return txt_customer_id;
    }

    public void setTxt_customer_id(JTextField txt_customer_id) {
        this.txt_customer_id = txt_customer_id;
    }

    public void setTxt_address(JTextField txt_address) {
        this.txt_address = txt_address;
    }

    public void setTxt_gender(JTextField txt_gender) {
        this.txt_gender = txt_gender;
    }

    public void setTxt_mobile(JTextField txt_mobile) {
        this.txt_mobile = txt_mobile;
    }

    public void setTxt_name(JTextField txt_name) {
        this.txt_name = txt_name;
    }
}
