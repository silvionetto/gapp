//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0-b170531.0717 
//         See <a href="https://jaxb.java.net/">https://jaxb.java.net/</a> 
//         Any modifications to this file will be lost upon recompilation of the source schema. 
//         Generated on: 2018.02.10 at 05:14:53 PM CET 
//


package org.fpml.fpml_5.master;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * A description of the legal agreement(s) and definitions that document a party's relationships with other parties
 * 
 * <p>Java class for PartyRelationshipDocumentation complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartyRelationshipDocumentation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;element name="masterAgreement" type="{http://www.fpml.org/FpML-5/master}MasterAgreement"/&gt;
 *           &lt;element name="creditSupportAgreement" type="{http://www.fpml.org/FpML-5/master}CreditSupportAgreement"/&gt;
 *           &lt;element name="agreement" type="{http://www.fpml.org/FpML-5/master}GenericAgreement"/&gt;
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
@XmlType(name = "PartyRelationshipDocumentation", propOrder = {
    "masterAgreementOrCreditSupportAgreementOrAgreement"
})
public class PartyRelationshipDocumentation {

    @XmlElements({
        @XmlElement(name = "masterAgreement", type = MasterAgreement.class),
        @XmlElement(name = "creditSupportAgreement", type = CreditSupportAgreement.class),
        @XmlElement(name = "agreement", type = GenericAgreement.class)
    })
    protected List<Object> masterAgreementOrCreditSupportAgreementOrAgreement;

    /**
     * Gets the value of the masterAgreementOrCreditSupportAgreementOrAgreement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the masterAgreementOrCreditSupportAgreementOrAgreement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMasterAgreementOrCreditSupportAgreementOrAgreement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MasterAgreement }
     * {@link CreditSupportAgreement }
     * {@link GenericAgreement }
     * 
     * 
     */
    public List<Object> getMasterAgreementOrCreditSupportAgreementOrAgreement() {
        if (masterAgreementOrCreditSupportAgreementOrAgreement == null) {
            masterAgreementOrCreditSupportAgreementOrAgreement = new ArrayList<Object>();
        }
        return this.masterAgreementOrCreditSupportAgreementOrAgreement;
    }

}
