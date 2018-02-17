//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0-b170531.0717 
//         See <a href="https://jaxb.java.net/">https://jaxb.java.net/</a> 
//         Any modifications to this file will be lost upon recompilation of the source schema. 
//         Generated on: 2018.02.10 at 05:14:53 PM CET 
//


package org.fpml.fpml_5.master;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Represents interest payment projections.
 * 
 * <p>Java class for PaymentProjection complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentProjection"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nextPaymentDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="projectedAmount" type="{http://www.fpml.org/FpML-5/master}MoneyWithParticipantShare" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentProjection", propOrder = {
    "nextPaymentDate",
    "projectedAmount"
})
public class PaymentProjection {

    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar nextPaymentDate;
    protected MoneyWithParticipantShare projectedAmount;

    /**
     * Gets the value of the nextPaymentDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNextPaymentDate() {
        return nextPaymentDate;
    }

    /**
     * Sets the value of the nextPaymentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNextPaymentDate(XMLGregorianCalendar value) {
        this.nextPaymentDate = value;
    }

    /**
     * Gets the value of the projectedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link MoneyWithParticipantShare }
     *     
     */
    public MoneyWithParticipantShare getProjectedAmount() {
        return projectedAmount;
    }

    /**
     * Sets the value of the projectedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link MoneyWithParticipantShare }
     *     
     */
    public void setProjectedAmount(MoneyWithParticipantShare value) {
        this.projectedAmount = value;
    }

}
