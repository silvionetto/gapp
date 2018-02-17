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
 * The parameters for defining how the commodity digital option can be exercised. I differs from the CommodityExercise type in that it lacks a specification of Settlement Currency. The Settlement Currency is specified in the 'featurePayment' element.
 * 
 * <p>Java class for CommodityDigitalExercise complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommodityDigitalExercise"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="americanExercise" type="{http://www.fpml.org/FpML-5/master}CommodityAmericanExercise"/&gt;
 *           &lt;element name="europeanExercise" type="{http://www.fpml.org/FpML-5/master}CommodityEuropeanExercise"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="automaticExercise" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="writtenConfirmation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.fpml.org/FpML-5/master}CommodityPaymentDates.model"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommodityDigitalExercise", propOrder = {
    "americanExercise",
    "europeanExercise",
    "automaticExercise",
    "writtenConfirmation",
    "relativePaymentDates",
    "paymentDates",
    "masterAgreementPaymentDates"
})
public class CommodityDigitalExercise {

    protected CommodityAmericanExercise americanExercise;
    protected CommodityEuropeanExercise europeanExercise;
    protected Boolean automaticExercise;
    protected Boolean writtenConfirmation;
    protected CommodityRelativePaymentDates relativePaymentDates;
    protected AdjustableDatesOrRelativeDateOffset paymentDates;
    protected Boolean masterAgreementPaymentDates;

    /**
     * Gets the value of the americanExercise property.
     * 
     * @return
     *     possible object is
     *     {@link CommodityAmericanExercise }
     *     
     */
    public CommodityAmericanExercise getAmericanExercise() {
        return americanExercise;
    }

    /**
     * Sets the value of the americanExercise property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommodityAmericanExercise }
     *     
     */
    public void setAmericanExercise(CommodityAmericanExercise value) {
        this.americanExercise = value;
    }

    /**
     * Gets the value of the europeanExercise property.
     * 
     * @return
     *     possible object is
     *     {@link CommodityEuropeanExercise }
     *     
     */
    public CommodityEuropeanExercise getEuropeanExercise() {
        return europeanExercise;
    }

    /**
     * Sets the value of the europeanExercise property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommodityEuropeanExercise }
     *     
     */
    public void setEuropeanExercise(CommodityEuropeanExercise value) {
        this.europeanExercise = value;
    }

    /**
     * Gets the value of the automaticExercise property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutomaticExercise() {
        return automaticExercise;
    }

    /**
     * Sets the value of the automaticExercise property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutomaticExercise(Boolean value) {
        this.automaticExercise = value;
    }

    /**
     * Gets the value of the writtenConfirmation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWrittenConfirmation() {
        return writtenConfirmation;
    }

    /**
     * Sets the value of the writtenConfirmation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWrittenConfirmation(Boolean value) {
        this.writtenConfirmation = value;
    }

    /**
     * Gets the value of the relativePaymentDates property.
     * 
     * @return
     *     possible object is
     *     {@link CommodityRelativePaymentDates }
     *     
     */
    public CommodityRelativePaymentDates getRelativePaymentDates() {
        return relativePaymentDates;
    }

    /**
     * Sets the value of the relativePaymentDates property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommodityRelativePaymentDates }
     *     
     */
    public void setRelativePaymentDates(CommodityRelativePaymentDates value) {
        this.relativePaymentDates = value;
    }

    /**
     * Gets the value of the paymentDates property.
     * 
     * @return
     *     possible object is
     *     {@link AdjustableDatesOrRelativeDateOffset }
     *     
     */
    public AdjustableDatesOrRelativeDateOffset getPaymentDates() {
        return paymentDates;
    }

    /**
     * Sets the value of the paymentDates property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdjustableDatesOrRelativeDateOffset }
     *     
     */
    public void setPaymentDates(AdjustableDatesOrRelativeDateOffset value) {
        this.paymentDates = value;
    }

    /**
     * Gets the value of the masterAgreementPaymentDates property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMasterAgreementPaymentDates() {
        return masterAgreementPaymentDates;
    }

    /**
     * Sets the value of the masterAgreementPaymentDates property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMasterAgreementPaymentDates(Boolean value) {
        this.masterAgreementPaymentDates = value;
    }

}
