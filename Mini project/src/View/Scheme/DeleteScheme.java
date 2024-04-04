package View.Scheme;
import javax.swing.*;

public class DeleteScheme extends JPanel {
    JTextField del_sch_id;
    JButton deleteSchemeBtn;

    public DeleteScheme(){
        del_sch_id=new JTextField();
        deleteSchemeBtn=new JButton("Delete Scheme");
        del_sch_id.setText("txt_sch_id");
        add(del_sch_id);
        add(deleteSchemeBtn);

    }
    public JButton getDeleteSchemeBtn(){ return deleteSchemeBtn;}
    public JTextField getDel_sch_id(){ return del_sch_id;}

    public void setDeleteSchemeBtn(JButton deleteSchemeBtn) {
        this.deleteSchemeBtn = deleteSchemeBtn;
    }

    public void setDel_sch_id(JTextField del_sch_id) {
        this.del_sch_id = del_sch_id;
    }
}
