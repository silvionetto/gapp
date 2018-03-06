//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0-b170531.0717 
//         See <a href="https://jaxb.java.net/">https://jaxb.java.net/</a> 
//         Any modifications to this file will be lost upon recompilation of the source schema. 
//         Generated on: 2018.02.10 at 05:14:53 PM CET 
//


package org.fpml.fpml_5.master;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * A subset of the ISDA Floating Rate Option scheme, i.e. the floating rate index. These indexes are the ones used by the syndicated loan market.
 * 
 * <p>Java class for FloatingRateIndexLoan complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FloatingRateIndexLoan"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.fpml.org/FpML-5/master&gt;Scheme"&gt;
 *       &lt;attribute name="floatingRateIndexScheme" type="{http://www.fpml.org/FpML-5/master}NonEmptyURI" default="http://www.fpml.org/coding-scheme/loan-floating-rate-index" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FloatingRateIndexLoan", propOrder = {
    "value"
})
public class FloatingRateIndexLoan {

    @XmlValue
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String value;
    @XmlAttribute(name = "floatingRateIndexScheme")
    protected String floatingRateIndexScheme;

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
     * Gets the value of the floatingRateIndexScheme property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFloatingRateIndexScheme() {
        if (floatingRateIndexScheme == null) {
            return "http://www.fpml.org/coding-scheme/loan-floating-rate-index";
        } else {
            return floatingRateIndexScheme;
        }
    }

    /**
     * Sets the value of the floatingRateIndexScheme property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFloatingRateIndexScheme(String value) {
        this.floatingRateIndexScheme = value;
    }

}
