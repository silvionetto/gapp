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
import javax.xml.bind.annotation.XmlType;


/**
 * A single facility definition stated as of a certain date.
 * 
 * <p>Java class for FacilityStatement complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FacilityStatement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.fpml.org/FpML-5/master}SyndicatedLoanStatement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fpml.org/FpML-5/master}facilityGroup" minOccurs="0"/&gt;
 *         &lt;element name="party" type="{http://www.fpml.org/FpML-5/master}Party" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FacilityStatement", propOrder = {
    "facilityGroup",
    "party"
})
public class FacilityStatement
    extends SyndicatedLoanStatement
{

    @XmlElementRef(name = "facilityGroup", namespace = "http://www.fpml.org/FpML-5/master", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends Facility> facilityGroup;
    protected List<Party> party;

    /**
     * Gets the value of the facilityGroup property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Revolver }{@code >}
     *     {@link JAXBElement }{@code <}{@link DelayedDraw }{@code >}
     *     {@link JAXBElement }{@code <}{@link LetterOfCreditFacility }{@code >}
     *     {@link JAXBElement }{@code <}{@link TermLoan }{@code >}
     *     {@link JAXBElement }{@code <}{@link Facility }{@code >}
     *     
     */
    public JAXBElement<? extends Facility> getFacilityGroup() {
        return facilityGroup;
    }

    /**
     * Sets the value of the facilityGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Revolver }{@code >}
     *     {@link JAXBElement }{@code <}{@link DelayedDraw }{@code >}
     *     {@link JAXBElement }{@code <}{@link LetterOfCreditFacility }{@code >}
     *     {@link JAXBElement }{@code <}{@link TermLoan }{@code >}
     *     {@link JAXBElement }{@code <}{@link Facility }{@code >}
     *     
     */
    public void setFacilityGroup(JAXBElement<? extends Facility> value) {
        this.facilityGroup = value;
    }

    /**
     * Gets the value of the party property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the party property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Party }
     * 
     * 
     */
    public List<Party> getParty() {
        if (party == null) {
            party = new ArrayList<Party>();
        }
        return this.party;
    }

}
