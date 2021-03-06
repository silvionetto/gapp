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


/**
 * A type defining the way in which interests are accrued: the applicable rate (fixed or floating reference) and the compounding method.
 * 
 * <p>Java class for InterestAccrualsCompoundingMethod complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InterestAccrualsCompoundingMethod"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.fpml.org/FpML-5/master}InterestAccrualsMethod"&gt;
 *       &lt;sequence minOccurs="0"&gt;
 *         &lt;element name="compoundingMethod" type="{http://www.fpml.org/FpML-5/master}CompoundingMethodEnum" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InterestAccrualsCompoundingMethod", propOrder = {
    "compoundingMethod"
})
public class InterestAccrualsCompoundingMethod
    extends InterestAccrualsMethod
{

    @XmlSchemaType(name = "token")
    protected CompoundingMethodEnum compoundingMethod;

    /**
     * Gets the value of the compoundingMethod property.
     * 
     * @return
     *     possible object is
     *     {@link CompoundingMethodEnum }
     *     
     */
    public CompoundingMethodEnum getCompoundingMethod() {
        return compoundingMethod;
    }

    /**
     * Sets the value of the compoundingMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompoundingMethodEnum }
     *     
     */
    public void setCompoundingMethod(CompoundingMethodEnum value) {
        this.compoundingMethod = value;
    }

}
