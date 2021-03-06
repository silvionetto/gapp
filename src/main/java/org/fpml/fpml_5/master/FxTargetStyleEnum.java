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
 * <p>Java class for FxTargetStyleEnum.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FxTargetStyleEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="Exact"/&gt;
 *     &lt;enumeration value="Exclusive"/&gt;
 *     &lt;enumeration value="Inclusive"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FxTargetStyleEnum")
@XmlEnum
public enum FxTargetStyleEnum {


    /**
     * The gain for the knockout period is adjusted to yield a final accumulated value equal to the target level.
     * 
     */
    @XmlEnumValue("Exact")
    EXACT("Exact"),

    /**
     * The gain for the knockout period is adjusted to zero i.e. the target yields zero value in the final period.
     * 
     */
    @XmlEnumValue("Exclusive")
    EXCLUSIVE("Exclusive"),

    /**
     * The gain for the knockout period is equal to the whole benefit of the final fixing over spot i.e. the final accumulated value may exceed the target level.
     * 
     */
    @XmlEnumValue("Inclusive")
    INCLUSIVE("Inclusive");
    private final String value;

    FxTargetStyleEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FxTargetStyleEnum fromValue(String v) {
        for (FxTargetStyleEnum c: FxTargetStyleEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
