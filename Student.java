public class Student{
    private String studentNo;
    private String lastName;
    private String firstName;

    //setter methods

    public void setStudentNo(String studentNo){
        this.studentNo = studentNo;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    //getter methods
    
    public String getStudentNo(){
        return studentNo;
    }

    public String getLastName(){
        return lastName;
    }

    public String getFirstName(){
        return firstName;
    }
}