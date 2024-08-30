public class Student {
    //encapsulation the blueprint of the student object
    private String fName;
    private String lName;
    private int age;

    public Student (String fName, String lName , int age ){
        setfName(fName);
        setlName(lName);
        setAge(age);
    }
    //fName getter and setter method
    //fName setter method must be void , pass on the parameter
    public void setfName(String fName){
        this.fName = fName;
    }
    //fName getter method
    public String getfName(){
        return this.fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    ///use alt insert to generate your getter and setter
}
