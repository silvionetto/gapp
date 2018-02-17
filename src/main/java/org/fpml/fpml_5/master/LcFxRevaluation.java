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
 * An event representing a change in either the [L/C -> Facility] or [Accrual -> L/C] FX rates (or both) on an outstanding letter of credit.
 * 
 * <p>Java class for LcFxRevaluation complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LcFxRevaluation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.fpml.org/FpML-5/master}LcEvent"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="lcFxRate" type="{http://www.fpml.org/FpML-5/master}FxTerms" minOccurs="0"/&gt;
 *         &lt;element name="facilityFxRate" type="{http://www.fpml.org/FpML-5/master}FxTerms" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LcFxRevaluation", propOrder = {
    "lcFxRate",
    "facilityFxRate"
})
public class LcFxRevaluation
    extends LcEvent
{

    protected FxTerms lcFxRate;
    protected FxTerms facilityFxRate;

    /**
     * Gets the value of the lcFxRate property.
     * 
     * @return
     *     possible object is
     *     {@link FxTerms }
     *     
     */
    public FxTerms getLcFxRate() {
        return lcFxRate;
    }

    /**
     * Sets the value of the lcFxRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link FxTerms }
     *     
     */
    public void setLcFxRate(FxTerms value) {
        this.lcFxRate = value;
    }

    /**
     * Gets the value of the facilityFxRate property.
     * 
     * @return
     *     possible object is
     *     {@link FxTerms }
     *     
     */
    public FxTerms getFacilityFxRate() {
        return facilityFxRate;
    }

    /**
     * Sets the value of the facilityFxRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link FxTerms }
     *     
     */
    public void setFacilityFxRate(FxTerms value) {
        this.facilityFxRate = value;
    }

}
