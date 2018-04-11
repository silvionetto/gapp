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
 * <p>Java class for FraDiscountingEnum.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FraDiscountingEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="ISDA"/&gt;
 *     &lt;enumeration value="AFMA"/&gt;
 *     &lt;enumeration value="NONE"/&gt;
 *     &lt;enumeration value="ISDAYield"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FraDiscountingEnum")
@XmlEnum
public enum FraDiscountingEnum {


    /**
     * "FRA Discounting" per the ISDA Definitions will apply.
     * 
     */
    ISDA("ISDA"),

    /**
     * FRA discounting per the Australian Financial Markets Association (AFMA) OTC Financial Product Conventions will apply. Note: Should not be used for a FRA trade documented under a legal framework where the 2006 ISDA Definitions have been incorporated.
     * 
     */
    AFMA("AFMA"),

    /**
     * No discounting will apply.
     * 
     */
    NONE("NONE"),

    /**
     * Per ISDA 2006 Definitions, Section 8.4. Discounting, paragraph (e)
     * 
     */
    @XmlEnumValue("ISDAYield")
    ISDA_YIELD("ISDAYield");
    private final String value;

    FraDiscountingEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FraDiscountingEnum fromValue(String v) {
        for (FraDiscountingEnum c: FraDiscountingEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}