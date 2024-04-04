package View.Scheme;
import View.EditCustomer;

import javax.swing.*;

public class EditScheme extends JPanel{
    JTextField get_sch_id;
    JButton getSchemeBtn;
    JTextField txt_scheme_ID;
    JTextField txt_scheme_Name;
    JTextField txt_duration;
    JTextField txt_int_rate;
    JTextField txt_eligibility;

    JTextField txt_scheme_type;
    JButton editSchemeBtn;
    public EditScheme(){
        txt_scheme_ID=new JTextField();
        txt_scheme_Name=new JTextField();
        txt_duration=new JTextField();
        txt_int_rate=new JTextField();
        txt_eligibility=new JTextField();
        txt_scheme_type=new JTextField();
        editSchemeBtn=new JButton("Edit Scheme");
        get_sch_id=new JTextField();
        getSchemeBtn=new JButton("Get Scheme to edit");

        get_sch_id.setText("scheme_idx");
        txt_scheme_ID.setText("id");
        txt_scheme_Name.setText("scheme_name");
        txt_duration.setText("duration");
        txt_int_rate.setText("interest");
        txt_eligibility.setText("eligibility_criteria");
        txt_scheme_type.setText("type");

        add(get_sch_id);
        add(getSchemeBtn);
        add(txt_scheme_ID);
        add(txt_scheme_Name);
        add(txt_duration);
        add(txt_int_rate);
        add(txt_eligibility);
        add(txt_scheme_type);
        add(editSchemeBtn);


    }
    public JButton getEditSchemeBtn(){return editSchemeBtn;}
    public JTextField getTxt_scheme_ID(){return txt_scheme_ID;}
    public JTextField getTxt_scheme_Name(){return txt_scheme_Name;}
    public JTextField getTxt_duration(){return txt_duration;}
    public JTextField getTxt_int_rate(){return txt_int_rate;}
    public JTextField getTxt_eligibility(){return txt_eligibility;}
    public JTextField getTxt_scheme_type(){return txt_scheme_type;}
    public JTextField getGet_sch_id(){return get_sch_id;}
    public JButton getGetSchemeBtn(){return getSchemeBtn;}
    public void setGet_sch_id(JTextField get_sch_id){this.get_sch_id=get_sch_id;}
    public void setGetSchemeBtn(JButton getSchemeBtn){this.getSchemeBtn=getSchemeBtn;}
    public void setEditSchemeBtn(JButton getSchemeBtn){this.editSchemeBtn=editSchemeBtn;}
    public void setTxt_eligibility(JTextField txt_eligibility){this.txt_eligibility=txt_eligibility;}
    public void setTxt_scheme_type(JTextField txt_scheme_type){this.txt_scheme_type=txt_scheme_type;}
    public void setTxt_scheme_ID(JTextField txt_scheme_ID){this.txt_scheme_ID=txt_scheme_ID;}
    public void setTxt_scheme_Name(JTextField txt_scheme_Name){this.txt_scheme_Name=txt_scheme_Name;}
    public void setTxt_duration(JTextField txt_duration){this.txt_duration=txt_duration;}
    public void setTxt_int_rate(JTextField txt_int_rate){this.txt_int_rate=txt_int_rate;}



}
