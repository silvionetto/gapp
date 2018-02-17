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
import javax.xml.bind.annotation.XmlType;


/**
 * A type defining additional information that may be recorded against a package of trades.
 * 
 * <p>Java class for PackageInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PackageInformation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="relatedParty" type="{http://www.fpml.org/FpML-5/master}RelatedParty" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="category" type="{http://www.fpml.org/FpML-5/master}TradeCategory" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="executionDateTime" type="{http://www.fpml.org/FpML-5/master}ExecutionDateTime" minOccurs="0"/&gt;
 *         &lt;element name="timestamps" type="{http://www.fpml.org/FpML-5/master}TradeProcessingTimestamps" minOccurs="0"/&gt;
 *         &lt;element name="intentToAllocate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="allocationStatus" type="{http://www.fpml.org/FpML-5/master}AllocationReportingStatus" minOccurs="0"/&gt;
 *         &lt;element name="intentToClear" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="clearingStatus" type="{http://www.fpml.org/FpML-5/master}ClearingStatusValue" minOccurs="0"/&gt;
 *         &lt;element name="executionVenueType" type="{http://www.fpml.org/FpML-5/master}ExecutionVenueType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PackageInformation", propOrder = {
    "relatedParty",
    "category",
    "executionDateTime",
    "timestamps",
    "intentToAllocate",
    "allocationStatus",
    "intentToClear",
    "clearingStatus",
    "executionVenueType"
})
public class PackageInformation {

    protected List<RelatedParty> relatedParty;
    protected List<TradeCategory> category;
    protected ExecutionDateTime executionDateTime;
    protected TradeProcessingTimestamps timestamps;
    protected Boolean intentToAllocate;
    protected AllocationReportingStatus allocationStatus;
    protected Boolean intentToClear;
    protected ClearingStatusValue clearingStatus;
    protected ExecutionVenueType executionVenueType;

    /**
     * Gets the value of the relatedParty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relatedParty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelatedParty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelatedParty }
     * 
     * 
     */
    public List<RelatedParty> getRelatedParty() {
        if (relatedParty == null) {
            relatedParty = new ArrayList<RelatedParty>();
        }
        return this.relatedParty;
    }

    /**
     * Gets the value of the category property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the category property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCategory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TradeCategory }
     * 
     * 
     */
    public List<TradeCategory> getCategory() {
        if (category == null) {
            category = new ArrayList<TradeCategory>();
        }
        return this.category;
    }

    /**
     * Gets the value of the executionDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link ExecutionDateTime }
     *     
     */
    public ExecutionDateTime getExecutionDateTime() {
        return executionDateTime;
    }

    /**
     * Sets the value of the executionDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExecutionDateTime }
     *     
     */
    public void setExecutionDateTime(ExecutionDateTime value) {
        this.executionDateTime = value;
    }

    /**
     * Gets the value of the timestamps property.
     * 
     * @return
     *     possible object is
     *     {@link TradeProcessingTimestamps }
     *     
     */
    public TradeProcessingTimestamps getTimestamps() {
        return timestamps;
    }

    /**
     * Sets the value of the timestamps property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeProcessingTimestamps }
     *     
     */
    public void setTimestamps(TradeProcessingTimestamps value) {
        this.timestamps = value;
    }

    /**
     * Gets the value of the intentToAllocate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIntentToAllocate() {
        return intentToAllocate;
    }

    /**
     * Sets the value of the intentToAllocate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIntentToAllocate(Boolean value) {
        this.intentToAllocate = value;
    }

    /**
     * Gets the value of the allocationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link AllocationReportingStatus }
     *     
     */
    public AllocationReportingStatus getAllocationStatus() {
        return allocationStatus;
    }

    /**
     * Sets the value of the allocationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link AllocationReportingStatus }
     *     
     */
    public void setAllocationStatus(AllocationReportingStatus value) {
        this.allocationStatus = value;
    }

    /**
     * Gets the value of the intentToClear property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIntentToClear() {
        return intentToClear;
    }

    /**
     * Sets the value of the intentToClear property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIntentToClear(Boolean value) {
        this.intentToClear = value;
    }

    /**
     * Gets the value of the clearingStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ClearingStatusValue }
     *     
     */
    public ClearingStatusValue getClearingStatus() {
        return clearingStatus;
    }

    /**
     * Sets the value of the clearingStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClearingStatusValue }
     *     
     */
    public void setClearingStatus(ClearingStatusValue value) {
        this.clearingStatus = value;
    }

    /**
     * Gets the value of the executionVenueType property.
     * 
     * @return
     *     possible object is
     *     {@link ExecutionVenueType }
     *     
     */
    public ExecutionVenueType getExecutionVenueType() {
        return executionVenueType;
    }

    /**
     * Sets the value of the executionVenueType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExecutionVenueType }
     *     
     */
    public void setExecutionVenueType(ExecutionVenueType value) {
        this.executionVenueType = value;
    }

}
