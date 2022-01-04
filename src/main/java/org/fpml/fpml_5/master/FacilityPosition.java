//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0-b170531.0717 
//         See <a href="https://jaxb.java.net/">https://jaxb.java.net/</a> 
//         Any modifications to this file will be lost upon recompilation of the source schema. 
//         Generated on: 2018.02.10 at 05:14:53 PM CET 
//


package org.fpml.fpml_5.master;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Represents current/prior facility commitment amounts on both the global and lender position levels.
 * 
 * <p>Java class for FacilityPosition complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FacilityPosition"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="facilityReference" type="{http://www.fpml.org/FpML-5/master}FacilityReference" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.fpml.org/FpML-5/master}CurrentPriorCommitment.model"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FacilityPosition", propOrder = {
    "facilityReference",
    "commitment",
    "priorCommitment"
})
@XmlSeeAlso({
    FacilityOutstandingsPosition.class
})
public class FacilityPosition {

    protected FacilityReference facilityReference;
    protected FacilityCommitment commitment;
    protected FacilityCommitment priorCommitment;

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
     * Gets the value of the commitment property.
     * 
     * @return
     *     possible object is
     *     {@link FacilityCommitment }
     *     
     */
    public FacilityCommitment getCommitment() {
        return commitment;
    }

    /**
     * Sets the value of the commitment property.
     * 
     * @param value
     *     allowed object is
     *     {@link FacilityCommitment }
     *     
     */
    public void setCommitment(FacilityCommitment value) {
        this.commitment = value;
    }

    /**
     * Gets the value of the priorCommitment property.
     * 
     * @return
     *     possible object is
     *     {@link FacilityCommitment }
     *     
     */
    public FacilityCommitment getPriorCommitment() {
        return priorCommitment;
    }

    /**
     * Sets the value of the priorCommitment property.
     * 
     * @param value
     *     allowed object is
     *     {@link FacilityCommitment }
     *     
     */
    public void setPriorCommitment(FacilityCommitment value) {
        this.priorCommitment = value;
    }

}