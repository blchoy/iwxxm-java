//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.11.08 at 04:16:07 AM UTC 
//


package net.opengis.gml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import icao.iwxxm.AIRMETEvolvingConditionCollectionType;
import icao.iwxxm.AIRMETEvolvingConditionType;
import icao.iwxxm.AIRMETType;
import icao.iwxxm.METARType;
import icao.iwxxm.MeteorologicalAerodromeObservationReportType;
import icao.iwxxm.ReportType;
import icao.iwxxm.SIGMETEvolvingConditionCollectionType;
import icao.iwxxm.SIGMETEvolvingConditionType;
import icao.iwxxm.SIGMETPositionCollectionType;
import icao.iwxxm.SIGMETPositionType;
import icao.iwxxm.SIGMETType;
import icao.iwxxm.SPECIType;
import icao.iwxxm.SpaceWeatherAdvisoryType;
import icao.iwxxm.SpaceWeatherAnalysisType;
import icao.iwxxm.SpaceWeatherRegionType;
import icao.iwxxm.TAFType;
import icao.iwxxm.TropicalCycloneAdvisoryType;
import icao.iwxxm.TropicalCycloneForecastConditionsType;
import icao.iwxxm.TropicalCycloneObservedConditionsType;
import icao.iwxxm.TropicalCycloneSIGMETEvolvingConditionCollectionType;
import icao.iwxxm.TropicalCycloneSIGMETPositionCollectionType;
import icao.iwxxm.TropicalCycloneSIGMETType;
import icao.iwxxm.VolcanicAshAdvisoryType;
import icao.iwxxm.VolcanicAshCloudForecastType;
import icao.iwxxm.VolcanicAshCloudObservedOrEstimatedType;
import icao.iwxxm.VolcanicAshForecastConditionsType;
import icao.iwxxm.VolcanicAshObservedOrEstimatedConditionsType;
import icao.iwxxm.VolcanicAshSIGMETEvolvingConditionCollectionType;
import icao.iwxxm.VolcanicAshSIGMETPositionCollectionType;
import icao.iwxxm.VolcanicAshSIGMETType;
import icao.iwxxm.WindObservedOrEstimatedType;
import def.wmo.collect.MeteorologicalBulletinType;
import def.wmo.metce.EruptingVolcanoType;
import def.wmo.metce.ProcessType;
import def.wmo.metce.TropicalCycloneType;
import def.wmo.metce.VolcanoType;
import aero.aixm.AbstractAIXMFeatureType;
import aero.aixm.AirportHeliportType;
import aero.aixm.AirspaceType;
import aero.aixm.RunwayDirectionType;
import aero.aixm.RunwayType;
import aero.aixm.UnitType;
import net.opengis.om.OMObservationType;
import org.w3.xlink.ActuateType;
import org.w3.xlink.ShowType;
import org.w3.xlink.TypeType;


/**
 * <p>Java class for FeaturePropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FeaturePropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence minOccurs="0"&gt;
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}AbstractFeature"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.opengis.net/gml/3.2}AssociationAttributeGroup"/&gt;
 *       &lt;attGroup ref="{http://www.opengis.net/gml/3.2}OwnershipAttributeGroup"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeaturePropertyType", propOrder = {
    "abstractFeature"
})
public class FeaturePropertyType {

    @XmlElementRef(name = "AbstractFeature", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends AbstractFeatureType> abstractFeature;
    @XmlAttribute(name = "nilReason")
    protected List<String> nilReason;
    @XmlAttribute(name = "remoteSchema", namespace = "http://www.opengis.net/gml/3.2")
    @XmlSchemaType(name = "anyURI")
    protected String remoteSchema;
    @XmlAttribute(name = "type", namespace = "http://www.w3.org/1999/xlink")
    protected TypeType type;
    @XmlAttribute(name = "href", namespace = "http://www.w3.org/1999/xlink")
    protected String href;
    @XmlAttribute(name = "role", namespace = "http://www.w3.org/1999/xlink")
    protected String role;
    @XmlAttribute(name = "arcrole", namespace = "http://www.w3.org/1999/xlink")
    protected String arcrole;
    @XmlAttribute(name = "title", namespace = "http://www.w3.org/1999/xlink")
    protected String title;
    @XmlAttribute(name = "show", namespace = "http://www.w3.org/1999/xlink")
    protected ShowType show;
    @XmlAttribute(name = "actuate", namespace = "http://www.w3.org/1999/xlink")
    protected ActuateType actuate;
    @XmlAttribute(name = "owns")
    protected java.lang.Boolean owns;

    /**
     * Gets the value of the abstractFeature property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ProcessType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SpaceWeatherAnalysisType }{@code >}
     *     {@link JAXBElement }{@code <}{@link VolcanicAshCloudObservedOrEstimatedType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DiscreteCoverageType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DiscreteCoverageType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DiscreteCoverageType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DiscreteCoverageType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DiscreteCoverageType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DiscreteCoverageType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DiscreteCoverageType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractCoverageType }{@code >}
     *     {@link JAXBElement }{@code <}{@link WindObservedOrEstimatedType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SpaceWeatherRegionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link VolcanicAshObservedOrEstimatedConditionsType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TropicalCycloneForecastConditionsType }{@code >}
     *     {@link JAXBElement }{@code <}{@link VolcanicAshCloudForecastType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AIRMETEvolvingConditionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AIRMETEvolvingConditionCollectionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TropicalCycloneSIGMETEvolvingConditionCollectionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link VolcanicAshSIGMETEvolvingConditionCollectionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SIGMETEvolvingConditionCollectionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TropicalCycloneObservedConditionsType }{@code >}
     *     {@link JAXBElement }{@code <}{@link VolcanicAshSIGMETPositionCollectionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TropicalCycloneSIGMETPositionCollectionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SIGMETPositionCollectionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TropicalCycloneSIGMETType }{@code >}
     *     {@link JAXBElement }{@code <}{@link VolcanicAshSIGMETType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SIGMETType }{@code >}
     *     {@link JAXBElement }{@code <}{@link VolcanicAshAdvisoryType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SpaceWeatherAdvisoryType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TropicalCycloneAdvisoryType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SPECIType }{@code >}
     *     {@link JAXBElement }{@code <}{@link METARType }{@code >}
     *     {@link JAXBElement }{@code <}{@link MeteorologicalAerodromeObservationReportType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TAFType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AIRMETType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ReportType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TropicalCycloneType }{@code >}
     *     {@link JAXBElement }{@code <}{@link MeteorologicalBulletinType }{@code >}
     *     {@link JAXBElement }{@code <}{@link VolcanicAshForecastConditionsType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SIGMETPositionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DynamicFeatureCollectionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DynamicFeatureType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FeatureCollectionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link OMObservationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link EruptingVolcanoType }{@code >}
     *     {@link JAXBElement }{@code <}{@link VolcanoType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DirectedObservationAtDistanceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DirectedObservationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ObservationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AirspaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AirportHeliportType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RunwayType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RunwayDirectionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link UnitType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractAIXMFeatureType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractContinuousCoverageType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SIGMETEvolvingConditionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractFeatureCollectionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractFeatureType }{@code >}
     *     
     */
    public JAXBElement<? extends AbstractFeatureType> getAbstractFeature() {
        return abstractFeature;
    }

    /**
     * Sets the value of the abstractFeature property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ProcessType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SpaceWeatherAnalysisType }{@code >}
     *     {@link JAXBElement }{@code <}{@link VolcanicAshCloudObservedOrEstimatedType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DiscreteCoverageType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DiscreteCoverageType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DiscreteCoverageType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DiscreteCoverageType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DiscreteCoverageType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DiscreteCoverageType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DiscreteCoverageType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractCoverageType }{@code >}
     *     {@link JAXBElement }{@code <}{@link WindObservedOrEstimatedType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SpaceWeatherRegionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link VolcanicAshObservedOrEstimatedConditionsType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TropicalCycloneForecastConditionsType }{@code >}
     *     {@link JAXBElement }{@code <}{@link VolcanicAshCloudForecastType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AIRMETEvolvingConditionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AIRMETEvolvingConditionCollectionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TropicalCycloneSIGMETEvolvingConditionCollectionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link VolcanicAshSIGMETEvolvingConditionCollectionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SIGMETEvolvingConditionCollectionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TropicalCycloneObservedConditionsType }{@code >}
     *     {@link JAXBElement }{@code <}{@link VolcanicAshSIGMETPositionCollectionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TropicalCycloneSIGMETPositionCollectionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SIGMETPositionCollectionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TropicalCycloneSIGMETType }{@code >}
     *     {@link JAXBElement }{@code <}{@link VolcanicAshSIGMETType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SIGMETType }{@code >}
     *     {@link JAXBElement }{@code <}{@link VolcanicAshAdvisoryType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SpaceWeatherAdvisoryType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TropicalCycloneAdvisoryType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SPECIType }{@code >}
     *     {@link JAXBElement }{@code <}{@link METARType }{@code >}
     *     {@link JAXBElement }{@code <}{@link MeteorologicalAerodromeObservationReportType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TAFType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AIRMETType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ReportType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TropicalCycloneType }{@code >}
     *     {@link JAXBElement }{@code <}{@link MeteorologicalBulletinType }{@code >}
     *     {@link JAXBElement }{@code <}{@link VolcanicAshForecastConditionsType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SIGMETPositionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DynamicFeatureCollectionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DynamicFeatureType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FeatureCollectionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link OMObservationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link EruptingVolcanoType }{@code >}
     *     {@link JAXBElement }{@code <}{@link VolcanoType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DirectedObservationAtDistanceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DirectedObservationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ObservationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AirspaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AirportHeliportType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RunwayType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RunwayDirectionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link UnitType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractAIXMFeatureType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractContinuousCoverageType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SIGMETEvolvingConditionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractFeatureCollectionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractFeatureType }{@code >}
     *     
     */
    public void setAbstractFeature(JAXBElement<? extends AbstractFeatureType> value) {
        this.abstractFeature = value;
    }

    /**
     * Gets the value of the nilReason property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nilReason property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNilReason().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNilReason() {
        if (nilReason == null) {
            nilReason = new ArrayList<String>();
        }
        return this.nilReason;
    }

    /**
     * Gets the value of the remoteSchema property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemoteSchema() {
        return remoteSchema;
    }

    /**
     * Sets the value of the remoteSchema property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemoteSchema(String value) {
        this.remoteSchema = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link TypeType }
     *     
     */
    public TypeType getType() {
        if (type == null) {
            return TypeType.SIMPLE;
        } else {
            return type;
        }
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeType }
     *     
     */
    public void setType(TypeType value) {
        this.type = value;
    }

    /**
     * Gets the value of the href property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHref() {
        return href;
    }

    /**
     * Sets the value of the href property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHref(String value) {
        this.href = value;
    }

    /**
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRole(String value) {
        this.role = value;
    }

    /**
     * Gets the value of the arcrole property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArcrole() {
        return arcrole;
    }

    /**
     * Sets the value of the arcrole property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArcrole(String value) {
        this.arcrole = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the show property.
     * 
     * @return
     *     possible object is
     *     {@link ShowType }
     *     
     */
    public ShowType getShow() {
        return show;
    }

    /**
     * Sets the value of the show property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShowType }
     *     
     */
    public void setShow(ShowType value) {
        this.show = value;
    }

    /**
     * Gets the value of the actuate property.
     * 
     * @return
     *     possible object is
     *     {@link ActuateType }
     *     
     */
    public ActuateType getActuate() {
        return actuate;
    }

    /**
     * Sets the value of the actuate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActuateType }
     *     
     */
    public void setActuate(ActuateType value) {
        this.actuate = value;
    }

    /**
     * Gets the value of the owns property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Boolean }
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
     *     {@link java.lang.Boolean }
     *     
     */
    public void setOwns(java.lang.Boolean value) {
        this.owns = value;
    }

}
