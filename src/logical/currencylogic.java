package logical;

import java.text.ParseException;

public class currencylogic {

	public static void main(String[] args) throws ParseException {
    float takeoutAmount = 1735.75F; //user input 
    float[] availableCurrencise = {2000,1000,500,200,100,50,20,10,5,1,0.5F,025F};//currencies should be in descending order
    boolean result = calculateCashDisbursement(availableCurrencise, takeoutAmount);
}

private static boolean calculateCashDisbursement(float[] availableCurrencise, float withdrawalAmount) {
    System.out.println("Cash withdrawal Amount:\t"+withdrawalAmount);
    for (float currency : availableCurrencise) {
        int count = (int) (withdrawalAmount / currency);
        System.out.println("Currency:\t" + currency + "\t\tNumber of currencies to dispense:\t" + count);
        if (count > 0) {
            withdrawalAmount = withdrawalAmount - currency * count;
        }

    }
    
    return false;
}
}