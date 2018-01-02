
package com.vodafone.group.schema.common.v1;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import un.unece.uncefact.documentation.standard.corecomponenttype._2.AmountType;
import un.unece.uncefact.documentation.standard.corecomponenttype._2.IDType;


/**
 * <p>Java class for PriceTypeWithID complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PriceTypeWithID"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ID" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}IDType" minOccurs="0"/&gt;
 *         &lt;element name="Amount" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}AmountType" minOccurs="0"/&gt;
 *         &lt;element name="DiscountAmount" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}AmountType" minOccurs="0"/&gt;
 *         &lt;element name="DiscountPercent" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}PercentType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="actionCode" type="{http://group.vodafone.com/schema/common/v1}ActionCodeType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceTypeWithID", propOrder = {
    "id",
    "amount",
    "discountAmount",
    "discountPercent"
})
@XmlSeeAlso({
    OneOffPriceType.class,
    RecurringPriceType.class
})
public class PriceTypeWithID {

    @XmlElement(name = "ID")
    protected IDType id;
    @XmlElement(name = "Amount")
    protected AmountType amount;
    @XmlElement(name = "DiscountAmount")
    protected AmountType discountAmount;
    @XmlElement(name = "DiscountPercent")
    protected BigDecimal discountPercent;
    @XmlAttribute(name = "actionCode")
    protected ActionCodeType actionCode;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setID(IDType value) {
        this.id = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAmount(AmountType value) {
        this.amount = value;
    }

    /**
     * Gets the value of the discountAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getDiscountAmount() {
        return discountAmount;
    }

    /**
     * Sets the value of the discountAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setDiscountAmount(AmountType value) {
        this.discountAmount = value;
    }

    /**
     * Gets the value of the discountPercent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDiscountPercent() {
        return discountPercent;
    }

    /**
     * Sets the value of the discountPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDiscountPercent(BigDecimal value) {
        this.discountPercent = value;
    }

    /**
     * Gets the value of the actionCode property.
     * 
     * @return
     *     possible object is
     *     {@link ActionCodeType }
     *     
     */
    public ActionCodeType getActionCode() {
        return actionCode;
    }

    /**
     * Sets the value of the actionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionCodeType }
     *     
     */
    public void setActionCode(ActionCodeType value) {
        this.actionCode = value;
    }

}
