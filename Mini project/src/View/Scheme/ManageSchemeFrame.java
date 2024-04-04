package View.Scheme;

import javax.swing.*;

public class ManageSchemeFrame extends JFrame { InitialSchemePanel ipp;
    public ManageSchemeFrame(){
        super("Manage  Dashboard");
        ipp=new InitialSchemePanel();
        add(ipp);
        pack();
        setSize(500,600);
    }

    public void setIpp(InitialSchemePanel ipp) {
        this.ipp = ipp;
    }

    public InitialSchemePanel getIpp() {
        return ipp;
    }
}
