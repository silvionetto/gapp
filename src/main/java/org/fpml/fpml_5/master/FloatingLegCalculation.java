//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0-b170531.0717 
//         See <a href="https://jaxb.java.net/">https://jaxb.java.net/</a> 
//         Any modifications to this file will be lost upon recompilation of the source schema. 
//         Generated on: 2018.02.10 at 05:14:53 PM CET 
//


package org.fpml.fpml_5.master;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * A type to capture details relevant to the calculation of the floating price.
 * 
 * <p>Java class for FloatingLegCalculation complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FloatingLegCalculation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="pricingDates" type="{http://www.fpml.org/FpML-5/master}CommodityPricingDates" minOccurs="0"/&gt;
 *         &lt;element name="averagingMethod" type="{http://www.fpml.org/FpML-5/master}AveragingMethodEnum" minOccurs="0"/&gt;
 *         &lt;element name="conversionFactor" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="rounding" type="{http://www.fpml.org/FpML-5/master}Rounding" minOccurs="0"/&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="spread" type="{http://www.fpml.org/FpML-5/master}CommoditySpread"/&gt;
 *           &lt;element name="spreadSchedule" type="{http://www.fpml.org/FpML-5/master}CommoditySpreadSchedule" maxOccurs="unbounded"/&gt;
 *           &lt;element name="spreadPercentage" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="fx" type="{http://www.fpml.org/FpML-5/master}CommodityFx" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FloatingLegCalculation", propOrder = {
    "pricingDates",
    "averagingMethod",
    "conversionFactor",
    "rounding",
    "spread",
    "spreadSchedule",
    "spreadPercentage",
    "fx"
})
@XmlSeeAlso({
    FloatingStrikePrice.class
})
public class FloatingLegCalculation {

    protected CommodityPricingDates pricingDates;
    @XmlSchemaType(name = "token")
    protected AveragingMethodEnum averagingMethod;
    protected BigDecimal conversionFactor;
    protected Rounding rounding;
    protected CommoditySpread spread;
    protected List<CommoditySpreadSchedule> spreadSchedule;
    protected BigDecimal spreadPercentage;
    protected CommodityFx fx;

    /**
     * Gets the value of the pricingDates property.
     * 
     * @return
     *     possible object is
     *     {@link CommodityPricingDates }
     *     
     */
    public CommodityPricingDates getPricingDates() {
        return pricingDates;
    }

    /**
     * Sets the value of the pricingDates property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommodityPricingDates }
     *     
     */
    public void setPricingDates(CommodityPricingDates value) {
        this.pricingDates = value;
    }

    /**
     * Gets the value of the averagingMethod property.
     * 
     * @return
     *     possible object is
     *     {@link AveragingMethodEnum }
     *     
     */
    public AveragingMethodEnum getAveragingMethod() {
        return averagingMethod;
    }

    /**
     * Sets the value of the averagingMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link AveragingMethodEnum }
     *     
     */
    public void setAveragingMethod(AveragingMethodEnum value) {
        this.averagingMethod = value;
    }

    /**
     * Gets the value of the conversionFactor property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getConversionFactor() {
        return conversionFactor;
    }

    /**
     * Sets the value of the conversionFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setConversionFactor(BigDecimal value) {
        this.conversionFactor = value;
    }

    /**
     * Gets the value of the rounding property.
     * 
     * @return
     *     possible object is
     *     {@link Rounding }
     *     
     */
    public Rounding getRounding() {
        return rounding;
    }

    /**
     * Sets the value of the rounding property.
     * 
     * @param value
     *     allowed object is
     *     {@link Rounding }
     *     
     */
    public void setRounding(Rounding value) {
        this.rounding = value;
    }

    /**
     * Gets the value of the spread property.
     * 
     * @return
     *     possible object is
     *     {@link CommoditySpread }
     *     
     */
    public CommoditySpread getSpread() {
        return spread;
    }

    /**
     * Sets the value of the spread property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommoditySpread }
     *     
     */
    public void setSpread(CommoditySpread value) {
        this.spread = value;
    }

    /**
     * Gets the value of the spreadSchedule property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the spreadSchedule property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpreadSchedule().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommoditySpreadSchedule }
     * 
     * 
     */
    public List<CommoditySpreadSchedule> getSpreadSchedule() {
        if (spreadSchedule == null) {
            spreadSchedule = new ArrayList<CommoditySpreadSchedule>();
        }
        return this.spreadSchedule;
    }

    /**
     * Gets the value of the spreadPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSpreadPercentage() {
        return spreadPercentage;
    }

    /**
     * Sets the value of the spreadPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSpreadPercentage(BigDecimal value) {
        this.spreadPercentage = value;
    }

    /**
     * Gets the value of the fx property.
     * 
     * @return
     *     possible object is
     *     {@link CommodityFx }
     *     
     */
    public CommodityFx getFx() {
        return fx;
    }

    /**
     * Sets the value of the fx property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommodityFx }
     *     
     */
    public void setFx(CommodityFx value) {
        this.fx = value;
    }

}
