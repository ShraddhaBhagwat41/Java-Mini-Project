package Controller;
import Model.Model;
import View.View;

import java.awt.event.*;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;


public class Controller {
    Model model;
    View view;

public Controller(Model m, View v) {
            model = m;
            view = v;

            view.getMcf().addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                    view.getFf().setVisible(true);
                }
            });
            view.getMsf().addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                    view.getFf().setVisible(true);
                }
            });
    view.getEmf().addWindowListener(new java.awt.event.WindowAdapter() {
        @Override
        public void windowClosing(java.awt.event.WindowEvent windowEvent) {
            view.getFf().setVisible(true);
        }
    });
            view.getFf().getManageCustomerBtn().addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    view.getFf().setVisible(false);
                    view.getMcf().setVisible(true);
                }
            });
            view.getFf().getManageSchemeBtn().addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    view.getFf().setVisible(false);
                    view.getMsf().setVisible(true);
                }
            });
            view.getFf().getManageEnrollBtn().addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    view.getFf().setVisible(false);
                    view.getEmf().setVisible(true);
                }
            });
            model.getMc().setLinesBeingDisplayed(15);
            view.centerInitialSetupCustomer(model.getMc().getLinesBeingDisplayed(), model.getMc().getHeaders().size());
            model.getMc().setFirstLineToDisplay(0);
            view.centerUpdateCustomer(model.getMc().getLines(model.getMc().getFirstLineToDisplay(), model.getMc().getLastLineToDisplay()-1), model.getMc().getHeaders());

            model.getMs().setLinesBeingDisplayed(15);
            view.centerInitialSetupScheme(model.getMs().getLinesBeingDisplayed(), model.getMs().getHeaders().size());
            model.getMs().setFirstLineToDisplay(0);
            view.centerUpdateScheme(model.getMs().getLines(model.getMs().getFirstLineToDisplay(), model.getMs().getLastLineToDisplay()), model.getMs().getHeaders());
            model.getMe().setLinesBeingDisplayed(15);
            view.enrollsCenterInitialSetup(model.getMe().getLinesBeingDisplayed(), model.getMe().getHeaders().size());
            model.getMe().setFirstLineToDisplay(0);
            view.centerUpdateEnrolls(model.getMe().getLines(model.getMe().getFirstLineToDisplay(), model.getMe().getLastLineToDisplay()), model.getMe().getHeaders());

            view.getMcf().getIp().getApe().getAddCustomerBtn().addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String txt_customer_id = view.getMcf().getIp().getApe().getTxt_custommer_id().getText();
                    String txt_name = view.getMcf().getIp().getApe().getTxt_name().getText();
                    String txt_gender = view.getMcf().getIp().getApe().getTxt_gender().getText();
                    String txt_age = view.getMcf().getIp().getApe().getTxt_age().getText();
                    String txt_address = view.getMcf().getIp().getApe().getTxt_address().getText();
                    String txt_mobile = view.getMcf().getIp().getApe().getTxt_mobile().getText();
                    String txt_aadhar_no = view.getMcf().getIp().getApe().getTxt_aadhar_no().getText();
                    try {
                        model.getMc().addNewCustomer(Integer.valueOf(txt_customer_id), txt_name, txt_gender, Integer.parseInt(txt_age), txt_address, txt_mobile, Long.valueOf(txt_aadhar_no));
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                }
            });

            view.getMcf().getIp().getEcp().getGetCustomerBtn().addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.out.println("Get Customer Details Clicked");
                    String txt_cust_idx = view.getMcf().getIp().getEcp().getGet_cust_id().getText();
                    model.getMc().readCustomerJsonFile("Mini project/src/Model/People/Customer.json");
                    int id = model.getMc().getTable().get(Integer.valueOf(txt_cust_idx)).getId();
                    String name = model.getMc().getTable().get(Integer.valueOf(txt_cust_idx)).getName();
                    String gender = model.getMc().getTable().get(Integer.valueOf(txt_cust_idx)).getGender();
                    int age = model.getMc().getTable().get(Integer.valueOf(txt_cust_idx)).getAge();
                    String address = model.getMc().getTable().get(Integer.valueOf(txt_cust_idx)).getAddress();
                    String mobile = model.getMc().getTable().get(Integer.valueOf(txt_cust_idx)).getMobile();
                    Long aadhar_no = model.getMc().getTable().get(Integer.valueOf(txt_cust_idx)).getAadhar_no();
                    view.getMcf().getIp().getEcp().getTxt_customer_id().setText(String.valueOf(id));
                    view.getMcf().getIp().getEcp().getTxt_name().setText(name);
                    view.getMcf().getIp().getEcp().getTxt_gender().setText(gender);
                    view.getMcf().getIp().getEcp().getTxt_age().setText(String.valueOf(age));
                    view.getMcf().getIp().getEcp().getTxt_address().setText(address);
                    view.getMcf().getIp().getEcp().getTxt_mobile().setText(mobile);
                    view.getMcf().getIp().getEcp().getTxt_aadhar_no().setText(String.valueOf(aadhar_no));
                }
            });

            view.getMcf().getIp().getEcp().getEditCustomerBtn().addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.out.println("Edit Customer Button Clicked");
                    String txt_cust_idx = String.valueOf(Integer.parseInt(view.getMcf().getIp().getEcp().getGet_cust_id().getText()));
                    String txt_customer_id = String.valueOf(Integer.parseInt(view.getMcf().getIp().getEcp().getTxt_custommer_id().getText()));
                    String txt_name = view.getMcf().getIp().getEcp().getTxt_name().getText();
                    String txt_gender = view.getMcf().getIp().getEcp().getTxt_gender().getText();
                    String txt_age = view.getMcf().getIp().getEcp().getTxt_age().getText();
                    String txt_address = view.getMcf().getIp().getEcp().getTxt_address().getText();
                    String txt_mobile = view.getMcf().getIp().getEcp().getTxt_mobile().getText();
                    String txt_aadhar_no = view.getMcf().getIp().getEcp().getTxt_aadhar_no().getText();

                    try {
                        model.getMc().editCustomer(Integer.valueOf(txt_cust_idx), Integer.valueOf(txt_customer_id), txt_name, txt_gender, Integer.valueOf(txt_age), txt_address, txt_mobile, Long.valueOf(txt_aadhar_no));
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                }
            });

            view.getMcf().getIp().getDcp().getDeleteCustBtn().addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.out.println("Delete Customer Button Clicked");
                    String del_cust_id = view.getMcf().getIp().getDcp().getDel_cust_id().getText();
                    try {
                        int c_id = model.getMc().deleteCustomer(Integer.valueOf(del_cust_id));
                        for (int i = 0; i < model.getMe().getTable().size(); i++) {
                            if (c_id == model.getMe().getTable().get(i).getC_temp().getId()) {
                                model.getMe().deleteEnrolls(i);
                            }
                        }
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                }
            });

            view.getMsf().getIpp().getApp().getAddSchemeBtn().addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String txt_scheme_ID = view.getMsf().getIpp().getApp().getTxt_scheme_ID().getText();
                    String txt_scheme_Name = view.getMsf().getIpp().getApp().getTxt_scheme_Name().getText();
                    String txt_duration = view.getMsf().getIpp().getApp().getTxt_duration().getText();
                    String txt_int_rate = view.getMsf().getIpp().getApp().getTxt_int_rate().getText();
                    String txt_eligibility = view.getMsf().getIpp().getApp().getTxt_eligibility().getText();
                    String txt_scheme_type = view.getMsf().getIpp().getApp().getTxt_scheme_type().getText();

                    try {
                        model.getMs().addNewScheme(Integer.valueOf(txt_scheme_ID),  txt_scheme_type, txt_scheme_Name , Integer.valueOf(txt_duration), Integer.valueOf(txt_int_rate),txt_eligibility);
                    } catch (IOException ee) {
                        throw new RuntimeException(ee);
                    }
                }

            });

    view.getMsf().getIpp().getEpp().getGetSchemeBtn().addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            System.out.println("Get Scheme Details Clicked:");
            String txt_sch_idx=view.getMsf().getIpp().getEpp().getGet_sch_id().getText();
            model.getMs().readScheme_typeJsonFile("Mini project/src/Model/PostOfficeSchemes/Scheme_type.json");
            int id=model.getMs().getTable().get(Integer.valueOf(txt_sch_idx)).getScheme_id();
            String type=model.getMs().getTable().get(Integer.valueOf(txt_sch_idx)).getScheme_type();
            int duration=model.getMs().getTable().get(Integer.valueOf(txt_sch_idx)).getDuration();
            String name=model.getMs().getTable().get(Integer.valueOf(txt_sch_idx)).getName();
            int rate=model.getMs().getTable().get(Integer.valueOf(txt_sch_idx)).getInt_rate();
            String eligibility=model.getMs().getTable().get(Integer.valueOf(txt_sch_idx)).getEligibility_criteria();
            view.getMsf().getIpp().getEpp().getTxt_scheme_ID().setText(String.valueOf(id));
            view.getMsf().getIpp().getEpp().getTxt_scheme_type().setText(type);
            view.getMsf().getIpp().getEpp().getTxt_duration().setText(String.valueOf(duration));
            view.getMsf().getIpp().getEpp().getTxt_scheme_Name().setText(name);
            view.getMsf().getIpp().getEpp().getTxt_int_rate().setText(String.valueOf(rate));
            view.getMsf().getIpp().getEpp().getTxt_eligibility().setText(String.valueOf(eligibility));
        }
    });
    view.getMsf().getIpp().getEpp().getEditSchemeBtn().addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Edit Scheme Button Clicked");
            String txt_sch_idx=String.valueOf(Integer.parseInt(view.getMsf().getIpp().getEpp().getGet_sch_id().getText()));
            String txt_scheme_ID = view.getMsf().getIpp().getEpp().getTxt_scheme_ID().getText();
            String txt_scheme_Name = view.getMsf().getIpp().getEpp().getTxt_scheme_Name().getText();
            String txt_duration = view.getMsf().getIpp().getEpp().getTxt_duration().getText();
            String txt_int_rate = view.getMsf().getIpp().getEpp().getTxt_int_rate().getText();
            String txt_eligibility = view.getMsf().getIpp().getEpp().getTxt_eligibility().getText();
            String txt_scheme_type = view.getMsf().getIpp().getEpp().getTxt_scheme_type().getText();

            try {
                model.getMs().EditScheme(Integer.valueOf(txt_sch_idx),Integer.valueOf(txt_scheme_ID), txt_scheme_Name, txt_scheme_type, txt_eligibility, Integer.valueOf(txt_duration), Integer.valueOf(txt_int_rate));
            } catch (IOException ee) {
                throw new RuntimeException(ee);
            }
        }
    });
    view.getMsf().getIpp().getDpp().getDeleteSchemeBtn().addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Delete Scheme Button Clicked");
            String del_sch_id = view.getMsf().getIpp().getDpp().getDel_sch_id().getText();
            try {
                int s_id = model.getMs().DeleteScheme(Integer.valueOf(del_sch_id));
                for (int i = 0; i < model.getMe().getTable().size(); i++) {
                    if (s_id == model.getMe().getTable().get(i).getS_temp().getScheme_id()) {
                        model.getMe().deleteEnrolls(i);
                    }
                }

            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }
    });
    view.getEmf().getEip().getEp().getAddEnrollsBtn().addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String txt_c_temp = view.getEmf().getEip().getEp().getCust_id().getText();
            String txt_s_temp = view.getEmf().getEip().getEp().getSch_id().getText();
            String txt_date = view.getEmf().getEip().getEp().getDate().getText();
            String txt_amt = view.getEmf().getEip().getEp().getAmt().getText();

            try {
                model.getMe().addNewEnrolls(Integer.parseInt(txt_c_temp), Integer.parseInt(txt_s_temp), txt_date, Integer.valueOf(txt_amt));
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }
    });

    view.getEmf().getEip().getEe().getGetEnrollsBtn().addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Get Enroll Details Clicked");
            String txt_enr_idx = view.getEmf().getEip().getEe().getGet_enr_id().getText();
            model.getMe().readEnrollsJsonFile("Mini project/src/Model/Enrolls/Enrolls.json");
            int c_id = model.getMe().getTable().get(Integer.valueOf(txt_enr_idx)).getC_temp().getId();
            int s_id = model.getMe().getTable().get(Integer.valueOf(txt_enr_idx)).getS_temp().getScheme_id();
            String date = model.getMe().getTable().get(Integer.valueOf(txt_enr_idx)).getDate();
            int amt = model.getMe().getTable().get(Integer.valueOf(txt_enr_idx)).getAmount();

            view.getEmf().getEip().getEe().getTxt_c_temp().setText(String.valueOf(c_id));
            view.getEmf().getEip().getEe().getTxt_s_temp().setText(String.valueOf(s_id));
            view.getEmf().getEip().getEe().getTxt_date().setText(date);
            view.getEmf().getEip().getEe().getTxt_amt().setText(String.valueOf(amt));
        }
    });

    view.getEmf().getEip().getEe().getEditEnrollsBtn().addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Edit Enrolls Button Clicked");
            String txt_enr_idx=view.getEmf().getEip().getEe().getGet_enr_id().getText();
            String c_id = view.getEmf().getEip().getEe().getTxt_c_temp().getText();
            String s_id = view.getEmf().getEip().getEe().getTxt_s_temp().getText();
            String date = view.getEmf().getEip().getEe().getTxt_date().getText();
            String amt = view.getEmf().getEip().getEe().getTxt_amt().getText();

            try {
                model.getMe().editEnrolls(Integer.valueOf(txt_enr_idx), Integer.valueOf(c_id), Integer.valueOf(s_id), date, Integer.valueOf(amt));
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }
    });

    view.getEmf().getEip().getDe().getDeleteEnrBtn().addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                model.getMe().deleteEnrolls(Integer.valueOf(view.getEmf().getEip().getDe().getDel_enr_id().getText()));
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }


        }
    });
            view.getMcf().getIp().getCp().addMouseWheelListener(new MouseWheelListener() {
                @Override
                public void mouseWheelMoved(MouseWheelEvent e) {
                    int units = e.getUnitsToScroll();
                    System.out.println(units);
                    int current_first_line = model.getMc().getFirstLineToDisplay();
                    int current_last_line = model.getMc().getLastLineToDisplay();
                    int no_of_courses = model.getMc().getTable().size();
                    int no_of_display_lines = model.getMc().getLinesBeingDisplayed();
                    if(units <= 0 && current_first_line == 0)
                    {
                        model.getMc().setFirstLineToDisplay(0);
                    }
                    else if(units <= 0 && current_first_line > 0)
                    {
                        int new_first_line = current_first_line + units;
                        if(new_first_line <= 0)
                        {
                            model.getMc().setFirstLineToDisplay(0);
                        }
                        else
                        {
                            model.getMc().setFirstLineToDisplay(new_first_line);
                        }
                    }
                    else if(units > 0 && current_last_line == no_of_courses-1)
                    {
                        model.getMc().setFirstLineToDisplay(current_first_line);
                    }
                    else if (units > 0 && current_last_line < no_of_courses-1)
                    {
                        int new_first_line = current_first_line + units;
                        if(new_first_line > no_of_courses - no_of_display_lines)
                        {
                            new_first_line = no_of_courses-no_of_display_lines;
                            model.getMc().setFirstLineToDisplay(new_first_line);
                        }
                        else
                        {
                            model.getMc().setFirstLineToDisplay(new_first_line);
                        }
                    }

                    view.centerUpdateCustomer(model.getMc().getLines(model.getMc().getFirstLineToDisplay(), model.getMc().getLastLineToDisplay()), model.getMc().getHeaders());
                }
            });
    view.getMsf().getIpp().getCpp().addMouseWheelListener(new MouseWheelListener() {
        @Override
        public void mouseWheelMoved(MouseWheelEvent e) {
            int units = e.getUnitsToScroll();
            System.out.println(units);
            int current_first_line = model.getMs().getFirstLineToDisplay();
            int current_last_line = model.getMs().getLastLineToDisplay();
            int no_of_courses = model.getMs().getTable().size();
            int no_of_display_lines = model.getMs().getLinesBeingDisplayed();
            if(units <= 0 && current_first_line == 0)
            {
                model.getMs().setFirstLineToDisplay(0);
            }
            else if(units <= 0 && current_first_line > 0)
            {
                int new_first_line = current_first_line + units;
                if(new_first_line <= 0)
                {
                    model.getMs().setFirstLineToDisplay(0);
                }
                else
                {
                    model.getMs().setFirstLineToDisplay(new_first_line);
                }
            }
            else if(units > 0 && current_last_line == no_of_courses-1)
            {
                model.getMs().setFirstLineToDisplay(current_first_line);
            }
            else if (units > 0 && current_last_line < no_of_courses-1)
            {
                int new_first_line = current_first_line + units;
                if(new_first_line > no_of_courses - no_of_display_lines)
                {
                    new_first_line = no_of_courses-no_of_display_lines;
                    model.getMs().setFirstLineToDisplay(new_first_line);
                }
                else
                {
                    model.getMs().setFirstLineToDisplay(new_first_line);
                }
            }

            view.centerUpdateScheme(model.getMs().getLines(model.getMs().getFirstLineToDisplay(), model.getMs().getLastLineToDisplay()), model.getMs().getHeaders());
        }
    });
    view.getEmf().getEip().getEcp().addMouseWheelListener(new MouseWheelListener() {
        @Override
        public void mouseWheelMoved(MouseWheelEvent e) {
            int units = e.getUnitsToScroll();
            System.out.println(units);
            int current_first_line = model.getMe().getFirstLineToDisplay();
            int current_last_line = model.getMe().getLastLineToDisplay();
            int no_of_courses = model.getMe().getTable().size();
            int no_of_display_lines = model.getMe().getLinesBeingDisplayed();
            if(units <= 0 && current_first_line == 0)
            {
                model.getMe().setFirstLineToDisplay(0);
            }
            else if(units <= 0 && current_first_line > 0)
            {
                int new_first_line = current_first_line + units;
                if(new_first_line <= 0)
                {
                    model.getMe().setFirstLineToDisplay(0);
                }
                else
                {
                    model.getMe().setFirstLineToDisplay(new_first_line);
                }
            }
            else if(units > 0 && current_last_line == no_of_courses-1)
            {
                model.getMe().setFirstLineToDisplay(current_first_line);
            }
            else if (units > 0 && current_last_line < no_of_courses-1)
            {
                int new_first_line = current_first_line + units;
                if(new_first_line > no_of_courses - no_of_display_lines)
                {
                    new_first_line = no_of_courses-no_of_display_lines;
                    model.getMe().setFirstLineToDisplay(new_first_line);
                }
                else
                {
                    model.getMe().setFirstLineToDisplay(new_first_line);
                }
            }

            view.centerUpdateEnrolls(model.getMe().getLines(model.getMe().getFirstLineToDisplay(), model.getMe().getLastLineToDisplay()), model.getMe().getHeaders());
        }
    });
        }
    }
