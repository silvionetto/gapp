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
 * A type defining the Bermuda option exercise dates and the expiration date together with any rules govenerning the notional amount of the underlying which can be exercised on any given exercise date and any associated exercise fee.
 * 
 * <p>Java class for BermudaExercise complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BermudaExercise"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.fpml.org/FpML-5/master}Exercise"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="bermudaExerciseDates" type="{http://www.fpml.org/FpML-5/master}AdjustableOrRelativeDates" minOccurs="0"/&gt;
 *         &lt;element name="relevantUnderlyingDate" type="{http://www.fpml.org/FpML-5/master}AdjustableOrRelativeDates" minOccurs="0"/&gt;
 *         &lt;element name="earliestExerciseTime" type="{http://www.fpml.org/FpML-5/master}BusinessCenterTime" minOccurs="0"/&gt;
 *         &lt;element name="latestExerciseTime" type="{http://www.fpml.org/FpML-5/master}BusinessCenterTime" minOccurs="0"/&gt;
 *         &lt;element name="expirationTime" type="{http://www.fpml.org/FpML-5/master}BusinessCenterTime" minOccurs="0"/&gt;
 *         &lt;element name="multipleExercise" type="{http://www.fpml.org/FpML-5/master}MultipleExercise" minOccurs="0"/&gt;
 *         &lt;element name="exerciseFeeSchedule" type="{http://www.fpml.org/FpML-5/master}ExerciseFeeSchedule" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BermudaExercise", propOrder = {
    "bermudaExerciseDates",
    "relevantUnderlyingDate",
    "earliestExerciseTime",
    "latestExerciseTime",
    "expirationTime",
    "multipleExercise",
    "exerciseFeeSchedule"
})
public class BermudaExercise
    extends Exercise
{

    protected AdjustableOrRelativeDates bermudaExerciseDates;
    protected AdjustableOrRelativeDates relevantUnderlyingDate;
    protected BusinessCenterTime earliestExerciseTime;
    protected BusinessCenterTime latestExerciseTime;
    protected BusinessCenterTime expirationTime;
    protected MultipleExercise multipleExercise;
    protected ExerciseFeeSchedule exerciseFeeSchedule;

    /**
     * Gets the value of the bermudaExerciseDates property.
     * 
     * @return
     *     possible object is
     *     {@link AdjustableOrRelativeDates }
     *     
     */
    public AdjustableOrRelativeDates getBermudaExerciseDates() {
        return bermudaExerciseDates;
    }

    /**
     * Sets the value of the bermudaExerciseDates property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdjustableOrRelativeDates }
     *     
     */
    public void setBermudaExerciseDates(AdjustableOrRelativeDates value) {
        this.bermudaExerciseDates = value;
    }

    /**
     * Gets the value of the relevantUnderlyingDate property.
     * 
     * @return
     *     possible object is
     *     {@link AdjustableOrRelativeDates }
     *     
     */
    public AdjustableOrRelativeDates getRelevantUnderlyingDate() {
        return relevantUnderlyingDate;
    }

    /**
     * Sets the value of the relevantUnderlyingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdjustableOrRelativeDates }
     *     
     */
    public void setRelevantUnderlyingDate(AdjustableOrRelativeDates value) {
        this.relevantUnderlyingDate = value;
    }

    /**
     * Gets the value of the earliestExerciseTime property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessCenterTime }
     *     
     */
    public BusinessCenterTime getEarliestExerciseTime() {
        return earliestExerciseTime;
    }

    /**
     * Sets the value of the earliestExerciseTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessCenterTime }
     *     
     */
    public void setEarliestExerciseTime(BusinessCenterTime value) {
        this.earliestExerciseTime = value;
    }

    /**
     * Gets the value of the latestExerciseTime property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessCenterTime }
     *     
     */
    public BusinessCenterTime getLatestExerciseTime() {
        return latestExerciseTime;
    }

    /**
     * Sets the value of the latestExerciseTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessCenterTime }
     *     
     */
    public void setLatestExerciseTime(BusinessCenterTime value) {
        this.latestExerciseTime = value;
    }

    /**
     * Gets the value of the expirationTime property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessCenterTime }
     *     
     */
    public BusinessCenterTime getExpirationTime() {
        return expirationTime;
    }

    /**
     * Sets the value of the expirationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessCenterTime }
     *     
     */
    public void setExpirationTime(BusinessCenterTime value) {
        this.expirationTime = value;
    }

    /**
     * Gets the value of the multipleExercise property.
     * 
     * @return
     *     possible object is
     *     {@link MultipleExercise }
     *     
     */
    public MultipleExercise getMultipleExercise() {
        return multipleExercise;
    }

    /**
     * Sets the value of the multipleExercise property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultipleExercise }
     *     
     */
    public void setMultipleExercise(MultipleExercise value) {
        this.multipleExercise = value;
    }

    /**
     * Gets the value of the exerciseFeeSchedule property.
     * 
     * @return
     *     possible object is
     *     {@link ExerciseFeeSchedule }
     *     
     */
    public ExerciseFeeSchedule getExerciseFeeSchedule() {
        return exerciseFeeSchedule;
    }

    /**
     * Sets the value of the exerciseFeeSchedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExerciseFeeSchedule }
     *     
     */
    public void setExerciseFeeSchedule(ExerciseFeeSchedule value) {
        this.exerciseFeeSchedule = value;
    }

}