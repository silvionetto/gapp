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
 * Physically settled leg of a physically settled coal transaction.
 * 
 * <p>Java class for CoalPhysicalLeg complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CoalPhysicalLeg"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.fpml.org/FpML-5/master}PhysicalSwapLeg"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="deliveryPeriods" type="{http://www.fpml.org/FpML-5/master}CommodityDeliveryPeriods" minOccurs="0"/&gt;
 *         &lt;element name="coal" type="{http://www.fpml.org/FpML-5/master}CoalProduct" minOccurs="0"/&gt;
 *         &lt;element name="deliveryConditions" type="{http://www.fpml.org/FpML-5/master}CoalDelivery" minOccurs="0"/&gt;
 *         &lt;element name="deliveryQuantity" type="{http://www.fpml.org/FpML-5/master}CommodityPhysicalQuantity" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CoalPhysicalLeg", propOrder = {
    "deliveryPeriods",
    "coal",
    "deliveryConditions",
    "deliveryQuantity"
})
public class CoalPhysicalLeg
    extends PhysicalSwapLeg
{

    protected CommodityDeliveryPeriods deliveryPeriods;
    protected CoalProduct coal;
    protected CoalDelivery deliveryConditions;
    protected CommodityPhysicalQuantity deliveryQuantity;

    /**
     * Gets the value of the deliveryPeriods property.
     * 
     * @return
     *     possible object is
     *     {@link CommodityDeliveryPeriods }
     *     
     */
    public CommodityDeliveryPeriods getDeliveryPeriods() {
        return deliveryPeriods;
    }

    /**
     * Sets the value of the deliveryPeriods property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommodityDeliveryPeriods }
     *     
     */
    public void setDeliveryPeriods(CommodityDeliveryPeriods value) {
        this.deliveryPeriods = value;
    }

    /**
     * Gets the value of the coal property.
     * 
     * @return
     *     possible object is
     *     {@link CoalProduct }
     *     
     */
    public CoalProduct getCoal() {
        return coal;
    }

    /**
     * Sets the value of the coal property.
     * 
     * @param value
     *     allowed object is
     *     {@link CoalProduct }
     *     
     */
    public void setCoal(CoalProduct value) {
        this.coal = value;
    }

    /**
     * Gets the value of the deliveryConditions property.
     * 
     * @return
     *     possible object is
     *     {@link CoalDelivery }
     *     
     */
    public CoalDelivery getDeliveryConditions() {
        return deliveryConditions;
    }

    /**
     * Sets the value of the deliveryConditions property.
     * 
     * @param value
     *     allowed object is
     *     {@link CoalDelivery }
     *     
     */
    public void setDeliveryConditions(CoalDelivery value) {
        this.deliveryConditions = value;
    }

    /**
     * Gets the value of the deliveryQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link CommodityPhysicalQuantity }
     *     
     */
    public CommodityPhysicalQuantity getDeliveryQuantity() {
        return deliveryQuantity;
    }

    /**
     * Sets the value of the deliveryQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommodityPhysicalQuantity }
     *     
     */
    public void setDeliveryQuantity(CommodityPhysicalQuantity value) {
        this.deliveryQuantity = value;
    }

}
