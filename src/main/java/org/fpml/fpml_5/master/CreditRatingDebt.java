//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0-b170531.0717 
//         See <a href="https://jaxb.java.net/">https://jaxb.java.net/</a> 
//         Any modifications to this file will be lost upon recompilation of the source schema. 
//         Generated on: 2018.02.10 at 05:14:53 PM CET 
//


package org.fpml.fpml_5.master;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * The credit rating debt type(s) associated with the credit rating notation and scale. When several debt types are specified, 'any' or 'all' may be applicable.
 * 
 * <p>Java class for CreditRatingDebt complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditRatingDebt"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="debtType" type="{http://www.fpml.org/FpML-5/master}DebtType"/&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="condition" type="{http://www.fpml.org/FpML-5/master}QuantifierEnum"/&gt;
 *           &lt;element name="debtType" type="{http://www.fpml.org/FpML-5/master}DebtType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditRatingDebt", propOrder = {
    "content"
})
public class CreditRatingDebt {

    @XmlElementRefs({
        @XmlElementRef(name = "debtType", namespace = "http://www.fpml.org/FpML-5/master", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "condition", namespace = "http://www.fpml.org/FpML-5/master", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> content;

    /**
     * Gets the rest of the content model. 
     *         
     *         <p>
     *         You are getting this "catch-all" property because of the following reason: 
     *         The field name "DebtType" is used by two different parts of a schema. See: 
     *         line 133 of file:/Users/silvionetto/IdeaProjects/gapp/src/main/resources/schema/fpml-legal.xsd
     *         line 122 of file:/Users/silvionetto/IdeaProjects/gapp/src/main/resources/schema/fpml-legal.xsd
     *         <p>
     *         To get rid of this property, apply a property customization to one 
     *         of both of the following declarations to change their names: 
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link DebtType }{@code >}
     * {@link JAXBElement }{@code <}{@link QuantifierEnum }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getContent() {
        if (content == null) {
            content = new ArrayList<JAXBElement<?>>();
        }
        return this.content;
    }

}