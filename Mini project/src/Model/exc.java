package Model;
import Model.MyException;

public class exc {
    private int age;
    public void validateage(int age) throws MyException{
        if(age <0){
            throw new MyException("Age cannot be negative");
        }

    }
    int a;
    public void validateentity(String name) throws MyException{
        if(name.isEmpty()){
            throw new MyException("This field cannot be empty");
        }
    }
public void validgender(String gender) throws MyException{
        if(!gender.equalsIgnoreCase("male")&& !gender.equalsIgnoreCase("female")&& !gender.equalsIgnoreCase("other")){
            throw new MyException("Invalid gender");
        }
}
public void validph(long aadhar_no) throws MyException{
        String aadharString=String.valueOf(aadhar_no);

        if(aadharString.length()!=12){
            throw new MyException("Invalid aadhar number");
        }
}
public void validname(String scheme_name) throws MyException{
        if(!scheme_name.matches("[a-zA-Z\\s]+")){
            throw new MyException("Name can only contain letters and spaces");
        }
}
public void validrate(int int_rate) throws MyException{
        if(int_rate<=0){
            throw new MyException("Interest rate must be a positive number");
        }
}

}
