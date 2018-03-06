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
 * A type for defining a premium.
 * 
 * <p>Java class for Premium complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Premium"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.fpml.org/FpML-5/master}SimplePayment"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.fpml.org/FpML-5/master}Premium.model" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.fpml.org/FpML-5/master}PaymentDiscounting.model" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Premium", propOrder = {
    "premiumType",
    "pricePerOption",
    "percentageOfNotional",
    "discountFactor",
    "presentValueAmount"
})
public class Premium
    extends SimplePayment
{

    @XmlSchemaType(name = "token")
    protected PremiumTypeEnum premiumType;
    protected Money pricePerOption;
    protected BigDecimal percentageOfNotional;
    protected BigDecimal discountFactor;
    protected Money presentValueAmount;

    /**
     * Gets the value of the premiumType property.
     * 
     * @return
     *     possible object is
     *     {@link PremiumTypeEnum }
     *     
     */
    public PremiumTypeEnum getPremiumType() {
        return premiumType;
    }

    /**
     * Sets the value of the premiumType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PremiumTypeEnum }
     *     
     */
    public void setPremiumType(PremiumTypeEnum value) {
        this.premiumType = value;
    }

    /**
     * Gets the value of the pricePerOption property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getPricePerOption() {
        return pricePerOption;
    }

    /**
     * Sets the value of the pricePerOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setPricePerOption(Money value) {
        this.pricePerOption = value;
    }

    /**
     * Gets the value of the percentageOfNotional property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPercentageOfNotional() {
        return percentageOfNotional;
    }

    /**
     * Sets the value of the percentageOfNotional property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPercentageOfNotional(BigDecimal value) {
        this.percentageOfNotional = value;
    }

    /**
     * Gets the value of the discountFactor property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDiscountFactor() {
        return discountFactor;
    }

    /**
     * Sets the value of the discountFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDiscountFactor(BigDecimal value) {
        this.discountFactor = value;
    }

    /**
     * Gets the value of the presentValueAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getPresentValueAmount() {
        return presentValueAmount;
    }

    /**
     * Sets the value of the presentValueAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setPresentValueAmount(Money value) {
        this.presentValueAmount = value;
    }

}
