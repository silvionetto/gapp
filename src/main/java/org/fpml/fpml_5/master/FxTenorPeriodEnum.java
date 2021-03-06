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
 * <p>Java class for FxTenorPeriodEnum.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FxTenorPeriodEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="Broken"/&gt;
 *     &lt;enumeration value="Today"/&gt;
 *     &lt;enumeration value="Tomorrow"/&gt;
 *     &lt;enumeration value="TomorrowNext"/&gt;
 *     &lt;enumeration value="Spot"/&gt;
 *     &lt;enumeration value="SpotNext"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FxTenorPeriodEnum")
@XmlEnum
public enum FxTenorPeriodEnum {


    /**
     * Broken/non conventional Tenor Period.
     * 
     */
    @XmlEnumValue("Broken")
    BROKEN("Broken"),

    /**
     * Today Tenor Period.
     * 
     */
    @XmlEnumValue("Today")
    TODAY("Today"),

    /**
     * Tomorrow Tenor Period.
     * 
     */
    @XmlEnumValue("Tomorrow")
    TOMORROW("Tomorrow"),

    /**
     * Day after Tomorrow Tenor Period.
     * 
     */
    @XmlEnumValue("TomorrowNext")
    TOMORROW_NEXT("TomorrowNext"),

    /**
     * Spot Tenor Period.
     * 
     */
    @XmlEnumValue("Spot")
    SPOT("Spot"),

    /**
     * Day after Spot Tenor period.
     * 
     */
    @XmlEnumValue("SpotNext")
    SPOT_NEXT("SpotNext");
    private final String value;

    FxTenorPeriodEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FxTenorPeriodEnum fromValue(String v) {
        for (FxTenorPeriodEnum c: FxTenorPeriodEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
