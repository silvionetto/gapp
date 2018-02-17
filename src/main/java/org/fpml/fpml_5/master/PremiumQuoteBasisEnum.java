//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0-b170531.0717 
//         See <a href="https://jaxb.java.net/">https://jaxb.java.net/</a> 
//         Any modifications to this file will be lost upon recompilation of the source schema. 
//         Generated on: 2018.02.10 at 05:14:53 PM CET 
//


package org.fpml.fpml_5.master;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PremiumQuoteBasisEnum.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PremiumQuoteBasisEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="PercentageOfCallCurrencyAmount"/&gt;
 *     &lt;enumeration value="PercentageOfPutCurrencyAmount"/&gt;
 *     &lt;enumeration value="CallCurrencyPerPutCurrency"/&gt;
 *     &lt;enumeration value="PutCurrencyPerCallCurrency"/&gt;
 *     &lt;enumeration value="Explicit"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PremiumQuoteBasisEnum")
@XmlEnum
public enum PremiumQuoteBasisEnum {


    /**
     * Premium is quoted as a percentage of the callCurrencyAmount.
     * 
     */
    @XmlEnumValue("PercentageOfCallCurrencyAmount")
    PERCENTAGE_OF_CALL_CURRENCY_AMOUNT("PercentageOfCallCurrencyAmount"),

    /**
     * Premium is quoted as a percentage of the putCurrencyAmount.
     * 
     */
    @XmlEnumValue("PercentageOfPutCurrencyAmount")
    PERCENTAGE_OF_PUT_CURRENCY_AMOUNT("PercentageOfPutCurrencyAmount"),

    /**
     * Premium is quoted in the call currency as a percentage of the put currency.
     * 
     */
    @XmlEnumValue("CallCurrencyPerPutCurrency")
    CALL_CURRENCY_PER_PUT_CURRENCY("CallCurrencyPerPutCurrency"),

    /**
     * Premium is quoted in the put currency as a percentage of the call currency.
     * 
     */
    @XmlEnumValue("PutCurrencyPerCallCurrency")
    PUT_CURRENCY_PER_CALL_CURRENCY("PutCurrencyPerCallCurrency"),

    /**
     * Premium is quoted as an explicit amount.
     * 
     */
    @XmlEnumValue("Explicit")
    EXPLICIT("Explicit");
    private final String value;

    PremiumQuoteBasisEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PremiumQuoteBasisEnum fromValue(String v) {
        for (PremiumQuoteBasisEnum c: PremiumQuoteBasisEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
