//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0-b170531.0717 
//         See <a href="https://jaxb.java.net/">https://jaxb.java.net/</a> 
//         Any modifications to this file will be lost upon recompilation of the source schema. 
//         Generated on: 2018.02.10 at 05:14:53 PM CET 
//


package org.fpml.fpml_5.master;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * A type describing the method for accruing interests on dividends. Can be either a fixed rate reference or a floating rate reference.
 * 
 * <p>Java class for InterestAccrualsMethod complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InterestAccrualsMethod"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="floatingRateCalculation" type="{http://www.fpml.org/FpML-5/master}FloatingRateCalculation"/&gt;
 *         &lt;element name="fixedRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InterestAccrualsMethod", propOrder = {
    "floatingRateCalculation",
    "fixedRate"
})
@XmlSeeAlso({
    InterestAccrualsCompoundingMethod.class
})
public class InterestAccrualsMethod {

    protected FloatingRateCalculation floatingRateCalculation;
    protected BigDecimal fixedRate;

    /**
     * Gets the value of the floatingRateCalculation property.
     * 
     * @return
     *     possible object is
     *     {@link FloatingRateCalculation }
     *     
     */
    public FloatingRateCalculation getFloatingRateCalculation() {
        return floatingRateCalculation;
    }

    /**
     * Sets the value of the floatingRateCalculation property.
     * 
     * @param value
     *     allowed object is
     *     {@link FloatingRateCalculation }
     *     
     */
    public void setFloatingRateCalculation(FloatingRateCalculation value) {
        this.floatingRateCalculation = value;
    }

    /**
     * Gets the value of the fixedRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFixedRate() {
        return fixedRate;
    }

    /**
     * Sets the value of the fixedRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFixedRate(BigDecimal value) {
        this.fixedRate = value;
    }

}