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
 * The physical delivery obligation options specific to a unit firm transaction.
 * 
 * <p>Java class for ElectricityDeliveryUnitFirm complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ElectricityDeliveryUnitFirm"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="applicable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="generationAsset" type="{http://www.fpml.org/FpML-5/master}CommodityDeliveryPoint" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElectricityDeliveryUnitFirm", propOrder = {
    "applicable",
    "generationAsset"
})
public class ElectricityDeliveryUnitFirm {

    protected Boolean applicable;
    protected CommodityDeliveryPoint generationAsset;

    /**
     * Gets the value of the applicable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isApplicable() {
        return applicable;
    }

    /**
     * Sets the value of the applicable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setApplicable(Boolean value) {
        this.applicable = value;
    }

    /**
     * Gets the value of the generationAsset property.
     * 
     * @return
     *     possible object is
     *     {@link CommodityDeliveryPoint }
     *     
     */
    public CommodityDeliveryPoint getGenerationAsset() {
        return generationAsset;
    }

    /**
     * Sets the value of the generationAsset property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommodityDeliveryPoint }
     *     
     */
    public void setGenerationAsset(CommodityDeliveryPoint value) {
        this.generationAsset = value;
    }

}
