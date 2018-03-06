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
import java.util.ArrayList;
import java.util.List;


/**
 * Observation point for trigger.
 * 
 * <p>Java class for TriggerEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TriggerEvent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="schedule" type="{http://www.fpml.org/FpML-5/master}AveragingSchedule" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="triggerDates" type="{http://www.fpml.org/FpML-5/master}DateList" minOccurs="0"/&gt;
 *         &lt;element name="trigger" type="{http://www.fpml.org/FpML-5/master}Trigger" minOccurs="0"/&gt;
 *         &lt;element name="featurePayment" type="{http://www.fpml.org/FpML-5/master}FeaturePayment" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TriggerEvent", propOrder = {
    "schedule",
    "triggerDates",
    "trigger",
    "featurePayment"
})
public class TriggerEvent {

    protected List<AveragingSchedule> schedule;
    protected DateList triggerDates;
    protected Trigger trigger;
    protected FeaturePayment featurePayment;

    /**
     * Gets the value of the schedule property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the schedule property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSchedule().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AveragingSchedule }
     * 
     * 
     */
    public List<AveragingSchedule> getSchedule() {
        if (schedule == null) {
            schedule = new ArrayList<AveragingSchedule>();
        }
        return this.schedule;
    }

    /**
     * Gets the value of the triggerDates property.
     * 
     * @return
     *     possible object is
     *     {@link DateList }
     *     
     */
    public DateList getTriggerDates() {
        return triggerDates;
    }

    /**
     * Sets the value of the triggerDates property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateList }
     *     
     */
    public void setTriggerDates(DateList value) {
        this.triggerDates = value;
    }

    /**
     * Gets the value of the trigger property.
     * 
     * @return
     *     possible object is
     *     {@link Trigger }
     *     
     */
    public Trigger getTrigger() {
        return trigger;
    }

    /**
     * Sets the value of the trigger property.
     * 
     * @param value
     *     allowed object is
     *     {@link Trigger }
     *     
     */
    public void setTrigger(Trigger value) {
        this.trigger = value;
    }

    /**
     * Gets the value of the featurePayment property.
     * 
     * @return
     *     possible object is
     *     {@link FeaturePayment }
     *     
     */
    public FeaturePayment getFeaturePayment() {
        return featurePayment;
    }

    /**
     * Sets the value of the featurePayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeaturePayment }
     *     
     */
    public void setFeaturePayment(FeaturePayment value) {
        this.featurePayment = value;
    }

}
