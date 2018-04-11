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
 * A loan servicing notification used to communicate a change in an accruing fee option. These options define the rates/calculations associated with facility-level accruing fees.
 * 
 * <p>Java class for AccruingFeeChangeNotification complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccruingFeeChangeNotification"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.fpml.org/FpML-5/master}AbstractFacilityNotification"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fpml.org/FpML-5/master}accruingFeeChangeGroup" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.fpml.org/FpML-5/master}FacilityDetails.model"/&gt;
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
@XmlType(name = "AccruingFeeChangeNotification", propOrder = {
    "accruingFeeChangeGroup",
    "facilityIdentifier",
    "facilitySummary",
    "party"
})
public class AccruingFeeChangeNotification
    extends AbstractFacilityNotification
{

    @XmlElementRef(name = "accruingFeeChangeGroup", namespace = "http://www.fpml.org/FpML-5/master", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends FacilityEvent> accruingFeeChangeGroup;
    protected FacilityIdentifier facilityIdentifier;
    protected FacilitySummary facilitySummary;
    protected List<Party> party;

    /**
     * Gets the value of the accruingFeeChangeGroup property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AccruingFeeExpiry }{@code >}
     *     {@link JAXBElement }{@code <}{@link AccruingFeeChange }{@code >}
     *     {@link JAXBElement }{@code <}{@link FacilityEvent }{@code >}
     *     
     */
    public JAXBElement<? extends FacilityEvent> getAccruingFeeChangeGroup() {
        return accruingFeeChangeGroup;
    }

    /**
     * Sets the value of the accruingFeeChangeGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AccruingFeeExpiry }{@code >}
     *     {@link JAXBElement }{@code <}{@link AccruingFeeChange }{@code >}
     *     {@link JAXBElement }{@code <}{@link FacilityEvent }{@code >}
     *     
     */
    public void setAccruingFeeChangeGroup(JAXBElement<? extends FacilityEvent> value) {
        this.accruingFeeChangeGroup = value;
    }

    /**
     * Gets the value of the facilityIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link FacilityIdentifier }
     *     
     */
    public FacilityIdentifier getFacilityIdentifier() {
        return facilityIdentifier;
    }

    /**
     * Sets the value of the facilityIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link FacilityIdentifier }
     *     
     */
    public void setFacilityIdentifier(FacilityIdentifier value) {
        this.facilityIdentifier = value;
    }

    /**
     * Gets the value of the facilitySummary property.
     * 
     * @return
     *     possible object is
     *     {@link FacilitySummary }
     *     
     */
    public FacilitySummary getFacilitySummary() {
        return facilitySummary;
    }

    /**
     * Sets the value of the facilitySummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link FacilitySummary }
     *     
     */
    public void setFacilitySummary(FacilitySummary value) {
        this.facilitySummary = value;
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