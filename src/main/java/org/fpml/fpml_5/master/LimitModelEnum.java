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
 * <p>Java class for LimitModelEnum.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LimitModelEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="Ping"/&gt;
 *     &lt;enumeration value="Plus1ToStop"/&gt;
 *     &lt;enumeration value="Plus1ToPing"/&gt;
 *     &lt;enumeration value="PushToPing"/&gt;
 *     &lt;enumeration value="PushToStop"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LimitModelEnum")
@XmlEnum
public enum LimitModelEnum {

    @XmlEnumValue("Ping")
    PING("Ping"),
    @XmlEnumValue("Plus1ToStop")
    PLUS_1_TO_STOP("Plus1ToStop"),
    @XmlEnumValue("Plus1ToPing")
    PLUS_1_TO_PING("Plus1ToPing"),
    @XmlEnumValue("PushToPing")
    PUSH_TO_PING("PushToPing"),
    @XmlEnumValue("PushToStop")
    PUSH_TO_STOP("PushToStop");
    private final String value;

    LimitModelEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LimitModelEnum fromValue(String v) {
        for (LimitModelEnum c: LimitModelEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
