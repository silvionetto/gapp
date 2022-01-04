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


/**
 * A type for defining Fx Features.
 * 
 * <p>Java class for FxFeature complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FxFeature"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="referenceCurrency" type="{http://www.fpml.org/FpML-5/master}IdentifiedCurrency" minOccurs="0"/&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="composite" type="{http://www.fpml.org/FpML-5/master}Composite"/&gt;
 *           &lt;element name="quanto" type="{http://www.fpml.org/FpML-5/master}Quanto"/&gt;
 *           &lt;element name="crossCurrency" type="{http://www.fpml.org/FpML-5/master}Composite"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FxFeature", propOrder = {
    "referenceCurrency",
    "composite",
    "quanto",
    "crossCurrency"
})
public class FxFeature {

    protected IdentifiedCurrency referenceCurrency;
    protected Composite composite;
    protected Quanto quanto;
    protected Composite crossCurrency;

    /**
     * Gets the value of the referenceCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifiedCurrency }
     *     
     */
    public IdentifiedCurrency getReferenceCurrency() {
        return referenceCurrency;
    }

    /**
     * Sets the value of the referenceCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifiedCurrency }
     *     
     */
    public void setReferenceCurrency(IdentifiedCurrency value) {
        this.referenceCurrency = value;
    }

    /**
     * Gets the value of the composite property.
     * 
     * @return
     *     possible object is
     *     {@link Composite }
     *     
     */
    public Composite getComposite() {
        return composite;
    }

    /**
     * Sets the value of the composite property.
     * 
     * @param value
     *     allowed object is
     *     {@link Composite }
     *     
     */
    public void setComposite(Composite value) {
        this.composite = value;
    }

    /**
     * Gets the value of the quanto property.
     * 
     * @return
     *     possible object is
     *     {@link Quanto }
     *     
     */
    public Quanto getQuanto() {
        return quanto;
    }

    /**
     * Sets the value of the quanto property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quanto }
     *     
     */
    public void setQuanto(Quanto value) {
        this.quanto = value;
    }

    /**
     * Gets the value of the crossCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link Composite }
     *     
     */
    public Composite getCrossCurrency() {
        return crossCurrency;
    }

    /**
     * Sets the value of the crossCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Composite }
     *     
     */
    public void setCrossCurrency(Composite value) {
        this.crossCurrency = value;
    }

}