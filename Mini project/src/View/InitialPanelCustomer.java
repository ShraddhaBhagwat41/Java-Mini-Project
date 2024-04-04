package View;
import javax.swing.*;
public class InitialPanelCustomer extends JPanel {
    private CenterPanelCustomer cp;
    private AddCustomerPanel ape;
    private DeleteCustomer dcp;
    private EditCustomer ecp;

    public InitialPanelCustomer(){
        super();
        cp=new CenterPanelCustomer();
        add(cp);
        ape=new AddCustomerPanel();
        add(ape);
        dcp=new DeleteCustomer();
        add(dcp);
        ecp=new EditCustomer();
        add(ecp);
    }
    public CenterPanelCustomer getCp(){return cp;}

    public void setApe(AddCustomerPanel ape) {
        this.ape = ape;
    }


    public void setCp(CenterPanelCustomer cp) {
        this.cp = cp;
    }

    public AddCustomerPanel getApe() {
        return ape;
    }
    public DeleteCustomer getDcp(){
        return dcp;
    }
    public void setDcp(DeleteCustomer dcp){
        this.dcp=dcp;
    }
    public EditCustomer getEcp(){
        return ecp;
    }

    public void setEcp(EditCustomer ecp) {
        this.ecp = ecp;
    }
}
