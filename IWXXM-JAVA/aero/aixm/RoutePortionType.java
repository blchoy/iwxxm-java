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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RoutePortionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RoutePortionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMObjectType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.aixm.aero/schema/5.1.1}RoutePortionPropertyGroup"/&gt;
 *         &lt;element name="extension" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;choice&gt;
 *                   &lt;element ref="{http://www.aixm.aero/schema/5.1.1}AbstractRoutePortionExtension"/&gt;
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
@XmlType(name = "RoutePortionType", propOrder = {
    "startFixDesignatedPoint",
    "startNavaidSystem",
    "startPosition",
    "startRunwayPoint",
    "startAimingPoint",
    "startAirportReferencePoint",
    "intermediatePointFixDesignatedPoint",
    "intermediatePointNavaidSystem",
    "intermediatePointPosition",
    "intermediatePointRunwayPoint",
    "intermediatePointAimingPoint",
    "intermediatePointAirportReferencePoint",
    "referencedRoute",
    "endFixDesignatedPoint",
    "endNavaidSystem",
    "endPosition",
    "endRunwayPoint",
    "endAimingPoint",
    "endAirportReferencePoint",
    "annotation",
    "extension"
})
public class RoutePortionType
    extends AbstractAIXMObjectType
{

    @XmlElementRef(name = "start_fixDesignatedPoint", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<DesignatedPointPropertyType> startFixDesignatedPoint;
    @XmlElementRef(name = "start_navaidSystem", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<NavaidPropertyType> startNavaidSystem;
    @XmlElementRef(name = "start_position", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<PointPropertyType> startPosition;
    @XmlElementRef(name = "start_runwayPoint", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<RunwayCentrelinePointPropertyType> startRunwayPoint;
    @XmlElementRef(name = "start_aimingPoint", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<TouchDownLiftOffPropertyType> startAimingPoint;
    @XmlElementRef(name = "start_airportReferencePoint", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<AirportHeliportPropertyType> startAirportReferencePoint;
    @XmlElementRef(name = "intermediatePoint_fixDesignatedPoint", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<DesignatedPointPropertyType> intermediatePointFixDesignatedPoint;
    @XmlElementRef(name = "intermediatePoint_navaidSystem", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<NavaidPropertyType> intermediatePointNavaidSystem;
    @XmlElementRef(name = "intermediatePoint_position", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<PointPropertyType> intermediatePointPosition;
    @XmlElementRef(name = "intermediatePoint_runwayPoint", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<RunwayCentrelinePointPropertyType> intermediatePointRunwayPoint;
    @XmlElementRef(name = "intermediatePoint_aimingPoint", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<TouchDownLiftOffPropertyType> intermediatePointAimingPoint;
    @XmlElementRef(name = "intermediatePoint_airportReferencePoint", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<AirportHeliportPropertyType> intermediatePointAirportReferencePoint;
    @XmlElementRef(name = "referencedRoute", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<RoutePropertyType> referencedRoute;
    @XmlElementRef(name = "end_fixDesignatedPoint", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<DesignatedPointPropertyType> endFixDesignatedPoint;
    @XmlElementRef(name = "end_navaidSystem", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<NavaidPropertyType> endNavaidSystem;
    @XmlElementRef(name = "end_position", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<PointPropertyType> endPosition;
    @XmlElementRef(name = "end_runwayPoint", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<RunwayCentrelinePointPropertyType> endRunwayPoint;
    @XmlElementRef(name = "end_aimingPoint", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<TouchDownLiftOffPropertyType> endAimingPoint;
    @XmlElementRef(name = "end_airportReferencePoint", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<AirportHeliportPropertyType> endAirportReferencePoint;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    protected List<RoutePortionType.Extension> extension;

    /**
     * Gets the value of the startFixDesignatedPoint property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DesignatedPointPropertyType }{@code >}
     *     
     */
    public JAXBElement<DesignatedPointPropertyType> getStartFixDesignatedPoint() {
        return startFixDesignatedPoint;
    }

    /**
     * Sets the value of the startFixDesignatedPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DesignatedPointPropertyType }{@code >}
     *     
     */
    public void setStartFixDesignatedPoint(JAXBElement<DesignatedPointPropertyType> value) {
        this.startFixDesignatedPoint = value;
    }

    /**
     * Gets the value of the startNavaidSystem property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NavaidPropertyType }{@code >}
     *     
     */
    public JAXBElement<NavaidPropertyType> getStartNavaidSystem() {
        return startNavaidSystem;
    }

    /**
     * Sets the value of the startNavaidSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NavaidPropertyType }{@code >}
     *     
     */
    public void setStartNavaidSystem(JAXBElement<NavaidPropertyType> value) {
        this.startNavaidSystem = value;
    }

    /**
     * Gets the value of the startPosition property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PointPropertyType }{@code >}
     *     
     */
    public JAXBElement<PointPropertyType> getStartPosition() {
        return startPosition;
    }

    /**
     * Sets the value of the startPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PointPropertyType }{@code >}
     *     
     */
    public void setStartPosition(JAXBElement<PointPropertyType> value) {
        this.startPosition = value;
    }

    /**
     * Gets the value of the startRunwayPoint property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RunwayCentrelinePointPropertyType }{@code >}
     *     
     */
    public JAXBElement<RunwayCentrelinePointPropertyType> getStartRunwayPoint() {
        return startRunwayPoint;
    }

    /**
     * Sets the value of the startRunwayPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RunwayCentrelinePointPropertyType }{@code >}
     *     
     */
    public void setStartRunwayPoint(JAXBElement<RunwayCentrelinePointPropertyType> value) {
        this.startRunwayPoint = value;
    }

    /**
     * Gets the value of the startAimingPoint property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TouchDownLiftOffPropertyType }{@code >}
     *     
     */
    public JAXBElement<TouchDownLiftOffPropertyType> getStartAimingPoint() {
        return startAimingPoint;
    }

    /**
     * Sets the value of the startAimingPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TouchDownLiftOffPropertyType }{@code >}
     *     
     */
    public void setStartAimingPoint(JAXBElement<TouchDownLiftOffPropertyType> value) {
        this.startAimingPoint = value;
    }

    /**
     * Gets the value of the startAirportReferencePoint property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AirportHeliportPropertyType }{@code >}
     *     
     */
    public JAXBElement<AirportHeliportPropertyType> getStartAirportReferencePoint() {
        return startAirportReferencePoint;
    }

    /**
     * Sets the value of the startAirportReferencePoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AirportHeliportPropertyType }{@code >}
     *     
     */
    public void setStartAirportReferencePoint(JAXBElement<AirportHeliportPropertyType> value) {
        this.startAirportReferencePoint = value;
    }

    /**
     * Gets the value of the intermediatePointFixDesignatedPoint property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DesignatedPointPropertyType }{@code >}
     *     
     */
    public JAXBElement<DesignatedPointPropertyType> getIntermediatePointFixDesignatedPoint() {
        return intermediatePointFixDesignatedPoint;
    }

    /**
     * Sets the value of the intermediatePointFixDesignatedPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DesignatedPointPropertyType }{@code >}
     *     
     */
    public void setIntermediatePointFixDesignatedPoint(JAXBElement<DesignatedPointPropertyType> value) {
        this.intermediatePointFixDesignatedPoint = value;
    }

    /**
     * Gets the value of the intermediatePointNavaidSystem property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NavaidPropertyType }{@code >}
     *     
     */
    public JAXBElement<NavaidPropertyType> getIntermediatePointNavaidSystem() {
        return intermediatePointNavaidSystem;
    }

    /**
     * Sets the value of the intermediatePointNavaidSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NavaidPropertyType }{@code >}
     *     
     */
    public void setIntermediatePointNavaidSystem(JAXBElement<NavaidPropertyType> value) {
        this.intermediatePointNavaidSystem = value;
    }

    /**
     * Gets the value of the intermediatePointPosition property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PointPropertyType }{@code >}
     *     
     */
    public JAXBElement<PointPropertyType> getIntermediatePointPosition() {
        return intermediatePointPosition;
    }

    /**
     * Sets the value of the intermediatePointPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PointPropertyType }{@code >}
     *     
     */
    public void setIntermediatePointPosition(JAXBElement<PointPropertyType> value) {
        this.intermediatePointPosition = value;
    }

    /**
     * Gets the value of the intermediatePointRunwayPoint property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RunwayCentrelinePointPropertyType }{@code >}
     *     
     */
    public JAXBElement<RunwayCentrelinePointPropertyType> getIntermediatePointRunwayPoint() {
        return intermediatePointRunwayPoint;
    }

    /**
     * Sets the value of the intermediatePointRunwayPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RunwayCentrelinePointPropertyType }{@code >}
     *     
     */
    public void setIntermediatePointRunwayPoint(JAXBElement<RunwayCentrelinePointPropertyType> value) {
        this.intermediatePointRunwayPoint = value;
    }

    /**
     * Gets the value of the intermediatePointAimingPoint property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TouchDownLiftOffPropertyType }{@code >}
     *     
     */
    public JAXBElement<TouchDownLiftOffPropertyType> getIntermediatePointAimingPoint() {
        return intermediatePointAimingPoint;
    }

    /**
     * Sets the value of the intermediatePointAimingPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TouchDownLiftOffPropertyType }{@code >}
     *     
     */
    public void setIntermediatePointAimingPoint(JAXBElement<TouchDownLiftOffPropertyType> value) {
        this.intermediatePointAimingPoint = value;
    }

    /**
     * Gets the value of the intermediatePointAirportReferencePoint property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AirportHeliportPropertyType }{@code >}
     *     
     */
    public JAXBElement<AirportHeliportPropertyType> getIntermediatePointAirportReferencePoint() {
        return intermediatePointAirportReferencePoint;
    }

    /**
     * Sets the value of the intermediatePointAirportReferencePoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AirportHeliportPropertyType }{@code >}
     *     
     */
    public void setIntermediatePointAirportReferencePoint(JAXBElement<AirportHeliportPropertyType> value) {
        this.intermediatePointAirportReferencePoint = value;
    }

    /**
     * Gets the value of the referencedRoute property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RoutePropertyType }{@code >}
     *     
     */
    public JAXBElement<RoutePropertyType> getReferencedRoute() {
        return referencedRoute;
    }

    /**
     * Sets the value of the referencedRoute property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RoutePropertyType }{@code >}
     *     
     */
    public void setReferencedRoute(JAXBElement<RoutePropertyType> value) {
        this.referencedRoute = value;
    }

    /**
     * Gets the value of the endFixDesignatedPoint property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DesignatedPointPropertyType }{@code >}
     *     
     */
    public JAXBElement<DesignatedPointPropertyType> getEndFixDesignatedPoint() {
        return endFixDesignatedPoint;
    }

    /**
     * Sets the value of the endFixDesignatedPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DesignatedPointPropertyType }{@code >}
     *     
     */
    public void setEndFixDesignatedPoint(JAXBElement<DesignatedPointPropertyType> value) {
        this.endFixDesignatedPoint = value;
    }

    /**
     * Gets the value of the endNavaidSystem property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NavaidPropertyType }{@code >}
     *     
     */
    public JAXBElement<NavaidPropertyType> getEndNavaidSystem() {
        return endNavaidSystem;
    }

    /**
     * Sets the value of the endNavaidSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NavaidPropertyType }{@code >}
     *     
     */
    public void setEndNavaidSystem(JAXBElement<NavaidPropertyType> value) {
        this.endNavaidSystem = value;
    }

    /**
     * Gets the value of the endPosition property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PointPropertyType }{@code >}
     *     
     */
    public JAXBElement<PointPropertyType> getEndPosition() {
        return endPosition;
    }

    /**
     * Sets the value of the endPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PointPropertyType }{@code >}
     *     
     */
    public void setEndPosition(JAXBElement<PointPropertyType> value) {
        this.endPosition = value;
    }

    /**
     * Gets the value of the endRunwayPoint property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RunwayCentrelinePointPropertyType }{@code >}
     *     
     */
    public JAXBElement<RunwayCentrelinePointPropertyType> getEndRunwayPoint() {
        return endRunwayPoint;
    }

    /**
     * Sets the value of the endRunwayPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RunwayCentrelinePointPropertyType }{@code >}
     *     
     */
    public void setEndRunwayPoint(JAXBElement<RunwayCentrelinePointPropertyType> value) {
        this.endRunwayPoint = value;
    }

    /**
     * Gets the value of the endAimingPoint property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TouchDownLiftOffPropertyType }{@code >}
     *     
     */
    public JAXBElement<TouchDownLiftOffPropertyType> getEndAimingPoint() {
        return endAimingPoint;
    }

    /**
     * Sets the value of the endAimingPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TouchDownLiftOffPropertyType }{@code >}
     *     
     */
    public void setEndAimingPoint(JAXBElement<TouchDownLiftOffPropertyType> value) {
        this.endAimingPoint = value;
    }

    /**
     * Gets the value of the endAirportReferencePoint property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AirportHeliportPropertyType }{@code >}
     *     
     */
    public JAXBElement<AirportHeliportPropertyType> getEndAirportReferencePoint() {
        return endAirportReferencePoint;
    }

    /**
     * Sets the value of the endAirportReferencePoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AirportHeliportPropertyType }{@code >}
     *     
     */
    public void setEndAirportReferencePoint(JAXBElement<AirportHeliportPropertyType> value) {
        this.endAirportReferencePoint = value;
    }

    /**
     * Gets the value of the annotation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the annotation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnnotation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NotePropertyType }
     * 
     * 
     */
    public List<NotePropertyType> getAnnotation() {
        if (annotation == null) {
            annotation = new ArrayList<NotePropertyType>();
        }
        return this.annotation;
    }

    /**
     * Gets the value of the extension property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extension property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtension().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RoutePortionType.Extension }
     * 
     * 
     */
    public List<RoutePortionType.Extension> getExtension() {
        if (extension == null) {
            extension = new ArrayList<RoutePortionType.Extension>();
        }
        return this.extension;
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
     *         &lt;element ref="{http://www.aixm.aero/schema/5.1.1}AbstractRoutePortionExtension"/&gt;
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
        "abstractRoutePortionExtension"
    })
    public static class Extension {

        @XmlElement(name = "AbstractRoutePortionExtension")
        protected AbstractExtensionType abstractRoutePortionExtension;
        @XmlAttribute(name = "owns")
        protected Boolean owns;

        /**
         * Gets the value of the abstractRoutePortionExtension property.
         * 
         * @return
         *     possible object is
         *     {@link AbstractExtensionType }
         *     
         */
        public AbstractExtensionType getAbstractRoutePortionExtension() {
            return abstractRoutePortionExtension;
        }

        /**
         * Sets the value of the abstractRoutePortionExtension property.
         * 
         * @param value
         *     allowed object is
         *     {@link AbstractExtensionType }
         *     
         */
        public void setAbstractRoutePortionExtension(AbstractExtensionType value) {
            this.abstractRoutePortionExtension = value;
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
