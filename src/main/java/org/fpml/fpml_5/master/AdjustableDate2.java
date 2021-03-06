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
 * A type that is different from AdjustableDate in two regards. First, date adjustments can be specified with either a dateAdjustments element or a reference to an existing dateAdjustments element. Second, it does not require the specification of date adjustments.
 * 
 * <p>Java class for AdjustableDate2 complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdjustableDate2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="unadjustedDate" type="{http://www.fpml.org/FpML-5/master}IdentifiedDate" minOccurs="0"/&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="dateAdjustments" type="{http://www.fpml.org/FpML-5/master}BusinessDayAdjustments"/&gt;
 *           &lt;element name="dateAdjustmentsReference" type="{http://www.fpml.org/FpML-5/master}BusinessDayAdjustmentsReference"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="adjustedDate" type="{http://www.fpml.org/FpML-5/master}IdentifiedDate" minOccurs="0"/&gt;
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
@XmlType(name = "AdjustableDate2", propOrder = {
    "unadjustedDate",
    "dateAdjustments",
    "dateAdjustmentsReference",
    "adjustedDate"
})
public class AdjustableDate2 {

    protected IdentifiedDate unadjustedDate;
    protected BusinessDayAdjustments dateAdjustments;
    protected BusinessDayAdjustmentsReference dateAdjustmentsReference;
    protected IdentifiedDate adjustedDate;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Gets the value of the unadjustedDate property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifiedDate }
     *     
     */
    public IdentifiedDate getUnadjustedDate() {
        return unadjustedDate;
    }

    /**
     * Sets the value of the unadjustedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifiedDate }
     *     
     */
    public void setUnadjustedDate(IdentifiedDate value) {
        this.unadjustedDate = value;
    }

    /**
     * Gets the value of the dateAdjustments property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessDayAdjustments }
     *     
     */
    public BusinessDayAdjustments getDateAdjustments() {
        return dateAdjustments;
    }

    /**
     * Sets the value of the dateAdjustments property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDayAdjustments }
     *     
     */
    public void setDateAdjustments(BusinessDayAdjustments value) {
        this.dateAdjustments = value;
    }

    /**
     * Gets the value of the dateAdjustmentsReference property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessDayAdjustmentsReference }
     *     
     */
    public BusinessDayAdjustmentsReference getDateAdjustmentsReference() {
        return dateAdjustmentsReference;
    }

    /**
     * Sets the value of the dateAdjustmentsReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDayAdjustmentsReference }
     *     
     */
    public void setDateAdjustmentsReference(BusinessDayAdjustmentsReference value) {
        this.dateAdjustmentsReference = value;
    }

    /**
     * Gets the value of the adjustedDate property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifiedDate }
     *     
     */
    public IdentifiedDate getAdjustedDate() {
        return adjustedDate;
    }

    /**
     * Sets the value of the adjustedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifiedDate }
     *     
     */
    public void setAdjustedDate(IdentifiedDate value) {
        this.adjustedDate = value;
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
