//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0-b170531.0717 
//         See <a href="https://jaxb.java.net/">https://jaxb.java.net/</a> 
//         Any modifications to this file will be lost upon recompilation of the source schema. 
//         Generated on: 2018.02.10 at 05:14:53 PM CET 
//


package org.fpml.fpml_5.master;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * A short form of a deal.
 * 
 * <p>Java class for DealSummary complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DealSummary"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.fpml.org/FpML-5/master}DealIdentifier"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.fpml.org/FpML-5/master}DealRoles.model"/&gt;
 *         &lt;element name="creditAgreementDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="currency" type="{http://www.fpml.org/FpML-5/master}Currency"/&gt;
 *           &lt;sequence&gt;
 *             &lt;element name="issuedAmount" type="{http://www.fpml.org/FpML-5/master}NonNegativeMoney" minOccurs="0"/&gt;
 *             &lt;element name="currentDealAmount" type="{http://www.fpml.org/FpML-5/master}MoneyWithParticipantShare" minOccurs="0"/&gt;
 *           &lt;/sequence&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DealSummary", propOrder = {
    "issuerPartyReference",
    "guarantorPartyReference",
    "agentPartyReference",
    "syndicationLeadPartyReference",
    "syndicationCoLeadPartyReference",
    "creditAgreementDate",
    "currency",
    "issuedAmount",
    "currentDealAmount"
})
@XmlSeeAlso({
    Deal.class
})
public class DealSummary
    extends DealIdentifier
{

    protected PartyReference issuerPartyReference;
    protected List<PartyReference> guarantorPartyReference;
    protected PartyReference agentPartyReference;
    protected PartyReference syndicationLeadPartyReference;
    protected List<PartyReference> syndicationCoLeadPartyReference;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar creditAgreementDate;
    protected Currency currency;
    protected NonNegativeMoney issuedAmount;
    protected MoneyWithParticipantShare currentDealAmount;

    /**
     * Gets the value of the issuerPartyReference property.
     * 
     * @return
     *     possible object is
     *     {@link PartyReference }
     *     
     */
    public PartyReference getIssuerPartyReference() {
        return issuerPartyReference;
    }

    /**
     * Sets the value of the issuerPartyReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyReference }
     *     
     */
    public void setIssuerPartyReference(PartyReference value) {
        this.issuerPartyReference = value;
    }

    /**
     * Gets the value of the guarantorPartyReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the guarantorPartyReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGuarantorPartyReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyReference }
     * 
     * 
     */
    public List<PartyReference> getGuarantorPartyReference() {
        if (guarantorPartyReference == null) {
            guarantorPartyReference = new ArrayList<PartyReference>();
        }
        return this.guarantorPartyReference;
    }

    /**
     * Gets the value of the agentPartyReference property.
     * 
     * @return
     *     possible object is
     *     {@link PartyReference }
     *     
     */
    public PartyReference getAgentPartyReference() {
        return agentPartyReference;
    }

    /**
     * Sets the value of the agentPartyReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyReference }
     *     
     */
    public void setAgentPartyReference(PartyReference value) {
        this.agentPartyReference = value;
    }

    /**
     * Gets the value of the syndicationLeadPartyReference property.
     * 
     * @return
     *     possible object is
     *     {@link PartyReference }
     *     
     */
    public PartyReference getSyndicationLeadPartyReference() {
        return syndicationLeadPartyReference;
    }

    /**
     * Sets the value of the syndicationLeadPartyReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyReference }
     *     
     */
    public void setSyndicationLeadPartyReference(PartyReference value) {
        this.syndicationLeadPartyReference = value;
    }

    /**
     * Gets the value of the syndicationCoLeadPartyReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the syndicationCoLeadPartyReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSyndicationCoLeadPartyReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyReference }
     * 
     * 
     */
    public List<PartyReference> getSyndicationCoLeadPartyReference() {
        if (syndicationCoLeadPartyReference == null) {
            syndicationCoLeadPartyReference = new ArrayList<PartyReference>();
        }
        return this.syndicationCoLeadPartyReference;
    }

    /**
     * Gets the value of the creditAgreementDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreditAgreementDate() {
        return creditAgreementDate;
    }

    /**
     * Sets the value of the creditAgreementDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreditAgreementDate(XMLGregorianCalendar value) {
        this.creditAgreementDate = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setCurrency(Currency value) {
        this.currency = value;
    }

    /**
     * Gets the value of the issuedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeMoney }
     *     
     */
    public NonNegativeMoney getIssuedAmount() {
        return issuedAmount;
    }

    /**
     * Sets the value of the issuedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeMoney }
     *     
     */
    public void setIssuedAmount(NonNegativeMoney value) {
        this.issuedAmount = value;
    }

    /**
     * Gets the value of the currentDealAmount property.
     * 
     * @return
     *     possible object is
     *     {@link MoneyWithParticipantShare }
     *     
     */
    public MoneyWithParticipantShare getCurrentDealAmount() {
        return currentDealAmount;
    }

    /**
     * Sets the value of the currentDealAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link MoneyWithParticipantShare }
     *     
     */
    public void setCurrentDealAmount(MoneyWithParticipantShare value) {
        this.currentDealAmount = value;
    }

}
