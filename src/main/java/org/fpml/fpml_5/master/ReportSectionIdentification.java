//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0-b170531.0717 
//         See <a href="https://jaxb.java.net/">https://jaxb.java.net/</a> 
//         Any modifications to this file will be lost upon recompilation of the source schema. 
//         Generated on: 2018.02.10 at 05:14:53 PM CET 
//


package org.fpml.fpml_5.master;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * A type that allows the specific report and section to be identified.
 * 
 * <p>Java class for ReportSectionIdentification complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReportSectionIdentification"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="reportId" type="{http://www.fpml.org/FpML-5/master}ReportId" minOccurs="0"/&gt;
 *         &lt;element name="sectionNumber" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportSectionIdentification", propOrder = {
    "reportId",
    "sectionNumber"
})
@XmlSeeAlso({
    ReportIdentification.class
})
public class ReportSectionIdentification {

    protected ReportId reportId;
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger sectionNumber;

    /**
     * Gets the value of the reportId property.
     * 
     * @return
     *     possible object is
     *     {@link ReportId }
     *     
     */
    public ReportId getReportId() {
        return reportId;
    }

    /**
     * Sets the value of the reportId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportId }
     *     
     */
    public void setReportId(ReportId value) {
        this.reportId = value;
    }

    /**
     * Gets the value of the sectionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSectionNumber() {
        return sectionNumber;
    }

    /**
     * Sets the value of the sectionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSectionNumber(BigInteger value) {
        this.sectionNumber = value;
    }

}
