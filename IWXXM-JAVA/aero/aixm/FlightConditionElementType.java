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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FlightConditionElementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlightConditionElementType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMObjectType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.aixm.aero/schema/5.1.1}FlightConditionElementPropertyGroup"/&gt;
 *         &lt;element name="extension" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;choice&gt;
 *                   &lt;element ref="{http://www.aixm.aero/schema/5.1.1}AbstractFlightConditionElementExtension"/&gt;
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
@XmlType(name = "FlightConditionElementType", propOrder = {
    "index",
    "flightConditionWeather",
    "flightConditionAircraft",
    "flightConditionFlight",
    "flightConditionDirectFlightCondition",
    "flightConditionBorderCrossingCondition",
    "flightConditionOperand",
    "flightConditionRoutePortionCondition",
    "flightConditionStandardInstrumentDepartureCondition",
    "flightConditionStandardInstrumentArrivalCondition",
    "flightConditionOrganisationCondition",
    "significantPointConditionFixDesignatedPoint",
    "significantPointConditionNavaidSystem",
    "significantPointConditionPosition",
    "significantPointConditionRunwayPoint",
    "significantPointConditionAimingPoint",
    "significantPointConditionAirportReferencePoint",
    "flightConditionAirspaceCondition",
    "flightConditionAirportHeliportCondition",
    "flightConditionAerialRefuellingCondition",
    "operationalCondition",
    "flightLevel",
    "annotation",
    "extension"
})
public class FlightConditionElementType
    extends AbstractAIXMObjectType
{

    @XmlElementRef(name = "index", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<NoSequenceType> index;
    @XmlElementRef(name = "flightCondition_weather", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<MeteorologyPropertyType> flightConditionWeather;
    @XmlElementRef(name = "flightCondition_aircraft", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<AircraftCharacteristicPropertyType> flightConditionAircraft;
    @XmlElementRef(name = "flightCondition_flight", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<FlightCharacteristicPropertyType> flightConditionFlight;
    @XmlElementRef(name = "flightCondition_directFlightCondition", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<DirectFlightPropertyType> flightConditionDirectFlightCondition;
    @XmlElementRef(name = "flightCondition_borderCrossingCondition", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<AirspaceBorderCrossingPropertyType> flightConditionBorderCrossingCondition;
    @XmlElementRef(name = "flightCondition_operand", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<FlightConditionCombinationPropertyType> flightConditionOperand;
    @XmlElementRef(name = "flightCondition_routePortionCondition", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<RoutePortionPropertyType> flightConditionRoutePortionCondition;
    @XmlElementRef(name = "flightCondition_standardInstrumentDepartureCondition", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<StandardInstrumentDeparturePropertyType> flightConditionStandardInstrumentDepartureCondition;
    @XmlElementRef(name = "flightCondition_standardInstrumentArrivalCondition", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<StandardInstrumentArrivalPropertyType> flightConditionStandardInstrumentArrivalCondition;
    @XmlElementRef(name = "flightCondition_organisationCondition", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<OrganisationAuthorityPropertyType> flightConditionOrganisationCondition;
    @XmlElementRef(name = "significantPointCondition_fixDesignatedPoint", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<DesignatedPointPropertyType> significantPointConditionFixDesignatedPoint;
    @XmlElementRef(name = "significantPointCondition_navaidSystem", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<NavaidPropertyType> significantPointConditionNavaidSystem;
    @XmlElementRef(name = "significantPointCondition_position", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<PointPropertyType> significantPointConditionPosition;
    @XmlElementRef(name = "significantPointCondition_runwayPoint", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<RunwayCentrelinePointPropertyType> significantPointConditionRunwayPoint;
    @XmlElementRef(name = "significantPointCondition_aimingPoint", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<TouchDownLiftOffPropertyType> significantPointConditionAimingPoint;
    @XmlElementRef(name = "significantPointCondition_airportReferencePoint", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<AirportHeliportPropertyType> significantPointConditionAirportReferencePoint;
    @XmlElementRef(name = "flightCondition_airspaceCondition", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<AirspacePropertyType> flightConditionAirspaceCondition;
    @XmlElementRef(name = "flightCondition_airportHeliportCondition", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<AirportHeliportPropertyType> flightConditionAirportHeliportCondition;
    @XmlElementRef(name = "flightCondition_aerialRefuellingCondition", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<AerialRefuellingPropertyType> flightConditionAerialRefuellingCondition;
    @XmlElementRef(name = "operationalCondition", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<FlightConditionCircumstancePropertyType> operationalCondition;
    @XmlElement(nillable = true)
    protected List<FlightRestrictionLevelPropertyType> flightLevel;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    protected List<FlightConditionElementType.Extension> extension;

    /**
     * Gets the value of the index property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NoSequenceType }{@code >}
     *     
     */
    public JAXBElement<NoSequenceType> getIndex() {
        return index;
    }

    /**
     * Sets the value of the index property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NoSequenceType }{@code >}
     *     
     */
    public void setIndex(JAXBElement<NoSequenceType> value) {
        this.index = value;
    }

    /**
     * Gets the value of the flightConditionWeather property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MeteorologyPropertyType }{@code >}
     *     
     */
    public JAXBElement<MeteorologyPropertyType> getFlightConditionWeather() {
        return flightConditionWeather;
    }

    /**
     * Sets the value of the flightConditionWeather property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MeteorologyPropertyType }{@code >}
     *     
     */
    public void setFlightConditionWeather(JAXBElement<MeteorologyPropertyType> value) {
        this.flightConditionWeather = value;
    }

    /**
     * Gets the value of the flightConditionAircraft property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AircraftCharacteristicPropertyType }{@code >}
     *     
     */
    public JAXBElement<AircraftCharacteristicPropertyType> getFlightConditionAircraft() {
        return flightConditionAircraft;
    }

    /**
     * Sets the value of the flightConditionAircraft property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AircraftCharacteristicPropertyType }{@code >}
     *     
     */
    public void setFlightConditionAircraft(JAXBElement<AircraftCharacteristicPropertyType> value) {
        this.flightConditionAircraft = value;
    }

    /**
     * Gets the value of the flightConditionFlight property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FlightCharacteristicPropertyType }{@code >}
     *     
     */
    public JAXBElement<FlightCharacteristicPropertyType> getFlightConditionFlight() {
        return flightConditionFlight;
    }

    /**
     * Sets the value of the flightConditionFlight property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FlightCharacteristicPropertyType }{@code >}
     *     
     */
    public void setFlightConditionFlight(JAXBElement<FlightCharacteristicPropertyType> value) {
        this.flightConditionFlight = value;
    }

    /**
     * Gets the value of the flightConditionDirectFlightCondition property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DirectFlightPropertyType }{@code >}
     *     
     */
    public JAXBElement<DirectFlightPropertyType> getFlightConditionDirectFlightCondition() {
        return flightConditionDirectFlightCondition;
    }

    /**
     * Sets the value of the flightConditionDirectFlightCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DirectFlightPropertyType }{@code >}
     *     
     */
    public void setFlightConditionDirectFlightCondition(JAXBElement<DirectFlightPropertyType> value) {
        this.flightConditionDirectFlightCondition = value;
    }

    /**
     * Gets the value of the flightConditionBorderCrossingCondition property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AirspaceBorderCrossingPropertyType }{@code >}
     *     
     */
    public JAXBElement<AirspaceBorderCrossingPropertyType> getFlightConditionBorderCrossingCondition() {
        return flightConditionBorderCrossingCondition;
    }

    /**
     * Sets the value of the flightConditionBorderCrossingCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AirspaceBorderCrossingPropertyType }{@code >}
     *     
     */
    public void setFlightConditionBorderCrossingCondition(JAXBElement<AirspaceBorderCrossingPropertyType> value) {
        this.flightConditionBorderCrossingCondition = value;
    }

    /**
     * Gets the value of the flightConditionOperand property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FlightConditionCombinationPropertyType }{@code >}
     *     
     */
    public JAXBElement<FlightConditionCombinationPropertyType> getFlightConditionOperand() {
        return flightConditionOperand;
    }

    /**
     * Sets the value of the flightConditionOperand property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FlightConditionCombinationPropertyType }{@code >}
     *     
     */
    public void setFlightConditionOperand(JAXBElement<FlightConditionCombinationPropertyType> value) {
        this.flightConditionOperand = value;
    }

    /**
     * Gets the value of the flightConditionRoutePortionCondition property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RoutePortionPropertyType }{@code >}
     *     
     */
    public JAXBElement<RoutePortionPropertyType> getFlightConditionRoutePortionCondition() {
        return flightConditionRoutePortionCondition;
    }

    /**
     * Sets the value of the flightConditionRoutePortionCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RoutePortionPropertyType }{@code >}
     *     
     */
    public void setFlightConditionRoutePortionCondition(JAXBElement<RoutePortionPropertyType> value) {
        this.flightConditionRoutePortionCondition = value;
    }

    /**
     * Gets the value of the flightConditionStandardInstrumentDepartureCondition property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StandardInstrumentDeparturePropertyType }{@code >}
     *     
     */
    public JAXBElement<StandardInstrumentDeparturePropertyType> getFlightConditionStandardInstrumentDepartureCondition() {
        return flightConditionStandardInstrumentDepartureCondition;
    }

    /**
     * Sets the value of the flightConditionStandardInstrumentDepartureCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StandardInstrumentDeparturePropertyType }{@code >}
     *     
     */
    public void setFlightConditionStandardInstrumentDepartureCondition(JAXBElement<StandardInstrumentDeparturePropertyType> value) {
        this.flightConditionStandardInstrumentDepartureCondition = value;
    }

    /**
     * Gets the value of the flightConditionStandardInstrumentArrivalCondition property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StandardInstrumentArrivalPropertyType }{@code >}
     *     
     */
    public JAXBElement<StandardInstrumentArrivalPropertyType> getFlightConditionStandardInstrumentArrivalCondition() {
        return flightConditionStandardInstrumentArrivalCondition;
    }

    /**
     * Sets the value of the flightConditionStandardInstrumentArrivalCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StandardInstrumentArrivalPropertyType }{@code >}
     *     
     */
    public void setFlightConditionStandardInstrumentArrivalCondition(JAXBElement<StandardInstrumentArrivalPropertyType> value) {
        this.flightConditionStandardInstrumentArrivalCondition = value;
    }

    /**
     * Gets the value of the flightConditionOrganisationCondition property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OrganisationAuthorityPropertyType }{@code >}
     *     
     */
    public JAXBElement<OrganisationAuthorityPropertyType> getFlightConditionOrganisationCondition() {
        return flightConditionOrganisationCondition;
    }

    /**
     * Sets the value of the flightConditionOrganisationCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OrganisationAuthorityPropertyType }{@code >}
     *     
     */
    public void setFlightConditionOrganisationCondition(JAXBElement<OrganisationAuthorityPropertyType> value) {
        this.flightConditionOrganisationCondition = value;
    }

    /**
     * Gets the value of the significantPointConditionFixDesignatedPoint property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DesignatedPointPropertyType }{@code >}
     *     
     */
    public JAXBElement<DesignatedPointPropertyType> getSignificantPointConditionFixDesignatedPoint() {
        return significantPointConditionFixDesignatedPoint;
    }

    /**
     * Sets the value of the significantPointConditionFixDesignatedPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DesignatedPointPropertyType }{@code >}
     *     
     */
    public void setSignificantPointConditionFixDesignatedPoint(JAXBElement<DesignatedPointPropertyType> value) {
        this.significantPointConditionFixDesignatedPoint = value;
    }

    /**
     * Gets the value of the significantPointConditionNavaidSystem property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NavaidPropertyType }{@code >}
     *     
     */
    public JAXBElement<NavaidPropertyType> getSignificantPointConditionNavaidSystem() {
        return significantPointConditionNavaidSystem;
    }

    /**
     * Sets the value of the significantPointConditionNavaidSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NavaidPropertyType }{@code >}
     *     
     */
    public void setSignificantPointConditionNavaidSystem(JAXBElement<NavaidPropertyType> value) {
        this.significantPointConditionNavaidSystem = value;
    }

    /**
     * Gets the value of the significantPointConditionPosition property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PointPropertyType }{@code >}
     *     
     */
    public JAXBElement<PointPropertyType> getSignificantPointConditionPosition() {
        return significantPointConditionPosition;
    }

    /**
     * Sets the value of the significantPointConditionPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PointPropertyType }{@code >}
     *     
     */
    public void setSignificantPointConditionPosition(JAXBElement<PointPropertyType> value) {
        this.significantPointConditionPosition = value;
    }

    /**
     * Gets the value of the significantPointConditionRunwayPoint property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RunwayCentrelinePointPropertyType }{@code >}
     *     
     */
    public JAXBElement<RunwayCentrelinePointPropertyType> getSignificantPointConditionRunwayPoint() {
        return significantPointConditionRunwayPoint;
    }

    /**
     * Sets the value of the significantPointConditionRunwayPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RunwayCentrelinePointPropertyType }{@code >}
     *     
     */
    public void setSignificantPointConditionRunwayPoint(JAXBElement<RunwayCentrelinePointPropertyType> value) {
        this.significantPointConditionRunwayPoint = value;
    }

    /**
     * Gets the value of the significantPointConditionAimingPoint property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TouchDownLiftOffPropertyType }{@code >}
     *     
     */
    public JAXBElement<TouchDownLiftOffPropertyType> getSignificantPointConditionAimingPoint() {
        return significantPointConditionAimingPoint;
    }

    /**
     * Sets the value of the significantPointConditionAimingPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TouchDownLiftOffPropertyType }{@code >}
     *     
     */
    public void setSignificantPointConditionAimingPoint(JAXBElement<TouchDownLiftOffPropertyType> value) {
        this.significantPointConditionAimingPoint = value;
    }

    /**
     * Gets the value of the significantPointConditionAirportReferencePoint property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AirportHeliportPropertyType }{@code >}
     *     
     */
    public JAXBElement<AirportHeliportPropertyType> getSignificantPointConditionAirportReferencePoint() {
        return significantPointConditionAirportReferencePoint;
    }

    /**
     * Sets the value of the significantPointConditionAirportReferencePoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AirportHeliportPropertyType }{@code >}
     *     
     */
    public void setSignificantPointConditionAirportReferencePoint(JAXBElement<AirportHeliportPropertyType> value) {
        this.significantPointConditionAirportReferencePoint = value;
    }

    /**
     * Gets the value of the flightConditionAirspaceCondition property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AirspacePropertyType }{@code >}
     *     
     */
    public JAXBElement<AirspacePropertyType> getFlightConditionAirspaceCondition() {
        return flightConditionAirspaceCondition;
    }

    /**
     * Sets the value of the flightConditionAirspaceCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AirspacePropertyType }{@code >}
     *     
     */
    public void setFlightConditionAirspaceCondition(JAXBElement<AirspacePropertyType> value) {
        this.flightConditionAirspaceCondition = value;
    }

    /**
     * Gets the value of the flightConditionAirportHeliportCondition property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AirportHeliportPropertyType }{@code >}
     *     
     */
    public JAXBElement<AirportHeliportPropertyType> getFlightConditionAirportHeliportCondition() {
        return flightConditionAirportHeliportCondition;
    }

    /**
     * Sets the value of the flightConditionAirportHeliportCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AirportHeliportPropertyType }{@code >}
     *     
     */
    public void setFlightConditionAirportHeliportCondition(JAXBElement<AirportHeliportPropertyType> value) {
        this.flightConditionAirportHeliportCondition = value;
    }

    /**
     * Gets the value of the flightConditionAerialRefuellingCondition property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AerialRefuellingPropertyType }{@code >}
     *     
     */
    public JAXBElement<AerialRefuellingPropertyType> getFlightConditionAerialRefuellingCondition() {
        return flightConditionAerialRefuellingCondition;
    }

    /**
     * Sets the value of the flightConditionAerialRefuellingCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AerialRefuellingPropertyType }{@code >}
     *     
     */
    public void setFlightConditionAerialRefuellingCondition(JAXBElement<AerialRefuellingPropertyType> value) {
        this.flightConditionAerialRefuellingCondition = value;
    }

    /**
     * Gets the value of the operationalCondition property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FlightConditionCircumstancePropertyType }{@code >}
     *     
     */
    public JAXBElement<FlightConditionCircumstancePropertyType> getOperationalCondition() {
        return operationalCondition;
    }

    /**
     * Sets the value of the operationalCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FlightConditionCircumstancePropertyType }{@code >}
     *     
     */
    public void setOperationalCondition(JAXBElement<FlightConditionCircumstancePropertyType> value) {
        this.operationalCondition = value;
    }

    /**
     * Gets the value of the flightLevel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flightLevel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlightLevel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlightRestrictionLevelPropertyType }
     * 
     * 
     */
    public List<FlightRestrictionLevelPropertyType> getFlightLevel() {
        if (flightLevel == null) {
            flightLevel = new ArrayList<FlightRestrictionLevelPropertyType>();
        }
        return this.flightLevel;
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
     * {@link FlightConditionElementType.Extension }
     * 
     * 
     */
    public List<FlightConditionElementType.Extension> getExtension() {
        if (extension == null) {
            extension = new ArrayList<FlightConditionElementType.Extension>();
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
     *         &lt;element ref="{http://www.aixm.aero/schema/5.1.1}AbstractFlightConditionElementExtension"/&gt;
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
        "abstractFlightConditionElementExtension"
    })
    public static class Extension {

        @XmlElement(name = "AbstractFlightConditionElementExtension")
        protected AbstractExtensionType abstractFlightConditionElementExtension;
        @XmlAttribute(name = "owns")
        protected Boolean owns;

        /**
         * Gets the value of the abstractFlightConditionElementExtension property.
         * 
         * @return
         *     possible object is
         *     {@link AbstractExtensionType }
         *     
         */
        public AbstractExtensionType getAbstractFlightConditionElementExtension() {
            return abstractFlightConditionElementExtension;
        }

        /**
         * Sets the value of the abstractFlightConditionElementExtension property.
         * 
         * @param value
         *     allowed object is
         *     {@link AbstractExtensionType }
         *     
         */
        public void setAbstractFlightConditionElementExtension(AbstractExtensionType value) {
            this.abstractFlightConditionElementExtension = value;
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
