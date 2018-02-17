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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * A facility which can be drawn at any point during a pre-defined period after the initial deal closing date,
 * 
 * <p>Java class for DelayedDraw complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DelayedDraw"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.fpml.org/FpML-5/master}Facility"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="delayedDraw" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="mustDrawByDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DelayedDraw", propOrder = {
    "delayedDraw",
    "mustDrawByDate"
})
public class DelayedDraw
    extends Facility
{

    protected Boolean delayedDraw;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar mustDrawByDate;

    /**
     * Gets the value of the delayedDraw property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDelayedDraw() {
        return delayedDraw;
    }

    /**
     * Sets the value of the delayedDraw property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDelayedDraw(Boolean value) {
        this.delayedDraw = value;
    }

    /**
     * Gets the value of the mustDrawByDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMustDrawByDate() {
        return mustDrawByDate;
    }

    /**
     * Sets the value of the mustDrawByDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMustDrawByDate(XMLGregorianCalendar value) {
        this.mustDrawByDate = value;
    }

}
