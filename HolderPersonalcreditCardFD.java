/*
*Third set of assignment

Credit Card Holder Personal Credit Card Financial Data – Subclass 
*
*Nalya Shakirova
*
*12/3/2019
*
*/
public class HolderPersonalCreditCardFD extends CreditCardHolderFD
{
    
    private final float ANNUAL_RATE_PERSON = 0.13f;
    
    public HolderPersonalCreditCardFD(int accountRoutingNumber, int bankingBranchNumber,
                                   String bankingCompanyName, String branchBankingCompanyName,
                                   String bbCompanyAdress, String bbCompanyCity, String bbCompanyState,
                                   int bbCompanyZipCode,  String companyEmail, int companyPhoneNum,
                                   int holdersAccountNum, String  holdersAccountName,
                                   String  holdersAdress, String  holdersCity,
                                   String  holdersState,  String  holdersZipCode,
                                   String  holdersEmail, int holdersPhoneNum,
                                   String cardAccountType, float  creditLimit,
                                   float previousBalance,  float newPurchase,
                                   float payments, float creditReturns )

     { super (accountRoutingNumber,
              bankingBranchNumber,
              bankingCompanyName,
              branchBankingCompanyName,
              bbCompanyAdress,
              bbCompanyCity,     
              bbCompanyState,   
              bbCompanyZipCode,
              companyEmail,
              companyPhoneNum,
              holdersAccountNum,  
              holdersAccountName,
              holdersAdress,
              holdersCity,
              holdersState,
              holdersZipCode,
              holdersEmail,
              holdersPhoneNum,
              cardAccountType,
              creditLimit,
              previousBalance,
              newPurchase,
              payments,
              creditReturns );
       
        }  


@Override
public float getNewBalance()
{
    float newBalance;
    newBalance = getPreviousBalance() + getNewPurchase() - getPayments() - getCreditReturns();
    
    if(newBalance > getCreditLimit())
     {  newBalance= newBalance + 10;  }

    return newBalance;
}
//
@Override
   
   public float getNewBalanceFee()
   {   float newBalanceFee;
       
     if(getNewBalance() > getCreditLimit())
     { 
       newBalanceFee= getNewBalance() +10; 
       return newBalanceFee;   
       }
     else
     {
        newBalanceFee = 0;
        return  newBalanceFee ;
       }
     
    }


@Override
public float getFinanceCharge()
{   
      float financeCharge;
    if ( getNewBalance()<= 0.0f)
    {
       return 0.0f;
      }
    else
    {
       return financeCharge =  getNewBalance() * ( ANNUAL_RATE_PERSON/12);
    }   
}

@Override
public float getNewPaymentAmount()
{
     float newPayment; float newBalance;

    if (getNewBalance() <= 0.0f)
    {
        return newPayment= 0.0f;
    }
    else
    {  
        return newPayment =( getNewBalance() * 0.02f) ;
     }   
}
//

@Override    
    public float getCreditLimitCheck()
    {   float limitCheck;
    
        limitCheck= getNewBalance()-  getCreditLimit();
        return limitCheck;
     }

//
@Override
   public float getTotalNewPayment()
    {  
        float totalNewPayment;
        totalNewPayment = getNewPaymentAmount() + getFinanceCharge() +getNewBalanceFee();
        return totalNewPayment;
     }

}
