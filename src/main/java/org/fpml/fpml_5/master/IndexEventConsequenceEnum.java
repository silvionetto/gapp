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
 * <p>Java class for IndexEventConsequenceEnum.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IndexEventConsequenceEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="CalculationAgentAdjustment"/&gt;
 *     &lt;enumeration value="NegotiatedCloseOut"/&gt;
 *     &lt;enumeration value="CancellationAndPayment"/&gt;
 *     &lt;enumeration value="RelatedExchange"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "IndexEventConsequenceEnum")
@XmlEnum
public enum IndexEventConsequenceEnum {


    /**
     * Calculation Agent Adjustment
     * 
     */
    @XmlEnumValue("CalculationAgentAdjustment")
    CALCULATION_AGENT_ADJUSTMENT("CalculationAgentAdjustment"),

    /**
     * Negotiated Close Out
     * 
     */
    @XmlEnumValue("NegotiatedCloseOut")
    NEGOTIATED_CLOSE_OUT("NegotiatedCloseOut"),

    /**
     * Cancellation and Payment
     * 
     */
    @XmlEnumValue("CancellationAndPayment")
    CANCELLATION_AND_PAYMENT("CancellationAndPayment"),

    /**
     * Related Exchange Adjustment
     * 
     */
    @XmlEnumValue("RelatedExchange")
    RELATED_EXCHANGE("RelatedExchange");
    private final String value;

    IndexEventConsequenceEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IndexEventConsequenceEnum fromValue(String v) {
        for (IndexEventConsequenceEnum c: IndexEventConsequenceEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
