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
import java.util.ArrayList;
import java.util.List;


/**
 * Period over which an average value is taken.
 * 
 * <p>Java class for AveragingPeriod complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AveragingPeriod"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="schedule" type="{http://www.fpml.org/FpML-5/master}AveragingSchedule" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="averagingDateTimes" type="{http://www.fpml.org/FpML-5/master}DateTimeList"/&gt;
 *           &lt;element name="averagingObservations" type="{http://www.fpml.org/FpML-5/master}AveragingObservationList"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="marketDisruption" type="{http://www.fpml.org/FpML-5/master}MarketDisruption" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AveragingPeriod", propOrder = {
    "schedule",
    "averagingDateTimes",
    "averagingObservations",
    "marketDisruption"
})
public class AveragingPeriod {

    protected List<AveragingSchedule> schedule;
    protected DateTimeList averagingDateTimes;
    protected AveragingObservationList averagingObservations;
    protected MarketDisruption marketDisruption;

    /**
     * Gets the value of the schedule property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the schedule property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSchedule().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AveragingSchedule }
     * 
     * 
     */
    public List<AveragingSchedule> getSchedule() {
        if (schedule == null) {
            schedule = new ArrayList<AveragingSchedule>();
        }
        return this.schedule;
    }

    /**
     * Gets the value of the averagingDateTimes property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeList }
     *     
     */
    public DateTimeList getAveragingDateTimes() {
        return averagingDateTimes;
    }

    /**
     * Sets the value of the averagingDateTimes property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeList }
     *     
     */
    public void setAveragingDateTimes(DateTimeList value) {
        this.averagingDateTimes = value;
    }

    /**
     * Gets the value of the averagingObservations property.
     * 
     * @return
     *     possible object is
     *     {@link AveragingObservationList }
     *     
     */
    public AveragingObservationList getAveragingObservations() {
        return averagingObservations;
    }

    /**
     * Sets the value of the averagingObservations property.
     * 
     * @param value
     *     allowed object is
     *     {@link AveragingObservationList }
     *     
     */
    public void setAveragingObservations(AveragingObservationList value) {
        this.averagingObservations = value;
    }

    /**
     * Gets the value of the marketDisruption property.
     * 
     * @return
     *     possible object is
     *     {@link MarketDisruption }
     *     
     */
    public MarketDisruption getMarketDisruption() {
        return marketDisruption;
    }

    /**
     * Sets the value of the marketDisruption property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketDisruption }
     *     
     */
    public void setMarketDisruption(MarketDisruption value) {
        this.marketDisruption = value;
    }

}
