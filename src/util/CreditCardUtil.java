package util;

public class CreditCardUtil {

    private final static String regVisa = "^4[0-9]{12}(?:[0-9]{3})?$";
    private final static String regMaster = "^5[1-5][0-9]{14}$";
    private final static String regExpress = "^3[47][0-9]{13}$";
    private final static String regDiners = "^3(?:0[0-5]|[68][0-9])[0-9]{11}$";
    private final static String regDiscover = "^6(?:011|5[0-9]{2})[0-9]{12}$";
    private final static String regJCB= "^(?:2131|1800|35\\d{3})\\d{11}$";

    public enum CredtitCardEnum {

        Visa("VISA"),
        MasterCard("MASTERCARD"),
        AmericanExpress("AMERICANEXPRESS"),
        JCB("JCB"),
        DiscoverCard("DISCOVERCARD");

        private String	value;

        CredtitCardEnum(String code) { this.value = code; }

        public String getValue( ) { return value; }

        @Override
        public String toString() { return "CredtitCardEnum{" + "value='" + value + '\'' + '}'; }

    }

    public static String getCreditCardTypeByNumber(String creditCardNumber) {

        creditCardNumber = creditCardNumber.replaceAll(" ", "");

        return creditCardNumber.matches(regVisa) ? CredtitCardEnum.Visa.getValue() :
           creditCardNumber.matches(regMaster) ? CredtitCardEnum.MasterCard.getValue() :
           creditCardNumber.matches(regExpress) ? CredtitCardEnum.AmericanExpress.getValue() :
           creditCardNumber.matches(regDiscover) ? CredtitCardEnum.DiscoverCard.getValue() :
           creditCardNumber.matches(regJCB) ? CredtitCardEnum.JCB.getValue() : "Invalid";
    }

    public static void main(String args[]) {
        System.out.println(getCreditCardTypeByNumber("4111 1111 1111 1111"));
    }
}
