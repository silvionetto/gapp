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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * The type that indicates the length of the resource.
 * 
 * <p>Java class for ResourceLength complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResourceLength"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="lengthUnit" type="{http://www.fpml.org/FpML-5/master}LengthUnitEnum" minOccurs="0"/&gt;
 *         &lt;element name="lengthValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResourceLength", propOrder = {
    "lengthUnit",
    "lengthValue"
})
public class ResourceLength {

    @XmlSchemaType(name = "token")
    protected LengthUnitEnum lengthUnit;
    protected BigDecimal lengthValue;

    /**
     * Gets the value of the lengthUnit property.
     * 
     * @return
     *     possible object is
     *     {@link LengthUnitEnum }
     *     
     */
    public LengthUnitEnum getLengthUnit() {
        return lengthUnit;
    }

    /**
     * Sets the value of the lengthUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthUnitEnum }
     *     
     */
    public void setLengthUnit(LengthUnitEnum value) {
        this.lengthUnit = value;
    }

    /**
     * Gets the value of the lengthValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLengthValue() {
        return lengthValue;
    }

    /**
     * Sets the value of the lengthValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLengthValue(BigDecimal value) {
        this.lengthValue = value;
    }

}
