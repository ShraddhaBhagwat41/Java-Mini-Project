package View.Scheme;

import javax.swing.*;

public class InitialSchemePanel extends JPanel { private SchemeTablePanel cpp;
    private AddSchemePanel app;
    private EditScheme epp;
    private DeleteScheme dpp;
    public InitialSchemePanel(){
        super();
        cpp=new SchemeTablePanel();
        add(cpp);
        app=new AddSchemePanel();
        add(app);
        epp=new EditScheme();
        add(epp);
        dpp=new DeleteScheme();
        add(dpp);
    }

    public AddSchemePanel getApp() {
        return app;
    }

    public SchemeTablePanel getCpp() {
        return cpp;
    }

    public void setApp(AddSchemePanel app) {
        this.app = app;
    }

    public void setCpp(SchemeTablePanel cpp) {
        this.cpp = cpp;
    }

    public DeleteScheme getDpp() {
        return dpp;
    }

    public void setDpp(DeleteScheme dpp) {
        this.dpp = dpp;
    }

    public void setEpp(EditScheme epp) {
        this.epp = epp;
    }

    public EditScheme getEpp() {
        return epp;
    }
}
