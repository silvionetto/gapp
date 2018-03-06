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
 * A type defining the floating rate and definitions relating to the calculation of floating rate amounts.
 * 
 * <p>Java class for FloatingRateCalculation complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FloatingRateCalculation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.fpml.org/FpML-5/master}FloatingRate"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="initialRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="finalRateRounding" type="{http://www.fpml.org/FpML-5/master}Rounding" minOccurs="0"/&gt;
 *         &lt;element name="averagingMethod" type="{http://www.fpml.org/FpML-5/master}AveragingMethodEnum" minOccurs="0"/&gt;
 *         &lt;element name="negativeInterestRateTreatment" type="{http://www.fpml.org/FpML-5/master}NegativeInterestRateTreatmentEnum" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FloatingRateCalculation", propOrder = {
    "initialRate",
    "finalRateRounding",
    "averagingMethod",
    "negativeInterestRateTreatment"
})
public class FloatingRateCalculation
    extends FloatingRate
{

    protected BigDecimal initialRate;
    protected Rounding finalRateRounding;
    @XmlSchemaType(name = "token")
    protected AveragingMethodEnum averagingMethod;
    @XmlSchemaType(name = "token")
    protected NegativeInterestRateTreatmentEnum negativeInterestRateTreatment;

    /**
     * Gets the value of the initialRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInitialRate() {
        return initialRate;
    }

    /**
     * Sets the value of the initialRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInitialRate(BigDecimal value) {
        this.initialRate = value;
    }

    /**
     * Gets the value of the finalRateRounding property.
     * 
     * @return
     *     possible object is
     *     {@link Rounding }
     *     
     */
    public Rounding getFinalRateRounding() {
        return finalRateRounding;
    }

    /**
     * Sets the value of the finalRateRounding property.
     * 
     * @param value
     *     allowed object is
     *     {@link Rounding }
     *     
     */
    public void setFinalRateRounding(Rounding value) {
        this.finalRateRounding = value;
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
     * Gets the value of the negativeInterestRateTreatment property.
     * 
     * @return
     *     possible object is
     *     {@link NegativeInterestRateTreatmentEnum }
     *     
     */
    public NegativeInterestRateTreatmentEnum getNegativeInterestRateTreatment() {
        return negativeInterestRateTreatment;
    }

    /**
     * Sets the value of the negativeInterestRateTreatment property.
     * 
     * @param value
     *     allowed object is
     *     {@link NegativeInterestRateTreatmentEnum }
     *     
     */
    public void setNegativeInterestRateTreatment(NegativeInterestRateTreatmentEnum value) {
        this.negativeInterestRateTreatment = value;
    }

}
