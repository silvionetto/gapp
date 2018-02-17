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
 * <p>Java class for BusinessDayConventionEnum.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BusinessDayConventionEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="FOLLOWING"/&gt;
 *     &lt;enumeration value="FRN"/&gt;
 *     &lt;enumeration value="MODFOLLOWING"/&gt;
 *     &lt;enumeration value="PRECEDING"/&gt;
 *     &lt;enumeration value="MODPRECEDING"/&gt;
 *     &lt;enumeration value="NEAREST"/&gt;
 *     &lt;enumeration value="NONE"/&gt;
 *     &lt;enumeration value="NotApplicable"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BusinessDayConventionEnum")
@XmlEnum
public enum BusinessDayConventionEnum {


    /**
     * The non-business date will be adjusted to the first following day that is a business day
     * 
     */
    FOLLOWING("FOLLOWING"),

    /**
     * Per 2000 ISDA Definitions, Section 4.11. FRN Convention; Eurodollar Convention.
     * 
     */
    FRN("FRN"),

    /**
     * The non-business date will be adjusted to the first following day that is a business day unless that day falls in the next calendar month, in which case that date will be the first preceding day that is a business day.
     * 
     */
    MODFOLLOWING("MODFOLLOWING"),

    /**
     * The non-business day will be adjusted to the first preceding day that is a business day.
     * 
     */
    PRECEDING("PRECEDING"),

    /**
     * The non-business date will be adjusted to the first preceding day that is a business day unless that day falls in the previous calendar month, in which case that date will be the first following day that us a business day.
     * 
     */
    MODPRECEDING("MODPRECEDING"),

    /**
     * The non-business date will be adjusted to the nearest day that is a business day - i.e. if the non-business day falls on any day other than a Sunday or a Monday, it will be the first preceding day that is a business day, and will be the first following business day if it falls on a Sunday or a Monday.
     * 
     */
    NEAREST("NEAREST"),

    /**
     * The date will not be adjusted if it falls on a day that is not a business day.
     * 
     */
    NONE("NONE"),

    /**
     * The date adjustments conventions are defined elsewhere, so it is not required to specify them here.
     * 
     */
    @XmlEnumValue("NotApplicable")
    NOT_APPLICABLE("NotApplicable");
    private final String value;

    BusinessDayConventionEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BusinessDayConventionEnum fromValue(String v) {
        for (BusinessDayConventionEnum c: BusinessDayConventionEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
