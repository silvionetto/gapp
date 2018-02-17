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
 * An event representing a change in a fixed rate accrual option. In real terms - an example of this would be a margin rate change.
 * 
 * <p>Java class for FixedRateOptionChange complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FixedRateOptionChange"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.fpml.org/FpML-5/master}FacilityEvent"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="fixedRateOption" type="{http://www.fpml.org/FpML-5/master}FixedRateOption" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FixedRateOptionChange", propOrder = {
    "fixedRateOption"
})
public class FixedRateOptionChange
    extends FacilityEvent
{

    protected FixedRateOption fixedRateOption;

    /**
     * Gets the value of the fixedRateOption property.
     * 
     * @return
     *     possible object is
     *     {@link FixedRateOption }
     *     
     */
    public FixedRateOption getFixedRateOption() {
        return fixedRateOption;
    }

    /**
     * Sets the value of the fixedRateOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link FixedRateOption }
     *     
     */
    public void setFixedRateOption(FixedRateOption value) {
        this.fixedRateOption = value;
    }

}
