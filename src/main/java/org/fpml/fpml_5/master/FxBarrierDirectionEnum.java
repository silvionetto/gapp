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
 * <p>Java class for FxBarrierDirectionEnum.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FxBarrierDirectionEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="Down"/&gt;
 *     &lt;enumeration value="Up"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FxBarrierDirectionEnum")
@XmlEnum
public enum FxBarrierDirectionEnum {


    /**
     * The barrier is triggered if the observed rate is at or below the barrier level during the period of observation, or at the time of observation.
     * 
     */
    @XmlEnumValue("Down")
    DOWN("Down"),

    /**
     * The barrier is triggered if the observed rate is at or above the barrier level during the period of observation, or at the time of observation.
     * 
     */
    @XmlEnumValue("Up")
    UP("Up");
    private final String value;

    FxBarrierDirectionEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FxBarrierDirectionEnum fromValue(String v) {
        for (FxBarrierDirectionEnum c: FxBarrierDirectionEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
