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
 * An event representing a change in the notional amount associated with an outstanding letter of credit.
 * 
 * <p>Java class for LcAdjustment complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LcAdjustment"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.fpml.org/FpML-5/master}LcEvent"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="adjustment" type="{http://www.fpml.org/FpML-5/master}Adjustment" minOccurs="0"/&gt;
 *         &lt;element name="amount" type="{http://www.fpml.org/FpML-5/master}MoneyWithParticipantShare" minOccurs="0"/&gt;
 *         &lt;element name="relatedBorrowing" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LcAdjustment", propOrder = {
    "adjustment",
    "amount",
    "relatedBorrowing"
})
public class LcAdjustment
    extends LcEvent
{

    protected Adjustment adjustment;
    protected MoneyWithParticipantShare amount;
    protected Boolean relatedBorrowing;

    /**
     * Gets the value of the adjustment property.
     * 
     * @return
     *     possible object is
     *     {@link Adjustment }
     *     
     */
    public Adjustment getAdjustment() {
        return adjustment;
    }

    /**
     * Sets the value of the adjustment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Adjustment }
     *     
     */
    public void setAdjustment(Adjustment value) {
        this.adjustment = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link MoneyWithParticipantShare }
     *     
     */
    public MoneyWithParticipantShare getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link MoneyWithParticipantShare }
     *     
     */
    public void setAmount(MoneyWithParticipantShare value) {
        this.amount = value;
    }

    /**
     * Gets the value of the relatedBorrowing property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRelatedBorrowing() {
        return relatedBorrowing;
    }

    /**
     * Sets the value of the relatedBorrowing property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRelatedBorrowing(Boolean value) {
        this.relatedBorrowing = value;
    }

}
