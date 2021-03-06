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
 * <p>Java class for CalendarSourceEnum.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CalendarSourceEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="ListedOption"/&gt;
 *     &lt;enumeration value="Future"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CalendarSourceEnum")
@XmlEnum
public enum CalendarSourceEnum {


    /**
     * Pricing Dates (based off of listed options dates) in respect of each Calculation Period, the last Commodity Business Day on which the relevant Options Contract is scheduled to trade on the Exchange.
     * 
     */
    @XmlEnumValue("ListedOption")
    LISTED_OPTION("ListedOption"),

    /**
     * Pricing Dates (based off of futures dates) in respect of each Calculation Period, the last Commodity Business Day on which the relevant Futures Contract is scheduled to trade on the Exchange.
     * 
     */
    @XmlEnumValue("Future")
    FUTURE("Future");
    private final String value;

    CalendarSourceEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CalendarSourceEnum fromValue(String v) {
        for (CalendarSourceEnum c: CalendarSourceEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
