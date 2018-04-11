//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0-b170531.0717 
//         See <a href="https://jaxb.java.net/">https://jaxb.java.net/</a> 
//         Any modifications to this file will be lost upon recompilation of the source schema. 
//         Generated on: 2018.02.10 at 05:14:53 PM CET 
//


package org.fpml.fpml_5.master;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * The Expiration Dates of the trade relative to the Calculation Periods.
 * 
 * <p>Java class for CommodityRelativeExpirationDates complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommodityRelativeExpirationDates"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="expireRelativeToEvent" type="{http://www.fpml.org/FpML-5/master}CommodityExpireRelativeToEvent" minOccurs="0"/&gt;
 *         &lt;element name="expirationDateOffset" type="{http://www.fpml.org/FpML-5/master}DateOffset" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.fpml.org/FpML-5/master}BusinessCentersOrReference.model" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommodityRelativeExpirationDates", propOrder = {
    "expireRelativeToEvent",
    "expirationDateOffset",
    "businessCentersReference",
    "businessCenters"
})
public class CommodityRelativeExpirationDates {

    protected CommodityExpireRelativeToEvent expireRelativeToEvent;
    protected DateOffset expirationDateOffset;
    protected BusinessCentersReference businessCentersReference;
    protected BusinessCenters businessCenters;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Gets the value of the expireRelativeToEvent property.
     * 
     * @return
     *     possible object is
     *     {@link CommodityExpireRelativeToEvent }
     *     
     */
    public CommodityExpireRelativeToEvent getExpireRelativeToEvent() {
        return expireRelativeToEvent;
    }

    /**
     * Sets the value of the expireRelativeToEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommodityExpireRelativeToEvent }
     *     
     */
    public void setExpireRelativeToEvent(CommodityExpireRelativeToEvent value) {
        this.expireRelativeToEvent = value;
    }

    /**
     * Gets the value of the expirationDateOffset property.
     * 
     * @return
     *     possible object is
     *     {@link DateOffset }
     *     
     */
    public DateOffset getExpirationDateOffset() {
        return expirationDateOffset;
    }

    /**
     * Sets the value of the expirationDateOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateOffset }
     *     
     */
    public void setExpirationDateOffset(DateOffset value) {
        this.expirationDateOffset = value;
    }

    /**
     * Gets the value of the businessCentersReference property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessCentersReference }
     *     
     */
    public BusinessCentersReference getBusinessCentersReference() {
        return businessCentersReference;
    }

    /**
     * Sets the value of the businessCentersReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessCentersReference }
     *     
     */
    public void setBusinessCentersReference(BusinessCentersReference value) {
        this.businessCentersReference = value;
    }

    /**
     * Gets the value of the businessCenters property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessCenters }
     *     
     */
    public BusinessCenters getBusinessCenters() {
        return businessCenters;
    }

    /**
     * Sets the value of the businessCenters property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessCenters }
     *     
     */
    public void setBusinessCenters(BusinessCenters value) {
        this.businessCenters = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}