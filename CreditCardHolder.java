//Third set of assignment

//Credit Card Holder Financial Data – Subclass (public abstract class)

//Nalya Shakirova 

//11/26/2019 
  
  public abstract class  CreditCardHolderFD  extends CardHolder //FD-financial data
   {  
   
     private String cardAccountType;//credit card account type(business or personal)
     private float  creditLimit;//Credit Card Account Credit Limit
     private float previousBalance;
     private float newPurchase;
     private float payments;
     private float creditReturns;
                                                       
//          
 
   public CreditCardHolderFD(int accountRoutingNumber, int bankingBranchNumber,
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
              holdersPhoneNum );
        this.cardAccountType =  cardAccountType;
        this.creditLimit     =  creditLimit;
        this. previousBalance= previousBalance;
        this.newPurchase= newPurchase;
        this.payments = payments;
        this.creditReturns = creditReturns;
        }

                              
    public void setCardAccType()
    {
      this.cardAccountType= cardAccountType ;
     }
     
   public String getCardAccountType()
    {
      return cardAccountType;
     }
     
 //
   public void setCreditLimit()
    {
      this.creditLimit= creditLimit ;
     }
     
   public float getCreditLimit()
    {
      return creditLimit;
     }
     
//
   public void setPreviousBalance()
    {
      this.previousBalance=  previousBalance;
     }
     
   public float getPreviousBalance()
    {
      return previousBalance;
     }
//

   public void setNewPurchase()
    {
      this.newPurchase=  newPurchase;
      newPurchase += newPurchase;
     }
     
   public float getNewPurchase()
    {
      return newPurchase;
     }
       
//     
   public void setPayments()
    {
      this.payments=  payments;
     }
     
   public float getPayments()
    {
      return payments;
     }
//
  
   public void setCreditReturns()
    {
      this.creditReturns=  creditReturns;
     }
     
   public float getCreditReturns()
    {
      return creditReturns;
     }
//  
   public abstract float getFinanceCharge();   
  
   public abstract float getNewBalance();    
   
   public abstract float getNewPaymentAmount();
   
   public abstract float getTotalNewPayment();
   
   public abstract float getCreditLimitCheck();

   public abstract float getNewBalanceFee();

 }
