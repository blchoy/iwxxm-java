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
 * <p>Java class for TouchDownLiftOffMarkingTimeSliceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TouchDownLiftOffMarkingTimeSliceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMTimeSliceType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.aixm.aero/schema/5.1.1}TouchDownLiftOffMarkingPropertyGroup"/&gt;
 *         &lt;element name="extension" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;choice&gt;
 *                   &lt;element ref="{http://www.aixm.aero/schema/5.1.1}AbstractTouchDownLiftOffMarkingExtension"/&gt;
 *                   &lt;element ref="{http://www.aixm.aero/schema/5.1.1}AbstractMarkingExtension"/&gt;
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
@XmlType(name = "TouchDownLiftOffMarkingTimeSliceType", propOrder = {
    "markingICAOStandard",
    "condition",
    "element",
    "annotation",
    "markingLocation",
    "markedTouchDownLiftOff",
    "extension"
})
public class TouchDownLiftOffMarkingTimeSliceType
    extends AbstractAIXMTimeSliceType
{

    @XmlElementRef(name = "markingICAOStandard", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> markingICAOStandard;
    @XmlElementRef(name = "condition", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeMarkingConditionType> condition;
    @XmlElement(nillable = true)
    protected List<MarkingElementPropertyType> element;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    @XmlElementRef(name = "markingLocation", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeTLOFSectionType> markingLocation;
    @XmlElementRef(name = "markedTouchDownLiftOff", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<TouchDownLiftOffPropertyType> markedTouchDownLiftOff;
    protected List<TouchDownLiftOffMarkingTimeSliceType.Extension> extension;

    /**
     * Gets the value of the markingICAOStandard property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public JAXBElement<CodeYesNoType> getMarkingICAOStandard() {
        return markingICAOStandard;
    }

    /**
     * Sets the value of the markingICAOStandard property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setMarkingICAOStandard(JAXBElement<CodeYesNoType> value) {
        this.markingICAOStandard = value;
    }

    /**
     * Gets the value of the condition property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeMarkingConditionType }{@code >}
     *     
     */
    public JAXBElement<CodeMarkingConditionType> getCondition() {
        return condition;
    }

    /**
     * Sets the value of the condition property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeMarkingConditionType }{@code >}
     *     
     */
    public void setCondition(JAXBElement<CodeMarkingConditionType> value) {
        this.condition = value;
    }

    /**
     * Gets the value of the element property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the element property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MarkingElementPropertyType }
     * 
     * 
     */
    public List<MarkingElementPropertyType> getElement() {
        if (element == null) {
            element = new ArrayList<MarkingElementPropertyType>();
        }
        return this.element;
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
     * Gets the value of the markingLocation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeTLOFSectionType }{@code >}
     *     
     */
    public JAXBElement<CodeTLOFSectionType> getMarkingLocation() {
        return markingLocation;
    }

    /**
     * Sets the value of the markingLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeTLOFSectionType }{@code >}
     *     
     */
    public void setMarkingLocation(JAXBElement<CodeTLOFSectionType> value) {
        this.markingLocation = value;
    }

    /**
     * Gets the value of the markedTouchDownLiftOff property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TouchDownLiftOffPropertyType }{@code >}
     *     
     */
    public JAXBElement<TouchDownLiftOffPropertyType> getMarkedTouchDownLiftOff() {
        return markedTouchDownLiftOff;
    }

    /**
     * Sets the value of the markedTouchDownLiftOff property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TouchDownLiftOffPropertyType }{@code >}
     *     
     */
    public void setMarkedTouchDownLiftOff(JAXBElement<TouchDownLiftOffPropertyType> value) {
        this.markedTouchDownLiftOff = value;
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
     * {@link TouchDownLiftOffMarkingTimeSliceType.Extension }
     * 
     * 
     */
    public List<TouchDownLiftOffMarkingTimeSliceType.Extension> getExtension() {
        if (extension == null) {
            extension = new ArrayList<TouchDownLiftOffMarkingTimeSliceType.Extension>();
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
     *         &lt;element ref="{http://www.aixm.aero/schema/5.1.1}AbstractTouchDownLiftOffMarkingExtension"/&gt;
     *         &lt;element ref="{http://www.aixm.aero/schema/5.1.1}AbstractMarkingExtension"/&gt;
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
        "abstractTouchDownLiftOffMarkingExtension",
        "abstractMarkingExtension"
    })
    public static class Extension {

        @XmlElement(name = "AbstractTouchDownLiftOffMarkingExtension")
        protected AbstractExtensionType abstractTouchDownLiftOffMarkingExtension;
        @XmlElement(name = "AbstractMarkingExtension")
        protected AbstractExtensionType abstractMarkingExtension;
        @XmlAttribute(name = "owns")
        protected Boolean owns;

        /**
         * Gets the value of the abstractTouchDownLiftOffMarkingExtension property.
         * 
         * @return
         *     possible object is
         *     {@link AbstractExtensionType }
         *     
         */
        public AbstractExtensionType getAbstractTouchDownLiftOffMarkingExtension() {
            return abstractTouchDownLiftOffMarkingExtension;
        }

        /**
         * Sets the value of the abstractTouchDownLiftOffMarkingExtension property.
         * 
         * @param value
         *     allowed object is
         *     {@link AbstractExtensionType }
         *     
         */
        public void setAbstractTouchDownLiftOffMarkingExtension(AbstractExtensionType value) {
            this.abstractTouchDownLiftOffMarkingExtension = value;
        }

        /**
         * Gets the value of the abstractMarkingExtension property.
         * 
         * @return
         *     possible object is
         *     {@link AbstractExtensionType }
         *     
         */
        public AbstractExtensionType getAbstractMarkingExtension() {
            return abstractMarkingExtension;
        }

        /**
         * Sets the value of the abstractMarkingExtension property.
         * 
         * @param value
         *     allowed object is
         *     {@link AbstractExtensionType }
         *     
         */
        public void setAbstractMarkingExtension(AbstractExtensionType value) {
            this.abstractMarkingExtension = value;
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
