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
 * <p>Java class for QuantifierEnum.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="QuantifierEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="All"/&gt;
 *     &lt;enumeration value="Any"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "QuantifierEnum")
@XmlEnum
public enum QuantifierEnum {


    /**
     * The condition in the scope of the quantifier is true of every member of the domain i.e. every one of the elements in scope.
     * 
     */
    @XmlEnumValue("All")
    ALL("All"),

    /**
     * The condition in the scope of the quantifier is true of at least one member of the domain i.e. one or more of the elements in scope.
     * 
     */
    @XmlEnumValue("Any")
    ANY("Any");
    private final String value;

    QuantifierEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static QuantifierEnum fromValue(String v) {
        for (QuantifierEnum c: QuantifierEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
