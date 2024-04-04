package View;
import javax.swing.*;
import java.awt.*;
public class FirstFrame extends JFrame{
    JButton manageCustomerBtn;
    JButton manageSchemeBtn;
    JButton manageEnrollBtn;


    JPanel firstPanel;
    FirstFrame(){

        super("Main DashBoard");
        ImageIcon originalImage = new ImageIcon("Mini project/src/View/pof.png");
        Image scaledImage = originalImage.getImage().getScaledInstance(800, 600, Image.SCALE_SMOOTH); // Resize image to fit frame size
        ImageIcon backgroundImage = new ImageIcon(scaledImage);
        JLabel backgroundLabel = new JLabel(backgroundImage);
        manageCustomerBtn=new JButton("Manage Customers");
        manageCustomerBtn.setBackground(Color.pink);
        manageCustomerBtn.setBorder(manageCustomerBtn.getBorder());
        manageSchemeBtn=new JButton("Manage Schemes");
        manageSchemeBtn.setBackground(Color.gray);

        manageEnrollBtn=new JButton("Manage Enrolls");
        firstPanel=new JPanel();
        firstPanel = new JPanel(new FlowLayout());
       // firstPanel.setLayout(new GridLayout(3,1,20,20));
        firstPanel = new JPanel(new FlowLayout());
        firstPanel.add(manageCustomerBtn);
        firstPanel.add(manageSchemeBtn);
        firstPanel.add(manageEnrollBtn);
        firstPanel.add(backgroundLabel);
       // firstPanel = new JPanel(new FlowLayout());
        firstPanel.setBackground(Color.WHITE);
        // Set background color to black

        // Add JLabel for background image

        add(firstPanel);
        pack();
        setSize(500, 600);
        setVisible(true);

//        JPanel firstP = new JPanel();
//        JLabel firstL = new JLabel();
//        firstP.setOpaque(false);
//        firstP.setLayout(new FlowLayout(FlowLayout.CENTER));
//        firstL.setSize(500,600);
//        firstP.setSize(500,600);
//        firstL.setText("WELCOME TO OFFICE MANAGEMENT SYSTEM!!!");
//        firstL.setForeground(Color.black);
//        firstL.setFont(new Font("WELCOME TO OFFICE MANAGEMENT SYSTEM!!!", Font.BOLD, 60) );
//        firstP.add(firstL);
//
//        JPanel Panel1 = new JPanel();
//        Panel1.setOpaque(false);
//        Panel1.setSize(100, 300 );
//        Panel1.setLayout(new GridLayout(3,0, 20,50));
//        manageCustomerBtn.setSize(100, 100);
//        Panel1.add(manageCustomerBtn);
//        Panel1.add(manageSchemeBtn);
//        Panel1.add(manageEnrollBtn);
//
//        ImageIcon im = new ImageIcon("C://Users//sahil//Downloads//exp 7//exp 7//src//england-post-office-zzqclboexnr5foo0.jpg");
//        Image img = im.getImage().getScaledInstance(1920, 1080, Image.SCALE_SMOOTH);
//        im.setImage(img);
//        JPanel p = new JPanel();
//        JLabel l = new JLabel(im);
//        l.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));
//        l.setMaximumSize(getMaximumSize());
//        l.add(firstP);
//        l.add(Panel1);
//        p.add(l);
    }

    public void setFirstPanel(JPanel firstPanel) {
        this.firstPanel = firstPanel;
    }

    public JButton getManageCustomerBtn() {
        return manageCustomerBtn;
    }

    public JButton getManageEnrollBtn() {
        return manageEnrollBtn;
    }

    public JButton getManageSchemeBtn() {
        return manageSchemeBtn;
    }
        public void setManageCustomerBtn(JButton manageCustomerBtn) {
        this.manageCustomerBtn = manageCustomerBtn;
    }

    public void setManageSchemeBtn(JButton manageSchemeBtn) {
        this.manageSchemeBtn = manageSchemeBtn;
    }

    public void setManageEnrollBtn(JButton manageEnrollBtn) {
        this.manageEnrollBtn = manageEnrollBtn;
    }

    public JPanel getFirstPanel() {
        return firstPanel;
    }


}

