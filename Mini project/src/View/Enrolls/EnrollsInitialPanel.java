package View.Enrolls;

import View.Scheme.AddSchemePanel;
import View.Scheme.SchemeTablePanel;

import javax.swing.*;

public class EnrollsInitialPanel extends JPanel{ EnrollsCentralPanel ecp;
    AddEnrollsPanel ep;
    DeleteEnrolls de;
    EditEnrolls ee;

        public EnrollsInitialPanel(){

            ecp=new EnrollsCentralPanel();
            add(ecp);
            ep=new AddEnrollsPanel();
            add(ep);
            ee=new EditEnrolls();
            add(ee);
            de=new DeleteEnrolls();
            add(de);


        }

    public void setEp(AddEnrollsPanel ep) {
        this.ep = ep;
    }

    public AddEnrollsPanel getEp() {
        return ep;
    }

    public void setEcp(EnrollsCentralPanel ecp) {
        this.ecp = ecp;
    }

    public EnrollsCentralPanel getEcp() {
            return ecp;
        }

    public void setDe(DeleteEnrolls de) {
        this.de = de;
    }

    public DeleteEnrolls getDe() {
        return de;
    }

    public void setEe(EditEnrolls ee) {
        this.ee = ee;
    }

    public EditEnrolls getEe() {
        return ee;
    }
}


