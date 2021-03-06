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
import javax.xml.bind.annotation.XmlType;
import icao.iwxxm.AIRMETEvolvingConditionCollectionType;
import icao.iwxxm.AIRMETEvolvingConditionType;
import icao.iwxxm.AIRMETType;
import icao.iwxxm.AerodromeAirTemperatureForecastType;
import icao.iwxxm.AerodromeCloudForecastType;
import icao.iwxxm.AerodromeCloudType;
import icao.iwxxm.AerodromeHorizontalVisibilityType;
import icao.iwxxm.AerodromeRunwayStateType;
import icao.iwxxm.AerodromeRunwayVisualRangeType;
import icao.iwxxm.AerodromeSeaConditionType;
import icao.iwxxm.AerodromeSurfaceWindForecastType;
import icao.iwxxm.AerodromeSurfaceWindTrendForecastType;
import icao.iwxxm.AerodromeSurfaceWindType;
import icao.iwxxm.AerodromeWindShearType;
import icao.iwxxm.CloudLayerType;
import icao.iwxxm.METARType;
import icao.iwxxm.MeteorologicalAerodromeForecastType;
import icao.iwxxm.MeteorologicalAerodromeObservationReportType;
import icao.iwxxm.MeteorologicalAerodromeObservationType;
import icao.iwxxm.MeteorologicalAerodromeTrendForecastType;
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
import def.wmo.metce.MeasurementContextType;
import def.wmo.metce.ProcessType;
import def.wmo.metce.TropicalCycloneType;
import def.wmo.metce.VolcanoType;
import def.wmo.opm.AbstractObservablePropertyType;
import def.wmo.opm.CategoryConstraintType;
import def.wmo.opm.CompositeObservablePropertyType;
import def.wmo.opm.ConstraintType;
import def.wmo.opm.ObservablePropertyType;
import def.wmo.opm.QualifiedObservablePropertyType;
import def.wmo.opm.RangeConstraintType;
import def.wmo.opm.ScalarConstraintType;
import def.wmo.opm.StatisticalQualifierType;
import aero.aixm.AbstractAIXMFeatureType;
import aero.aixm.AbstractAIXMObjectType;
import aero.aixm.AirportHeliportTimeSliceType;
import aero.aixm.AirportHeliportType;
import aero.aixm.AirspaceTimeSliceType;
import aero.aixm.AirspaceType;
import aero.aixm.ElevatedCurveType;
import aero.aixm.ElevatedPointType;
import aero.aixm.ElevatedSurfaceType;
import aero.aixm.RunwayDirectionTimeSliceType;
import aero.aixm.RunwayDirectionType;
import aero.aixm.RunwayTimeSliceType;
import aero.aixm.RunwayType;
import aero.aixm.UnitTimeSliceType;
import aero.aixm.UnitType;
import net.opengis.om.OMObservationType;


/**
 * <p>Java class for ArrayAssociationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayAssociationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}AbstractObject" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "ArrayAssociationType", propOrder = {
    "abstractObject"
})
public class ArrayAssociationType {

    @XmlElementRef(name = "AbstractObject", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class, required = false)
    protected List<JAXBElement<?>> abstractObject;
    @XmlAttribute(name = "owns")
    protected java.lang.Boolean owns;

    /**
     * Gets the value of the abstractObject property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the abstractObject property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAbstractObject().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link ScalarConstraintType }{@code >}
     * {@link JAXBElement }{@code <}{@link CategoryConstraintType }{@code >}
     * {@link JAXBElement }{@code <}{@link RangeConstraintType }{@code >}
     * {@link JAXBElement }{@code <}{@link ConstraintType }{@code >}
     * {@link JAXBElement }{@code <}{@link ArcByBulgeType }{@code >}
     * {@link JAXBElement }{@code <}{@link ArcStringByBulgeType }{@code >}
     * {@link JAXBElement }{@code <}{@link BezierType }{@code >}
     * {@link JAXBElement }{@code <}{@link BSplineType }{@code >}
     * {@link JAXBElement }{@code <}{@link OffsetCurveType }{@code >}
     * {@link JAXBElement }{@code <}{@link ClothoidType }{@code >}
     * {@link JAXBElement }{@code <}{@link CircleByCenterPointType }{@code >}
     * {@link JAXBElement }{@code <}{@link ArcByCenterPointType }{@code >}
     * {@link JAXBElement }{@code <}{@link CubicSplineType }{@code >}
     * {@link JAXBElement }{@code <}{@link LineStringSegmentType }{@code >}
     * {@link JAXBElement }{@code <}{@link CircleType }{@code >}
     * {@link JAXBElement }{@code <}{@link ArcType }{@code >}
     * {@link JAXBElement }{@code <}{@link ArcStringType }{@code >}
     * {@link JAXBElement }{@code <}{@link GeodesicType }{@code >}
     * {@link JAXBElement }{@code <}{@link GeodesicStringType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractCurveSegmentType }{@code >}
     * {@link JAXBElement }{@code <}{@link AffinePlacementType }{@code >}
     * {@link JAXBElement }{@code <}{@link FileType }{@code >}
     * {@link JAXBElement }{@code <}{@link GenericMetaDataType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractMetaDataType }{@code >}
     * {@link JAXBElement }{@code <}{@link GeometricComplexType }{@code >}
     * {@link JAXBElement }{@code <}{@link RectifiedGridType }{@code >}
     * {@link JAXBElement }{@code <}{@link GridType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractGeometryType }{@code >}
     * {@link JAXBElement }{@code <}{@link PolygonType }{@code >}
     * {@link JAXBElement }{@code <}{@link OrientableSurfaceType }{@code >}
     * {@link JAXBElement }{@code <}{@link CompositeSurfaceType }{@code >}
     * {@link JAXBElement }{@code <}{@link ShellType }{@code >}
     * {@link JAXBElement }{@code <}{@link TinType }{@code >}
     * {@link JAXBElement }{@code <}{@link net.opengis.gml.SurfaceType }{@code >}
     * {@link JAXBElement }{@code <}{@link net.opengis.gml.SurfaceType }{@code >}
     * {@link JAXBElement }{@code <}{@link ElevatedSurfaceType }{@code >}
     * {@link JAXBElement }{@code <}{@link aero.aixm.SurfaceType }{@code >}
     * {@link JAXBElement }{@code <}{@link net.opengis.gml.SurfaceType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractSurfaceType }{@code >}
     * {@link JAXBElement }{@code <}{@link SolidType }{@code >}
     * {@link JAXBElement }{@code <}{@link CompositeSolidType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractSolidType }{@code >}
     * {@link JAXBElement }{@code <}{@link LineStringType }{@code >}
     * {@link JAXBElement }{@code <}{@link ElevatedCurveType }{@code >}
     * {@link JAXBElement }{@code <}{@link aero.aixm.CurveType }{@code >}
     * {@link JAXBElement }{@code <}{@link net.opengis.gml.CurveType }{@code >}
     * {@link JAXBElement }{@code <}{@link OrientableCurveType }{@code >}
     * {@link JAXBElement }{@code <}{@link CompositeCurveType }{@code >}
     * {@link JAXBElement }{@code <}{@link RingType }{@code >}
     * {@link JAXBElement }{@code <}{@link LinearRingType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractRingType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractCurveType }{@code >}
     * {@link JAXBElement }{@code <}{@link ElevatedPointType }{@code >}
     * {@link JAXBElement }{@code <}{@link aero.aixm.PointType }{@code >}
     * {@link JAXBElement }{@code <}{@link net.opengis.gml.PointType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractGeometricPrimitiveType }{@code >}
     * {@link JAXBElement }{@code <}{@link MultiGeometryType }{@code >}
     * {@link JAXBElement }{@code <}{@link MultiSurfaceType }{@code >}
     * {@link JAXBElement }{@code <}{@link MultiCurveType }{@code >}
     * {@link JAXBElement }{@code <}{@link MultiPointType }{@code >}
     * {@link JAXBElement }{@code <}{@link MultiSolidType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractGeometricAggregateType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractGeometryType }{@code >}
     * {@link JAXBElement }{@code <}{@link TimeEdgeType }{@code >}
     * {@link JAXBElement }{@code <}{@link TimeNodeType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractTimeTopologyPrimitiveType }{@code >}
     * {@link JAXBElement }{@code <}{@link TimeInstantType }{@code >}
     * {@link JAXBElement }{@code <}{@link TimePeriodType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractTimeGeometricPrimitiveType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractTimePrimitiveType }{@code >}
     * {@link JAXBElement }{@code <}{@link TimeTopologyComplexType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractTimeComplexType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractTimeObjectType }{@code >}
     * {@link JAXBElement }{@code <}{@link MeteorologicalAerodromeTrendForecastType }{@code >}
     * {@link JAXBElement }{@code <}{@link ProcessType }{@code >}
     * {@link JAXBElement }{@code <}{@link SpaceWeatherAnalysisType }{@code >}
     * {@link JAXBElement }{@code <}{@link VolcanicAshCloudObservedOrEstimatedType }{@code >}
     * {@link JAXBElement }{@code <}{@link DiscreteCoverageType }{@code >}
     * {@link JAXBElement }{@code <}{@link DiscreteCoverageType }{@code >}
     * {@link JAXBElement }{@code <}{@link DiscreteCoverageType }{@code >}
     * {@link JAXBElement }{@code <}{@link DiscreteCoverageType }{@code >}
     * {@link JAXBElement }{@code <}{@link DiscreteCoverageType }{@code >}
     * {@link JAXBElement }{@code <}{@link DiscreteCoverageType }{@code >}
     * {@link JAXBElement }{@code <}{@link DiscreteCoverageType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractCoverageType }{@code >}
     * {@link JAXBElement }{@code <}{@link WindObservedOrEstimatedType }{@code >}
     * {@link JAXBElement }{@code <}{@link SpaceWeatherRegionType }{@code >}
     * {@link JAXBElement }{@code <}{@link VolcanicAshObservedOrEstimatedConditionsType }{@code >}
     * {@link JAXBElement }{@code <}{@link TropicalCycloneForecastConditionsType }{@code >}
     * {@link JAXBElement }{@code <}{@link VolcanicAshCloudForecastType }{@code >}
     * {@link JAXBElement }{@code <}{@link AIRMETEvolvingConditionType }{@code >}
     * {@link JAXBElement }{@code <}{@link AIRMETEvolvingConditionCollectionType }{@code >}
     * {@link JAXBElement }{@code <}{@link TropicalCycloneSIGMETEvolvingConditionCollectionType }{@code >}
     * {@link JAXBElement }{@code <}{@link VolcanicAshSIGMETEvolvingConditionCollectionType }{@code >}
     * {@link JAXBElement }{@code <}{@link SIGMETEvolvingConditionCollectionType }{@code >}
     * {@link JAXBElement }{@code <}{@link TropicalCycloneObservedConditionsType }{@code >}
     * {@link JAXBElement }{@code <}{@link VolcanicAshSIGMETPositionCollectionType }{@code >}
     * {@link JAXBElement }{@code <}{@link TropicalCycloneSIGMETPositionCollectionType }{@code >}
     * {@link JAXBElement }{@code <}{@link SIGMETPositionCollectionType }{@code >}
     * {@link JAXBElement }{@code <}{@link TropicalCycloneSIGMETType }{@code >}
     * {@link JAXBElement }{@code <}{@link VolcanicAshSIGMETType }{@code >}
     * {@link JAXBElement }{@code <}{@link SIGMETType }{@code >}
     * {@link JAXBElement }{@code <}{@link VolcanicAshAdvisoryType }{@code >}
     * {@link JAXBElement }{@code <}{@link SpaceWeatherAdvisoryType }{@code >}
     * {@link JAXBElement }{@code <}{@link TropicalCycloneAdvisoryType }{@code >}
     * {@link JAXBElement }{@code <}{@link SPECIType }{@code >}
     * {@link JAXBElement }{@code <}{@link METARType }{@code >}
     * {@link JAXBElement }{@code <}{@link MeteorologicalAerodromeObservationReportType }{@code >}
     * {@link JAXBElement }{@code <}{@link TAFType }{@code >}
     * {@link JAXBElement }{@code <}{@link AIRMETType }{@code >}
     * {@link JAXBElement }{@code <}{@link ReportType }{@code >}
     * {@link JAXBElement }{@code <}{@link TropicalCycloneType }{@code >}
     * {@link JAXBElement }{@code <}{@link MeteorologicalBulletinType }{@code >}
     * {@link JAXBElement }{@code <}{@link VolcanicAshForecastConditionsType }{@code >}
     * {@link JAXBElement }{@code <}{@link SIGMETPositionType }{@code >}
     * {@link JAXBElement }{@code <}{@link DynamicFeatureCollectionType }{@code >}
     * {@link JAXBElement }{@code <}{@link DynamicFeatureType }{@code >}
     * {@link JAXBElement }{@code <}{@link FeatureCollectionType }{@code >}
     * {@link JAXBElement }{@code <}{@link OMObservationType }{@code >}
     * {@link JAXBElement }{@code <}{@link EruptingVolcanoType }{@code >}
     * {@link JAXBElement }{@code <}{@link VolcanoType }{@code >}
     * {@link JAXBElement }{@code <}{@link DirectedObservationAtDistanceType }{@code >}
     * {@link JAXBElement }{@code <}{@link DirectedObservationType }{@code >}
     * {@link JAXBElement }{@code <}{@link ObservationType }{@code >}
     * {@link JAXBElement }{@code <}{@link AirspaceType }{@code >}
     * {@link JAXBElement }{@code <}{@link AirportHeliportType }{@code >}
     * {@link JAXBElement }{@code <}{@link RunwayType }{@code >}
     * {@link JAXBElement }{@code <}{@link RunwayDirectionType }{@code >}
     * {@link JAXBElement }{@code <}{@link UnitType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractAIXMFeatureType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractContinuousCoverageType }{@code >}
     * {@link JAXBElement }{@code <}{@link SIGMETEvolvingConditionType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractFeatureCollectionType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractFeatureType }{@code >}
     * {@link JAXBElement }{@code <}{@link QualifiedObservablePropertyType }{@code >}
     * {@link JAXBElement }{@code <}{@link ObservablePropertyType }{@code >}
     * {@link JAXBElement }{@code <}{@link CompositeObservablePropertyType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractObservablePropertyType }{@code >}
     * {@link JAXBElement }{@code <}{@link BagType }{@code >}
     * {@link JAXBElement }{@code <}{@link ArrayType }{@code >}
     * {@link JAXBElement }{@code <}{@link CompoundCRSType }{@code >}
     * {@link JAXBElement }{@code <}{@link TemporalCRSType }{@code >}
     * {@link JAXBElement }{@code <}{@link GeographicCRSType }{@code >}
     * {@link JAXBElement }{@code <}{@link GeocentricCRSType }{@code >}
     * {@link JAXBElement }{@code <}{@link ImageCRSType }{@code >}
     * {@link JAXBElement }{@code <}{@link EngineeringCRSType }{@code >}
     * {@link JAXBElement }{@code <}{@link VerticalCRSType }{@code >}
     * {@link JAXBElement }{@code <}{@link DerivedCRSType }{@code >}
     * {@link JAXBElement }{@code <}{@link ProjectedCRSType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractGeneralDerivedCRSType }{@code >}
     * {@link JAXBElement }{@code <}{@link GeodeticCRSType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractCRSType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractCRSType }{@code >}
     * {@link JAXBElement }{@code <}{@link DefinitionProxyType }{@code >}
     * {@link JAXBElement }{@code <}{@link TemporalCSType }{@code >}
     * {@link JAXBElement }{@code <}{@link CylindricalCSType }{@code >}
     * {@link JAXBElement }{@code <}{@link EllipsoidalCSType }{@code >}
     * {@link JAXBElement }{@code <}{@link CartesianCSType }{@code >}
     * {@link JAXBElement }{@code <}{@link TimeCSType }{@code >}
     * {@link JAXBElement }{@code <}{@link LinearCSType }{@code >}
     * {@link JAXBElement }{@code <}{@link AffineCSType }{@code >}
     * {@link JAXBElement }{@code <}{@link VerticalCSType }{@code >}
     * {@link JAXBElement }{@code <}{@link SphericalCSType }{@code >}
     * {@link JAXBElement }{@code <}{@link PolarCSType }{@code >}
     * {@link JAXBElement }{@code <}{@link ObliqueCartesianCSType }{@code >}
     * {@link JAXBElement }{@code <}{@link UserDefinedCSType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractCoordinateSystemType }{@code >}
     * {@link JAXBElement }{@code <}{@link PrimeMeridianType }{@code >}
     * {@link JAXBElement }{@code <}{@link CoordinateSystemAxisType }{@code >}
     * {@link JAXBElement }{@code <}{@link OperationMethodType }{@code >}
     * {@link JAXBElement }{@code <}{@link OperationParameterGroupType }{@code >}
     * {@link JAXBElement }{@code <}{@link OperationParameterType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractGeneralOperationParameterType }{@code >}
     * {@link JAXBElement }{@code <}{@link DictionaryType }{@code >}
     * {@link JAXBElement }{@code <}{@link TemporalDatumType }{@code >}
     * {@link JAXBElement }{@code <}{@link GeodeticDatumType }{@code >}
     * {@link JAXBElement }{@code <}{@link EngineeringDatumType }{@code >}
     * {@link JAXBElement }{@code <}{@link ImageDatumType }{@code >}
     * {@link JAXBElement }{@code <}{@link VerticalDatumType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractDatumType }{@code >}
     * {@link JAXBElement }{@code <}{@link ConcatenatedOperationType }{@code >}
     * {@link JAXBElement }{@code <}{@link ConversionType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractGeneralConversionType }{@code >}
     * {@link JAXBElement }{@code <}{@link TransformationType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractGeneralTransformationType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractCoordinateOperationType }{@code >}
     * {@link JAXBElement }{@code <}{@link PassThroughOperationType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractCoordinateOperationType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractCoordinateOperationType }{@code >}
     * {@link JAXBElement }{@code <}{@link EllipsoidType }{@code >}
     * {@link JAXBElement }{@code <}{@link TimeCalendarType }{@code >}
     * {@link JAXBElement }{@code <}{@link TimeOrdinalReferenceSystemType }{@code >}
     * {@link JAXBElement }{@code <}{@link TimeCoordinateSystemType }{@code >}
     * {@link JAXBElement }{@code <}{@link TimeClockType }{@code >}
     * {@link JAXBElement }{@code <}{@link TimeReferenceSystemType }{@code >}
     * {@link JAXBElement }{@code <}{@link DictionaryType }{@code >}
     * {@link JAXBElement }{@code <}{@link BaseUnitType }{@code >}
     * {@link JAXBElement }{@code <}{@link DerivedUnitType }{@code >}
     * {@link JAXBElement }{@code <}{@link ConventionalUnitType }{@code >}
     * {@link JAXBElement }{@code <}{@link UnitDefinitionType }{@code >}
     * {@link JAXBElement }{@code <}{@link DefinitionType }{@code >}
     * {@link JAXBElement }{@code <}{@link TopoComplexType }{@code >}
     * {@link JAXBElement }{@code <}{@link FaceType }{@code >}
     * {@link JAXBElement }{@code <}{@link TopoSolidType }{@code >}
     * {@link JAXBElement }{@code <}{@link NodeType }{@code >}
     * {@link JAXBElement }{@code <}{@link EdgeType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractTopoPrimitiveType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractTopologyType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractAIXMObjectType }{@code >}
     * {@link JAXBElement }{@code <}{@link MeasurementContextType }{@code >}
     * {@link JAXBElement }{@code <}{@link AerodromeCloudForecastType }{@code >}
     * {@link JAXBElement }{@code <}{@link MeteorologicalAerodromeObservationType }{@code >}
     * {@link JAXBElement }{@code <}{@link MeteorologicalAerodromeForecastType }{@code >}
     * {@link JAXBElement }{@code <}{@link RunwayTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link MovingObjectStatusType }{@code >}
     * {@link JAXBElement }{@code <}{@link RunwayDirectionTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link AirportHeliportTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link UnitTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link AirspaceTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractGMLType }{@code >}
     * {@link JAXBElement }{@code <}{@link AerodromeSeaConditionType }{@code >}
     * {@link JAXBElement }{@code <}{@link AerodromeSurfaceWindType }{@code >}
     * {@link JAXBElement }{@code <}{@link ParameterValueType }{@code >}
     * {@link JAXBElement }{@code <}{@link ParameterValueGroupType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractGeneralParameterValueType }{@code >}
     * {@link JAXBElement }{@code <}{@link CloudLayerType }{@code >}
     * {@link JAXBElement }{@code <}{@link AerodromeCloudType }{@code >}
     * {@link JAXBElement }{@code <}{@link EnvelopeWithTimePeriodType }{@code >}
     * {@link JAXBElement }{@code <}{@link EnvelopeType }{@code >}
     * {@link JAXBElement }{@code <}{@link AerodromeRunwayStateType }{@code >}
     * {@link JAXBElement }{@code <}{@link AerodromeAirTemperatureForecastType }{@code >}
     * {@link JAXBElement }{@code <}{@link AerodromeWindShearType }{@code >}
     * {@link JAXBElement }{@code <}{@link AerodromeHorizontalVisibilityType }{@code >}
     * {@link JAXBElement }{@code <}{@link AerodromeRunwayVisualRangeType }{@code >}
     * {@link JAXBElement }{@code <}{@link def.wmo.opm.RangeBoundsType }{@code >}
     * {@link JAXBElement }{@code <}{@link DataBlockType }{@code >}
     * {@link JAXBElement }{@code <}{@link StatisticalQualifierType }{@code >}
     * {@link JAXBElement }{@code <}{@link CoverageFunctionType }{@code >}
     * {@link JAXBElement }{@code <}{@link MappingRuleType }{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link CodeOrNilReasonListType }{@code >}
     * {@link JAXBElement }{@code <}{@link MeasureOrNilReasonListType }{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Count }{@code >}
     * {@link JAXBElement }{@code <}{@link Quantity }{@code >}
     * {@link JAXBElement }{@code <}{@link Category }{@code >}
     * {@link JAXBElement }{@code <}{@link net.opengis.gml.Boolean }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link QuantityExtentType }{@code >}
     * {@link JAXBElement }{@code <}{@link CategoryExtentType }{@code >}
     * {@link JAXBElement }{@code <}{@link ValueArrayType }{@code >}
     * {@link JAXBElement }{@code <}{@link CompositeValueType }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link GridFunctionType }{@code >}
     * {@link JAXBElement }{@code <}{@link def.wmo.metce.RangeBoundsType }{@code >}
     * {@link JAXBElement }{@code <}{@link AerodromeSurfaceWindForecastType }{@code >}
     * {@link JAXBElement }{@code <}{@link AerodromeSurfaceWindTrendForecastType }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getAbstractObject() {
        if (abstractObject == null) {
            abstractObject = new ArrayList<JAXBElement<?>>();
        }
        return this.abstractObject;
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
