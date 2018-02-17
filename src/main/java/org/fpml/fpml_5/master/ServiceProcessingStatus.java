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
 * A type defining the content model for report on the status of the processing by a service. In the future we may wish to provide some kind of scope or other qualification for the event, e.g. the currencies, products, or books to which it applies.
 * 
 * <p>Java class for ServiceProcessingStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceProcessingStatus"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cycle" type="{http://www.fpml.org/FpML-5/master}ServiceProcessingCycle" minOccurs="0"/&gt;
 *         &lt;element name="step" type="{http://www.fpml.org/FpML-5/master}ServiceProcessingStep" minOccurs="0"/&gt;
 *         &lt;element name="event" type="{http://www.fpml.org/FpML-5/master}ServiceProcessingEvent" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceProcessingStatus", propOrder = {
    "cycle",
    "step",
    "event"
})
public class ServiceProcessingStatus {

    protected ServiceProcessingCycle cycle;
    protected ServiceProcessingStep step;
    protected ServiceProcessingEvent event;

    /**
     * Gets the value of the cycle property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceProcessingCycle }
     *     
     */
    public ServiceProcessingCycle getCycle() {
        return cycle;
    }

    /**
     * Sets the value of the cycle property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceProcessingCycle }
     *     
     */
    public void setCycle(ServiceProcessingCycle value) {
        this.cycle = value;
    }

    /**
     * Gets the value of the step property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceProcessingStep }
     *     
     */
    public ServiceProcessingStep getStep() {
        return step;
    }

    /**
     * Sets the value of the step property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceProcessingStep }
     *     
     */
    public void setStep(ServiceProcessingStep value) {
        this.step = value;
    }

    /**
     * Gets the value of the event property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceProcessingEvent }
     *     
     */
    public ServiceProcessingEvent getEvent() {
        return event;
    }

    /**
     * Sets the value of the event property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceProcessingEvent }
     *     
     */
    public void setEvent(ServiceProcessingEvent value) {
        this.event = value;
    }

}
