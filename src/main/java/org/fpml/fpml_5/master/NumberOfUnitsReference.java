//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0-b170531.0717 
//         See <a href="https://jaxb.java.net/">https://jaxb.java.net/</a> 
//         Any modifications to this file will be lost upon recompilation of the source schema. 
//         Generated on: 2018.02.10 at 05:14:53 PM CET 
//


package org.fpml.fpml_5.master;

import javax.xml.bind.annotation.*;


/**
 * A reference to the number of units.
 * 
 * <p>Java class for NumberOfUnitsReference complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NumberOfUnitsReference"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.fpml.org/FpML-5/master}Reference"&gt;
 *       &lt;attribute name="href" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NumberOfUnitsReference")
public class NumberOfUnitsReference
    extends Reference
{

    @XmlAttribute(name = "href", required = true)
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object href;

    /**
     * Gets the value of the href property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getHref() {
        return href;
    }

    /**
     * Sets the value of the href property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setHref(Object value) {
        this.href = value;
    }

}
