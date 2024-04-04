package View;

import javax.swing.*;

public class DeleteCustomer extends JPanel{
    JTextField del_cust_id;
    JButton deleteCustomerBtn;

    public DeleteCustomer()
    {

        del_cust_id = new JTextField();
        deleteCustomerBtn = new JButton("Delete Customer");

        del_cust_id.setText("txt_cust_id");

        add(del_cust_id);
        add(deleteCustomerBtn);
    }

    public JButton getDeleteCustBtn() {
        return deleteCustomerBtn;
    }

    public JTextField getDel_cust_id() {
        return del_cust_id;
    }

    public void setDeleteCustomerBtn(JButton deleteCustBtn) {
        this.deleteCustomerBtn = deleteCustomerBtn;
    }

    public void setDel_cust_id(JTextField txt_del_course_id) {
        this.del_cust_id = del_cust_id;
    }
}


