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
 * An event representing a change of maturity date on a one or more outstanding loan contracts.
 * 
 * <p>Java class for LoanContractMaturityChange complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoanContractMaturityChange"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.fpml.org/FpML-5/master}LoanContractEvent"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="currentMaturityDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="priorMaturityDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoanContractMaturityChange", propOrder = {
    "currentMaturityDate",
    "priorMaturityDate"
})
public class LoanContractMaturityChange
    extends LoanContractEvent
{

    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar currentMaturityDate;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar priorMaturityDate;

    /**
     * Gets the value of the currentMaturityDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCurrentMaturityDate() {
        return currentMaturityDate;
    }

    /**
     * Sets the value of the currentMaturityDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCurrentMaturityDate(XMLGregorianCalendar value) {
        this.currentMaturityDate = value;
    }

    /**
     * Gets the value of the priorMaturityDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPriorMaturityDate() {
        return priorMaturityDate;
    }

    /**
     * Sets the value of the priorMaturityDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPriorMaturityDate(XMLGregorianCalendar value) {
        this.priorMaturityDate = value;
    }

}