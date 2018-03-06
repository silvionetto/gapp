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
 * A message to request that a message be retransmitted. The original message will typically be a component of a group of messages, such as a portfolio or a report in multiple parts.
 * 
 * <p>Java class for RequestRetransmission complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestRetransmission"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.fpml.org/FpML-5/master}NonCorrectableRequestMessage"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.fpml.org/FpML-5/master}PortfolioReferenceOrReportIdentification.model"/&gt;
 *         &lt;group ref="{http://www.fpml.org/FpML-5/master}PartiesAndAccounts.model"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestRetransmission", propOrder = {
    "portfolioReference",
    "reportIdentification",
    "party",
    "account"
})
public class RequestRetransmission
    extends NonCorrectableRequestMessage
{

    protected PortfolioConstituentReference portfolioReference;
    protected ReportSectionIdentification reportIdentification;
    protected List<Party> party;
    protected List<Account> account;

    /**
     * Gets the value of the portfolioReference property.
     * 
     * @return
     *     possible object is
     *     {@link PortfolioConstituentReference }
     *     
     */
    public PortfolioConstituentReference getPortfolioReference() {
        return portfolioReference;
    }

    /**
     * Sets the value of the portfolioReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link PortfolioConstituentReference }
     *     
     */
    public void setPortfolioReference(PortfolioConstituentReference value) {
        this.portfolioReference = value;
    }

    /**
     * Gets the value of the reportIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link ReportSectionIdentification }
     *     
     */
    public ReportSectionIdentification getReportIdentification() {
        return reportIdentification;
    }

    /**
     * Sets the value of the reportIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportSectionIdentification }
     *     
     */
    public void setReportIdentification(ReportSectionIdentification value) {
        this.reportIdentification = value;
    }

    /**
     * Gets the value of the party property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the party property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Party }
     * 
     * 
     */
    public List<Party> getParty() {
        if (party == null) {
            party = new ArrayList<Party>();
        }
        return this.party;
    }

    /**
     * Gets the value of the account property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the account property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Account }
     * 
     * 
     */
    public List<Account> getAccount() {
        if (account == null) {
            account = new ArrayList<Account>();
        }
        return this.account;
    }

}
