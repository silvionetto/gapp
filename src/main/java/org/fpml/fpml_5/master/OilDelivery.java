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
 * The physical delivery conditions for an oil product.
 * 
 * <p>Java class for OilDelivery complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OilDelivery"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="pipeline" type="{http://www.fpml.org/FpML-5/master}OilPipelineDelivery"/&gt;
 *           &lt;element name="transfer" type="{http://www.fpml.org/FpML-5/master}OilTransferDelivery"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="importerOfRecord" type="{http://www.fpml.org/FpML-5/master}PartyReference" minOccurs="0"/&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="absoluteTolerance" type="{http://www.fpml.org/FpML-5/master}AbsoluteTolerance"/&gt;
 *           &lt;element name="percentageTolerance" type="{http://www.fpml.org/FpML-5/master}PercentageTolerance"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OilDelivery", propOrder = {
    "pipeline",
    "transfer",
    "importerOfRecord",
    "absoluteTolerance",
    "percentageTolerance"
})
public class OilDelivery {

    protected OilPipelineDelivery pipeline;
    protected OilTransferDelivery transfer;
    protected PartyReference importerOfRecord;
    protected AbsoluteTolerance absoluteTolerance;
    protected PercentageTolerance percentageTolerance;

    /**
     * Gets the value of the pipeline property.
     * 
     * @return
     *     possible object is
     *     {@link OilPipelineDelivery }
     *     
     */
    public OilPipelineDelivery getPipeline() {
        return pipeline;
    }

    /**
     * Sets the value of the pipeline property.
     * 
     * @param value
     *     allowed object is
     *     {@link OilPipelineDelivery }
     *     
     */
    public void setPipeline(OilPipelineDelivery value) {
        this.pipeline = value;
    }

    /**
     * Gets the value of the transfer property.
     * 
     * @return
     *     possible object is
     *     {@link OilTransferDelivery }
     *     
     */
    public OilTransferDelivery getTransfer() {
        return transfer;
    }

    /**
     * Sets the value of the transfer property.
     * 
     * @param value
     *     allowed object is
     *     {@link OilTransferDelivery }
     *     
     */
    public void setTransfer(OilTransferDelivery value) {
        this.transfer = value;
    }

    /**
     * Gets the value of the importerOfRecord property.
     * 
     * @return
     *     possible object is
     *     {@link PartyReference }
     *     
     */
    public PartyReference getImporterOfRecord() {
        return importerOfRecord;
    }

    /**
     * Sets the value of the importerOfRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyReference }
     *     
     */
    public void setImporterOfRecord(PartyReference value) {
        this.importerOfRecord = value;
    }

    /**
     * Gets the value of the absoluteTolerance property.
     * 
     * @return
     *     possible object is
     *     {@link AbsoluteTolerance }
     *     
     */
    public AbsoluteTolerance getAbsoluteTolerance() {
        return absoluteTolerance;
    }

    /**
     * Sets the value of the absoluteTolerance property.
     * 
     * @param value
     *     allowed object is
     *     {@link AbsoluteTolerance }
     *     
     */
    public void setAbsoluteTolerance(AbsoluteTolerance value) {
        this.absoluteTolerance = value;
    }

    /**
     * Gets the value of the percentageTolerance property.
     * 
     * @return
     *     possible object is
     *     {@link PercentageTolerance }
     *     
     */
    public PercentageTolerance getPercentageTolerance() {
        return percentageTolerance;
    }

    /**
     * Sets the value of the percentageTolerance property.
     * 
     * @param value
     *     allowed object is
     *     {@link PercentageTolerance }
     *     
     */
    public void setPercentageTolerance(PercentageTolerance value) {
        this.percentageTolerance = value;
    }

}
