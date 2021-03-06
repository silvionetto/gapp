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
 * A type defining to whom and where notice of execution should be given. The partyReference refers to one of the principal parties of the trade. If present the exerciseNoticePartyReference refers to a party, other than the principal party, to whome notice should be given.
 * 
 * <p>Java class for ExerciseNotice complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExerciseNotice"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="partyReference" type="{http://www.fpml.org/FpML-5/master}PartyReference" minOccurs="0"/&gt;
 *         &lt;element name="exerciseNoticePartyReference" type="{http://www.fpml.org/FpML-5/master}PartyReference" minOccurs="0"/&gt;
 *         &lt;element name="businessCenter" type="{http://www.fpml.org/FpML-5/master}BusinessCenter" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExerciseNotice", propOrder = {
    "partyReference",
    "exerciseNoticePartyReference",
    "businessCenter"
})
public class ExerciseNotice {

    protected PartyReference partyReference;
    protected PartyReference exerciseNoticePartyReference;
    protected BusinessCenter businessCenter;

    /**
     * Gets the value of the partyReference property.
     * 
     * @return
     *     possible object is
     *     {@link PartyReference }
     *     
     */
    public PartyReference getPartyReference() {
        return partyReference;
    }

    /**
     * Sets the value of the partyReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyReference }
     *     
     */
    public void setPartyReference(PartyReference value) {
        this.partyReference = value;
    }

    /**
     * Gets the value of the exerciseNoticePartyReference property.
     * 
     * @return
     *     possible object is
     *     {@link PartyReference }
     *     
     */
    public PartyReference getExerciseNoticePartyReference() {
        return exerciseNoticePartyReference;
    }

    /**
     * Sets the value of the exerciseNoticePartyReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyReference }
     *     
     */
    public void setExerciseNoticePartyReference(PartyReference value) {
        this.exerciseNoticePartyReference = value;
    }

    /**
     * Gets the value of the businessCenter property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessCenter }
     *     
     */
    public BusinessCenter getBusinessCenter() {
        return businessCenter;
    }

    /**
     * Sets the value of the businessCenter property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessCenter }
     *     
     */
    public void setBusinessCenter(BusinessCenter value) {
        this.businessCenter = value;
    }

}
