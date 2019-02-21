package investment_services_and_activities;

import tools.UnderAgeException;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class GovermentBonds extends InvestmentServicesAndActivities {
    public GovermentBonds(String name, int number, int price, int period, int feesAndCommissions, int investmentYield) {
        super(name, number, price, period, feesAndCommissions, investmentYield);
    }

    @Override
    public void buy() {
        System.out.printf("Client %s,buys %d goverment bonds each with currentPrice %.2f for sum %.2f \n",
                getName(), getNumber(), getCurrentPrice(), getNumber() * getCurrentPrice());
    }

    @Override
    public void sell() {
        System.out.printf("Client %s,sells %d goverment bonds each with price %.2f for sum %.2f \n",
                getName(), getNumber(), getCurrentPrice() + getCurrentPrice() * getInvestmentYield(), getNumber() * (getCurrentPrice() + getPeriod() * getInvestmentYield()));

    }

    public void checkClientYears(int birthYear, int birthMonth, int birthDay) throws UnderAgeException {
        GregorianCalendar cal = new GregorianCalendar();
        int y, m, d, years;

        y = cal.get(Calendar.YEAR);// current year ,
        m = cal.get(Calendar.MONTH);// current month
        d = cal.get(Calendar.DAY_OF_MONTH);//current day
        cal.set(birthYear, birthMonth, birthDay);// here client birthDate
        years = y - cal.get(Calendar.YEAR);
        if (years < AGE_OF_MAJORITY || (years == AGE_OF_MAJORITY && (m < cal.get(Calendar.MONTH))) || (years == AGE_OF_MAJORITY && (m == cal.get(Calendar.MONTH)) && (d < cal.get(Calendar.DAY_OF_MONTH)))) {
            throw new UnderAgeException("The client is under age,he cannot invest in goverment bonds\n");
        } else {
            System.out.printf("Client %s,reach age of majority,so he can invest in corporate bonds\n", getName());
        }
    }
}
