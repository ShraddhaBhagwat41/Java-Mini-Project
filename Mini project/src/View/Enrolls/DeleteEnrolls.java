package View.Enrolls;

import javax.swing.*;

public class DeleteEnrolls extends JPanel {JTextField del_enr_id;
    JButton deleteEnrollsBtn;

    public DeleteEnrolls()
    {

        del_enr_id = new JTextField();
        deleteEnrollsBtn = new JButton("Delete Enrolls");

        del_enr_id.setText("txt_enr_id");

        add(del_enr_id);
        add(deleteEnrollsBtn);
    }

    public JButton getDeleteEnrBtn() {
        return deleteEnrollsBtn;
    }

    public JTextField getDel_enr_id() {
        return del_enr_id;
    }

    public void setDeleteEnrollsBtn(JButton deleteEnrBtn) {
        this.deleteEnrollsBtn = deleteEnrollsBtn;
    }

    public void setDel_enr_id(JTextField del_enr_id) {
        this.del_enr_id = del_enr_id;
    }
}
