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
 * <p>Java class for InterestCalculationMethodEnum.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InterestCalculationMethodEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="ContractPositionThruPeriod"/&gt;
 *     &lt;enumeration value="ProRataShareSnapshot"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "InterestCalculationMethodEnum")
@XmlEnum
public enum InterestCalculationMethodEnum {


    /**
     * Agent bank is making an interest payment based on the lender's contract position throughout the interest payment period.
     * 
     */
    @XmlEnumValue("ContractPositionThruPeriod")
    CONTRACT_POSITION_THRU_PERIOD("ContractPositionThruPeriod"),

    /**
     * Agent bank is making an interest payment based on the lender pro-rata share snapshot at the time of payment.
     * 
     */
    @XmlEnumValue("ProRataShareSnapshot")
    PRO_RATA_SHARE_SNAPSHOT("ProRataShareSnapshot");
    private final String value;

    InterestCalculationMethodEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InterestCalculationMethodEnum fromValue(String v) {
        for (InterestCalculationMethodEnum c: InterestCalculationMethodEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
