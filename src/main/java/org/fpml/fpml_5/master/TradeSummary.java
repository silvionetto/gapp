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
 * Summary information about the trade.
 * 
 * <p>Java class for TradeSummary complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TradeSummary"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="isPackageTrade" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="isPrimeBrokerTrade" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="reportingLevel" type="{http://www.fpml.org/FpML-5/master}ReportingLevel" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeSummary", propOrder = {
    "isPackageTrade",
    "isPrimeBrokerTrade",
    "reportingLevel"
})
public class TradeSummary {

    protected Boolean isPackageTrade;
    protected Boolean isPrimeBrokerTrade;
    protected ReportingLevel reportingLevel;

    /**
     * Gets the value of the isPackageTrade property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPackageTrade() {
        return isPackageTrade;
    }

    /**
     * Sets the value of the isPackageTrade property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPackageTrade(Boolean value) {
        this.isPackageTrade = value;
    }

    /**
     * Gets the value of the isPrimeBrokerTrade property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPrimeBrokerTrade() {
        return isPrimeBrokerTrade;
    }

    /**
     * Sets the value of the isPrimeBrokerTrade property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPrimeBrokerTrade(Boolean value) {
        this.isPrimeBrokerTrade = value;
    }

    /**
     * Gets the value of the reportingLevel property.
     * 
     * @return
     *     possible object is
     *     {@link ReportingLevel }
     *     
     */
    public ReportingLevel getReportingLevel() {
        return reportingLevel;
    }

    /**
     * Sets the value of the reportingLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportingLevel }
     *     
     */
    public void setReportingLevel(ReportingLevel value) {
        this.reportingLevel = value;
    }

}
