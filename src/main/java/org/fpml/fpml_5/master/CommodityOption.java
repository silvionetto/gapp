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
 * Defines a commodity option product type. The product support for financially-settled exercises or exercise into physical forward contracts written on precious and non-precious metals. options in FpML is based on the creation of a 'commodityOption' product. The product references the 'commodity' underlyer in order to support the underlying asset of the option.
 * 
 * <p>Java class for CommodityOption complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommodityOption"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.fpml.org/FpML-5/master}Product"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.fpml.org/FpML-5/master}BuyerSeller.model"/&gt;
 *         &lt;element name="optionType" type="{http://www.fpml.org/FpML-5/master}PutCallEnum" minOccurs="0"/&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;group ref="{http://www.fpml.org/FpML-5/master}CommodityFinancialOption.model"/&gt;
 *           &lt;group ref="{http://www.fpml.org/FpML-5/master}CommodityPhysicalOption.model"/&gt;
 *           &lt;group ref="{http://www.fpml.org/FpML-5/master}CommodityWeatherOption.model"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="premium" type="{http://www.fpml.org/FpML-5/master}CommodityPremium" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.fpml.org/FpML-5/master}CommodityContent.model" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommodityOption")
public class CommodityOption
    extends Product
{


}
