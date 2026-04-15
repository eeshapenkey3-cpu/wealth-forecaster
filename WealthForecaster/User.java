public class User{
    //private data members
    private String name;
    private int currentAge, retirementAge;
    private double wealthGoal;

    //constructor
    public User(){
        name = "";
        currentAge = 0;
        retirementAge = 0;
        wealthGoal = 0;
    }

    //set methods - one for each input
    public void setName(String name){
        this.name = name;
    }

    public void setCurrentAge(int currentAge){
        this.currentAge = currentAge;
    }

    public void setRetirementAge(int retirementAge){
        this.retirementAge = retirementAge;
    }

    public void setWealthGoal(double wealthGoal){
        this.wealthGoal = wealthGoal;
    }

    //get methods - one for each output
    public String getName(){
        return name;
    }

    public int getCurrentAge(){
        return currentAge;
    }

    public int getRetirementAge(){
        return retirementAge;
    }

    public double getWealthGoal(){
        return wealthGoal;
    }
}