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
import java.math.BigDecimal;


/**
 * A structure describing the effect of a change to an index.
 * 
 * <p>Java class for IndexChange complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IndexChange"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.fpml.org/FpML-5/master}ChangeEvent"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="indexFactor" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="factoredCalculationAmount" type="{http://www.fpml.org/FpML-5/master}Money" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndexChange", propOrder = {
    "indexFactor",
    "factoredCalculationAmount"
})
public class IndexChange
    extends ChangeEvent
{

    protected BigDecimal indexFactor;
    protected Money factoredCalculationAmount;

    /**
     * Gets the value of the indexFactor property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIndexFactor() {
        return indexFactor;
    }

    /**
     * Sets the value of the indexFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIndexFactor(BigDecimal value) {
        this.indexFactor = value;
    }

    /**
     * Gets the value of the factoredCalculationAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getFactoredCalculationAmount() {
        return factoredCalculationAmount;
    }

    /**
     * Sets the value of the factoredCalculationAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setFactoredCalculationAmount(Money value) {
        this.factoredCalculationAmount = value;
    }

}
