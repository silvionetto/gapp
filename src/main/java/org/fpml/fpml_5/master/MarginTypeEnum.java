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
 * <p>Java class for MarginTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MarginTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="Cash"/&gt;
 *     &lt;enumeration value="Instrument"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MarginTypeEnum")
@XmlEnum
public enum MarginTypeEnum {


    /**
     * When the margin type is Cash, the margin factor is applied to the cash value of the transaction.
     * 
     */
    @XmlEnumValue("Cash")
    CASH("Cash"),

    /**
     * When the margin type is Instrument, the margin factor is applied to the instrument value for the transaction. In the “instrument” case, the haircut would be applied to the securities.
     * 
     */
    @XmlEnumValue("Instrument")
    INSTRUMENT("Instrument");
    private final String value;

    MarginTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MarginTypeEnum fromValue(String v) {
        for (MarginTypeEnum c: MarginTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
