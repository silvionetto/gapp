//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0-b170531.0717 
//         See <a href="https://jaxb.java.net/">https://jaxb.java.net/</a> 
//         Any modifications to this file will be lost upon recompilation of the source schema. 
//         Generated on: 2018.02.10 at 05:14:53 PM CET 
//


package org.fpml.fpml_5.master;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DayOfWeekEnum.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DayOfWeekEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="MON"/&gt;
 *     &lt;enumeration value="TUE"/&gt;
 *     &lt;enumeration value="WED"/&gt;
 *     &lt;enumeration value="THU"/&gt;
 *     &lt;enumeration value="FRI"/&gt;
 *     &lt;enumeration value="SAT"/&gt;
 *     &lt;enumeration value="SUN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DayOfWeekEnum")
@XmlEnum
public enum DayOfWeekEnum {


    /**
     * Monday
     * 
     */
    MON,

    /**
     * Tuesday
     * 
     */
    TUE,

    /**
     * Wednesday
     * 
     */
    WED,

    /**
     * Thursday
     * 
     */
    THU,

    /**
     * Friday
     * 
     */
    FRI,

    /**
     * Saturday
     * 
     */
    SAT,

    /**
     * Sunday
     * 
     */
    SUN;

    public String value() {
        return name();
    }

    public static DayOfWeekEnum fromValue(String v) {
        return valueOf(v);
    }

}
