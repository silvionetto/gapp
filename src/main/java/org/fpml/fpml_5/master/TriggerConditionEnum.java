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
 * <p>Java class for TriggerConditionEnum.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TriggerConditionEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="AtOrAbove"/&gt;
 *     &lt;enumeration value="AtOrBelow"/&gt;
 *     &lt;enumeration value="Above"/&gt;
 *     &lt;enumeration value="Below"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TriggerConditionEnum")
@XmlEnum
public enum TriggerConditionEnum {


    /**
     * The spot rate must be greater than or equal to the trigger rate.
     * 
     */
    @XmlEnumValue("AtOrAbove")
    AT_OR_ABOVE("AtOrAbove"),

    /**
     * The spot rate must be less than or equal to the trigger rate.
     * 
     */
    @XmlEnumValue("AtOrBelow")
    AT_OR_BELOW("AtOrBelow"),

    /**
     * DEPRECATE: The spot rate must be greater than or equal to the trigger rate.
     * 
     */
    @XmlEnumValue("Above")
    ABOVE("Above"),

    /**
     * DEPRECATE: The spot rate must be less than or equal to the trigger rate.
     * 
     */
    @XmlEnumValue("Below")
    BELOW("Below");
    private final String value;

    TriggerConditionEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TriggerConditionEnum fromValue(String v) {
        for (TriggerConditionEnum c: TriggerConditionEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
