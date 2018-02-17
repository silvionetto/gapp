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
 * Describes a rate source to be fixed and the date the fixing occurs
 * 
 * <p>Java class for FxRateSourceFixing complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FxRateSourceFixing"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="settlementRateSource" type="{http://www.fpml.org/FpML-5/master}FxSettlementRateSource" minOccurs="0"/&gt;
 *         &lt;element name="fixingDate" type="{http://www.fpml.org/FpML-5/master}AdjustableDate" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FxRateSourceFixing", propOrder = {
    "settlementRateSource",
    "fixingDate"
})
public class FxRateSourceFixing {

    protected FxSettlementRateSource settlementRateSource;
    protected AdjustableDate fixingDate;

    /**
     * Gets the value of the settlementRateSource property.
     * 
     * @return
     *     possible object is
     *     {@link FxSettlementRateSource }
     *     
     */
    public FxSettlementRateSource getSettlementRateSource() {
        return settlementRateSource;
    }

    /**
     * Sets the value of the settlementRateSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link FxSettlementRateSource }
     *     
     */
    public void setSettlementRateSource(FxSettlementRateSource value) {
        this.settlementRateSource = value;
    }

    /**
     * Gets the value of the fixingDate property.
     * 
     * @return
     *     possible object is
     *     {@link AdjustableDate }
     *     
     */
    public AdjustableDate getFixingDate() {
        return fixingDate;
    }

    /**
     * Sets the value of the fixingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdjustableDate }
     *     
     */
    public void setFixingDate(AdjustableDate value) {
        this.fixingDate = value;
    }

}
