package Model;

import Model.Enrolls.manageEnrolls;
import Model.People.manageCustomer;
import Model.PostOfficeSchemes.managescheme_type;

public class Model {
    manageCustomer mc;
    managescheme_type ms;
    manageEnrolls me;
    public Model(){
        mc=new manageCustomer();
        ms=new managescheme_type();
        me=new manageEnrolls();
    }

    public manageCustomer getMc() {
        return mc;
    }

    public manageEnrolls getMe() {
        return me;
    }

    public managescheme_type getMs() {
        return ms;
    }

    public void setMc(manageCustomer mc) {
        this.mc = mc;
    }

    public void setMe(manageEnrolls me) {
        this.me = me;
    }

    public void setMs(managescheme_type ms) {
        this.ms = ms;
    }

}
