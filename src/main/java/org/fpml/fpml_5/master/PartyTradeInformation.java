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
 * A type defining party-specific additional information that may be recorded against a trade.
 * 
 * <p>Java class for PartyTradeInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartyTradeInformation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.fpml.org/FpML-5/master}PartyAndAccountReferences.model"/&gt;
 *         &lt;element name="relatedParty" type="{http://www.fpml.org/FpML-5/master}RelatedParty" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="reportingRole" type="{http://www.fpml.org/FpML-5/master}ReportingRole" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{http://www.fpml.org/FpML-5/master}String" minOccurs="0"/&gt;
 *         &lt;element name="unit" type="{http://www.fpml.org/FpML-5/master}Unit" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="relatedBusinessUnit" type="{http://www.fpml.org/FpML-5/master}RelatedBusinessUnit" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="relatedPerson" type="{http://www.fpml.org/FpML-5/master}RelatedPerson" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="algorithm" type="{http://www.fpml.org/FpML-5/master}Algorithm" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="isAccountingHedge" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="category" type="{http://www.fpml.org/FpML-5/master}TradeCategory" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="trader" type="{http://www.fpml.org/FpML-5/master}Trader" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="executionDateTime" type="{http://www.fpml.org/FpML-5/master}ExecutionDateTime" minOccurs="0"/&gt;
 *         &lt;element name="timestamps" type="{http://www.fpml.org/FpML-5/master}TradeProcessingTimestamps" minOccurs="0"/&gt;
 *         &lt;element name="intentToAllocate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="allocationStatus" type="{http://www.fpml.org/FpML-5/master}AllocationReportingStatus" minOccurs="0"/&gt;
 *         &lt;element name="intentToClear" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="clearingStatus" type="{http://www.fpml.org/FpML-5/master}ClearingStatusValue" minOccurs="0"/&gt;
 *         &lt;element name="collateralizationType" type="{http://www.fpml.org/FpML-5/master}CollateralizationType" minOccurs="0"/&gt;
 *         &lt;element name="collateralPortfolio" type="{http://www.fpml.org/FpML-5/master}PortfolioName" minOccurs="0"/&gt;
 *         &lt;element name="reportingRegime" type="{http://www.fpml.org/FpML-5/master}ReportingRegime" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;sequence&gt;
 *             &lt;element name="endUserException" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *             &lt;element name="endUserExceptionReason" type="{http://www.fpml.org/FpML-5/master}ClearingExceptionReason" minOccurs="0"/&gt;
 *           &lt;/sequence&gt;
 *           &lt;element name="endUserExceptionDeclaration" type="{http://www.fpml.org/FpML-5/master}EndUserExceptionDeclaration" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="nonStandardTerms" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="offMarketPrice" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="pricingContext" type="{http://www.fpml.org/FpML-5/master}PricingContext" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="largeSizeTrade" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="executionType" type="{http://www.fpml.org/FpML-5/master}ExecutionType" minOccurs="0"/&gt;
 *         &lt;element name="executionVenueType" type="{http://www.fpml.org/FpML-5/master}ExecutionVenueType" minOccurs="0"/&gt;
 *         &lt;element name="verificationMethod" type="{http://www.fpml.org/FpML-5/master}VerificationMethod" minOccurs="0"/&gt;
 *         &lt;element name="confirmationMethod" type="{http://www.fpml.org/FpML-5/master}ConfirmationMethod" minOccurs="0"/&gt;
 *         &lt;element name="compressedTrade" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.fpml.org/FpML-5/master}TransactionClassification.model" minOccurs="0"/&gt;
 *         &lt;element name="isDisputed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyTradeInformation", propOrder = {
    "partyReference",
    "accountReference",
    "relatedParty",
    "reportingRole",
    "description",
    "unit",
    "relatedBusinessUnit",
    "relatedPerson",
    "algorithm",
    "isAccountingHedge",
    "category",
    "trader",
    "executionDateTime",
    "timestamps",
    "intentToAllocate",
    "allocationStatus",
    "intentToClear",
    "clearingStatus",
    "collateralizationType",
    "collateralPortfolio",
    "reportingRegime",
    "endUserException",
    "endUserExceptionReason",
    "endUserExceptionDeclaration",
    "nonStandardTerms",
    "offMarketPrice",
    "pricingContext",
    "largeSizeTrade",
    "executionType",
    "executionVenueType",
    "verificationMethod",
    "confirmationMethod",
    "compressedTrade",
    "isSecuritiesFinancing",
    "otcClassification",
    "tradingWaiver",
    "shortSale",
    "isCommodityHedge",
    "isDisputed"
})
public class PartyTradeInformation {

    protected PartyReference partyReference;
    protected AccountReference accountReference;
    protected List<RelatedParty> relatedParty;
    protected ReportingRole reportingRole;
    protected String description;
    protected List<Unit> unit;
    protected List<RelatedBusinessUnit> relatedBusinessUnit;
    protected List<RelatedPerson> relatedPerson;
    protected List<Algorithm> algorithm;
    protected Boolean isAccountingHedge;
    protected List<TradeCategory> category;
    protected List<Trader> trader;
    protected ExecutionDateTime executionDateTime;
    protected TradeProcessingTimestamps timestamps;
    protected Boolean intentToAllocate;
    protected AllocationReportingStatus allocationStatus;
    protected Boolean intentToClear;
    protected ClearingStatusValue clearingStatus;
    protected CollateralizationType collateralizationType;
    protected PortfolioName collateralPortfolio;
    protected List<ReportingRegime> reportingRegime;
    protected Boolean endUserException;
    protected ClearingExceptionReason endUserExceptionReason;
    protected EndUserExceptionDeclaration endUserExceptionDeclaration;
    protected Boolean nonStandardTerms;
    protected Boolean offMarketPrice;
    protected List<PricingContext> pricingContext;
    protected Boolean largeSizeTrade;
    protected ExecutionType executionType;
    protected ExecutionVenueType executionVenueType;
    protected VerificationMethod verificationMethod;
    protected ConfirmationMethod confirmationMethod;
    protected Boolean compressedTrade;
    protected Boolean isSecuritiesFinancing;
    protected List<OtcClassification> otcClassification;
    protected List<TradingWaiver> tradingWaiver;
    protected ShortSale shortSale;
    protected Boolean isCommodityHedge;
    protected Boolean isDisputed;

    /**
     * Gets the value of the partyReference property.
     * 
     * @return
     *     possible object is
     *     {@link PartyReference }
     *     
     */
    public PartyReference getPartyReference() {
        return partyReference;
    }

    /**
     * Sets the value of the partyReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyReference }
     *     
     */
    public void setPartyReference(PartyReference value) {
        this.partyReference = value;
    }

    /**
     * Gets the value of the accountReference property.
     * 
     * @return
     *     possible object is
     *     {@link AccountReference }
     *     
     */
    public AccountReference getAccountReference() {
        return accountReference;
    }

    /**
     * Sets the value of the accountReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountReference }
     *     
     */
    public void setAccountReference(AccountReference value) {
        this.accountReference = value;
    }

    /**
     * Gets the value of the relatedParty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relatedParty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelatedParty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelatedParty }
     * 
     * 
     */
    public List<RelatedParty> getRelatedParty() {
        if (relatedParty == null) {
            relatedParty = new ArrayList<RelatedParty>();
        }
        return this.relatedParty;
    }

    /**
     * Gets the value of the reportingRole property.
     * 
     * @return
     *     possible object is
     *     {@link ReportingRole }
     *     
     */
    public ReportingRole getReportingRole() {
        return reportingRole;
    }

    /**
     * Sets the value of the reportingRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportingRole }
     *     
     */
    public void setReportingRole(ReportingRole value) {
        this.reportingRole = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the unit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Unit }
     * 
     * 
     */
    public List<Unit> getUnit() {
        if (unit == null) {
            unit = new ArrayList<Unit>();
        }
        return this.unit;
    }

    /**
     * Gets the value of the relatedBusinessUnit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relatedBusinessUnit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelatedBusinessUnit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelatedBusinessUnit }
     * 
     * 
     */
    public List<RelatedBusinessUnit> getRelatedBusinessUnit() {
        if (relatedBusinessUnit == null) {
            relatedBusinessUnit = new ArrayList<RelatedBusinessUnit>();
        }
        return this.relatedBusinessUnit;
    }

    /**
     * Gets the value of the relatedPerson property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relatedPerson property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelatedPerson().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelatedPerson }
     * 
     * 
     */
    public List<RelatedPerson> getRelatedPerson() {
        if (relatedPerson == null) {
            relatedPerson = new ArrayList<RelatedPerson>();
        }
        return this.relatedPerson;
    }

    /**
     * Gets the value of the algorithm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the algorithm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlgorithm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Algorithm }
     * 
     * 
     */
    public List<Algorithm> getAlgorithm() {
        if (algorithm == null) {
            algorithm = new ArrayList<Algorithm>();
        }
        return this.algorithm;
    }

    /**
     * Gets the value of the isAccountingHedge property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAccountingHedge() {
        return isAccountingHedge;
    }

    /**
     * Sets the value of the isAccountingHedge property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAccountingHedge(Boolean value) {
        this.isAccountingHedge = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the category property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCategory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TradeCategory }
     * 
     * 
     */
    public List<TradeCategory> getCategory() {
        if (category == null) {
            category = new ArrayList<TradeCategory>();
        }
        return this.category;
    }

    /**
     * Gets the value of the trader property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trader property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrader().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Trader }
     * 
     * 
     */
    public List<Trader> getTrader() {
        if (trader == null) {
            trader = new ArrayList<Trader>();
        }
        return this.trader;
    }

    /**
     * Gets the value of the executionDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link ExecutionDateTime }
     *     
     */
    public ExecutionDateTime getExecutionDateTime() {
        return executionDateTime;
    }

    /**
     * Sets the value of the executionDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExecutionDateTime }
     *     
     */
    public void setExecutionDateTime(ExecutionDateTime value) {
        this.executionDateTime = value;
    }

    /**
     * Gets the value of the timestamps property.
     * 
     * @return
     *     possible object is
     *     {@link TradeProcessingTimestamps }
     *     
     */
    public TradeProcessingTimestamps getTimestamps() {
        return timestamps;
    }

    /**
     * Sets the value of the timestamps property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeProcessingTimestamps }
     *     
     */
    public void setTimestamps(TradeProcessingTimestamps value) {
        this.timestamps = value;
    }

    /**
     * Gets the value of the intentToAllocate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIntentToAllocate() {
        return intentToAllocate;
    }

    /**
     * Sets the value of the intentToAllocate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIntentToAllocate(Boolean value) {
        this.intentToAllocate = value;
    }

    /**
     * Gets the value of the allocationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link AllocationReportingStatus }
     *     
     */
    public AllocationReportingStatus getAllocationStatus() {
        return allocationStatus;
    }

    /**
     * Sets the value of the allocationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link AllocationReportingStatus }
     *     
     */
    public void setAllocationStatus(AllocationReportingStatus value) {
        this.allocationStatus = value;
    }

    /**
     * Gets the value of the intentToClear property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIntentToClear() {
        return intentToClear;
    }

    /**
     * Sets the value of the intentToClear property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIntentToClear(Boolean value) {
        this.intentToClear = value;
    }

    /**
     * Gets the value of the clearingStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ClearingStatusValue }
     *     
     */
    public ClearingStatusValue getClearingStatus() {
        return clearingStatus;
    }

    /**
     * Sets the value of the clearingStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClearingStatusValue }
     *     
     */
    public void setClearingStatus(ClearingStatusValue value) {
        this.clearingStatus = value;
    }

    /**
     * Gets the value of the collateralizationType property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralizationType }
     *     
     */
    public CollateralizationType getCollateralizationType() {
        return collateralizationType;
    }

    /**
     * Sets the value of the collateralizationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralizationType }
     *     
     */
    public void setCollateralizationType(CollateralizationType value) {
        this.collateralizationType = value;
    }

    /**
     * Gets the value of the collateralPortfolio property.
     * 
     * @return
     *     possible object is
     *     {@link PortfolioName }
     *     
     */
    public PortfolioName getCollateralPortfolio() {
        return collateralPortfolio;
    }

    /**
     * Sets the value of the collateralPortfolio property.
     * 
     * @param value
     *     allowed object is
     *     {@link PortfolioName }
     *     
     */
    public void setCollateralPortfolio(PortfolioName value) {
        this.collateralPortfolio = value;
    }

    /**
     * Gets the value of the reportingRegime property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reportingRegime property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReportingRegime().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReportingRegime }
     * 
     * 
     */
    public List<ReportingRegime> getReportingRegime() {
        if (reportingRegime == null) {
            reportingRegime = new ArrayList<ReportingRegime>();
        }
        return this.reportingRegime;
    }

    /**
     * Gets the value of the endUserException property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEndUserException() {
        return endUserException;
    }

    /**
     * Sets the value of the endUserException property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEndUserException(Boolean value) {
        this.endUserException = value;
    }

    /**
     * Gets the value of the endUserExceptionReason property.
     * 
     * @return
     *     possible object is
     *     {@link ClearingExceptionReason }
     *     
     */
    public ClearingExceptionReason getEndUserExceptionReason() {
        return endUserExceptionReason;
    }

    /**
     * Sets the value of the endUserExceptionReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClearingExceptionReason }
     *     
     */
    public void setEndUserExceptionReason(ClearingExceptionReason value) {
        this.endUserExceptionReason = value;
    }

    /**
     * Gets the value of the endUserExceptionDeclaration property.
     * 
     * @return
     *     possible object is
     *     {@link EndUserExceptionDeclaration }
     *     
     */
    public EndUserExceptionDeclaration getEndUserExceptionDeclaration() {
        return endUserExceptionDeclaration;
    }

    /**
     * Sets the value of the endUserExceptionDeclaration property.
     * 
     * @param value
     *     allowed object is
     *     {@link EndUserExceptionDeclaration }
     *     
     */
    public void setEndUserExceptionDeclaration(EndUserExceptionDeclaration value) {
        this.endUserExceptionDeclaration = value;
    }

    /**
     * Gets the value of the nonStandardTerms property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNonStandardTerms() {
        return nonStandardTerms;
    }

    /**
     * Sets the value of the nonStandardTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNonStandardTerms(Boolean value) {
        this.nonStandardTerms = value;
    }

    /**
     * Gets the value of the offMarketPrice property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOffMarketPrice() {
        return offMarketPrice;
    }

    /**
     * Sets the value of the offMarketPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOffMarketPrice(Boolean value) {
        this.offMarketPrice = value;
    }

    /**
     * Gets the value of the pricingContext property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pricingContext property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPricingContext().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PricingContext }
     * 
     * 
     */
    public List<PricingContext> getPricingContext() {
        if (pricingContext == null) {
            pricingContext = new ArrayList<PricingContext>();
        }
        return this.pricingContext;
    }

    /**
     * Gets the value of the largeSizeTrade property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLargeSizeTrade() {
        return largeSizeTrade;
    }

    /**
     * Sets the value of the largeSizeTrade property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLargeSizeTrade(Boolean value) {
        this.largeSizeTrade = value;
    }

    /**
     * Gets the value of the executionType property.
     * 
     * @return
     *     possible object is
     *     {@link ExecutionType }
     *     
     */
    public ExecutionType getExecutionType() {
        return executionType;
    }

    /**
     * Sets the value of the executionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExecutionType }
     *     
     */
    public void setExecutionType(ExecutionType value) {
        this.executionType = value;
    }

    /**
     * Gets the value of the executionVenueType property.
     * 
     * @return
     *     possible object is
     *     {@link ExecutionVenueType }
     *     
     */
    public ExecutionVenueType getExecutionVenueType() {
        return executionVenueType;
    }

    /**
     * Sets the value of the executionVenueType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExecutionVenueType }
     *     
     */
    public void setExecutionVenueType(ExecutionVenueType value) {
        this.executionVenueType = value;
    }

    /**
     * Gets the value of the verificationMethod property.
     * 
     * @return
     *     possible object is
     *     {@link VerificationMethod }
     *     
     */
    public VerificationMethod getVerificationMethod() {
        return verificationMethod;
    }

    /**
     * Sets the value of the verificationMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link VerificationMethod }
     *     
     */
    public void setVerificationMethod(VerificationMethod value) {
        this.verificationMethod = value;
    }

    /**
     * Gets the value of the confirmationMethod property.
     * 
     * @return
     *     possible object is
     *     {@link ConfirmationMethod }
     *     
     */
    public ConfirmationMethod getConfirmationMethod() {
        return confirmationMethod;
    }

    /**
     * Sets the value of the confirmationMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfirmationMethod }
     *     
     */
    public void setConfirmationMethod(ConfirmationMethod value) {
        this.confirmationMethod = value;
    }

    /**
     * Gets the value of the compressedTrade property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCompressedTrade() {
        return compressedTrade;
    }

    /**
     * Sets the value of the compressedTrade property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCompressedTrade(Boolean value) {
        this.compressedTrade = value;
    }

    /**
     * Gets the value of the isSecuritiesFinancing property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSecuritiesFinancing() {
        return isSecuritiesFinancing;
    }

    /**
     * Sets the value of the isSecuritiesFinancing property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSecuritiesFinancing(Boolean value) {
        this.isSecuritiesFinancing = value;
    }

    /**
     * Gets the value of the otcClassification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otcClassification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtcClassification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OtcClassification }
     * 
     * 
     */
    public List<OtcClassification> getOtcClassification() {
        if (otcClassification == null) {
            otcClassification = new ArrayList<OtcClassification>();
        }
        return this.otcClassification;
    }

    /**
     * Gets the value of the tradingWaiver property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tradingWaiver property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTradingWaiver().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TradingWaiver }
     * 
     * 
     */
    public List<TradingWaiver> getTradingWaiver() {
        if (tradingWaiver == null) {
            tradingWaiver = new ArrayList<TradingWaiver>();
        }
        return this.tradingWaiver;
    }

    /**
     * Gets the value of the shortSale property.
     * 
     * @return
     *     possible object is
     *     {@link ShortSale }
     *     
     */
    public ShortSale getShortSale() {
        return shortSale;
    }

    /**
     * Sets the value of the shortSale property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShortSale }
     *     
     */
    public void setShortSale(ShortSale value) {
        this.shortSale = value;
    }

    /**
     * Gets the value of the isCommodityHedge property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCommodityHedge() {
        return isCommodityHedge;
    }

    /**
     * Sets the value of the isCommodityHedge property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCommodityHedge(Boolean value) {
        this.isCommodityHedge = value;
    }

    /**
     * Gets the value of the isDisputed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDisputed() {
        return isDisputed;
    }

    /**
     * Sets the value of the isDisputed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDisputed(Boolean value) {
        this.isDisputed = value;
    }

}
