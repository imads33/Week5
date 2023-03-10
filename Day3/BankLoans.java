class BankLoan{
    double amount,principleAmount,totalAmount;
    float intrest;
    int period;
    BankLoan(double amount,float intrest){
        this.amount=amount;
        this.intrest=intrest;
        principleAmount=intrest*amount/100;
        totalAmount=principleAmount+amount;

        if(totalAmount>100000){
            period=12;
        }
    }
}

public class BankLoans{
    public static void main(String[] args){
        BankLoan bl=new BankLoan(100000,6.0f);
    }
}