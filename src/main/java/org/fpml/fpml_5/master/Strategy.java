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
 * A type defining a group of products making up a single trade.
 * 
 * <p>Java class for Strategy complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Strategy"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.fpml.org/FpML-5/master}Product"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="strategyComponentIdentifier" type="{http://www.fpml.org/FpML-5/master}StrategyComponentIdentification" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="premiumProductReference" type="{http://www.fpml.org/FpML-5/master}ProductReference" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fpml.org/FpML-5/master}product" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Strategy")
public class Strategy
    extends Product
{


}