package View;
import View.Enrolls.EnrollsManageFrame;
import View.Scheme.ManageSchemeFrame;

import java.awt.*;
import java.util.ArrayList;

public class View {
    FirstFrame ff;
    ManageCustomerFrame mcf;
    ManageSchemeFrame msf;
    EnrollsManageFrame emf;
    public View(){
        ff=new FirstFrame();
        mcf=new ManageCustomerFrame();
        msf=new ManageSchemeFrame();
        emf=new EnrollsManageFrame();

    }
    public void centerInitialSetupCustomer(int linesBeingDisplayed, int size ){
        mcf.getIp().getCp().setLayout(new GridLayout(linesBeingDisplayed+1, size));
        mcf.getIp().getCp().createButtons((linesBeingDisplayed+1) * size);
    }
    public void centerUpdateCustomer(ArrayList<ArrayList<String>> lines, ArrayList<String> headers){
        for(int i=0;i<headers.size(); i++){
            mcf.getIp().getCp().getAllButtons().get(i).setText(headers.get(i));
        }
        for(int emp_row_no=0; emp_row_no<lines.size();emp_row_no++){
            for(int emp_col_no=0; emp_col_no<headers.size();emp_col_no++){
                int button_no=emp_row_no* headers.size()+ headers.size()+emp_col_no;
                String button_txt=lines.get(emp_row_no).get(emp_col_no);
                mcf.getIp().getCp().getAllButtons().get(button_no).setText(button_txt);
            }
        }
    }
    public void centerInitialSetupScheme(int linesBeingDisplayed, int size){
        msf.getIpp().getCpp().setLayout(new GridLayout(linesBeingDisplayed+1,size));
        msf.getIpp().getCpp().createButtons((linesBeingDisplayed+1) * size);
    }
    public void centerUpdateScheme(ArrayList<ArrayList<String>>lines, ArrayList<String>headers){
        for (int i=0; i< headers.size(); i++){
            msf.getIpp().getCpp().getAllButtons().get(i).setText(headers.get(i));
        }
        for (int pro_row_no=0; pro_row_no<lines.size(); pro_row_no++){
            for (int pro_col_no=0; pro_col_no< headers.size(); pro_col_no++){
                int button_no=pro_row_no* headers.size()+ headers.size()+pro_col_no;
                String button_txt=lines.get(pro_row_no).get(pro_col_no);
                msf.getIpp().getCpp().getAllButtons().get(button_no).setText(button_txt);
            }
        }
    }
    public void enrollsCenterInitialSetup(int linesBeingDisplayed, int size){
        emf.getEip().getEcp().setLayout(new GridLayout(linesBeingDisplayed+1,size));
        emf.getEip().getEcp().createLabels((linesBeingDisplayed+1) * size);
    }
    public void centerUpdateEnrolls(ArrayList<ArrayList<String>>lines, ArrayList<String>headers){
        try {
            for (int i=0; i< headers.size(); i++){
                emf.getEip().getEcp().getAllLabels().get(i).setText(headers.get(i));
            }
            for (int enr_row_no=0; enr_row_no<lines.size(); enr_row_no++){
                for (int enr_col_no=0; enr_col_no< headers.size(); enr_col_no++){
                    int label_no=enr_row_no* headers.size()+ headers.size()+enr_col_no;
                    String label_txt=lines.get(enr_row_no).get(enr_col_no);
                    emf.getEip().getEcp().getAllLabels().get(label_no).setText(label_txt);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setFf(FirstFrame ff) {
        this.ff = ff;
    }

    public FirstFrame getFf() {
        return ff;
    }
    public void setEmf(EnrollsManageFrame emf){
        this.emf=emf;
    }
    public EnrollsManageFrame getEmf(){
        return emf;
    }

    public void setMcf(ManageCustomerFrame mcf) {
        this.mcf = mcf;
    }

    public ManageCustomerFrame getMcf() {
        return mcf;
    }

    public ManageSchemeFrame getMsf() {
        return msf;
    }

    public void setMsf(ManageSchemeFrame msf) {
        this.msf = msf;
    }
}


