//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0-b170531.0717 
//         See <a href="https://jaxb.java.net/">https://jaxb.java.net/</a> 
//         Any modifications to this file will be lost upon recompilation of the source schema. 
//         Generated on: 2018.02.10 at 05:14:53 PM CET 
//


package org.fpml.fpml_5.master;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;


/**
 * The barrier which, when breached, triggers the knock-in or knock-out of the barrier option.
 * 
 * <p>Java class for CommodityTrigger complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommodityTrigger"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;sequence&gt;
 *             &lt;element name="levelQuantity" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *             &lt;element name="levelUnit" type="{http://www.fpml.org/FpML-5/master}QuantityUnit" minOccurs="0"/&gt;
 *           &lt;/sequence&gt;
 *           &lt;element name="levelPercentage" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *           &lt;element name="levelPrice" type="{http://www.fpml.org/FpML-5/master}FixedPrice"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="triggerType" type="{http://www.fpml.org/FpML-5/master}TriggerTypeEnum" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommodityTrigger", propOrder = {
    "levelQuantity",
    "levelUnit",
    "levelPercentage",
    "levelPrice",
    "triggerType"
})
public class CommodityTrigger {

    protected BigDecimal levelQuantity;
    protected QuantityUnit levelUnit;
    protected BigDecimal levelPercentage;
    protected FixedPrice levelPrice;
    @XmlSchemaType(name = "token")
    protected TriggerTypeEnum triggerType;

    /**
     * Gets the value of the levelQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLevelQuantity() {
        return levelQuantity;
    }

    /**
     * Sets the value of the levelQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLevelQuantity(BigDecimal value) {
        this.levelQuantity = value;
    }

    /**
     * Gets the value of the levelUnit property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityUnit }
     *     
     */
    public QuantityUnit getLevelUnit() {
        return levelUnit;
    }

    /**
     * Sets the value of the levelUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityUnit }
     *     
     */
    public void setLevelUnit(QuantityUnit value) {
        this.levelUnit = value;
    }

    /**
     * Gets the value of the levelPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLevelPercentage() {
        return levelPercentage;
    }

    /**
     * Sets the value of the levelPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLevelPercentage(BigDecimal value) {
        this.levelPercentage = value;
    }

    /**
     * Gets the value of the levelPrice property.
     * 
     * @return
     *     possible object is
     *     {@link FixedPrice }
     *     
     */
    public FixedPrice getLevelPrice() {
        return levelPrice;
    }

    /**
     * Sets the value of the levelPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link FixedPrice }
     *     
     */
    public void setLevelPrice(FixedPrice value) {
        this.levelPrice = value;
    }

    /**
     * Gets the value of the triggerType property.
     * 
     * @return
     *     possible object is
     *     {@link TriggerTypeEnum }
     *     
     */
    public TriggerTypeEnum getTriggerType() {
        return triggerType;
    }

    /**
     * Sets the value of the triggerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TriggerTypeEnum }
     *     
     */
    public void setTriggerType(TriggerTypeEnum value) {
        this.triggerType = value;
    }

}
