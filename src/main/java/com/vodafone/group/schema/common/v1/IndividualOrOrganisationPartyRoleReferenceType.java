
package com.vodafone.group.schema.common.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A type defining a Party Role reference component to Party that can be defined as either an Individual or an Organisation.
 * 
 * <p>Java class for IndividualOrOrganisationPartyRoleReferenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IndividualOrOrganisationPartyRoleReferenceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://group.vodafone.com/schema/common/v1}PartyReferenceType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="Individual" type="{http://group.vodafone.com/schema/common/v1}IndividualRoleType"/&gt;
 *           &lt;element name="Organisation" type="{http://group.vodafone.com/schema/common/v1}OrganisationPartyType"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndividualOrOrganisationPartyRoleReferenceType", propOrder = {
    "individual",
    "organisation"
})
public class IndividualOrOrganisationPartyRoleReferenceType
    extends PartyReferenceType
{

    @XmlElement(name = "Individual")
    protected IndividualRoleType individual;
    @XmlElement(name = "Organisation")
    protected OrganisationPartyType organisation;

    /**
     * Gets the value of the individual property.
     * 
     * @return
     *     possible object is
     *     {@link IndividualRoleType }
     *     
     */
    public IndividualRoleType getIndividual() {
        return individual;
    }

    /**
     * Sets the value of the individual property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualRoleType }
     *     
     */
    public void setIndividual(IndividualRoleType value) {
        this.individual = value;
    }

    /**
     * Gets the value of the organisation property.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationPartyType }
     *     
     */
    public OrganisationPartyType getOrganisation() {
        return organisation;
    }

    /**
     * Sets the value of the organisation property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationPartyType }
     *     
     */
    public void setOrganisation(OrganisationPartyType value) {
        this.organisation = value;
    }

}
