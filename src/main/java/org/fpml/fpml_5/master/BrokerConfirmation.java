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
 * Identifies the market sector in which the trade has been arranged.
 * 
 * <p>Java class for BrokerConfirmation complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BrokerConfirmation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="brokerConfirmationType" type="{http://www.fpml.org/FpML-5/master}BrokerConfirmationType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BrokerConfirmation", propOrder = {
    "brokerConfirmationType"
})
public class BrokerConfirmation {

    protected BrokerConfirmationType brokerConfirmationType;

    /**
     * Gets the value of the brokerConfirmationType property.
     * 
     * @return
     *     possible object is
     *     {@link BrokerConfirmationType }
     *     
     */
    public BrokerConfirmationType getBrokerConfirmationType() {
        return brokerConfirmationType;
    }

    /**
     * Sets the value of the brokerConfirmationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BrokerConfirmationType }
     *     
     */
    public void setBrokerConfirmationType(BrokerConfirmationType value) {
        this.brokerConfirmationType = value;
    }

}
