//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0-b170531.0717 
//         See <a href="https://jaxb.java.net/">https://jaxb.java.net/</a> 
//         Any modifications to this file will be lost upon recompilation of the source schema. 
//         Generated on: 2018.02.10 at 05:14:53 PM CET 
//


package org.fpml.fpml_5.master;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * A type defining the basic content for a message sent to inform another system that some exception has been detected.
 * 
 * <p>Java class for Exception complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Exception"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.fpml.org/FpML-5/master}Message"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="header" type="{http://www.fpml.org/FpML-5/master}ExceptionMessageHeader" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.fpml.org/FpML-5/master}Validation.model"/&gt;
 *         &lt;group ref="{http://www.fpml.org/FpML-5/master}CorrelationAndOptionalSequence.model" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.fpml.org/FpML-5/master}Exception.model"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Exception", propOrder = {
    "header",
    "validation",
    "parentCorrelationId",
    "correlationId",
    "sequenceNumber",
    "reason",
    "additionalData"
})
public class Exception
    extends Message
{

    protected ExceptionMessageHeader header;
    protected List<Validation> validation;
    protected CorrelationId parentCorrelationId;
    protected CorrelationId correlationId;
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger sequenceNumber;
    protected List<Reason> reason;
    protected AdditionalData additionalData;

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link ExceptionMessageHeader }
     *     
     */
    public ExceptionMessageHeader getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExceptionMessageHeader }
     *     
     */
    public void setHeader(ExceptionMessageHeader value) {
        this.header = value;
    }

    /**
     * Gets the value of the validation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the validation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValidation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Validation }
     * 
     * 
     */
    public List<Validation> getValidation() {
        if (validation == null) {
            validation = new ArrayList<Validation>();
        }
        return this.validation;
    }

    /**
     * Gets the value of the parentCorrelationId property.
     * 
     * @return
     *     possible object is
     *     {@link CorrelationId }
     *     
     */
    public CorrelationId getParentCorrelationId() {
        return parentCorrelationId;
    }

    /**
     * Sets the value of the parentCorrelationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorrelationId }
     *     
     */
    public void setParentCorrelationId(CorrelationId value) {
        this.parentCorrelationId = value;
    }

    /**
     * Gets the value of the correlationId property.
     * 
     * @return
     *     possible object is
     *     {@link CorrelationId }
     *     
     */
    public CorrelationId getCorrelationId() {
        return correlationId;
    }

    /**
     * Sets the value of the correlationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorrelationId }
     *     
     */
    public void setCorrelationId(CorrelationId value) {
        this.correlationId = value;
    }

    /**
     * Gets the value of the sequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * Sets the value of the sequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSequenceNumber(BigInteger value) {
        this.sequenceNumber = value;
    }

    /**
     * Gets the value of the reason property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reason property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReason().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Reason }
     * 
     * 
     */
    public List<Reason> getReason() {
        if (reason == null) {
            reason = new ArrayList<Reason>();
        }
        return this.reason;
    }

    /**
     * Gets the value of the additionalData property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalData }
     *     
     */
    public AdditionalData getAdditionalData() {
        return additionalData;
    }

    /**
     * Sets the value of the additionalData property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalData }
     *     
     */
    public void setAdditionalData(AdditionalData value) {
        this.additionalData = value;
    }

}
