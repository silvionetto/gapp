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
 * Abstract base class for all underlying assets.
 * 
 * <p>Java class for UnderlyingAsset complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UnderlyingAsset"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.fpml.org/FpML-5/master}IdentifiedAsset"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="currency" type="{http://www.fpml.org/FpML-5/master}IdentifiedCurrency" minOccurs="0"/&gt;
 *         &lt;element name="exchangeId" type="{http://www.fpml.org/FpML-5/master}ExchangeId" minOccurs="0"/&gt;
 *         &lt;element name="clearanceSystem" type="{http://www.fpml.org/FpML-5/master}ClearanceSystem" minOccurs="0"/&gt;
 *         &lt;element name="definition" type="{http://www.fpml.org/FpML-5/master}ProductReference" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnderlyingAsset", propOrder = {
    "currency",
    "exchangeId",
    "clearanceSystem",
    "definition"
})
@XmlSeeAlso({
    Bond.class,
    Deposit.class,
    FxRateAsset.class,
    Loan.class,
    Mortgage.class,
    MutualFund.class,
    RateIndex.class,
    SimpleCreditDefaultSwap.class,
    SimpleFra.class,
    SimpleIRSwap.class,
    ExchangeTraded.class
})
public abstract class UnderlyingAsset
    extends IdentifiedAsset
{

    protected IdentifiedCurrency currency;
    protected ExchangeId exchangeId;
    protected ClearanceSystem clearanceSystem;
    protected ProductReference definition;

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifiedCurrency }
     *     
     */
    public IdentifiedCurrency getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifiedCurrency }
     *     
     */
    public void setCurrency(IdentifiedCurrency value) {
        this.currency = value;
    }

    /**
     * Gets the value of the exchangeId property.
     * 
     * @return
     *     possible object is
     *     {@link ExchangeId }
     *     
     */
    public ExchangeId getExchangeId() {
        return exchangeId;
    }

    /**
     * Sets the value of the exchangeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExchangeId }
     *     
     */
    public void setExchangeId(ExchangeId value) {
        this.exchangeId = value;
    }

    /**
     * Gets the value of the clearanceSystem property.
     * 
     * @return
     *     possible object is
     *     {@link ClearanceSystem }
     *     
     */
    public ClearanceSystem getClearanceSystem() {
        return clearanceSystem;
    }

    /**
     * Sets the value of the clearanceSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClearanceSystem }
     *     
     */
    public void setClearanceSystem(ClearanceSystem value) {
        this.clearanceSystem = value;
    }

    /**
     * Gets the value of the definition property.
     * 
     * @return
     *     possible object is
     *     {@link ProductReference }
     *     
     */
    public ProductReference getDefinition() {
        return definition;
    }

    /**
     * Sets the value of the definition property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductReference }
     *     
     */
    public void setDefinition(ProductReference value) {
        this.definition = value;
    }

}
