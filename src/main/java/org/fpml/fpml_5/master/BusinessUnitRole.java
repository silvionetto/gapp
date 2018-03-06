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
 * A type describing a role played by a unit in one or more transactions. Examples include roles such as Trader, Collateral, Confirmation, Settlement, etc. This can be extended to provide custom roles.
 * 
 * <p>Java class for BusinessUnitRole complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BusinessUnitRole"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.fpml.org/FpML-5/master&gt;Scheme"&gt;
 *       &lt;attribute name="unitRoleScheme" type="{http://www.fpml.org/FpML-5/master}NonEmptyURI" default="http://www.fpml.org/coding-scheme/unit-role" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusinessUnitRole", propOrder = {
    "value"
})
public class BusinessUnitRole {

    @XmlValue
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String value;
    @XmlAttribute(name = "unitRoleScheme")
    protected String unitRoleScheme;

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
     * Gets the value of the unitRoleScheme property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitRoleScheme() {
        if (unitRoleScheme == null) {
            return "http://www.fpml.org/coding-scheme/unit-role";
        } else {
            return unitRoleScheme;
        }
    }

    /**
     * Sets the value of the unitRoleScheme property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitRoleScheme(String value) {
        this.unitRoleScheme = value;
    }

}
