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
 * Coding scheme that specifies the settlement price default election.
 * 
 * <p>Java class for SettlementPriceDefaultElection complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SettlementPriceDefaultElection"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.fpml.org/FpML-5/master&gt;Scheme"&gt;
 *       &lt;attribute name="settlementPriceDefaultElectionScheme" type="{http://www.fpml.org/FpML-5/master}NonEmptyURI" default="http://www.fpml.org/coding-scheme/settlement-price-default-election" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementPriceDefaultElection", propOrder = {
    "value"
})
public class SettlementPriceDefaultElection {

    @XmlValue
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String value;
    @XmlAttribute(name = "settlementPriceDefaultElectionScheme")
    protected String settlementPriceDefaultElectionScheme;

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
     * Gets the value of the settlementPriceDefaultElectionScheme property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSettlementPriceDefaultElectionScheme() {
        if (settlementPriceDefaultElectionScheme == null) {
            return "http://www.fpml.org/coding-scheme/settlement-price-default-election";
        } else {
            return settlementPriceDefaultElectionScheme;
        }
    }

    /**
     * Sets the value of the settlementPriceDefaultElectionScheme property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSettlementPriceDefaultElectionScheme(String value) {
        this.settlementPriceDefaultElectionScheme = value;
    }

}
