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
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Allows timing information about when a trade was processed and reported to be recorded.
 * 
 * <p>Java class for TradeProcessingTimestamps complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TradeProcessingTimestamps"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="orderEntered" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="orderSubmitted" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="publiclyReported" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="publicReportAccepted" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="publicReportUpdated" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="nonpubliclyReported" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="nonpublicReportAccepted" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="nonpublicReportUpdated" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="submittedForConfirmation" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="updatedForConfirmation" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="confirmed" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="submittedForClearing" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="updatedForClearing" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="cleared" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="allocationsSubmitted" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="allocationsUpdated" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="allocationsCompleted" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="timestamp" type="{http://www.fpml.org/FpML-5/master}TradeTimestamp" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeProcessingTimestamps", propOrder = {
    "orderEntered",
    "orderSubmitted",
    "publiclyReported",
    "publicReportAccepted",
    "publicReportUpdated",
    "nonpubliclyReported",
    "nonpublicReportAccepted",
    "nonpublicReportUpdated",
    "submittedForConfirmation",
    "updatedForConfirmation",
    "confirmed",
    "submittedForClearing",
    "updatedForClearing",
    "cleared",
    "allocationsSubmitted",
    "allocationsUpdated",
    "allocationsCompleted",
    "timestamp"
})
public class TradeProcessingTimestamps {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar orderEntered;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar orderSubmitted;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar publiclyReported;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar publicReportAccepted;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar publicReportUpdated;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar nonpubliclyReported;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar nonpublicReportAccepted;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar nonpublicReportUpdated;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar submittedForConfirmation;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updatedForConfirmation;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar confirmed;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar submittedForClearing;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updatedForClearing;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar cleared;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar allocationsSubmitted;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar allocationsUpdated;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar allocationsCompleted;
    protected List<TradeTimestamp> timestamp;

    /**
     * Gets the value of the orderEntered property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOrderEntered() {
        return orderEntered;
    }

    /**
     * Sets the value of the orderEntered property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOrderEntered(XMLGregorianCalendar value) {
        this.orderEntered = value;
    }

    /**
     * Gets the value of the orderSubmitted property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOrderSubmitted() {
        return orderSubmitted;
    }

    /**
     * Sets the value of the orderSubmitted property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOrderSubmitted(XMLGregorianCalendar value) {
        this.orderSubmitted = value;
    }

    /**
     * Gets the value of the publiclyReported property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPubliclyReported() {
        return publiclyReported;
    }

    /**
     * Sets the value of the publiclyReported property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPubliclyReported(XMLGregorianCalendar value) {
        this.publiclyReported = value;
    }

    /**
     * Gets the value of the publicReportAccepted property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPublicReportAccepted() {
        return publicReportAccepted;
    }

    /**
     * Sets the value of the publicReportAccepted property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPublicReportAccepted(XMLGregorianCalendar value) {
        this.publicReportAccepted = value;
    }

    /**
     * Gets the value of the publicReportUpdated property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPublicReportUpdated() {
        return publicReportUpdated;
    }

    /**
     * Sets the value of the publicReportUpdated property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPublicReportUpdated(XMLGregorianCalendar value) {
        this.publicReportUpdated = value;
    }

    /**
     * Gets the value of the nonpubliclyReported property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNonpubliclyReported() {
        return nonpubliclyReported;
    }

    /**
     * Sets the value of the nonpubliclyReported property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNonpubliclyReported(XMLGregorianCalendar value) {
        this.nonpubliclyReported = value;
    }

    /**
     * Gets the value of the nonpublicReportAccepted property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNonpublicReportAccepted() {
        return nonpublicReportAccepted;
    }

    /**
     * Sets the value of the nonpublicReportAccepted property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNonpublicReportAccepted(XMLGregorianCalendar value) {
        this.nonpublicReportAccepted = value;
    }

    /**
     * Gets the value of the nonpublicReportUpdated property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNonpublicReportUpdated() {
        return nonpublicReportUpdated;
    }

    /**
     * Sets the value of the nonpublicReportUpdated property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNonpublicReportUpdated(XMLGregorianCalendar value) {
        this.nonpublicReportUpdated = value;
    }

    /**
     * Gets the value of the submittedForConfirmation property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSubmittedForConfirmation() {
        return submittedForConfirmation;
    }

    /**
     * Sets the value of the submittedForConfirmation property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSubmittedForConfirmation(XMLGregorianCalendar value) {
        this.submittedForConfirmation = value;
    }

    /**
     * Gets the value of the updatedForConfirmation property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUpdatedForConfirmation() {
        return updatedForConfirmation;
    }

    /**
     * Sets the value of the updatedForConfirmation property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUpdatedForConfirmation(XMLGregorianCalendar value) {
        this.updatedForConfirmation = value;
    }

    /**
     * Gets the value of the confirmed property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getConfirmed() {
        return confirmed;
    }

    /**
     * Sets the value of the confirmed property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setConfirmed(XMLGregorianCalendar value) {
        this.confirmed = value;
    }

    /**
     * Gets the value of the submittedForClearing property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSubmittedForClearing() {
        return submittedForClearing;
    }

    /**
     * Sets the value of the submittedForClearing property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSubmittedForClearing(XMLGregorianCalendar value) {
        this.submittedForClearing = value;
    }

    /**
     * Gets the value of the updatedForClearing property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUpdatedForClearing() {
        return updatedForClearing;
    }

    /**
     * Sets the value of the updatedForClearing property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUpdatedForClearing(XMLGregorianCalendar value) {
        this.updatedForClearing = value;
    }

    /**
     * Gets the value of the cleared property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCleared() {
        return cleared;
    }

    /**
     * Sets the value of the cleared property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCleared(XMLGregorianCalendar value) {
        this.cleared = value;
    }

    /**
     * Gets the value of the allocationsSubmitted property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAllocationsSubmitted() {
        return allocationsSubmitted;
    }

    /**
     * Sets the value of the allocationsSubmitted property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAllocationsSubmitted(XMLGregorianCalendar value) {
        this.allocationsSubmitted = value;
    }

    /**
     * Gets the value of the allocationsUpdated property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAllocationsUpdated() {
        return allocationsUpdated;
    }

    /**
     * Sets the value of the allocationsUpdated property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAllocationsUpdated(XMLGregorianCalendar value) {
        this.allocationsUpdated = value;
    }

    /**
     * Gets the value of the allocationsCompleted property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAllocationsCompleted() {
        return allocationsCompleted;
    }

    /**
     * Sets the value of the allocationsCompleted property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAllocationsCompleted(XMLGregorianCalendar value) {
        this.allocationsCompleted = value;
    }

    /**
     * Gets the value of the timestamp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the timestamp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTimestamp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TradeTimestamp }
     * 
     * 
     */
    public List<TradeTimestamp> getTimestamp() {
        if (timestamp == null) {
            timestamp = new ArrayList<TradeTimestamp>();
        }
        return this.timestamp;
    }

}
