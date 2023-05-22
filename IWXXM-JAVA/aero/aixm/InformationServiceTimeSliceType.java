//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0-SNAPSHOT 
// See <a href="https://jaxb.java.net/">https://jaxb.java.net/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.05.22 at 02:50:00 PM HKT 
//


package aero.aixm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InformationServiceTimeSliceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InformationServiceTimeSliceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMTimeSliceType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.aixm.aero/schema/5.1.1}InformationServicePropertyGroup"/&gt;
 *         &lt;element name="extension" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;choice&gt;
 *                   &lt;element ref="{http://www.aixm.aero/schema/5.1.1}AbstractInformationServiceExtension"/&gt;
 *                   &lt;element ref="{http://www.aixm.aero/schema/5.1.1}AbstractServiceExtension"/&gt;
 *                 &lt;/choice&gt;
 *                 &lt;attGroup ref="{http://www.opengis.net/gml/3.2}OwnershipAttributeGroup"/&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InformationServiceTimeSliceType", propOrder = {
    "rest"
})
public class InformationServiceTimeSliceType
    extends AbstractAIXMTimeSliceType
{

    @XmlElementRefs({
        @XmlElementRef(name = "flightOperations", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "rank", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "compliantICAO", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "name", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "location", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "serviceProvider", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "call-sign", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "radioCommunication", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "groundCommunication", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "availability", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "annotation", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "type", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "voice", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "dataLink", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "recorded", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "navaidBroadcast", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "clientAirspace", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "clientAirport", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "clientRoute", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "clientProcedure", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "clientHolding", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "clientAerialRefuelling", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "extension", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> rest;

    /**
     * Gets the rest of the content model. 
     * 
     * <p>
     * You are getting this "catch-all" property because of the following reason: 
     * The field name "Name" is used by two different parts of a schema. See: 
     * line 9932 of https://www.aixm.aero/schema/5.1.1/AIXM_Features.xsd
     * line 43 of http://schemas.opengis.net/gml/3.2.1/gmlBase.xsd
     * <p>
     * To get rid of this property, apply a property customization to one 
     * of both of the following declarations to change their names: 
     * Gets the value of the rest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link CodeFlightDestinationType }{@code >}
     * {@link JAXBElement }{@code <}{@link CodeFacilityRankingType }{@code >}
     * {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     * {@link JAXBElement }{@code <}{@link TextNameType }{@code >}
     * {@link JAXBElement }{@code <}{@link ElevatedPointPropertyType }{@code >}
     * {@link JAXBElement }{@code <}{@link UnitPropertyType }{@code >}
     * {@link JAXBElement }{@code <}{@link CallsignDetailPropertyType }{@code >}
     * {@link JAXBElement }{@code <}{@link RadioCommunicationChannelPropertyType }{@code >}
     * {@link JAXBElement }{@code <}{@link ContactInformationPropertyType }{@code >}
     * {@link JAXBElement }{@code <}{@link ServiceOperationalStatusPropertyType }{@code >}
     * {@link JAXBElement }{@code <}{@link NotePropertyType }{@code >}
     * {@link JAXBElement }{@code <}{@link CodeServiceInformationType }{@code >}
     * {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     * {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     * {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     * {@link JAXBElement }{@code <}{@link VORPropertyType }{@code >}
     * {@link JAXBElement }{@code <}{@link AirspacePropertyType }{@code >}
     * {@link JAXBElement }{@code <}{@link AirportHeliportPropertyType }{@code >}
     * {@link JAXBElement }{@code <}{@link RoutePortionPropertyType }{@code >}
     * {@link JAXBElement }{@code <}{@link ProcedurePropertyType }{@code >}
     * {@link JAXBElement }{@code <}{@link HoldingPatternPropertyType }{@code >}
     * {@link JAXBElement }{@code <}{@link AerialRefuellingPropertyType }{@code >}
     * {@link JAXBElement }{@code <}{@link InformationServiceTimeSliceType.Extension }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getRest() {
        if (rest == null) {
            rest = new ArrayList<JAXBElement<?>>();
        }
        return this.rest;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;choice&gt;
     *         &lt;element ref="{http://www.aixm.aero/schema/5.1.1}AbstractInformationServiceExtension"/&gt;
     *         &lt;element ref="{http://www.aixm.aero/schema/5.1.1}AbstractServiceExtension"/&gt;
     *       &lt;/choice&gt;
     *       &lt;attGroup ref="{http://www.opengis.net/gml/3.2}OwnershipAttributeGroup"/&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "abstractInformationServiceExtension",
        "abstractServiceExtension"
    })
    public static class Extension {

        @XmlElement(name = "AbstractInformationServiceExtension")
        protected AbstractExtensionType abstractInformationServiceExtension;
        @XmlElement(name = "AbstractServiceExtension")
        protected AbstractExtensionType abstractServiceExtension;
        @XmlAttribute(name = "owns")
        protected Boolean owns;

        /**
         * Gets the value of the abstractInformationServiceExtension property.
         * 
         * @return
         *     possible object is
         *     {@link AbstractExtensionType }
         *     
         */
        public AbstractExtensionType getAbstractInformationServiceExtension() {
            return abstractInformationServiceExtension;
        }

        /**
         * Sets the value of the abstractInformationServiceExtension property.
         * 
         * @param value
         *     allowed object is
         *     {@link AbstractExtensionType }
         *     
         */
        public void setAbstractInformationServiceExtension(AbstractExtensionType value) {
            this.abstractInformationServiceExtension = value;
        }

        /**
         * Gets the value of the abstractServiceExtension property.
         * 
         * @return
         *     possible object is
         *     {@link AbstractExtensionType }
         *     
         */
        public AbstractExtensionType getAbstractServiceExtension() {
            return abstractServiceExtension;
        }

        /**
         * Sets the value of the abstractServiceExtension property.
         * 
         * @param value
         *     allowed object is
         *     {@link AbstractExtensionType }
         *     
         */
        public void setAbstractServiceExtension(AbstractExtensionType value) {
            this.abstractServiceExtension = value;
        }

        /**
         * Gets the value of the owns property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public boolean isOwns() {
            if (owns == null) {
                return false;
            } else {
                return owns;
            }
        }

        /**
         * Sets the value of the owns property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setOwns(Boolean value) {
            this.owns = value;
        }

    }

}
