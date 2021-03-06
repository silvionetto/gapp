//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0-b170531.0717 
//         See <a href="https://jaxb.java.net/">https://jaxb.java.net/</a> 
//         Any modifications to this file will be lost upon recompilation of the source schema. 
//         Generated on: 2018.02.10 at 05:14:53 PM CET 
//


package org.fpml.fpml_5.master;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * The physical delivery obligation options specific to a firm transaction.
 * 
 * <p>Java class for ElectricityDeliveryFirm complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ElectricityDeliveryFirm"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="forceMajeure" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElectricityDeliveryFirm", propOrder = {
    "forceMajeure"
})
public class ElectricityDeliveryFirm {

    protected Boolean forceMajeure;

    /**
     * Gets the value of the forceMajeure property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isForceMajeure() {
        return forceMajeure;
    }

    /**
     * Sets the value of the forceMajeure property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setForceMajeure(Boolean value) {
        this.forceMajeure = value;
    }

}
