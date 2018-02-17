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
 * <p>Java class for OrderStatusEnum.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OrderStatusEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="Cancelled"/&gt;
 *     &lt;enumeration value="Rejected"/&gt;
 *     &lt;enumeration value="Accepted"/&gt;
 *     &lt;enumeration value="Working"/&gt;
 *     &lt;enumeration value="Filled"/&gt;
 *     &lt;enumeration value="Completed"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OrderStatusEnum")
@XmlEnum
public enum OrderStatusEnum {


    /**
     * Order was cancelled/retracted by the submitter.
     * 
     */
    @XmlEnumValue("Cancelled")
    CANCELLED("Cancelled"),

    /**
     * Order was rejected by the recipient.
     * 
     */
    @XmlEnumValue("Rejected")
    REJECTED("Rejected"),

    /**
     * Order has been accepted but not yet acted on.
     * 
     */
    @XmlEnumValue("Accepted")
    ACCEPTED("Accepted"),

    /**
     * Order has been partly filled (executed).
     * 
     */
    @XmlEnumValue("Working")
    WORKING("Working"),

    /**
     * Order has been completely filled.
     * 
     */
    @XmlEnumValue("Filled")
    FILLED("Filled"),

    /**
     * Order has been completely filled, and all fills have been fully reported/processed as required.
     * 
     */
    @XmlEnumValue("Completed")
    COMPLETED("Completed");
    private final String value;

    OrderStatusEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OrderStatusEnum fromValue(String v) {
        for (OrderStatusEnum c: OrderStatusEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
