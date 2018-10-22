package com.ballistic.server.pojo.common;

public enum IMacros {

    AUCTION_ID("${AUCTION_ID}"),
    AUCTION_BID_ID("${AUCTION_BID_ID}"),
    AUCTION_IMP_ID("${AUCTION_IMP_ID}"),
    AUCTION_SEAT_ID("${AUCTION_SEAT_ID}"),
    AUCTION_AD_ID("${AUCTION_AD_ID}"),
    AUCTION_PRICE("${AUCTION_PRICE}"),
    AUCTION_CURRENCY("${AUCTION_CURRENCY}"),
    AUCTION_MBR("${AUCTION_MBR}"),
    AUCTION_LOSS("${AUCTION_LOSS}");

    private final String marco_type;

    private IMacros(String marco_type) { this.marco_type = marco_type; }

    public String getValue() { return marco_type; }
    // AUCTION_LOSS
    public static String getObjectStringValue(IMacros macro) { return macro.toString(); }
    // ${AUCTION_LOSS}
    public static String getStringValue(IMacros macro) { return macro.getValue(); }

    public static String getMarcro(String value) {
        switch (value) {
            case "${AUCTION_ID}":
                return getStringValue(IMacros.AUCTION_ID);
            case "${AUCTION_BID_ID}":
                return getStringValue(IMacros.AUCTION_BID_ID);
            case "${AUCTION_IMP_ID}":
                return getStringValue(IMacros.AUCTION_IMP_ID);
            case "${AUCTION_SEAT_ID}":
                return getStringValue(IMacros.AUCTION_SEAT_ID);
            case "${AUCTION_AD_ID}":
                return getStringValue(IMacros.AUCTION_AD_ID);
            case "${AUCTION_PRICE}":
                return getStringValue(IMacros.AUCTION_PRICE);
            case "${AUCTION_CURRENCY}":
                return getStringValue(IMacros.AUCTION_CURRENCY);
            case "${AUCTION_MBR}":
                return getStringValue(IMacros.AUCTION_MBR);
            case "${AUCTION_LOSS}":
                return getStringValue(IMacros.AUCTION_LOSS);
            default:
                return null;
        }
    }
}
