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
import javax.xml.bind.annotation.XmlType;


/**
 * Represents the rules for payment of assignment fees to the agent.
 * 
 * <p>Java class for AssignmentFee complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AssignmentFee"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="amount" type="{http://www.fpml.org/FpML-5/master}NonNegativeMoney" minOccurs="0"/&gt;
 *         &lt;element name="rule" type="{http://www.fpml.org/FpML-5/master}AssignmentFeeRule" minOccurs="0"/&gt;
 *         &lt;element name="lenderTypeWaived" type="{http://www.fpml.org/FpML-5/master}LenderClassification" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssignmentFee", propOrder = {
    "amount",
    "rule",
    "lenderTypeWaived"
})
public class AssignmentFee {

    protected NonNegativeMoney amount;
    protected AssignmentFeeRule rule;
    protected List<LenderClassification> lenderTypeWaived;

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeMoney }
     *     
     */
    public NonNegativeMoney getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeMoney }
     *     
     */
    public void setAmount(NonNegativeMoney value) {
        this.amount = value;
    }

    /**
     * Gets the value of the rule property.
     * 
     * @return
     *     possible object is
     *     {@link AssignmentFeeRule }
     *     
     */
    public AssignmentFeeRule getRule() {
        return rule;
    }

    /**
     * Sets the value of the rule property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssignmentFeeRule }
     *     
     */
    public void setRule(AssignmentFeeRule value) {
        this.rule = value;
    }

    /**
     * Gets the value of the lenderTypeWaived property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lenderTypeWaived property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLenderTypeWaived().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LenderClassification }
     * 
     * 
     */
    public List<LenderClassification> getLenderTypeWaived() {
        if (lenderTypeWaived == null) {
            lenderTypeWaived = new ArrayList<LenderClassification>();
        }
        return this.lenderTypeWaived;
    }

}
