//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0-b170531.0717 
//         See <a href="https://jaxb.java.net/">https://jaxb.java.net/</a> 
//         Any modifications to this file will be lost upon recompilation of the source schema. 
//         Generated on: 2018.02.10 at 05:14:53 PM CET 
//


package org.fpml.fpml_5.master;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * A loan servicing retraction used to cancel a previous change in facility-level rates.
 * 
 * <p>Java class for FacilityRateChangeNotificationRetracted complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FacilityRateChangeNotificationRetracted"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.fpml.org/FpML-5/master}NonCorrectableRequestMessage"&gt;
 *       &lt;choice minOccurs="0"&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="eventIdentifier" type="{http://www.fpml.org/FpML-5/master}BusinessEventIdentifier"/&gt;
 *           &lt;element name="party" type="{http://www.fpml.org/FpML-5/master}Party" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;element ref="{http://www.fpml.org/FpML-5/master}facilityRateChangeGroup" minOccurs="0"/&gt;
 *           &lt;group ref="{http://www.fpml.org/FpML-5/master}FacilityDetails.model"/&gt;
 *           &lt;group ref="{http://www.fpml.org/FpML-5/master}LoanContractDetails.model" maxOccurs="unbounded" minOccurs="0"/&gt;
 *           &lt;element name="party" type="{http://www.fpml.org/FpML-5/master}Party" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/choice&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FacilityRateChangeNotificationRetracted", propOrder = {
    "rest"
})
public class FacilityRateChangeNotificationRetracted
    extends NonCorrectableRequestMessage
{

    @XmlElementRefs({
        @XmlElementRef(name = "eventIdentifier", namespace = "http://www.fpml.org/FpML-5/master", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "party", namespace = "http://www.fpml.org/FpML-5/master", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "facilityRateChangeGroup", namespace = "http://www.fpml.org/FpML-5/master", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "facilityIdentifier", namespace = "http://www.fpml.org/FpML-5/master", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "facilitySummary", namespace = "http://www.fpml.org/FpML-5/master", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "contractIdentifier", namespace = "http://www.fpml.org/FpML-5/master", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "contractSummary", namespace = "http://www.fpml.org/FpML-5/master", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "contract", namespace = "http://www.fpml.org/FpML-5/master", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> rest;

    /**
     * Gets the rest of the content model. 
     *         
     *         <p>
     *         You are getting this "catch-all" property because of the following reason: 
     *         The field name "Party" is used by two different parts of a schema. See: 
     *         line 1650 of file:/Users/silvionetto/IdeaProjects/gapp/src/main/resources/schema/fpml-loan.xsd
     *         line 1629 of file:/Users/silvionetto/IdeaProjects/gapp/src/main/resources/schema/fpml-loan.xsd
     *         <p>
     *         To get rid of this property, apply a property customization to one 
     *         of both of the following declarations to change their names: 
     * Gets the value of the rest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link BusinessEventIdentifier }{@code >}
     * {@link JAXBElement }{@code <}{@link Party }{@code >}
     * {@link JAXBElement }{@code <}{@link PenaltyRateExpiry }{@code >}
     * {@link JAXBElement }{@code <}{@link DefaultRateExpiry }{@code >}
     * {@link JAXBElement }{@code <}{@link PenaltyRateChange }{@code >}
     * {@link JAXBElement }{@code <}{@link MandatoryCostRateExpiry }{@code >}
     * {@link JAXBElement }{@code <}{@link MandatoryCostRateChange }{@code >}
     * {@link JAXBElement }{@code <}{@link DefaultRateChange }{@code >}
     * {@link JAXBElement }{@code <}{@link FacilityContractEvent }{@code >}
     * {@link JAXBElement }{@code <}{@link FacilityIdentifier }{@code >}
     * {@link JAXBElement }{@code <}{@link FacilitySummary }{@code >}
     * {@link JAXBElement }{@code <}{@link FacilityContractIdentifier }{@code >}
     * {@link JAXBElement }{@code <}{@link LoanContractSummary }{@code >}
     * {@link JAXBElement }{@code <}{@link LoanContract }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getRest() {
        if (rest == null) {
            rest = new ArrayList<JAXBElement<?>>();
        }
        return this.rest;
    }

}
