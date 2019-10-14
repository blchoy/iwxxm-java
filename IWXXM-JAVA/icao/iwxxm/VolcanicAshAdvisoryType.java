//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.10.14 at 03:52:52 AM UTC 
//


package icao.iwxxm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import def.wmo.metce.EruptingVolcanoPropertyType;
import net.opengis.gml.TimeInstantPropertyType;
import net.opengis.om.OMObservationPropertyType;


/**
 * <p>Java class for VolcanicAshAdvisoryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VolcanicAshAdvisoryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://icao.int/iwxxm/2.1}ReportType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="issueTime" type="{http://www.opengis.net/gml/3.2}TimeInstantPropertyType"/&gt;
 *         &lt;element name="issuingVolcanicAshAdvisoryCentre" type="{http://icao.int/iwxxm/2.1}UnitPropertyType"/&gt;
 *         &lt;element name="volcano" type="{http://def.wmo.int/metce/2013}EruptingVolcanoPropertyType"/&gt;
 *         &lt;element name="advisoryNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="informationSource" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="colourCode" type="{http://icao.int/iwxxm/2.1}AviationColourCodeType" minOccurs="0"/&gt;
 *         &lt;element name="analysis" type="{http://www.opengis.net/om/2.0}OM_ObservationPropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="remarks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nextAdvisoryEarliestTime" type="{http://www.opengis.net/gml/3.2}TimeInstantPropertyType" minOccurs="0"/&gt;
 *         &lt;element name="nextAdvisoryLatestTime" type="{http://www.opengis.net/gml/3.2}TimeInstantPropertyType" minOccurs="0"/&gt;
 *         &lt;element name="extension" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VolcanicAshAdvisoryType", propOrder = {
    "issueTime",
    "issuingVolcanicAshAdvisoryCentre",
    "volcano",
    "advisoryNumber",
    "informationSource",
    "colourCode",
    "analysis",
    "remarks",
    "nextAdvisoryEarliestTime",
    "nextAdvisoryLatestTime",
    "extension"
})
public class VolcanicAshAdvisoryType
    extends ReportType
{

    @XmlElement(required = true)
    protected TimeInstantPropertyType issueTime;
    @XmlElement(required = true)
    protected UnitPropertyType issuingVolcanicAshAdvisoryCentre;
    @XmlElement(required = true)
    protected EruptingVolcanoPropertyType volcano;
    @XmlElement(required = true)
    protected String advisoryNumber;
    @XmlElement(required = true)
    protected String informationSource;
    @XmlElementRef(name = "colourCode", namespace = "http://icao.int/iwxxm/2.1", type = JAXBElement.class, required = false)
    protected JAXBElement<AviationColourCodeType> colourCode;
    protected List<OMObservationPropertyType> analysis;
    protected String remarks;
    protected TimeInstantPropertyType nextAdvisoryEarliestTime;
    protected TimeInstantPropertyType nextAdvisoryLatestTime;
    protected List<Object> extension;

    /**
     * Gets the value of the issueTime property.
     * 
     * @return
     *     possible object is
     *     {@link TimeInstantPropertyType }
     *     
     */
    public TimeInstantPropertyType getIssueTime() {
        return issueTime;
    }

    /**
     * Sets the value of the issueTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeInstantPropertyType }
     *     
     */
    public void setIssueTime(TimeInstantPropertyType value) {
        this.issueTime = value;
    }

    /**
     * Gets the value of the issuingVolcanicAshAdvisoryCentre property.
     * 
     * @return
     *     possible object is
     *     {@link UnitPropertyType }
     *     
     */
    public UnitPropertyType getIssuingVolcanicAshAdvisoryCentre() {
        return issuingVolcanicAshAdvisoryCentre;
    }

    /**
     * Sets the value of the issuingVolcanicAshAdvisoryCentre property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitPropertyType }
     *     
     */
    public void setIssuingVolcanicAshAdvisoryCentre(UnitPropertyType value) {
        this.issuingVolcanicAshAdvisoryCentre = value;
    }

    /**
     * Gets the value of the volcano property.
     * 
     * @return
     *     possible object is
     *     {@link EruptingVolcanoPropertyType }
     *     
     */
    public EruptingVolcanoPropertyType getVolcano() {
        return volcano;
    }

    /**
     * Sets the value of the volcano property.
     * 
     * @param value
     *     allowed object is
     *     {@link EruptingVolcanoPropertyType }
     *     
     */
    public void setVolcano(EruptingVolcanoPropertyType value) {
        this.volcano = value;
    }

    /**
     * Gets the value of the advisoryNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdvisoryNumber() {
        return advisoryNumber;
    }

    /**
     * Sets the value of the advisoryNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdvisoryNumber(String value) {
        this.advisoryNumber = value;
    }

    /**
     * Gets the value of the informationSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInformationSource() {
        return informationSource;
    }

    /**
     * Sets the value of the informationSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInformationSource(String value) {
        this.informationSource = value;
    }

    /**
     * Gets the value of the colourCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AviationColourCodeType }{@code >}
     *     
     */
    public JAXBElement<AviationColourCodeType> getColourCode() {
        return colourCode;
    }

    /**
     * Sets the value of the colourCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AviationColourCodeType }{@code >}
     *     
     */
    public void setColourCode(JAXBElement<AviationColourCodeType> value) {
        this.colourCode = value;
    }

    /**
     * Gets the value of the analysis property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the analysis property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnalysis().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OMObservationPropertyType }
     * 
     * 
     */
    public List<OMObservationPropertyType> getAnalysis() {
        if (analysis == null) {
            analysis = new ArrayList<OMObservationPropertyType>();
        }
        return this.analysis;
    }

    /**
     * Gets the value of the remarks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * Sets the value of the remarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemarks(String value) {
        this.remarks = value;
    }

    /**
     * Gets the value of the nextAdvisoryEarliestTime property.
     * 
     * @return
     *     possible object is
     *     {@link TimeInstantPropertyType }
     *     
     */
    public TimeInstantPropertyType getNextAdvisoryEarliestTime() {
        return nextAdvisoryEarliestTime;
    }

    /**
     * Sets the value of the nextAdvisoryEarliestTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeInstantPropertyType }
     *     
     */
    public void setNextAdvisoryEarliestTime(TimeInstantPropertyType value) {
        this.nextAdvisoryEarliestTime = value;
    }

    /**
     * Gets the value of the nextAdvisoryLatestTime property.
     * 
     * @return
     *     possible object is
     *     {@link TimeInstantPropertyType }
     *     
     */
    public TimeInstantPropertyType getNextAdvisoryLatestTime() {
        return nextAdvisoryLatestTime;
    }

    /**
     * Sets the value of the nextAdvisoryLatestTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeInstantPropertyType }
     *     
     */
    public void setNextAdvisoryLatestTime(TimeInstantPropertyType value) {
        this.nextAdvisoryLatestTime = value;
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
     * {@link Object }
     * 
     * 
     */
    public List<Object> getExtension() {
        if (extension == null) {
            extension = new ArrayList<Object>();
        }
        return this.extension;
    }

}
