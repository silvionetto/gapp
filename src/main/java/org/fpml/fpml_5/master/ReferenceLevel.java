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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReferenceLevel complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReferenceLevel"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="referenceLevelUnit" type="{http://www.fpml.org/FpML-5/master}ReferenceLevelUnit" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReferenceLevel", propOrder = {
    "amount",
    "referenceLevelUnit"
})
public class ReferenceLevel {

    protected BigDecimal amount;
    protected ReferenceLevelUnit referenceLevelUnit;

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmount(BigDecimal value) {
        this.amount = value;
    }

    /**
     * Gets the value of the referenceLevelUnit property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceLevelUnit }
     *     
     */
    public ReferenceLevelUnit getReferenceLevelUnit() {
        return referenceLevelUnit;
    }

    /**
     * Sets the value of the referenceLevelUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceLevelUnit }
     *     
     */
    public void setReferenceLevelUnit(ReferenceLevelUnit value) {
        this.referenceLevelUnit = value;
    }

}
