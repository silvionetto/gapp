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
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * A type representing criteria for defining a query portfolio. The criteria are made up of a QueryParameterId, QueryParameterValue and QueryParameterOperator.
 * 
 * <p>Java class for QueryParameter complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryParameter"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="queryParameterId" type="{http://www.fpml.org/FpML-5/master}QueryParameterId" minOccurs="0"/&gt;
 *         &lt;element name="queryParameterValue" type="{http://www.fpml.org/FpML-5/master}NormalizedString" minOccurs="0"/&gt;
 *         &lt;element name="queryParameterOperator" type="{http://www.fpml.org/FpML-5/master}QueryParameterOperator" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryParameter", propOrder = {
    "queryParameterId",
    "queryParameterValue",
    "queryParameterOperator"
})
public class QueryParameter {

    protected QueryParameterId queryParameterId;
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String queryParameterValue;
    protected QueryParameterOperator queryParameterOperator;

    /**
     * Gets the value of the queryParameterId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryParameterId }
     *     
     */
    public QueryParameterId getQueryParameterId() {
        return queryParameterId;
    }

    /**
     * Sets the value of the queryParameterId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryParameterId }
     *     
     */
    public void setQueryParameterId(QueryParameterId value) {
        this.queryParameterId = value;
    }

    /**
     * Gets the value of the queryParameterValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueryParameterValue() {
        return queryParameterValue;
    }

    /**
     * Sets the value of the queryParameterValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueryParameterValue(String value) {
        this.queryParameterValue = value;
    }

    /**
     * Gets the value of the queryParameterOperator property.
     * 
     * @return
     *     possible object is
     *     {@link QueryParameterOperator }
     *     
     */
    public QueryParameterOperator getQueryParameterOperator() {
        return queryParameterOperator;
    }

    /**
     * Sets the value of the queryParameterOperator property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryParameterOperator }
     *     
     */
    public void setQueryParameterOperator(QueryParameterOperator value) {
        this.queryParameterOperator = value;
    }

}
