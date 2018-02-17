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
 * A type defining one or more trade identifiers allocated to the trade by a party. A link identifier allows the trade to be associated with other related trades, e.g. trades forming part of a larger structured transaction. It is expected that for external communication of trade there will be only one tradeId sent in the document per party.
 * 
 * <p>Java class for PartyTradeIdentifier complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartyTradeIdentifier"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.fpml.org/FpML-5/master}TradeIdentifier"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="linkId" type="{http://www.fpml.org/FpML-5/master}LinkId" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="allocationTradeId" type="{http://www.fpml.org/FpML-5/master}TradeIdentifier" maxOccurs="unbounded" minOccurs="0"/&gt;
 *           &lt;element name="resultingTradeId" type="{http://www.fpml.org/FpML-5/master}TradeIdentifierExtended" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="blockTradeId" type="{http://www.fpml.org/FpML-5/master}TradeIdentifier" minOccurs="0"/&gt;
 *         &lt;element name="originatingTradeId" type="{http://www.fpml.org/FpML-5/master}TradeIdentifier" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="productComponentIdentifier" type="{http://www.fpml.org/FpML-5/master}ProductComponentIdentifier" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyTradeIdentifier", propOrder = {
    "linkId",
    "allocationTradeId",
    "resultingTradeId",
    "blockTradeId",
    "originatingTradeId",
    "productComponentIdentifier"
})
public class PartyTradeIdentifier
    extends TradeIdentifier
{

    protected List<LinkId> linkId;
    protected List<TradeIdentifier> allocationTradeId;
    protected List<TradeIdentifierExtended> resultingTradeId;
    protected TradeIdentifier blockTradeId;
    protected List<TradeIdentifier> originatingTradeId;
    protected List<ProductComponentIdentifier> productComponentIdentifier;

    /**
     * Gets the value of the linkId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the linkId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLinkId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LinkId }
     * 
     * 
     */
    public List<LinkId> getLinkId() {
        if (linkId == null) {
            linkId = new ArrayList<LinkId>();
        }
        return this.linkId;
    }

    /**
     * Gets the value of the allocationTradeId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the allocationTradeId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllocationTradeId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TradeIdentifier }
     * 
     * 
     */
    public List<TradeIdentifier> getAllocationTradeId() {
        if (allocationTradeId == null) {
            allocationTradeId = new ArrayList<TradeIdentifier>();
        }
        return this.allocationTradeId;
    }

    /**
     * Gets the value of the resultingTradeId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resultingTradeId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResultingTradeId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TradeIdentifierExtended }
     * 
     * 
     */
    public List<TradeIdentifierExtended> getResultingTradeId() {
        if (resultingTradeId == null) {
            resultingTradeId = new ArrayList<TradeIdentifierExtended>();
        }
        return this.resultingTradeId;
    }

    /**
     * Gets the value of the blockTradeId property.
     * 
     * @return
     *     possible object is
     *     {@link TradeIdentifier }
     *     
     */
    public TradeIdentifier getBlockTradeId() {
        return blockTradeId;
    }

    /**
     * Sets the value of the blockTradeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeIdentifier }
     *     
     */
    public void setBlockTradeId(TradeIdentifier value) {
        this.blockTradeId = value;
    }

    /**
     * Gets the value of the originatingTradeId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the originatingTradeId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOriginatingTradeId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TradeIdentifier }
     * 
     * 
     */
    public List<TradeIdentifier> getOriginatingTradeId() {
        if (originatingTradeId == null) {
            originatingTradeId = new ArrayList<TradeIdentifier>();
        }
        return this.originatingTradeId;
    }

    /**
     * Gets the value of the productComponentIdentifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productComponentIdentifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductComponentIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductComponentIdentifier }
     * 
     * 
     */
    public List<ProductComponentIdentifier> getProductComponentIdentifier() {
        if (productComponentIdentifier == null) {
            productComponentIdentifier = new ArrayList<ProductComponentIdentifier>();
        }
        return this.productComponentIdentifier;
    }

}
