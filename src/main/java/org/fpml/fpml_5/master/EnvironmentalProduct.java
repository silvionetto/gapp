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
 * A type defining the characteristics of the environmental allowance or credit being traded. Settlement of environmental transactions is classified as physical because settlement is accomplished through the exchange of one or more certificates (despite the fact that this exchange is almost always executed through electronic book entry transfer between the parties allowance accounts).
 * 
 * <p>Java class for EnvironmentalProduct complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EnvironmentalProduct"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="productType" type="{http://www.fpml.org/FpML-5/master}EnvironmentalProductTypeEnum" minOccurs="0"/&gt;
 *         &lt;element name="compliancePeriod" type="{http://www.fpml.org/FpML-5/master}EnvironmentalProductComplaincePeriod" minOccurs="0"/&gt;
 *         &lt;element name="vintage" type="{http://www.w3.org/2001/XMLSchema}gYear" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="applicableLaw" type="{http://www.fpml.org/FpML-5/master}EnvironmentalProductApplicableLaw" minOccurs="0"/&gt;
 *         &lt;element name="trackingSystem" type="{http://www.fpml.org/FpML-5/master}EnvironmentalTrackingSystem" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnvironmentalProduct", propOrder = {
    "productType",
    "compliancePeriod",
    "vintage",
    "applicableLaw",
    "trackingSystem"
})
public class EnvironmentalProduct {

    @XmlSchemaType(name = "token")
    protected EnvironmentalProductTypeEnum productType;
    protected EnvironmentalProductComplaincePeriod compliancePeriod;
    @XmlSchemaType(name = "gYear")
    protected List<XMLGregorianCalendar> vintage;
    protected EnvironmentalProductApplicableLaw applicableLaw;
    protected EnvironmentalTrackingSystem trackingSystem;

    /**
     * Gets the value of the productType property.
     * 
     * @return
     *     possible object is
     *     {@link EnvironmentalProductTypeEnum }
     *     
     */
    public EnvironmentalProductTypeEnum getProductType() {
        return productType;
    }

    /**
     * Sets the value of the productType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnvironmentalProductTypeEnum }
     *     
     */
    public void setProductType(EnvironmentalProductTypeEnum value) {
        this.productType = value;
    }

    /**
     * Gets the value of the compliancePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link EnvironmentalProductComplaincePeriod }
     *     
     */
    public EnvironmentalProductComplaincePeriod getCompliancePeriod() {
        return compliancePeriod;
    }

    /**
     * Sets the value of the compliancePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnvironmentalProductComplaincePeriod }
     *     
     */
    public void setCompliancePeriod(EnvironmentalProductComplaincePeriod value) {
        this.compliancePeriod = value;
    }

    /**
     * Gets the value of the vintage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vintage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVintage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XMLGregorianCalendar }
     * 
     * 
     */
    public List<XMLGregorianCalendar> getVintage() {
        if (vintage == null) {
            vintage = new ArrayList<XMLGregorianCalendar>();
        }
        return this.vintage;
    }

    /**
     * Gets the value of the applicableLaw property.
     * 
     * @return
     *     possible object is
     *     {@link EnvironmentalProductApplicableLaw }
     *     
     */
    public EnvironmentalProductApplicableLaw getApplicableLaw() {
        return applicableLaw;
    }

    /**
     * Sets the value of the applicableLaw property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnvironmentalProductApplicableLaw }
     *     
     */
    public void setApplicableLaw(EnvironmentalProductApplicableLaw value) {
        this.applicableLaw = value;
    }

    /**
     * Gets the value of the trackingSystem property.
     * 
     * @return
     *     possible object is
     *     {@link EnvironmentalTrackingSystem }
     *     
     */
    public EnvironmentalTrackingSystem getTrackingSystem() {
        return trackingSystem;
    }

    /**
     * Sets the value of the trackingSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnvironmentalTrackingSystem }
     *     
     */
    public void setTrackingSystem(EnvironmentalTrackingSystem value) {
        this.trackingSystem = value;
    }

}