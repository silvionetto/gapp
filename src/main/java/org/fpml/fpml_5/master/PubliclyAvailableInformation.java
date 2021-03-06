//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0-b170531.0717 
//         See <a href="https://jaxb.java.net/">https://jaxb.java.net/</a> 
//         Any modifications to this file will be lost upon recompilation of the source schema. 
//         Generated on: 2018.02.10 at 05:14:53 PM CET 
//


package org.fpml.fpml_5.master;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PubliclyAvailableInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PubliclyAvailableInformation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="standardPublicSources" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="publicSource" type="{http://www.fpml.org/FpML-5/master}String" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="specifiedNumber" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PubliclyAvailableInformation", propOrder = {
    "standardPublicSources",
    "publicSource",
    "specifiedNumber"
})
public class PubliclyAvailableInformation {

    protected Boolean standardPublicSources;
    protected List<String> publicSource;
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger specifiedNumber;

    /**
     * Gets the value of the standardPublicSources property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStandardPublicSources() {
        return standardPublicSources;
    }

    /**
     * Sets the value of the standardPublicSources property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStandardPublicSources(Boolean value) {
        this.standardPublicSources = value;
    }

    /**
     * Gets the value of the publicSource property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the publicSource property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPublicSource().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPublicSource() {
        if (publicSource == null) {
            publicSource = new ArrayList<String>();
        }
        return this.publicSource;
    }

    /**
     * Gets the value of the specifiedNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSpecifiedNumber() {
        return specifiedNumber;
    }

    /**
     * Sets the value of the specifiedNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSpecifiedNumber(BigInteger value) {
        this.specifiedNumber = value;
    }

}
