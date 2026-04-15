public class InvestmentAccount{
    //private data members
    private double currentBalance, annualContribution, expectedReturnRate;

    //constructor
    public InvestmentAccount(){
        currentBalance = 0;
        annualContribution = 0;
        expectedReturnRate = 0;
    }

    //set methods - one for each input
    public void setCurrentBalance(double currentBalance){
        this.currentBalance = currentBalance;
    }    

    public void setAnnualContribution(double annualContribution){
        this.annualContribution = annualContribution;
    }

    public void setEexpectedRerunRate(double expectedReturnRate){
        if(expectedReturnRate) >= 1.0{
            this.expectedReturnRate = expectedReturnRate / 100;
        }else{
            this.expectedReturnRate = expectedReturnRate;
        }
    }

    //gte methods - one for each output

    public double getCurrentBalance(){
        return currentBalance;
    }

    public double getAnnualContribution(){
        return annualContribution;
    }

    public double getExpectedReturnRate(){
        return expectedReturnRate;
    }

}