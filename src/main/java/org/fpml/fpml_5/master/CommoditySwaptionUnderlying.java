//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0-b170531.0717 
//         See <a href="https://jaxb.java.net/">https://jaxb.java.net/</a> 
//         Any modifications to this file will be lost upon recompilation of the source schema. 
//         Generated on: 2018.02.10 at 05:14:53 PM CET 
//


package org.fpml.fpml_5.master;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for CommoditySwaptionUnderlying complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommoditySwaptionUnderlying"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.fpml.org/FpML-5/master}CommoditySwapDetails.model"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommoditySwaptionUnderlying", propOrder = {
    "effectiveDate",
    "terminationDate",
    "settlementCurrency",
    "commoditySwapLeg",
    "weatherLeg",
    "commonPricing",
    "marketDisruption",
    "settlementDisruption",
    "rounding"
})
public class CommoditySwaptionUnderlying {

    protected AdjustableOrRelativeDate effectiveDate;
    protected AdjustableOrRelativeDate terminationDate;
    protected IdentifiedCurrency settlementCurrency;
    @XmlElementRef(name = "commoditySwapLeg", namespace = "http://www.fpml.org/FpML-5/master", type = JAXBElement.class, required = false)
    protected List<JAXBElement<? extends CommoditySwapLeg>> commoditySwapLeg;
    protected List<WeatherLeg> weatherLeg;
    protected Boolean commonPricing;
    protected CommodityMarketDisruption marketDisruption;
    @XmlSchemaType(name = "token")
    protected CommodityBullionSettlementDisruptionEnum settlementDisruption;
    protected Rounding rounding;

    /**
     * Gets the value of the effectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link AdjustableOrRelativeDate }
     *     
     */
    public AdjustableOrRelativeDate getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * Sets the value of the effectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdjustableOrRelativeDate }
     *     
     */
    public void setEffectiveDate(AdjustableOrRelativeDate value) {
        this.effectiveDate = value;
    }

    /**
     * Gets the value of the terminationDate property.
     * 
     * @return
     *     possible object is
     *     {@link AdjustableOrRelativeDate }
     *     
     */
    public AdjustableOrRelativeDate getTerminationDate() {
        return terminationDate;
    }

    /**
     * Sets the value of the terminationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdjustableOrRelativeDate }
     *     
     */
    public void setTerminationDate(AdjustableOrRelativeDate value) {
        this.terminationDate = value;
    }

    /**
     * Gets the value of the settlementCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifiedCurrency }
     *     
     */
    public IdentifiedCurrency getSettlementCurrency() {
        return settlementCurrency;
    }

    /**
     * Sets the value of the settlementCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifiedCurrency }
     *     
     */
    public void setSettlementCurrency(IdentifiedCurrency value) {
        this.settlementCurrency = value;
    }

    /**
     * Gets the value of the commoditySwapLeg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the commoditySwapLeg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommoditySwapLeg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link FixedPriceLeg }{@code >}
     * {@link JAXBElement }{@code <}{@link OilPhysicalLeg }{@code >}
     * {@link JAXBElement }{@code <}{@link GasPhysicalLeg }{@code >}
     * {@link JAXBElement }{@code <}{@link ElectricityPhysicalLeg }{@code >}
     * {@link JAXBElement }{@code <}{@link EnvironmentalPhysicalLeg }{@code >}
     * {@link JAXBElement }{@code <}{@link CoalPhysicalLeg }{@code >}
     * {@link JAXBElement }{@code <}{@link FloatingPriceLeg }{@code >}
     * {@link JAXBElement }{@code <}{@link CommoditySwapLeg }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends CommoditySwapLeg>> getCommoditySwapLeg() {
        if (commoditySwapLeg == null) {
            commoditySwapLeg = new ArrayList<JAXBElement<? extends CommoditySwapLeg>>();
        }
        return this.commoditySwapLeg;
    }

    /**
     * Gets the value of the weatherLeg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the weatherLeg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWeatherLeg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WeatherLeg }
     * 
     * 
     */
    public List<WeatherLeg> getWeatherLeg() {
        if (weatherLeg == null) {
            weatherLeg = new ArrayList<WeatherLeg>();
        }
        return this.weatherLeg;
    }

    /**
     * Gets the value of the commonPricing property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCommonPricing() {
        return commonPricing;
    }

    /**
     * Sets the value of the commonPricing property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCommonPricing(Boolean value) {
        this.commonPricing = value;
    }

    /**
     * Gets the value of the marketDisruption property.
     * 
     * @return
     *     possible object is
     *     {@link CommodityMarketDisruption }
     *     
     */
    public CommodityMarketDisruption getMarketDisruption() {
        return marketDisruption;
    }

    /**
     * Sets the value of the marketDisruption property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommodityMarketDisruption }
     *     
     */
    public void setMarketDisruption(CommodityMarketDisruption value) {
        this.marketDisruption = value;
    }

    /**
     * Gets the value of the settlementDisruption property.
     * 
     * @return
     *     possible object is
     *     {@link CommodityBullionSettlementDisruptionEnum }
     *     
     */
    public CommodityBullionSettlementDisruptionEnum getSettlementDisruption() {
        return settlementDisruption;
    }

    /**
     * Sets the value of the settlementDisruption property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommodityBullionSettlementDisruptionEnum }
     *     
     */
    public void setSettlementDisruption(CommodityBullionSettlementDisruptionEnum value) {
        this.settlementDisruption = value;
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

}
