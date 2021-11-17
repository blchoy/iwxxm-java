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
 * <p>Java class for PilotControlledLightingTimeSliceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PilotControlledLightingTimeSliceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMTimeSliceType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.aixm.aero/schema/5.1.1}PilotControlledLightingPropertyGroup"/&gt;
 *         &lt;element name="extension" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.aixm.aero/schema/5.1.1}AbstractPilotControlledLightingExtension"/&gt;
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
@XmlType(name = "PilotControlledLightingTimeSliceType", propOrder = {
    "type",
    "duration",
    "intensitySteps",
    "standByIntensity",
    "radioFrequency",
    "activationInstruction",
    "controlledLightIntensity",
    "activatedGroundLighting",
    "annotation",
    "extension"
})
public class PilotControlledLightingTimeSliceType
    extends AbstractAIXMTimeSliceType
{

    @XmlElementRef(name = "type", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodePilotControlledLightingType> type;
    @XmlElementRef(name = "duration", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDurationType> duration;
    @XmlElementRef(name = "intensitySteps", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<NoNumberType> intensitySteps;
    @XmlElementRef(name = "standByIntensity", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeIntensityStandByType> standByIntensity;
    @XmlElementRef(name = "radioFrequency", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValFrequencyType> radioFrequency;
    @XmlElementRef(name = "activationInstruction", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<TextInstructionType> activationInstruction;
    @XmlElement(nillable = true)
    protected List<LightActivationPropertyType> controlledLightIntensity;
    @XmlElement(nillable = true)
    protected List<GroundLightSystemPropertyType> activatedGroundLighting;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    protected List<PilotControlledLightingTimeSliceType.Extension> extension;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodePilotControlledLightingType }{@code >}
     *     
     */
    public JAXBElement<CodePilotControlledLightingType> getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodePilotControlledLightingType }{@code >}
     *     
     */
    public void setType(JAXBElement<CodePilotControlledLightingType> value) {
        this.type = value;
    }

    /**
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDurationType }{@code >}
     *     
     */
    public JAXBElement<ValDurationType> getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDurationType }{@code >}
     *     
     */
    public void setDuration(JAXBElement<ValDurationType> value) {
        this.duration = value;
    }

    /**
     * Gets the value of the intensitySteps property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NoNumberType }{@code >}
     *     
     */
    public JAXBElement<NoNumberType> getIntensitySteps() {
        return intensitySteps;
    }

    /**
     * Sets the value of the intensitySteps property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NoNumberType }{@code >}
     *     
     */
    public void setIntensitySteps(JAXBElement<NoNumberType> value) {
        this.intensitySteps = value;
    }

    /**
     * Gets the value of the standByIntensity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeIntensityStandByType }{@code >}
     *     
     */
    public JAXBElement<CodeIntensityStandByType> getStandByIntensity() {
        return standByIntensity;
    }

    /**
     * Sets the value of the standByIntensity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeIntensityStandByType }{@code >}
     *     
     */
    public void setStandByIntensity(JAXBElement<CodeIntensityStandByType> value) {
        this.standByIntensity = value;
    }

    /**
     * Gets the value of the radioFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValFrequencyType }{@code >}
     *     
     */
    public JAXBElement<ValFrequencyType> getRadioFrequency() {
        return radioFrequency;
    }

    /**
     * Sets the value of the radioFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValFrequencyType }{@code >}
     *     
     */
    public void setRadioFrequency(JAXBElement<ValFrequencyType> value) {
        this.radioFrequency = value;
    }

    /**
     * Gets the value of the activationInstruction property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TextInstructionType }{@code >}
     *     
     */
    public JAXBElement<TextInstructionType> getActivationInstruction() {
        return activationInstruction;
    }

    /**
     * Sets the value of the activationInstruction property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TextInstructionType }{@code >}
     *     
     */
    public void setActivationInstruction(JAXBElement<TextInstructionType> value) {
        this.activationInstruction = value;
    }

    /**
     * Gets the value of the controlledLightIntensity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the controlledLightIntensity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getControlledLightIntensity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LightActivationPropertyType }
     * 
     * 
     */
    public List<LightActivationPropertyType> getControlledLightIntensity() {
        if (controlledLightIntensity == null) {
            controlledLightIntensity = new ArrayList<LightActivationPropertyType>();
        }
        return this.controlledLightIntensity;
    }

    /**
     * Gets the value of the activatedGroundLighting property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the activatedGroundLighting property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActivatedGroundLighting().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GroundLightSystemPropertyType }
     * 
     * 
     */
    public List<GroundLightSystemPropertyType> getActivatedGroundLighting() {
        if (activatedGroundLighting == null) {
            activatedGroundLighting = new ArrayList<GroundLightSystemPropertyType>();
        }
        return this.activatedGroundLighting;
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
     * {@link PilotControlledLightingTimeSliceType.Extension }
     * 
     * 
     */
    public List<PilotControlledLightingTimeSliceType.Extension> getExtension() {
        if (extension == null) {
            extension = new ArrayList<PilotControlledLightingTimeSliceType.Extension>();
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
     *         &lt;element ref="{http://www.aixm.aero/schema/5.1.1}AbstractPilotControlledLightingExtension"/&gt;
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
        "abstractPilotControlledLightingExtension"
    })
    public static class Extension {

        @XmlElement(name = "AbstractPilotControlledLightingExtension", required = true)
        protected AbstractExtensionType abstractPilotControlledLightingExtension;
        @XmlAttribute(name = "owns")
        protected Boolean owns;

        /**
         * Gets the value of the abstractPilotControlledLightingExtension property.
         * 
         * @return
         *     possible object is
         *     {@link AbstractExtensionType }
         *     
         */
        public AbstractExtensionType getAbstractPilotControlledLightingExtension() {
            return abstractPilotControlledLightingExtension;
        }

        /**
         * Sets the value of the abstractPilotControlledLightingExtension property.
         * 
         * @param value
         *     allowed object is
         *     {@link AbstractExtensionType }
         *     
         */
        public void setAbstractPilotControlledLightingExtension(AbstractExtensionType value) {
            this.abstractPilotControlledLightingExtension = value;
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
