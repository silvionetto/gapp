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
 * A type defining manual exercise, i.e. that the option buyer counterparty must give notice to the option seller of exercise.
 * 
 * <p>Java class for ManualExercise complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ManualExercise"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="exerciseNotice" type="{http://www.fpml.org/FpML-5/master}ExerciseNotice" minOccurs="0"/&gt;
 *         &lt;element name="fallbackExercise" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ManualExercise", propOrder = {
    "exerciseNotice",
    "fallbackExercise"
})
public class ManualExercise {

    protected ExerciseNotice exerciseNotice;
    protected Boolean fallbackExercise;

    /**
     * Gets the value of the exerciseNotice property.
     * 
     * @return
     *     possible object is
     *     {@link ExerciseNotice }
     *     
     */
    public ExerciseNotice getExerciseNotice() {
        return exerciseNotice;
    }

    /**
     * Sets the value of the exerciseNotice property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExerciseNotice }
     *     
     */
    public void setExerciseNotice(ExerciseNotice value) {
        this.exerciseNotice = value;
    }

    /**
     * Gets the value of the fallbackExercise property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFallbackExercise() {
        return fallbackExercise;
    }

    /**
     * Sets the value of the fallbackExercise property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFallbackExercise(Boolean value) {
        this.fallbackExercise = value;
    }

}