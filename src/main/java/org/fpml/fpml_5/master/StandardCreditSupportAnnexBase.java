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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * The base SCSA implementation.
 * 
 * <p>Java class for StandardCreditSupportAnnexBase complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StandardCreditSupportAnnexBase"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.fpml.org/FpML-5/master}ContractualDocument"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="independentAmounts" type="{http://www.fpml.org/FpML-5/master}IndependentAmounts" maxOccurs="2" minOccurs="0"/&gt;
 *         &lt;element name="baseCurrency" type="{http://www.fpml.org/FpML-5/master}Currency" minOccurs="0"/&gt;
 *         &lt;element name="existingCreditSupportAnnex" type="{http://www.fpml.org/FpML-5/master}ExistingCreditSupportAnnex" minOccurs="0"/&gt;
 *         &lt;element name="settlementDay" type="{http://www.fpml.org/FpML-5/master}SettlementDay" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StandardCreditSupportAnnexBase", propOrder = {
    "independentAmounts",
    "baseCurrency",
    "existingCreditSupportAnnex",
    "settlementDay"
})
@XmlSeeAlso({
    StandardCreditSupportAnnex2013EnglishLaw.class,
    StandardCreditSupportAnnex2014EnglishLaw.class,
    StandardCreditSupportAnnex2013NewYorkLaw.class,
    StandardCreditSupportAnnex2014NewYorkLaw.class
})
public abstract class StandardCreditSupportAnnexBase
    extends ContractualDocument
{

    protected List<IndependentAmounts> independentAmounts;
    protected Currency baseCurrency;
    protected ExistingCreditSupportAnnex existingCreditSupportAnnex;
    protected SettlementDay settlementDay;

    /**
     * Gets the value of the independentAmounts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the independentAmounts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIndependentAmounts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IndependentAmounts }
     * 
     * 
     */
    public List<IndependentAmounts> getIndependentAmounts() {
        if (independentAmounts == null) {
            independentAmounts = new ArrayList<IndependentAmounts>();
        }
        return this.independentAmounts;
    }

    /**
     * Gets the value of the baseCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getBaseCurrency() {
        return baseCurrency;
    }

    /**
     * Sets the value of the baseCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setBaseCurrency(Currency value) {
        this.baseCurrency = value;
    }

    /**
     * Gets the value of the existingCreditSupportAnnex property.
     * 
     * @return
     *     possible object is
     *     {@link ExistingCreditSupportAnnex }
     *     
     */
    public ExistingCreditSupportAnnex getExistingCreditSupportAnnex() {
        return existingCreditSupportAnnex;
    }

    /**
     * Sets the value of the existingCreditSupportAnnex property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExistingCreditSupportAnnex }
     *     
     */
    public void setExistingCreditSupportAnnex(ExistingCreditSupportAnnex value) {
        this.existingCreditSupportAnnex = value;
    }

    /**
     * Gets the value of the settlementDay property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementDay }
     *     
     */
    public SettlementDay getSettlementDay() {
        return settlementDay;
    }

    /**
     * Sets the value of the settlementDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementDay }
     *     
     */
    public void setSettlementDay(SettlementDay value) {
        this.settlementDay = value;
    }

}
