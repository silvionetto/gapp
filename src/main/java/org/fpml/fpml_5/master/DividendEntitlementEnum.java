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
 * <p>Java class for DividendEntitlementEnum.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DividendEntitlementEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="ExDate"/&gt;
 *     &lt;enumeration value="RecordDate"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DividendEntitlementEnum")
@XmlEnum
public enum DividendEntitlementEnum {


    /**
     * Dividend entitlement is on the dividend ex-date.
     * 
     */
    @XmlEnumValue("ExDate")
    EX_DATE("ExDate"),

    /**
     * Dividend entitlement is on the dividend record date.
     * 
     */
    @XmlEnumValue("RecordDate")
    RECORD_DATE("RecordDate");
    private final String value;

    DividendEntitlementEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DividendEntitlementEnum fromValue(String v) {
        for (DividendEntitlementEnum c: DividendEntitlementEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}