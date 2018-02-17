//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0-b170531.0717 
//         See <a href="https://jaxb.java.net/">https://jaxb.java.net/</a> 
//         Any modifications to this file will be lost upon recompilation of the source schema. 
//         Generated on: 2018.02.10 at 05:14:53 PM CET 
//


package org.fpml.fpml_5.master;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * The details of the underlying elements that explain the calculation of an accrual against a reference balance.
 * 
 * <p>Java class for AccrualPeriod complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccrualPeriod"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.fpml.org/FpML-5/master}PeriodWithDays.model"/&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="referenceAmount" type="{http://www.fpml.org/FpML-5/master}MoneyWithParticipantShare" minOccurs="0"/&gt;
 *           &lt;element name="referenceAmountType" type="{http://www.fpml.org/FpML-5/master}AccrualReferenceAmountTypeEnum" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;element name="rate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="accrualAmount" type="{http://www.fpml.org/FpML-5/master}MoneyWithParticipantShare" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccrualPeriod", propOrder = {
    "startDate",
    "endDate",
    "numberOfDays",
    "referenceAmount",
    "referenceAmountType",
    "rate",
    "accrualAmount"
})
public class AccrualPeriod {

    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDate;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endDate;
    protected BigDecimal numberOfDays;
    protected MoneyWithParticipantShare referenceAmount;
    @XmlSchemaType(name = "token")
    protected AccrualReferenceAmountTypeEnum referenceAmountType;
    protected BigDecimal rate;
    protected MoneyWithParticipantShare accrualAmount;

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the numberOfDays property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNumberOfDays() {
        return numberOfDays;
    }

    /**
     * Sets the value of the numberOfDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNumberOfDays(BigDecimal value) {
        this.numberOfDays = value;
    }

    /**
     * Gets the value of the referenceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link MoneyWithParticipantShare }
     *     
     */
    public MoneyWithParticipantShare getReferenceAmount() {
        return referenceAmount;
    }

    /**
     * Sets the value of the referenceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link MoneyWithParticipantShare }
     *     
     */
    public void setReferenceAmount(MoneyWithParticipantShare value) {
        this.referenceAmount = value;
    }

    /**
     * Gets the value of the referenceAmountType property.
     * 
     * @return
     *     possible object is
     *     {@link AccrualReferenceAmountTypeEnum }
     *     
     */
    public AccrualReferenceAmountTypeEnum getReferenceAmountType() {
        return referenceAmountType;
    }

    /**
     * Sets the value of the referenceAmountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccrualReferenceAmountTypeEnum }
     *     
     */
    public void setReferenceAmountType(AccrualReferenceAmountTypeEnum value) {
        this.referenceAmountType = value;
    }

    /**
     * Gets the value of the rate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRate() {
        return rate;
    }

    /**
     * Sets the value of the rate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRate(BigDecimal value) {
        this.rate = value;
    }

    /**
     * Gets the value of the accrualAmount property.
     * 
     * @return
     *     possible object is
     *     {@link MoneyWithParticipantShare }
     *     
     */
    public MoneyWithParticipantShare getAccrualAmount() {
        return accrualAmount;
    }

    /**
     * Sets the value of the accrualAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link MoneyWithParticipantShare }
     *     
     */
    public void setAccrualAmount(MoneyWithParticipantShare value) {
        this.accrualAmount = value;
    }

}
