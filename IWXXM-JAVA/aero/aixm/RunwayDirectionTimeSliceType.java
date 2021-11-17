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
 * <p>Java class for RunwayDirectionTimeSliceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RunwayDirectionTimeSliceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMTimeSliceType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.aixm.aero/schema/5.1.1}RunwayDirectionPropertyGroup"/&gt;
 *         &lt;element name="extension" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.aixm.aero/schema/5.1.1}AbstractRunwayDirectionExtension"/&gt;
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
@XmlType(name = "RunwayDirectionTimeSliceType", propOrder = {
    "designator",
    "trueBearing",
    "trueBearingAccuracy",
    "magneticBearing",
    "patternVFR",
    "slopeTDZ",
    "elevationTDZ",
    "elevationTDZAccuracy",
    "approachMarkingType",
    "approachMarkingCondition",
    "classLightingJAR",
    "precisionApproachGuidance",
    "usedRunway",
    "startingElement",
    "annotation",
    "availability",
    "extension"
})
public class RunwayDirectionTimeSliceType
    extends AbstractAIXMTimeSliceType
{

    @XmlElementRef(name = "designator", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<TextDesignatorType> designator;
    @XmlElementRef(name = "trueBearing", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValBearingType> trueBearing;
    @XmlElementRef(name = "trueBearingAccuracy", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValAngleType> trueBearingAccuracy;
    @XmlElementRef(name = "magneticBearing", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValBearingType> magneticBearing;
    @XmlElementRef(name = "patternVFR", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeDirectionTurnType> patternVFR;
    @XmlElementRef(name = "slopeTDZ", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValSlopeType> slopeTDZ;
    @XmlElementRef(name = "elevationTDZ", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceVerticalType> elevationTDZ;
    @XmlElementRef(name = "elevationTDZAccuracy", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceType> elevationTDZAccuracy;
    @XmlElementRef(name = "approachMarkingType", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeRunwayMarkingType> approachMarkingType;
    @XmlElementRef(name = "approachMarkingCondition", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeMarkingConditionType> approachMarkingCondition;
    @XmlElementRef(name = "classLightingJAR", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeLightingJARType> classLightingJAR;
    @XmlElementRef(name = "precisionApproachGuidance", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeApproachGuidanceType> precisionApproachGuidance;
    @XmlElementRef(name = "usedRunway", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<RunwayPropertyType> usedRunway;
    @XmlElementRef(name = "startingElement", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<RunwayElementPropertyType> startingElement;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    @XmlElement(nillable = true)
    protected List<ManoeuvringAreaAvailabilityPropertyType> availability;
    protected List<RunwayDirectionTimeSliceType.Extension> extension;

    /**
     * Gets the value of the designator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TextDesignatorType }{@code >}
     *     
     */
    public JAXBElement<TextDesignatorType> getDesignator() {
        return designator;
    }

    /**
     * Sets the value of the designator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TextDesignatorType }{@code >}
     *     
     */
    public void setDesignator(JAXBElement<TextDesignatorType> value) {
        this.designator = value;
    }

    /**
     * Gets the value of the trueBearing property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValBearingType }{@code >}
     *     
     */
    public JAXBElement<ValBearingType> getTrueBearing() {
        return trueBearing;
    }

    /**
     * Sets the value of the trueBearing property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValBearingType }{@code >}
     *     
     */
    public void setTrueBearing(JAXBElement<ValBearingType> value) {
        this.trueBearing = value;
    }

    /**
     * Gets the value of the trueBearingAccuracy property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValAngleType }{@code >}
     *     
     */
    public JAXBElement<ValAngleType> getTrueBearingAccuracy() {
        return trueBearingAccuracy;
    }

    /**
     * Sets the value of the trueBearingAccuracy property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValAngleType }{@code >}
     *     
     */
    public void setTrueBearingAccuracy(JAXBElement<ValAngleType> value) {
        this.trueBearingAccuracy = value;
    }

    /**
     * Gets the value of the magneticBearing property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValBearingType }{@code >}
     *     
     */
    public JAXBElement<ValBearingType> getMagneticBearing() {
        return magneticBearing;
    }

    /**
     * Sets the value of the magneticBearing property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValBearingType }{@code >}
     *     
     */
    public void setMagneticBearing(JAXBElement<ValBearingType> value) {
        this.magneticBearing = value;
    }

    /**
     * Gets the value of the patternVFR property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeDirectionTurnType }{@code >}
     *     
     */
    public JAXBElement<CodeDirectionTurnType> getPatternVFR() {
        return patternVFR;
    }

    /**
     * Sets the value of the patternVFR property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeDirectionTurnType }{@code >}
     *     
     */
    public void setPatternVFR(JAXBElement<CodeDirectionTurnType> value) {
        this.patternVFR = value;
    }

    /**
     * Gets the value of the slopeTDZ property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValSlopeType }{@code >}
     *     
     */
    public JAXBElement<ValSlopeType> getSlopeTDZ() {
        return slopeTDZ;
    }

    /**
     * Sets the value of the slopeTDZ property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValSlopeType }{@code >}
     *     
     */
    public void setSlopeTDZ(JAXBElement<ValSlopeType> value) {
        this.slopeTDZ = value;
    }

    /**
     * Gets the value of the elevationTDZ property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    public JAXBElement<ValDistanceVerticalType> getElevationTDZ() {
        return elevationTDZ;
    }

    /**
     * Sets the value of the elevationTDZ property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    public void setElevationTDZ(JAXBElement<ValDistanceVerticalType> value) {
        this.elevationTDZ = value;
    }

    /**
     * Gets the value of the elevationTDZAccuracy property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public JAXBElement<ValDistanceType> getElevationTDZAccuracy() {
        return elevationTDZAccuracy;
    }

    /**
     * Sets the value of the elevationTDZAccuracy property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public void setElevationTDZAccuracy(JAXBElement<ValDistanceType> value) {
        this.elevationTDZAccuracy = value;
    }

    /**
     * Gets the value of the approachMarkingType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeRunwayMarkingType }{@code >}
     *     
     */
    public JAXBElement<CodeRunwayMarkingType> getApproachMarkingType() {
        return approachMarkingType;
    }

    /**
     * Sets the value of the approachMarkingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeRunwayMarkingType }{@code >}
     *     
     */
    public void setApproachMarkingType(JAXBElement<CodeRunwayMarkingType> value) {
        this.approachMarkingType = value;
    }

    /**
     * Gets the value of the approachMarkingCondition property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeMarkingConditionType }{@code >}
     *     
     */
    public JAXBElement<CodeMarkingConditionType> getApproachMarkingCondition() {
        return approachMarkingCondition;
    }

    /**
     * Sets the value of the approachMarkingCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeMarkingConditionType }{@code >}
     *     
     */
    public void setApproachMarkingCondition(JAXBElement<CodeMarkingConditionType> value) {
        this.approachMarkingCondition = value;
    }

    /**
     * Gets the value of the classLightingJAR property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeLightingJARType }{@code >}
     *     
     */
    public JAXBElement<CodeLightingJARType> getClassLightingJAR() {
        return classLightingJAR;
    }

    /**
     * Sets the value of the classLightingJAR property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeLightingJARType }{@code >}
     *     
     */
    public void setClassLightingJAR(JAXBElement<CodeLightingJARType> value) {
        this.classLightingJAR = value;
    }

    /**
     * Gets the value of the precisionApproachGuidance property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeApproachGuidanceType }{@code >}
     *     
     */
    public JAXBElement<CodeApproachGuidanceType> getPrecisionApproachGuidance() {
        return precisionApproachGuidance;
    }

    /**
     * Sets the value of the precisionApproachGuidance property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeApproachGuidanceType }{@code >}
     *     
     */
    public void setPrecisionApproachGuidance(JAXBElement<CodeApproachGuidanceType> value) {
        this.precisionApproachGuidance = value;
    }

    /**
     * Gets the value of the usedRunway property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RunwayPropertyType }{@code >}
     *     
     */
    public JAXBElement<RunwayPropertyType> getUsedRunway() {
        return usedRunway;
    }

    /**
     * Sets the value of the usedRunway property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RunwayPropertyType }{@code >}
     *     
     */
    public void setUsedRunway(JAXBElement<RunwayPropertyType> value) {
        this.usedRunway = value;
    }

    /**
     * Gets the value of the startingElement property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RunwayElementPropertyType }{@code >}
     *     
     */
    public JAXBElement<RunwayElementPropertyType> getStartingElement() {
        return startingElement;
    }

    /**
     * Sets the value of the startingElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RunwayElementPropertyType }{@code >}
     *     
     */
    public void setStartingElement(JAXBElement<RunwayElementPropertyType> value) {
        this.startingElement = value;
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
     * Gets the value of the availability property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the availability property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAvailability().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ManoeuvringAreaAvailabilityPropertyType }
     * 
     * 
     */
    public List<ManoeuvringAreaAvailabilityPropertyType> getAvailability() {
        if (availability == null) {
            availability = new ArrayList<ManoeuvringAreaAvailabilityPropertyType>();
        }
        return this.availability;
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
     * {@link RunwayDirectionTimeSliceType.Extension }
     * 
     * 
     */
    public List<RunwayDirectionTimeSliceType.Extension> getExtension() {
        if (extension == null) {
            extension = new ArrayList<RunwayDirectionTimeSliceType.Extension>();
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
     *       &lt;sequence&gt;
     *         &lt;element ref="{http://www.aixm.aero/schema/5.1.1}AbstractRunwayDirectionExtension"/&gt;
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
        "abstractRunwayDirectionExtension"
    })
    public static class Extension {

        @XmlElement(name = "AbstractRunwayDirectionExtension", required = true)
        protected AbstractExtensionType abstractRunwayDirectionExtension;
        @XmlAttribute(name = "owns")
        protected Boolean owns;

        /**
         * Gets the value of the abstractRunwayDirectionExtension property.
         * 
         * @return
         *     possible object is
         *     {@link AbstractExtensionType }
         *     
         */
        public AbstractExtensionType getAbstractRunwayDirectionExtension() {
            return abstractRunwayDirectionExtension;
        }

        /**
         * Sets the value of the abstractRunwayDirectionExtension property.
         * 
         * @param value
         *     allowed object is
         *     {@link AbstractExtensionType }
         *     
         */
        public void setAbstractRunwayDirectionExtension(AbstractExtensionType value) {
            this.abstractRunwayDirectionExtension = value;
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
