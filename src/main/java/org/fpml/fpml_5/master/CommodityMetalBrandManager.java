//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0-b170531.0717 
//         See <a href="https://jaxb.java.net/">https://jaxb.java.net/</a> 
//         Any modifications to this file will be lost upon recompilation of the source schema. 
//         Generated on: 2018.02.10 at 05:14:53 PM CET 
//


package org.fpml.fpml_5.master;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for CommodityMetalBrandManager complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommodityMetalBrandManager"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.fpml.org/FpML-5/master&gt;Scheme"&gt;
 *       &lt;attribute name="commodityMetalBrandManagerScheme" type="{http://www.fpml.org/FpML-5/master}NonEmptyURI" default="http://www.fpml.org/coding-scheme/commodity-metal-brand-manager" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommodityMetalBrandManager", propOrder = {
    "value"
})
public class CommodityMetalBrandManager {

    @XmlValue
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String value;
    @XmlAttribute(name = "commodityMetalBrandManagerScheme")
    protected String commodityMetalBrandManagerScheme;

    /**
     * The base class for all types which define coding schemes that are allowed to be empty.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the commodityMetalBrandManagerScheme property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommodityMetalBrandManagerScheme() {
        if (commodityMetalBrandManagerScheme == null) {
            return "http://www.fpml.org/coding-scheme/commodity-metal-brand-manager";
        } else {
            return commodityMetalBrandManagerScheme;
        }
    }

    /**
     * Sets the value of the commodityMetalBrandManagerScheme property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommodityMetalBrandManagerScheme(String value) {
        this.commodityMetalBrandManagerScheme = value;
    }

}
