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
 * <p>Java class for CommodityBullionSettlementDisruptionEnum.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CommodityBullionSettlementDisruptionEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="Negotiation"/&gt;
 *     &lt;enumeration value="Cancellation and Payment"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CommodityBullionSettlementDisruptionEnum")
@XmlEnum
public enum CommodityBullionSettlementDisruptionEnum {


    /**
     * Negotiation will apply in the event of Bullion Settlement Disruption as per Section 10.5.(d) of the 2005 Commodity Definitions.
     * 
     */
    @XmlEnumValue("Negotiation")
    NEGOTIATION("Negotiation"),

    /**
     * Cancellation and Payment will apply in the event of Bullion Settlement Disruption as per Section 10.5.(d) of the 2005 Commodity Definitions.
     * 
     */
    @XmlEnumValue("Cancellation and Payment")
    CANCELLATION_AND_PAYMENT("Cancellation and Payment");
    private final String value;

    CommodityBullionSettlementDisruptionEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CommodityBullionSettlementDisruptionEnum fromValue(String v) {
        for (CommodityBullionSettlementDisruptionEnum c: CommodityBullionSettlementDisruptionEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
