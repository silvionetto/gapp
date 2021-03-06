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
 * <p>Java class for ExerciseTimingEnum.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ExerciseTimingEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="Immediate"/&gt;
 *     &lt;enumeration value="OnExpiration"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ExerciseTimingEnum")
@XmlEnum
public enum ExerciseTimingEnum {


    /**
     * Perform the requested exercise behavior immediately on receipt of the request.
     * 
     */
    @XmlEnumValue("Immediate")
    IMMEDIATE("Immediate"),

    /**
     * Perform the requested exercise behavior at the expiration of the option.
     * 
     */
    @XmlEnumValue("OnExpiration")
    ON_EXPIRATION("OnExpiration");
    private final String value;

    ExerciseTimingEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ExerciseTimingEnum fromValue(String v) {
        for (ExerciseTimingEnum c: ExerciseTimingEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
