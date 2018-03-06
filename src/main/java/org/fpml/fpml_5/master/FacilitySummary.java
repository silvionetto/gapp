//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0-b170531.0717 
//         See <a href="https://jaxb.java.net/">https://jaxb.java.net/</a> 
//         Any modifications to this file will be lost upon recompilation of the source schema. 
//         Generated on: 2018.02.10 at 05:14:53 PM CET 
//


package org.fpml.fpml_5.master;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.List;


/**
 * A short form of a facility.
 * 
 * <p>Java class for FacilitySummary complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FacilitySummary"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.fpml.org/FpML-5/master}FacilityIdentifier"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.fpml.org/FpML-5/master}FacilityRoles.model"/&gt;
 *         &lt;group ref="{http://www.fpml.org/FpML-5/master}FacilityDates.model"/&gt;
 *         &lt;group ref="{http://www.fpml.org/FpML-5/master}FacilityCommitment.model"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FacilitySummary", propOrder = {
    "borrowerPartyReference",
    "coBorrowerPartyReference",
    "agentPartyReference",
    "lcIssuingBankPartyReference",
    "guarantorPartyReference",
    "startDate",
    "expiryDate",
    "maturityDate",
    "currentCommitment",
    "originalCommitment",
    "commitmentSchedule",
    "dealFxRate"
})
@XmlSeeAlso({
    Facility.class
})
public class FacilitySummary
    extends FacilityIdentifier
{

    protected PartyReference borrowerPartyReference;
    protected List<PartyReference> coBorrowerPartyReference;
    protected PartyReference agentPartyReference;
    protected List<PartyReference> lcIssuingBankPartyReference;
    protected List<PartyReference> guarantorPartyReference;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDate;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expiryDate;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar maturityDate;
    protected FacilityCommitment currentCommitment;
    protected MoneyWithParticipantShare originalCommitment;
    protected CommitmentSchedule commitmentSchedule;
    protected FxTerms dealFxRate;

    /**
     * Gets the value of the borrowerPartyReference property.
     * 
     * @return
     *     possible object is
     *     {@link PartyReference }
     *     
     */
    public PartyReference getBorrowerPartyReference() {
        return borrowerPartyReference;
    }

    /**
     * Sets the value of the borrowerPartyReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyReference }
     *     
     */
    public void setBorrowerPartyReference(PartyReference value) {
        this.borrowerPartyReference = value;
    }

    /**
     * Gets the value of the coBorrowerPartyReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the coBorrowerPartyReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCoBorrowerPartyReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyReference }
     * 
     * 
     */
    public List<PartyReference> getCoBorrowerPartyReference() {
        if (coBorrowerPartyReference == null) {
            coBorrowerPartyReference = new ArrayList<PartyReference>();
        }
        return this.coBorrowerPartyReference;
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
     * Gets the value of the lcIssuingBankPartyReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lcIssuingBankPartyReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLcIssuingBankPartyReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyReference }
     * 
     * 
     */
    public List<PartyReference> getLcIssuingBankPartyReference() {
        if (lcIssuingBankPartyReference == null) {
            lcIssuingBankPartyReference = new ArrayList<PartyReference>();
        }
        return this.lcIssuingBankPartyReference;
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
     * Gets the value of the expiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpiryDate() {
        return expiryDate;
    }

    /**
     * Sets the value of the expiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpiryDate(XMLGregorianCalendar value) {
        this.expiryDate = value;
    }

    /**
     * Gets the value of the maturityDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMaturityDate() {
        return maturityDate;
    }

    /**
     * Sets the value of the maturityDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMaturityDate(XMLGregorianCalendar value) {
        this.maturityDate = value;
    }

    /**
     * Gets the value of the currentCommitment property.
     * 
     * @return
     *     possible object is
     *     {@link FacilityCommitment }
     *     
     */
    public FacilityCommitment getCurrentCommitment() {
        return currentCommitment;
    }

    /**
     * Sets the value of the currentCommitment property.
     * 
     * @param value
     *     allowed object is
     *     {@link FacilityCommitment }
     *     
     */
    public void setCurrentCommitment(FacilityCommitment value) {
        this.currentCommitment = value;
    }

    /**
     * Gets the value of the originalCommitment property.
     * 
     * @return
     *     possible object is
     *     {@link MoneyWithParticipantShare }
     *     
     */
    public MoneyWithParticipantShare getOriginalCommitment() {
        return originalCommitment;
    }

    /**
     * Sets the value of the originalCommitment property.
     * 
     * @param value
     *     allowed object is
     *     {@link MoneyWithParticipantShare }
     *     
     */
    public void setOriginalCommitment(MoneyWithParticipantShare value) {
        this.originalCommitment = value;
    }

    /**
     * Gets the value of the commitmentSchedule property.
     * 
     * @return
     *     possible object is
     *     {@link CommitmentSchedule }
     *     
     */
    public CommitmentSchedule getCommitmentSchedule() {
        return commitmentSchedule;
    }

    /**
     * Sets the value of the commitmentSchedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommitmentSchedule }
     *     
     */
    public void setCommitmentSchedule(CommitmentSchedule value) {
        this.commitmentSchedule = value;
    }

    /**
     * Gets the value of the dealFxRate property.
     * 
     * @return
     *     possible object is
     *     {@link FxTerms }
     *     
     */
    public FxTerms getDealFxRate() {
        return dealFxRate;
    }

    /**
     * Sets the value of the dealFxRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link FxTerms }
     *     
     */
    public void setDealFxRate(FxTerms value) {
        this.dealFxRate = value;
    }

}
