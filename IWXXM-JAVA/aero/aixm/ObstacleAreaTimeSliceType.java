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
 * <p>Java class for ObstacleAreaTimeSliceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ObstacleAreaTimeSliceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMTimeSliceType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.aixm.aero/schema/5.1.1}ObstacleAreaPropertyGroup"/&gt;
 *         &lt;element name="extension" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.aixm.aero/schema/5.1.1}AbstractObstacleAreaExtension"/&gt;
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
@XmlType(name = "ObstacleAreaTimeSliceType", propOrder = {
    "type",
    "obstructionIdSurfaceCondition",
    "referenceOwnerOrganisation",
    "referenceOwnerRunway",
    "referenceOwnerAirport",
    "surfaceExtent",
    "obstacle",
    "annotation",
    "extension"
})
public class ObstacleAreaTimeSliceType
    extends AbstractAIXMTimeSliceType
{

    @XmlElementRef(name = "type", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeObstacleAreaType> type;
    @XmlElementRef(name = "obstructionIdSurfaceCondition", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeObstacleAssessmentSurfaceType> obstructionIdSurfaceCondition;
    @XmlElementRef(name = "reference_ownerOrganisation", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<OrganisationAuthorityPropertyType> referenceOwnerOrganisation;
    @XmlElementRef(name = "reference_ownerRunway", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<RunwayDirectionPropertyType> referenceOwnerRunway;
    @XmlElementRef(name = "reference_ownerAirport", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<AirportHeliportPropertyType> referenceOwnerAirport;
    @XmlElementRef(name = "surfaceExtent", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<SurfacePropertyType> surfaceExtent;
    @XmlElement(nillable = true)
    protected List<VerticalStructurePropertyType> obstacle;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    protected List<ObstacleAreaTimeSliceType.Extension> extension;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeObstacleAreaType }{@code >}
     *     
     */
    public JAXBElement<CodeObstacleAreaType> getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeObstacleAreaType }{@code >}
     *     
     */
    public void setType(JAXBElement<CodeObstacleAreaType> value) {
        this.type = value;
    }

    /**
     * Gets the value of the obstructionIdSurfaceCondition property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeObstacleAssessmentSurfaceType }{@code >}
     *     
     */
    public JAXBElement<CodeObstacleAssessmentSurfaceType> getObstructionIdSurfaceCondition() {
        return obstructionIdSurfaceCondition;
    }

    /**
     * Sets the value of the obstructionIdSurfaceCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeObstacleAssessmentSurfaceType }{@code >}
     *     
     */
    public void setObstructionIdSurfaceCondition(JAXBElement<CodeObstacleAssessmentSurfaceType> value) {
        this.obstructionIdSurfaceCondition = value;
    }

    /**
     * Gets the value of the referenceOwnerOrganisation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OrganisationAuthorityPropertyType }{@code >}
     *     
     */
    public JAXBElement<OrganisationAuthorityPropertyType> getReferenceOwnerOrganisation() {
        return referenceOwnerOrganisation;
    }

    /**
     * Sets the value of the referenceOwnerOrganisation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OrganisationAuthorityPropertyType }{@code >}
     *     
     */
    public void setReferenceOwnerOrganisation(JAXBElement<OrganisationAuthorityPropertyType> value) {
        this.referenceOwnerOrganisation = value;
    }

    /**
     * Gets the value of the referenceOwnerRunway property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RunwayDirectionPropertyType }{@code >}
     *     
     */
    public JAXBElement<RunwayDirectionPropertyType> getReferenceOwnerRunway() {
        return referenceOwnerRunway;
    }

    /**
     * Sets the value of the referenceOwnerRunway property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RunwayDirectionPropertyType }{@code >}
     *     
     */
    public void setReferenceOwnerRunway(JAXBElement<RunwayDirectionPropertyType> value) {
        this.referenceOwnerRunway = value;
    }

    /**
     * Gets the value of the referenceOwnerAirport property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AirportHeliportPropertyType }{@code >}
     *     
     */
    public JAXBElement<AirportHeliportPropertyType> getReferenceOwnerAirport() {
        return referenceOwnerAirport;
    }

    /**
     * Sets the value of the referenceOwnerAirport property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AirportHeliportPropertyType }{@code >}
     *     
     */
    public void setReferenceOwnerAirport(JAXBElement<AirportHeliportPropertyType> value) {
        this.referenceOwnerAirport = value;
    }

    /**
     * Gets the value of the surfaceExtent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SurfacePropertyType }{@code >}
     *     
     */
    public JAXBElement<SurfacePropertyType> getSurfaceExtent() {
        return surfaceExtent;
    }

    /**
     * Sets the value of the surfaceExtent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SurfacePropertyType }{@code >}
     *     
     */
    public void setSurfaceExtent(JAXBElement<SurfacePropertyType> value) {
        this.surfaceExtent = value;
    }

    /**
     * Gets the value of the obstacle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the obstacle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObstacle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VerticalStructurePropertyType }
     * 
     * 
     */
    public List<VerticalStructurePropertyType> getObstacle() {
        if (obstacle == null) {
            obstacle = new ArrayList<VerticalStructurePropertyType>();
        }
        return this.obstacle;
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
     * {@link ObstacleAreaTimeSliceType.Extension }
     * 
     * 
     */
    public List<ObstacleAreaTimeSliceType.Extension> getExtension() {
        if (extension == null) {
            extension = new ArrayList<ObstacleAreaTimeSliceType.Extension>();
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
     *         &lt;element ref="{http://www.aixm.aero/schema/5.1.1}AbstractObstacleAreaExtension"/&gt;
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
        "abstractObstacleAreaExtension"
    })
    public static class Extension {

        @XmlElement(name = "AbstractObstacleAreaExtension", required = true)
        protected AbstractExtensionType abstractObstacleAreaExtension;
        @XmlAttribute(name = "owns")
        protected Boolean owns;

        /**
         * Gets the value of the abstractObstacleAreaExtension property.
         * 
         * @return
         *     possible object is
         *     {@link AbstractExtensionType }
         *     
         */
        public AbstractExtensionType getAbstractObstacleAreaExtension() {
            return abstractObstacleAreaExtension;
        }

        /**
         * Sets the value of the abstractObstacleAreaExtension property.
         * 
         * @param value
         *     allowed object is
         *     {@link AbstractExtensionType }
         *     
         */
        public void setAbstractObstacleAreaExtension(AbstractExtensionType value) {
            this.abstractObstacleAreaExtension = value;
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
