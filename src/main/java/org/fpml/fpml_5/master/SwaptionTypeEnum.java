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
 * <p>Java class for SwaptionTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SwaptionTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="Payer"/&gt;
 *     &lt;enumeration value="Receiver"/&gt;
 *     &lt;enumeration value="Straddle"/&gt;
 *     &lt;enumeration value="NonStandard"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SwaptionTypeEnum")
@XmlEnum
public enum SwaptionTypeEnum {


    /**
     * A Payer swaption confers on the buyer the right, but not the obligation, to enter into the underlying swap as payer of the fixed rate (and receiver of the floating rate).
     * 
     */
    @XmlEnumValue("Payer")
    PAYER("Payer"),

    /**
     * A Receiver swaption confers on the buyer the right, but not the obligation, to enter into the underlying swap as receiver of the fixed rate (and payer of the floating rate).
     * 
     */
    @XmlEnumValue("Receiver")
    RECEIVER("Receiver"),

    /**
     * A swaption straddle is a strategy trade, in which the buyer simultaneously purchases a Payer and a Receiver swaption at the same strike (fixed rate) and with otherwise identical economic characteristics.
     * 
     */
    @XmlEnumValue("Straddle")
    STRADDLE("Straddle"),

    /**
     * This designation is reserved for swaptions with non-standard characteristics e.g. having a basis swap or cross-currency swap underlyer.
     * 
     */
    @XmlEnumValue("NonStandard")
    NON_STANDARD("NonStandard");
    private final String value;

    SwaptionTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SwaptionTypeEnum fromValue(String v) {
        for (SwaptionTypeEnum c: SwaptionTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
