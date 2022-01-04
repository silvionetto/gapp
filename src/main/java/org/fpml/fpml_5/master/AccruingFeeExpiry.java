//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0-b170531.0717 
//         See <a href="https://jaxb.java.net/">https://jaxb.java.net/</a> 
//         Any modifications to this file will be lost upon recompilation of the source schema. 
//         Generated on: 2018.02.10 at 05:14:53 PM CET 
//


package org.fpml.fpml_5.master;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * An event describing a future expiry of one of the accruing fees associated with a specific facility.
 * 
 * <p>Java class for AccruingFeeExpiry complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccruingFeeExpiry"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.fpml.org/FpML-5/master}FacilityEvent"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.fpml.org/FpML-5/master}AccrualTypeId" minOccurs="0"/&gt;
 *         &lt;element name="type" type="{http://www.fpml.org/FpML-5/master}AccruingFeeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccruingFeeExpiry", propOrder = {
    "id",
    "type"
})
public class AccruingFeeExpiry
    extends FacilityEvent
{

    protected AccrualTypeId id;
    protected AccruingFeeType type;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link AccrualTypeId }
     *     
     */
    public AccrualTypeId getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccrualTypeId }
     *     
     */
    public void setId(AccrualTypeId value) {
        this.id = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link AccruingFeeType }
     *     
     */
    public AccruingFeeType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccruingFeeType }
     *     
     */
    public void setType(AccruingFeeType value) {
        this.type = value;
    }

}