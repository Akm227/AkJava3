package project3;

public class Student {
    String name;
    int total=98;

    public String getGrade(){
        if (total>=90){
            return "Excellent";
        } else if (total>=70) {
            return "Good";
        }else{
            return "Fail";
        }
    }
    public void displayInfo(){
        System.out.println("name:"+name);
        System.out.println("Total:"+total);
        System.out.println("Grade:"+getGrade());
    }
}
