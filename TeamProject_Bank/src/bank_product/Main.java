package bank_product;

import investment_services_and_activities.CorporateBonds;
import investment_services_and_activities.GovermentBonds;
import investment_services_and_activities.Shares;
import tools.UnderAgeException;
import tools.Entity;

public class Main {
    public static void main(String[] args) throws UnderAgeException {
        GovermentBonds govermentBonds = new GovermentBonds("Pesho", 100, 30, 2, 40, 5);
        govermentBonds.buy();
        CorporateBonds corporateBonds = new CorporateBonds("Pesho", 100, 30, 2, 40, 5);
        corporateBonds.sell();
        Credit credit = new Credit("Petyr", 1000, "8011111111", Entity.PHYSICAL, CreditTypePhysical.CUSTOM, 12, 1200);
        Shares share = new Shares();
        share.buy();
        CreditCard creditCard = new CreditCard("P", "8000000000", 1000
                , 40, 1.8, 1000);
        creditCard.checkClientYears(2000, 1, 12);
        DebitCard debitCard = new DebitCard("P", "8000000000", 100
                , 40, 1.8, 250);
        debitCard.cardValidityCheck(2018, 7, 5);
        debitCard.billsPayable(211);
        debitCard.billsPayable(43);
        corporateBonds.checkClientYears(2000, 1, 21);
        creditCard.cashFromATMWithdraw(20);
        CurrencyChange clientM = new CurrencyChange("Pesho", 1.69570, AvailableBankCurrencies.BGN,
                AvailableBankCurrencies.USD);
        clientM.changeCurrency(100);
    }
}
