public class Employee {
    String firstName;
    String lastName;
    int initinalSalary;
    int currentSalary;
    int workingExperinace;
    String companyName="DC";
    Employee(String firstName,String lastName,int initinalSalary,int workingExperinace){
        this.firstName=firstName;
        this.lastName=lastName;
        this.initinalSalary=initinalSalary;
        this.workingExperinace=workingExperinace;
    }
    public String toString(){
        return firstName+" "+lastName+ ":"+companyName;
    }
    public void salaryCount(){
        if(workingExperinace<=1){
            currentSalary=initinalSalary;
            System.out.println(currentSalary);
        }else if(workingExperinace>1&&workingExperinace<=3){
            currentSalary=initinalSalary+200000;
            System.out.println(currentSalary);
        }
        else {
            currentSalary=initinalSalary+500000;
            System.out.println(currentSalary);
        }
    }
    public String getInfo(){
        return firstName +" " +lastName+" "+companyName+ " "+initinalSalary+" "+ workingExperinace+" "+currentSalary ;
    }
    }
