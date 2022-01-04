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
 * A short form definition of a letter of credit.
 * 
 * <p>Java class for LetterOfCreditSummary complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LetterOfCreditSummary"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="identifier" type="{http://www.fpml.org/FpML-5/master}FacilityContractIdentifier" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="type" type="{http://www.fpml.org/FpML-5/master}LcType" minOccurs="0"/&gt;
 *         &lt;element name="effectiveDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.fpml.org/FpML-5/master}LetterOfCreditRoles.model"/&gt;
 *         &lt;element name="amount" type="{http://www.fpml.org/FpML-5/master}MoneyWithParticipantShare" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LetterOfCreditSummary", propOrder = {
    "identifier",
    "type",
    "effectiveDate",
    "borrowerPartyReference",
    "issuingBankPartyReference",
    "beneficiaryPartyReference",
    "amount"
})
@XmlSeeAlso({
    LetterOfCredit.class
})
public class LetterOfCreditSummary {

    protected List<FacilityContractIdentifier> identifier;
    protected LcType type;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effectiveDate;
    protected PartyReference borrowerPartyReference;
    protected PartyReference issuingBankPartyReference;
    protected PartyReference beneficiaryPartyReference;
    protected MoneyWithParticipantShare amount;

    /**
     * Gets the value of the identifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the identifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FacilityContractIdentifier }
     * 
     * 
     */
    public List<FacilityContractIdentifier> getIdentifier() {
        if (identifier == null) {
            identifier = new ArrayList<FacilityContractIdentifier>();
        }
        return this.identifier;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link LcType }
     *     
     */
    public LcType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link LcType }
     *     
     */
    public void setType(LcType value) {
        this.type = value;
    }

    /**
     * Gets the value of the effectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * Sets the value of the effectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEffectiveDate(XMLGregorianCalendar value) {
        this.effectiveDate = value;
    }

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
     * Gets the value of the issuingBankPartyReference property.
     * 
     * @return
     *     possible object is
     *     {@link PartyReference }
     *     
     */
    public PartyReference getIssuingBankPartyReference() {
        return issuingBankPartyReference;
    }

    /**
     * Sets the value of the issuingBankPartyReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyReference }
     *     
     */
    public void setIssuingBankPartyReference(PartyReference value) {
        this.issuingBankPartyReference = value;
    }

    /**
     * Gets the value of the beneficiaryPartyReference property.
     * 
     * @return
     *     possible object is
     *     {@link PartyReference }
     *     
     */
    public PartyReference getBeneficiaryPartyReference() {
        return beneficiaryPartyReference;
    }

    /**
     * Sets the value of the beneficiaryPartyReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyReference }
     *     
     */
    public void setBeneficiaryPartyReference(PartyReference value) {
        this.beneficiaryPartyReference = value;
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

}