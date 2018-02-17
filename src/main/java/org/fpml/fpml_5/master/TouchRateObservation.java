//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0-b170531.0717 
//         See <a href="https://jaxb.java.net/">https://jaxb.java.net/</a> 
//         Any modifications to this file will be lost upon recompilation of the source schema. 
//         Generated on: 2018.02.10 at 05:14:53 PM CET 
//


package org.fpml.fpml_5.master;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TouchRateObservation complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TouchRateObservation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.fpml.org/FpML-5/master}TriggerRateObservation"&gt;
 *       &lt;choice&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="exerciseSide" type="{http://www.fpml.org/FpML-5/master}ExerciseSideEnum" minOccurs="0"/&gt;
 *           &lt;choice&gt;
 *             &lt;element name="settlementType" type="{http://www.fpml.org/FpML-5/master}SettlementTypeEnum"/&gt;
 *             &lt;element name="cashSettlement" type="{http://www.fpml.org/FpML-5/master}SimplePayment"/&gt;
 *             &lt;element name="physicalSettlement" type="{http://www.fpml.org/FpML-5/master}PhysicalSettlement"/&gt;
 *           &lt;/choice&gt;
 *           &lt;element name="payment" type="{http://www.fpml.org/FpML-5/master}NonNegativePayment" minOccurs="0"/&gt;
 *           &lt;element name="clearingInstructions" type="{http://www.fpml.org/FpML-5/master}ClearingInstructions" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;element name="isExercisable" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TouchRateObservation", propOrder = {
    "exerciseSide",
    "settlementType",
    "cashSettlement",
    "physicalSettlement",
    "payment",
    "clearingInstructions",
    "isExercisable"
})
public class TouchRateObservation
    extends TriggerRateObservation
{

    protected String exerciseSide;
    @XmlSchemaType(name = "token")
    protected SettlementTypeEnum settlementType;
    protected SimplePayment cashSettlement;
    protected PhysicalSettlement physicalSettlement;
    protected NonNegativePayment payment;
    protected ClearingInstructions clearingInstructions;
    protected Boolean isExercisable;

    /**
     * Gets the value of the exerciseSide property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExerciseSide() {
        return exerciseSide;
    }

    /**
     * Sets the value of the exerciseSide property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExerciseSide(String value) {
        this.exerciseSide = value;
    }

    /**
     * Gets the value of the settlementType property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementTypeEnum }
     *     
     */
    public SettlementTypeEnum getSettlementType() {
        return settlementType;
    }

    /**
     * Sets the value of the settlementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementTypeEnum }
     *     
     */
    public void setSettlementType(SettlementTypeEnum value) {
        this.settlementType = value;
    }

    /**
     * Gets the value of the cashSettlement property.
     * 
     * @return
     *     possible object is
     *     {@link SimplePayment }
     *     
     */
    public SimplePayment getCashSettlement() {
        return cashSettlement;
    }

    /**
     * Sets the value of the cashSettlement property.
     * 
     * @param value
     *     allowed object is
     *     {@link SimplePayment }
     *     
     */
    public void setCashSettlement(SimplePayment value) {
        this.cashSettlement = value;
    }

    /**
     * Gets the value of the physicalSettlement property.
     * 
     * @return
     *     possible object is
     *     {@link PhysicalSettlement }
     *     
     */
    public PhysicalSettlement getPhysicalSettlement() {
        return physicalSettlement;
    }

    /**
     * Sets the value of the physicalSettlement property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhysicalSettlement }
     *     
     */
    public void setPhysicalSettlement(PhysicalSettlement value) {
        this.physicalSettlement = value;
    }

    /**
     * Gets the value of the payment property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativePayment }
     *     
     */
    public NonNegativePayment getPayment() {
        return payment;
    }

    /**
     * Sets the value of the payment property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativePayment }
     *     
     */
    public void setPayment(NonNegativePayment value) {
        this.payment = value;
    }

    /**
     * Gets the value of the clearingInstructions property.
     * 
     * @return
     *     possible object is
     *     {@link ClearingInstructions }
     *     
     */
    public ClearingInstructions getClearingInstructions() {
        return clearingInstructions;
    }

    /**
     * Sets the value of the clearingInstructions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClearingInstructions }
     *     
     */
    public void setClearingInstructions(ClearingInstructions value) {
        this.clearingInstructions = value;
    }

    /**
     * Gets the value of the isExercisable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsExercisable() {
        return isExercisable;
    }

    /**
     * Sets the value of the isExercisable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsExercisable(Boolean value) {
        this.isExercisable = value;
    }

}
