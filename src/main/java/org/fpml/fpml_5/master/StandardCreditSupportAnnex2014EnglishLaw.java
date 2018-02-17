//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0-b170531.0717 
//         See <a href="https://jaxb.java.net/">https://jaxb.java.net/</a> 
//         Any modifications to this file will be lost upon recompilation of the source schema. 
//         Generated on: 2018.02.10 at 05:14:53 PM CET 
//


package org.fpml.fpml_5.master;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * The English Law 2014 SCSA implementation, which extends StandardCreditSupportAnnexBase.
 * 
 * <p>Java class for StandardCreditSupportAnnex2014EnglishLaw complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StandardCreditSupportAnnex2014EnglishLaw"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.fpml.org/FpML-5/master}StandardCreditSupportAnnexBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="demandsAndNotices" type="{http://www.fpml.org/FpML-5/master}PartyContactInformation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="independentAmountEligibleCreditSupport" type="{http://www.fpml.org/FpML-5/master}IndependentAmountEligibleCollateral" maxOccurs="2" minOccurs="0"/&gt;
 *         &lt;element name="valuationDateCity" type="{http://www.fpml.org/FpML-5/master}BusinessCenters" minOccurs="0"/&gt;
 *         &lt;element name="notificationTimeCity" type="{http://www.fpml.org/FpML-5/master}BusinessCenter" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StandardCreditSupportAnnex2014EnglishLaw", propOrder = {
    "demandsAndNotices",
    "independentAmountEligibleCreditSupport",
    "valuationDateCity",
    "notificationTimeCity"
})
public class StandardCreditSupportAnnex2014EnglishLaw
    extends StandardCreditSupportAnnexBase
{

    protected List<PartyContactInformation> demandsAndNotices;
    protected List<IndependentAmountEligibleCollateral> independentAmountEligibleCreditSupport;
    protected BusinessCenters valuationDateCity;
    protected BusinessCenter notificationTimeCity;

    /**
     * Gets the value of the demandsAndNotices property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the demandsAndNotices property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDemandsAndNotices().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyContactInformation }
     * 
     * 
     */
    public List<PartyContactInformation> getDemandsAndNotices() {
        if (demandsAndNotices == null) {
            demandsAndNotices = new ArrayList<PartyContactInformation>();
        }
        return this.demandsAndNotices;
    }

    /**
     * Gets the value of the independentAmountEligibleCreditSupport property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the independentAmountEligibleCreditSupport property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIndependentAmountEligibleCreditSupport().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IndependentAmountEligibleCollateral }
     * 
     * 
     */
    public List<IndependentAmountEligibleCollateral> getIndependentAmountEligibleCreditSupport() {
        if (independentAmountEligibleCreditSupport == null) {
            independentAmountEligibleCreditSupport = new ArrayList<IndependentAmountEligibleCollateral>();
        }
        return this.independentAmountEligibleCreditSupport;
    }

    /**
     * Gets the value of the valuationDateCity property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessCenters }
     *     
     */
    public BusinessCenters getValuationDateCity() {
        return valuationDateCity;
    }

    /**
     * Sets the value of the valuationDateCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessCenters }
     *     
     */
    public void setValuationDateCity(BusinessCenters value) {
        this.valuationDateCity = value;
    }

    /**
     * Gets the value of the notificationTimeCity property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessCenter }
     *     
     */
    public BusinessCenter getNotificationTimeCity() {
        return notificationTimeCity;
    }

    /**
     * Sets the value of the notificationTimeCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessCenter }
     *     
     */
    public void setNotificationTimeCity(BusinessCenter value) {
        this.notificationTimeCity = value;
    }

}
