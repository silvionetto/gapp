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
 * <p>Java class for FxSettlementRateSource complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FxSettlementRateSource"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="settlementRateOption" type="{http://www.fpml.org/FpML-5/master}SettlementRateOption"/&gt;
 *         &lt;element name="nonstandardSettlementRate" type="{http://www.fpml.org/FpML-5/master}FxInformationSource"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FxSettlementRateSource", propOrder = {
    "settlementRateOption",
    "nonstandardSettlementRate"
})
public class FxSettlementRateSource {

    protected SettlementRateOption settlementRateOption;
    protected FxInformationSource nonstandardSettlementRate;

    /**
     * Gets the value of the settlementRateOption property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementRateOption }
     *     
     */
    public SettlementRateOption getSettlementRateOption() {
        return settlementRateOption;
    }

    /**
     * Sets the value of the settlementRateOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementRateOption }
     *     
     */
    public void setSettlementRateOption(SettlementRateOption value) {
        this.settlementRateOption = value;
    }

    /**
     * Gets the value of the nonstandardSettlementRate property.
     * 
     * @return
     *     possible object is
     *     {@link FxInformationSource }
     *     
     */
    public FxInformationSource getNonstandardSettlementRate() {
        return nonstandardSettlementRate;
    }

    /**
     * Sets the value of the nonstandardSettlementRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link FxInformationSource }
     *     
     */
    public void setNonstandardSettlementRate(FxInformationSource value) {
        this.nonstandardSettlementRate = value;
    }

}
