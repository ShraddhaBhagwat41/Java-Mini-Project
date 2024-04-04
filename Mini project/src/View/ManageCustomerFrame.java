package View;
import javax.swing.*;
public class ManageCustomerFrame extends JFrame{
    InitialPanelCustomer ip;
    public ManageCustomerFrame(){
        super("Manage Customer Dashboard");
        ip=new InitialPanelCustomer();
        add(ip);
        pack();
        setSize(500,600);
    }
    public void setIp(InitialPanelCustomer ip){
        this.ip=ip;
    }
    public InitialPanelCustomer getIp(){return ip;}
}
