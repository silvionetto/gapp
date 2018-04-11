//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0-b170531.0717 
//         See <a href="https://jaxb.java.net/">https://jaxb.java.net/</a> 
//         Any modifications to this file will be lost upon recompilation of the source schema. 
//         Generated on: 2018.02.10 at 05:14:53 PM CET 
//


package org.fpml.fpml_5.master;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * The abstract base class for all types which define intra-document pointers.
 * 
 * <p>Java class for Reference complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Reference"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Reference")
@XmlSeeAlso({
    AccountReference.class,
    AmountReference.class,
    BusinessCentersReference.class,
    BusinessDayAdjustmentsReference.class,
    BusinessUnitReference.class,
    DateReference.class,
    DeterminationMethodReference.class,
    IdentifiedCurrencyReference.class,
    LegalEntityReference.class,
    NotionalAmountReference.class,
    NotionalReference.class,
    NumberOfOptionsReference.class,
    NumberOfUnitsReference.class,
    PartyReference.class,
    PersonReference.class,
    PartyTradeIdentifierReference.class,
    PaymentReference.class,
    PricingStructureReference.class,
    ProductReference.class,
    ReturnSwapNotionalAmountReference.class,
    ScheduleReference.class,
    SpreadScheduleReference.class,
    AnyAssetReference.class,
    AssetReference.class,
    CreditEventsReference.class,
    CalculationPeriodsDatesReference.class,
    CalculationPeriodsReference.class,
    CalculationPeriodsScheduleReference.class,
    CommodityNotionalAmountReference.class,
    LagReference.class,
    QuantityReference.class,
    SettlementPeriodsReference.class,
    StrikePriceBasketReference.class,
    StrikePriceUnderlyingReference.class,
    DocumentReference.class,
    FacilityReference.class,
    LetterOfCreditReference.class,
    LoanContractReference.class
})
public abstract class Reference {


}