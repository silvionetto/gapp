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
 * <p>Java class for QuotationRateTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="QuotationRateTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="Bid"/&gt;
 *     &lt;enumeration value="Ask"/&gt;
 *     &lt;enumeration value="Mid"/&gt;
 *     &lt;enumeration value="ExercisingPartyPays"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "QuotationRateTypeEnum")
@XmlEnum
public enum QuotationRateTypeEnum {


    /**
     * A bid rate.
     * 
     */
    @XmlEnumValue("Bid")
    BID("Bid"),

    /**
     * An ask rate.
     * 
     */
    @XmlEnumValue("Ask")
    ASK("Ask"),

    /**
     * A mid-market rate.
     * 
     */
    @XmlEnumValue("Mid")
    MID("Mid"),

    /**
     * If optional early termination is applicable to a swap transaction, the rate, which may be a bid or ask rate, which would result, if seller is in-the-money, in the higher absolute value of the cash settlement amount, or, is seller is out-of-the-money, in the lower absolute value of the cash settlement amount.
     * 
     */
    @XmlEnumValue("ExercisingPartyPays")
    EXERCISING_PARTY_PAYS("ExercisingPartyPays");
    private final String value;

    QuotationRateTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static QuotationRateTypeEnum fromValue(String v) {
        for (QuotationRateTypeEnum c: QuotationRateTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
