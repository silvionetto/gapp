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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * An abstract base type for all facility and/or contract-level business events.
 * 
 * <p>Java class for FacilityContractEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FacilityContractEvent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.fpml.org/FpML-5/master}LoanEvent"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="facilityReference" type="{http://www.fpml.org/FpML-5/master}FacilityReference" minOccurs="0"/&gt;
 *         &lt;element name="loanContractReference" type="{http://www.fpml.org/FpML-5/master}LoanContractReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FacilityContractEvent", propOrder = {
    "facilityReference",
    "loanContractReference"
})
@XmlSeeAlso({
    NonRecurringFeePayment.class,
    DefaultRateExpiry.class,
    MandatoryCostRateExpiry.class,
    PenaltyRateExpiry.class,
    FacilityRateChangeEvent.class
})
public abstract class FacilityContractEvent
    extends LoanEvent
{

    protected FacilityReference facilityReference;
    protected List<LoanContractReference> loanContractReference;

    /**
     * Gets the value of the facilityReference property.
     * 
     * @return
     *     possible object is
     *     {@link FacilityReference }
     *     
     */
    public FacilityReference getFacilityReference() {
        return facilityReference;
    }

    /**
     * Sets the value of the facilityReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link FacilityReference }
     *     
     */
    public void setFacilityReference(FacilityReference value) {
        this.facilityReference = value;
    }

    /**
     * Gets the value of the loanContractReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the loanContractReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLoanContractReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LoanContractReference }
     * 
     * 
     */
    public List<LoanContractReference> getLoanContractReference() {
        if (loanContractReference == null) {
            loanContractReference = new ArrayList<LoanContractReference>();
        }
        return this.loanContractReference;
    }

}
