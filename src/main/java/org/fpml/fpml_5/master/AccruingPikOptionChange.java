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
 * An event representing a change in a PIK accrual option. In real terms - an example of this would be a margin rate change.
 * 
 * <p>Java class for AccruingPikOptionChange complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccruingPikOptionChange"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.fpml.org/FpML-5/master}FacilityEvent"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="accruingPikOption" type="{http://www.fpml.org/FpML-5/master}AccruingPikOption" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccruingPikOptionChange", propOrder = {
    "accruingPikOption"
})
public class AccruingPikOptionChange
    extends FacilityEvent
{

    protected AccruingPikOption accruingPikOption;

    /**
     * Gets the value of the accruingPikOption property.
     * 
     * @return
     *     possible object is
     *     {@link AccruingPikOption }
     *     
     */
    public AccruingPikOption getAccruingPikOption() {
        return accruingPikOption;
    }

    /**
     * Sets the value of the accruingPikOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccruingPikOption }
     *     
     */
    public void setAccruingPikOption(AccruingPikOption value) {
        this.accruingPikOption = value;
    }

}
