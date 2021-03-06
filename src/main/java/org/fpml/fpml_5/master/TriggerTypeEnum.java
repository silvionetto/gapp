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
 * <p>Java class for TriggerTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TriggerTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="EqualOrLess"/&gt;
 *     &lt;enumeration value="EqualOrGreater"/&gt;
 *     &lt;enumeration value="Equal"/&gt;
 *     &lt;enumeration value="Less"/&gt;
 *     &lt;enumeration value="Greater"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TriggerTypeEnum")
@XmlEnum
public enum TriggerTypeEnum {


    /**
     * The underlyer price must be equal to or less than the Trigger level.
     * 
     */
    @XmlEnumValue("EqualOrLess")
    EQUAL_OR_LESS("EqualOrLess"),

    /**
     * The underlyer price must be equal to or greater than the Trigger level.
     * 
     */
    @XmlEnumValue("EqualOrGreater")
    EQUAL_OR_GREATER("EqualOrGreater"),

    /**
     * The underlyer price must be equal to the Trigger level.
     * 
     */
    @XmlEnumValue("Equal")
    EQUAL("Equal"),

    /**
     * The underlyer price must be less than the Trigger level.
     * 
     */
    @XmlEnumValue("Less")
    LESS("Less"),

    /**
     * The underlyer price must be greater than the Trigger level.
     * 
     */
    @XmlEnumValue("Greater")
    GREATER("Greater");
    private final String value;

    TriggerTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TriggerTypeEnum fromValue(String v) {
        for (TriggerTypeEnum c: TriggerTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
