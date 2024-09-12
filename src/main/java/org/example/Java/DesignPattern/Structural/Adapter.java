package org.example.Java.DesignPattern.Structural;
/*
Purpose: Allows the interface of an existing class to be used as another interface.
Use Cases: Used when you want to integrate classes that don't have compatible interfaces.
 */
public class Adapter {
    interface CreditCard {
        void giveBankDetails();
        String getCreditCard();
    }
    public static class BankDetails{
        private String bankName;
        private String accHolderName;
        private long accNumber;
        public String getBankName() {
            return bankName;
        }
        public void setBankName(String bankName) {
            this.bankName = bankName;
        }
        public String getAccHolderName() {
            return accHolderName;
        }
        public void setAccHolderName(String accHolderName) {
            this.accHolderName = accHolderName;
        }
        public long getAccNumber() {
            return accNumber;
        }
        public void setAccNumber(long accNumber) {
            this.accNumber = accNumber;
        }
    }
    public static class BankCustomer extends BankDetails implements CreditCard {
        @Override
        public void giveBankDetails() {
            setAccHolderName("John Doe");
            setAccNumber(123456789);
            setBankName("Bank of America");
        }
        @Override
        public String getCreditCard() {
            long accno = getAccNumber();
            String accholdername = getAccHolderName();
            String bname = getBankName();
            return ("The Account number " + accno + " of " + accholdername + " in " + bname + " bank is valid and authenticated for issuing the credit card.");
        }
    }
}
