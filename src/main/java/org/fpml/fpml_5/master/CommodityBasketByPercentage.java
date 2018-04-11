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
 * <p>Java class for CommodityBasketByPercentage complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommodityBasketByPercentage"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.fpml.org/FpML-5/master}CommodityBasketBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="underlying" type="{http://www.fpml.org/FpML-5/master}CommodityBasketUnderlyingByPercentage" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="notionalAmount" type="{http://www.fpml.org/FpML-5/master}NotionalAmount" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommodityBasketByPercentage", propOrder = {
    "underlying",
    "notionalAmount"
})
public class CommodityBasketByPercentage
    extends CommodityBasketBase
{

    protected List<CommodityBasketUnderlyingByPercentage> underlying;
    protected NotionalAmount notionalAmount;

    /**
     * Gets the value of the underlying property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the underlying property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnderlying().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommodityBasketUnderlyingByPercentage }
     * 
     * 
     */
    public List<CommodityBasketUnderlyingByPercentage> getUnderlying() {
        if (underlying == null) {
            underlying = new ArrayList<CommodityBasketUnderlyingByPercentage>();
        }
        return this.underlying;
    }

    /**
     * Gets the value of the notionalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link NotionalAmount }
     *     
     */
    public NotionalAmount getNotionalAmount() {
        return notionalAmount;
    }

    /**
     * Sets the value of the notionalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotionalAmount }
     *     
     */
    public void setNotionalAmount(NotionalAmount value) {
        this.notionalAmount = value;
    }

}