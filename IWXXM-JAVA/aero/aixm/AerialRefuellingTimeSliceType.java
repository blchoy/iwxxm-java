//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0-SNAPSHOT 
// See <a href="https://jaxb.java.net/">https://jaxb.java.net/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.11.10 at 05:15:57 PM HKT 
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
 * <p>Java class for AerialRefuellingTimeSliceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AerialRefuellingTimeSliceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMTimeSliceType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.aixm.aero/schema/5.1.1}AerialRefuellingPropertyGroup"/&gt;
 *         &lt;element name="extension" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.aixm.aero/schema/5.1.1}AbstractAerialRefuellingExtension"/&gt;
 *                 &lt;/sequence&gt;
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
@XmlType(name = "AerialRefuellingTimeSliceType", propOrder = {
    "rest"
})
public class AerialRefuellingTimeSliceType
    extends AbstractAIXMTimeSliceType
{

    @XmlElementRefs({
        @XmlElementRef(name = "designatorPrefix", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "designatorNumber", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "designatorSuffix", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "designatorDirection", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "name", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "type", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "radarBeaconSetting", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "xbandRadarSetting", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "tankerChannel", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "receiverChannel", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "helicopterRoute", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "specialRefuelling", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "bidirectionalUse", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "reverseDirectionTurn", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "availability", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "protectingAirspace", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "track", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "anchor", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "oppositeTrack", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "managingOrganisation", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "annotation", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "extension", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> rest;

    /**
     * Gets the rest of the content model. 
     * 
     * <p>
     * You are getting this "catch-all" property because of the following reason: 
     * The field name "Name" is used by two different parts of a schema. See: 
     * line 78 of https://www.aixm.aero/schema/5.1.1/AIXM_Features.xsd
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
     * {@link JAXBElement }{@code <}{@link CodeAerialRefuellingPrefixType }{@code >}
     * {@link JAXBElement }{@code <}{@link NoNumberType }{@code >}
     * {@link JAXBElement }{@code <}{@link TextDesignatorType }{@code >}
     * {@link JAXBElement }{@code <}{@link CodeCardinalDirectionType }{@code >}
     * {@link JAXBElement }{@code <}{@link TextNameType }{@code >}
     * {@link JAXBElement }{@code <}{@link CodeAerialRefuellingType }{@code >}
     * {@link JAXBElement }{@code <}{@link NoNumberType }{@code >}
     * {@link JAXBElement }{@code <}{@link NoNumberType }{@code >}
     * {@link JAXBElement }{@code <}{@link CodeTACANChannelType }{@code >}
     * {@link JAXBElement }{@code <}{@link CodeTACANChannelType }{@code >}
     * {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     * {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     * {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     * {@link JAXBElement }{@code <}{@link CodeDirectionTurnType }{@code >}
     * {@link JAXBElement }{@code <}{@link RouteAvailabilityPropertyType }{@code >}
     * {@link JAXBElement }{@code <}{@link AirspacePropertyType }{@code >}
     * {@link JAXBElement }{@code <}{@link AerialRefuellingTrackPropertyType }{@code >}
     * {@link JAXBElement }{@code <}{@link AerialRefuellingAnchorPropertyType }{@code >}
     * {@link JAXBElement }{@code <}{@link AerialRefuellingPropertyType }{@code >}
     * {@link JAXBElement }{@code <}{@link AuthorityForAerialRefuellingPropertyType }{@code >}
     * {@link JAXBElement }{@code <}{@link NotePropertyType }{@code >}
     * {@link JAXBElement }{@code <}{@link AerialRefuellingTimeSliceType.Extension }{@code >}
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
     *       &lt;sequence&gt;
     *         &lt;element ref="{http://www.aixm.aero/schema/5.1.1}AbstractAerialRefuellingExtension"/&gt;
     *       &lt;/sequence&gt;
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
        "abstractAerialRefuellingExtension"
    })
    public static class Extension {

        @XmlElement(name = "AbstractAerialRefuellingExtension", required = true)
        protected AbstractExtensionType abstractAerialRefuellingExtension;
        @XmlAttribute(name = "owns")
        protected Boolean owns;

        /**
         * Gets the value of the abstractAerialRefuellingExtension property.
         * 
         * @return
         *     possible object is
         *     {@link AbstractExtensionType }
         *     
         */
        public AbstractExtensionType getAbstractAerialRefuellingExtension() {
            return abstractAerialRefuellingExtension;
        }

        /**
         * Sets the value of the abstractAerialRefuellingExtension property.
         * 
         * @param value
         *     allowed object is
         *     {@link AbstractExtensionType }
         *     
         */
        public void setAbstractAerialRefuellingExtension(AbstractExtensionType value) {
            this.abstractAerialRefuellingExtension = value;
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
