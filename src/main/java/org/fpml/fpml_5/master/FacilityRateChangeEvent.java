//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0-b170531.0717 
//         See <a href="https://jaxb.java.net/">https://jaxb.java.net/</a> 
//         Any modifications to this file will be lost upon recompilation of the source schema. 
//         Generated on: 2018.02.10 at 05:14:53 PM CET 
//


package org.fpml.fpml_5.master;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * An event describing changes in a facility-level rate.
 * 
 * <p>Java class for FacilityRateChangeEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FacilityRateChangeEvent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.fpml.org/FpML-5/master}FacilityContractEvent"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="rate" type="{http://www.fpml.org/FpML-5/master}PeriodRate" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FacilityRateChangeEvent", propOrder = {
    "rate"
})
@XmlSeeAlso({
    DefaultRateChange.class,
    MandatoryCostRateChange.class,
    PenaltyRateChange.class
})
public abstract class FacilityRateChangeEvent
    extends FacilityContractEvent
{

    protected PeriodRate rate;

    /**
     * Gets the value of the rate property.
     * 
     * @return
     *     possible object is
     *     {@link PeriodRate }
     *     
     */
    public PeriodRate getRate() {
        return rate;
    }

    /**
     * Sets the value of the rate property.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodRate }
     *     
     */
    public void setRate(PeriodRate value) {
        this.rate = value;
    }

}
