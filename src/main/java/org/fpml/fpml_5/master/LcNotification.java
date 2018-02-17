//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0-b170531.0717 
//         See <a href="https://jaxb.java.net/">https://jaxb.java.net/</a> 
//         Any modifications to this file will be lost upon recompilation of the source schema. 
//         Generated on: 2018.02.10 at 05:14:53 PM CET 
//


package org.fpml.fpml_5.master;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * A loan servicing notification used to communicate various letter of credit business events.
 * 
 * <p>Java class for LcNotification complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LcNotification"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.fpml.org/FpML-5/master}AbstractContractNotification"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fpml.org/FpML-5/master}lcEventGroup" minOccurs="0"/&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.fpml.org/FpML-5/master}FacilityDetails.model"/&gt;
 *           &lt;group ref="{http://www.fpml.org/FpML-5/master}LetterOfCreditDetails.model"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;element name="party" type="{http://www.fpml.org/FpML-5/master}Party" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LcNotification", propOrder = {
    "lcEventGroup",
    "facilityIdentifier",
    "facilitySummary",
    "letterOfCreditIdentifier",
    "letterOfCreditSummary",
    "letterOfCredit",
    "party"
})
public class LcNotification
    extends AbstractContractNotification
{

    @XmlElementRef(name = "lcEventGroup", namespace = "http://www.fpml.org/FpML-5/master", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends LcEvent> lcEventGroup;
    protected FacilityIdentifier facilityIdentifier;
    protected FacilitySummary facilitySummary;
    protected FacilityContractIdentifier letterOfCreditIdentifier;
    protected LetterOfCreditSummary letterOfCreditSummary;
    protected LetterOfCredit letterOfCredit;
    protected List<Party> party;

    /**
     * Gets the value of the lcEventGroup property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LcFxRevaluation }{@code >}
     *     {@link JAXBElement }{@code <}{@link LcAdjustment }{@code >}
     *     {@link JAXBElement }{@code <}{@link LcRenewal }{@code >}
     *     {@link JAXBElement }{@code <}{@link LcIssuance }{@code >}
     *     {@link JAXBElement }{@code <}{@link LcIssuanceFeePayment }{@code >}
     *     {@link JAXBElement }{@code <}{@link LcTermination }{@code >}
     *     {@link JAXBElement }{@code <}{@link LcRateChange }{@code >}
     *     {@link JAXBElement }{@code <}{@link LcEvent }{@code >}
     *     
     */
    public JAXBElement<? extends LcEvent> getLcEventGroup() {
        return lcEventGroup;
    }

    /**
     * Sets the value of the lcEventGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LcFxRevaluation }{@code >}
     *     {@link JAXBElement }{@code <}{@link LcAdjustment }{@code >}
     *     {@link JAXBElement }{@code <}{@link LcRenewal }{@code >}
     *     {@link JAXBElement }{@code <}{@link LcIssuance }{@code >}
     *     {@link JAXBElement }{@code <}{@link LcIssuanceFeePayment }{@code >}
     *     {@link JAXBElement }{@code <}{@link LcTermination }{@code >}
     *     {@link JAXBElement }{@code <}{@link LcRateChange }{@code >}
     *     {@link JAXBElement }{@code <}{@link LcEvent }{@code >}
     *     
     */
    public void setLcEventGroup(JAXBElement<? extends LcEvent> value) {
        this.lcEventGroup = value;
    }

    /**
     * Gets the value of the facilityIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link FacilityIdentifier }
     *     
     */
    public FacilityIdentifier getFacilityIdentifier() {
        return facilityIdentifier;
    }

    /**
     * Sets the value of the facilityIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link FacilityIdentifier }
     *     
     */
    public void setFacilityIdentifier(FacilityIdentifier value) {
        this.facilityIdentifier = value;
    }

    /**
     * Gets the value of the facilitySummary property.
     * 
     * @return
     *     possible object is
     *     {@link FacilitySummary }
     *     
     */
    public FacilitySummary getFacilitySummary() {
        return facilitySummary;
    }

    /**
     * Sets the value of the facilitySummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link FacilitySummary }
     *     
     */
    public void setFacilitySummary(FacilitySummary value) {
        this.facilitySummary = value;
    }

    /**
     * Gets the value of the letterOfCreditIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link FacilityContractIdentifier }
     *     
     */
    public FacilityContractIdentifier getLetterOfCreditIdentifier() {
        return letterOfCreditIdentifier;
    }

    /**
     * Sets the value of the letterOfCreditIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link FacilityContractIdentifier }
     *     
     */
    public void setLetterOfCreditIdentifier(FacilityContractIdentifier value) {
        this.letterOfCreditIdentifier = value;
    }

    /**
     * Gets the value of the letterOfCreditSummary property.
     * 
     * @return
     *     possible object is
     *     {@link LetterOfCreditSummary }
     *     
     */
    public LetterOfCreditSummary getLetterOfCreditSummary() {
        return letterOfCreditSummary;
    }

    /**
     * Sets the value of the letterOfCreditSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link LetterOfCreditSummary }
     *     
     */
    public void setLetterOfCreditSummary(LetterOfCreditSummary value) {
        this.letterOfCreditSummary = value;
    }

    /**
     * Gets the value of the letterOfCredit property.
     * 
     * @return
     *     possible object is
     *     {@link LetterOfCredit }
     *     
     */
    public LetterOfCredit getLetterOfCredit() {
        return letterOfCredit;
    }

    /**
     * Sets the value of the letterOfCredit property.
     * 
     * @param value
     *     allowed object is
     *     {@link LetterOfCredit }
     *     
     */
    public void setLetterOfCredit(LetterOfCredit value) {
        this.letterOfCredit = value;
    }

    /**
     * Gets the value of the party property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the party property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Party }
     * 
     * 
     */
    public List<Party> getParty() {
        if (party == null) {
            party = new ArrayList<Party>();
        }
        return this.party;
    }

}
